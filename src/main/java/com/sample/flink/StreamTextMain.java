package com.sample.flink;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

/**
 * StreamTextMain
 *
 * @author Aaric, created on 2022-09-06T13:51.
 * @version 0.2.0-SNAPSHOT
 */
public class StreamTextMain {

    public static void main(String[] args) throws Exception {
        // Socket Serve: nc -lk 7777
        // Startup: java -jar flink-achieve-0.2.0-SNAPSHOT.jar --hostname centos-v7-s1 --port 7777
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        ParameterTool pTool = ParameterTool.fromArgs(args);
        DataStreamSource<String> dss = env.socketTextStream(pTool.get("hostname"), pTool.getInt("port"));
        SingleOutputStreamOperator<Tuple2<String, Long>> operator = dss.flatMap((String line, Collector<Tuple2<String, Long>> out) -> {
            String[] words = line.split(" ");
            for (String word : words) {
                out.collect(Tuple2.of(word, 1L));
            }
        }).returns(Types.TUPLE(Types.STRING, Types.LONG));
        KeyedStream<Tuple2<String, Long>, String> stream = operator.keyBy(data -> data.f0);
        SingleOutputStreamOperator<Tuple2<String, Long>> sum = stream.sum(1);
        sum.print();

        env.execute();
    }
}

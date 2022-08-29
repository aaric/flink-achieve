package com.sample.flink;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;
import org.junit.jupiter.api.Test;

/**
 * StreamTextTests
 *
 * @author Aaric, created on 2022-08-29T10:48.
 * @version 0.1.0-SNAPSHOT
 */
public class StreamTextTests {

    @Test
    public void testCount() throws Exception {
        // DataStream API
        // Socket Serve: nc -lk 7777
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStreamSource<String> dss = env.socketTextStream("localhost", 7777);
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
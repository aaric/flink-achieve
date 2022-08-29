package com.sample.flink;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.AggregateOperator;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.operators.FlatMapOperator;
import org.apache.flink.api.java.operators.UnsortedGrouping;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;
import org.junit.jupiter.api.Test;

/**
 * BatchTextTests
 *
 * @author Aaric, created on 2022-08-24T13:35.
 * @version 0.1.0-SNAPSHOT
 */
public class BatchTextTests {

    @Test
    public void testCount() throws Exception {
        // DataSet API
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        DataSource<String> ds = env.readTextFile("input/sample.txt");
        FlatMapOperator<String, Tuple2<String, Long>> operator = ds.flatMap((String line, Collector<Tuple2<String, Long>> out) -> {
            String[] words = line.split(" ");
            for (String word : words) {
                out.collect(Tuple2.of(word, 1L));
            }
        }).returns(Types.TUPLE(Types.STRING, Types.LONG));
        UnsortedGrouping<Tuple2<String, Long>> grouping = operator.groupBy(0);
        AggregateOperator<Tuple2<String, Long>> sum = grouping.sum(1);
        sum.print();
    }
}

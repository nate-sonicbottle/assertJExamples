package com.sonicbottle.assertjexamples.lists;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.assertj.core.api.Condition;
import org.junit.Test;

public class ConditionsSample {

    private boolean isEven(Integer integer) {
        return integer % 2 == 0;
    }

    @Test
    public void simpleTest() {
        Condition<Integer> evenNumber = new Condition<>(this::isEven, "Is Number even");

        assertThat(2).is(evenNumber);
        assertThat(1).isNot(evenNumber);
    }

    @Test
    public void test() {
        Condition<Integer> evenNumber = new Condition<>(this::isEven, "Is Number even");
        List<Integer> numbers = IntStream.range(1, 5).boxed().collect(Collectors.toList());
        assertThat(numbers).haveExactly(2, evenNumber);
    }
}

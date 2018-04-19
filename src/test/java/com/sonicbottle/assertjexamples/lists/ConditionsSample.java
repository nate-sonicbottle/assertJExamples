package com.sonicbottle.assertjexamples.lists;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Condition;
import org.junit.Test;

public class ConditionsSample {

    private boolean isEven(Integer integer) {
        return integer % 2 == 0;
    }

    @Test
    public void simpleTest() {
        Condition<Integer> condition = new Condition<>(this::isEven, "Is Number even");

        assertThat(2).is(condition);
    }
}

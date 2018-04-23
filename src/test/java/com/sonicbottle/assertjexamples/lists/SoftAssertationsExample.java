package com.sonicbottle.assertjexamples.lists;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class SoftAssertationsExample {

    @Test
    public void test() {
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(1 == 2).as("This should fail").isTrue();
            softly.assertThat(1 == 1).as("This should work").isTrue();
            softly.assertThat(1 == 3).as("This should fail").isTrue();
        });
    }
}

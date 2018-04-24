package com.sonicbottle.assertjexamples.lists;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.assertj.core.api.AutoCloseableSoftAssertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class SoftAssertationsExample {

    @Test
    public void nonSoftAssertionExample() {
        assertTrue("This should fail", 1 == 2);
        assertTrue("This should work",1 ==1);
        assertTrue("This should fail", 1 == 3);
    }

    @Test
    public void softAssertionsAssertSoftlyExample() {
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(1 == 2).as("This should fail").isTrue();
            softly.assertThat(1 == 1).as("This should work").isTrue();
            softly.assertThat(1 == 3).as("This should fail").isTrue();
        });
    }

    @Test
    public void autoCloseableSoftAssertionsExample() {
        try (AutoCloseableSoftAssertions softly = new AutoCloseableSoftAssertions()) {
            softly.assertThat(1 == 2).as("This should fail").isTrue();
            softly.assertThat(1 == 1).as("This should work").isTrue();
            softly.assertThat(1 == 3).as("This should fail").isTrue();
        }
    }

    //TODO Demostrate with TestNG
    // TODO Demostrate with junit
}

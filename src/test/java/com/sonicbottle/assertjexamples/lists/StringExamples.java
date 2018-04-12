package com.sonicbottle.assertjexamples.lists;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringExamples {

    private static final String NAME = "James";
    private static final String DESCRIPTION = "Line 1 \n Line 2";
    private static final String AGE = "12";

    @Test
    public void StringStartsWith() {
        assertThat(NAME).startsWith("Ja");
    }

    @Test
    public void StringEndsWith() {
        assertThat(NAME).endsWith("es");
    }

    @Test
    public void StringLength() {
        assertThat(NAME).hasSize(5);
    }

    @Test
    public void StringLineCount() {
        assertThat(DESCRIPTION).hasLineCount(2);
    }

    @Test
    public void StringContains() {
        assertThat(NAME).contains("me");
    }

    @Test
    public void StringContainsIgnoringCase() {
        assertThat(NAME).containsIgnoringCase("ME");
    }

    @Test
    public void StringContainsSubsequence() {
        assertThat(NAME).containsSubsequence("Ja", "me");
    }

    @Test
    public void StringDoesNotContain() {
        assertThat(NAME).doesNotContain("TOM");
    }

    @Test
    public void StringContainsOnlyDigits() {
        assertThat(AGE).containsOnlyDigits();
    }

}

package com.sonicbottle.assertjexamples.lists;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sonicbottle.assertjexamples.lists.util.Pojo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ListExamples {

    private static List<Pojo> pojos;
    private static Pojo pojo1, pojo2, pojo3;

    private static List<String> strings;


    @Before
    public void setUp() {
        pojo1 = new Pojo("Bob", "Holmes", 28);
        pojo2 = new Pojo("Sammatha", "Hill", 35);
        pojo3 = new Pojo("Bob", "Jones", 2);
        pojos = Arrays.asList(pojo1, pojo2, pojo3);

        strings = Arrays.asList("Bob", "Sammatha", "Bob");
    }

    @Test
    public void listContainsExpectedElementByEquals() {
        assertThat(pojos).contains(pojo1);
    }

    @Test
    public void listDoesNotContainsExpectedElementByEquals() {
        Pojo pojo = new Pojo("John", "Holmes", 28);

        assertThat(pojos).doesNotContain(pojo);
    }

    @Test
    public void listContainsAllElementsInAnyOrder() {
        assertThat(pojos).containsExactlyInAnyOrder(pojo3, pojo1, pojo2);
    }

    @Test
    public void listContainsAllElementsInExactOrder() {
        assertThat(pojos).containsExactlyInAnyOrder(pojo1, pojo2, pojo3);
    }

    @Test
    public void listContainsOnly() {
        assertThat(pojos).containsOnly(pojo2, pojo1, pojo3);
    }

}

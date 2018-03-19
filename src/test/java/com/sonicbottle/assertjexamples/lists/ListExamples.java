package com.sonicbottle.assertjexamples.lists;

import static org.assertj.core.api.Assertions.assertThat;

import javax.swing.Popup;
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

    private static List<Pojo> pojos = new ArrayList<>();

    @Before
    public void setUp() {
        pojos.add(new Pojo("Bob", "Holmes", 28));
        pojos.add(new Pojo("Sammatha", "Hill", 35));
        pojos.add(new Pojo("Bob", "Jones", 2));
    }

//    @Test
//    public void test() {
//        assertThat(pojos).
//    }

    @Test
    public void testingCollectionContainsExpectedElementByObjectReference() {
        Pojo pojo = new Pojo("bob", "Holmes", 28);

        List<Pojo> pojos = Arrays.asList(pojo);

        assertThat(pojos).contains(pojo);
    }
}

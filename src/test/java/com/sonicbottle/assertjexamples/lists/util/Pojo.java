package com.sonicbottle.assertjexamples.lists.util;

import java.io.Serializable;
import java.util.Objects;

public class Pojo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private int age;

    public Pojo(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pojo pojo = (Pojo)o;
        return age == pojo.age &&
                Objects.equals(firstName, pojo.firstName) &&
                Objects.equals(lastName, pojo.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, age);
    }
}

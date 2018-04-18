package com.sonicbottle.assertjexamples.lists.util;

public class Service {

    public void doSomethingAndThrowException() {
        throw new ServiceException("Test Message");
    }

    public void doSomethingAndThrowExceptionWithCauseBy() {
        Exception npe = new NullPointerException();
        throw new ServiceException("npe", npe);
    }

}

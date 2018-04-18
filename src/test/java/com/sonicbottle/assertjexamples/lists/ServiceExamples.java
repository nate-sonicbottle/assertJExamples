package com.sonicbottle.assertjexamples.lists;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import com.sonicbottle.assertjexamples.lists.util.Service;
import com.sonicbottle.assertjexamples.lists.util.ServiceException;
import org.junit.Test;

public class ServiceExamples {

    private Service service = new Service();

    @Test
    public void exceptionAssertThatThrownBy() {
        assertThatThrownBy(() -> service.doSomethingAndThrowException())
                .isInstanceOf(ServiceException.class)
                .hasMessage("Test Message");
    }

    @Test
    public void exceptionAssertThatThrownByAlternative() {
        assertThatExceptionOfType(ServiceException.class)
                .isThrownBy(() -> service.doSomethingAndThrowException());
    }

    @Test
    public void test() {
        assertThatThrownBy(() -> service.doSomethingAndThrowExceptionWithCauseBy())
                .hasCauseInstanceOf(NullPointerException.class);
    }

}

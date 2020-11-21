package io.automatenow.hamcrestmatchers.custommatchers;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.automatenow.hamcrestmatchers.custommatchers.AccountNumber.aValidAccountNumber;
import static io.automatenow.hamcrestmatchers.custommatchers.Temperature.aFever;

/**
 * Test custom Hamcrest matchers
 *
 * @author Marco A. Cruz
 */
public class HamcrestCustomMatchers {

    @Test
    public void testValidAccountNumber1() {
        String accountNumber = "XYZ387457-2020";
        assertThat(accountNumber, is(aValidAccountNumber()));
    }

    // This test will fail
    @Test
    public void testValidAccountNumber2() {
        String accountNumber = "XYZ387457-2019";
        assertThat(accountNumber, is(aValidAccountNumber()));
    }

    @Test
    public void testPatientIsSick1() {
        double patientTemperature = 102.5;
        assertThat(patientTemperature, is(aFever()));
    }

    // This test will fail
    @Test
    public void testPatientIsSick2() {
        double patientTemperature = 98.3;
        assertThat(patientTemperature, is(aFever()));
    }
}

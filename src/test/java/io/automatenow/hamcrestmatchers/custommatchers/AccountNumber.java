package io.automatenow.hamcrestmatchers.custommatchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/**
 * A custom matcher that checks to see if an account number is valid.
 *
 * @author Marco A. Cruz
 */
public class AccountNumber extends TypeSafeMatcher<String> {

    @Override
    public boolean matchesSafely(String number) {
        return (number.startsWith("XYZ") && number.endsWith("-2020"));
    }

    public void describeTo(Description description) {
        description.appendText("a valid account number");
    }

    public static Matcher aValidAccountNumber() {
        return new AccountNumber();
    }
}

package io.automatenow.hamcrestmatchers.custommatchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/**
 * A custom matcher that checks to see if a patient has a fever.
 *
 * @author Marco A. Cruz
 */
public class Temperature extends TypeSafeMatcher<Double> {
    @Override
    public boolean matchesSafely(Double temperature) {
        return (temperature > 100.4);
    }

    public void describeTo(Description description) {
        description.appendText("a temperature greater than 100.4 F");
    }

    public static Matcher aFever() {
        return new Temperature();
    }
}

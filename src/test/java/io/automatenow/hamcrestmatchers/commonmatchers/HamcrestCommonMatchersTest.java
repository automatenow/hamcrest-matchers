package io.automatenow.hamcrestmatchers.commonmatchers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Test common Hamcrest matchers
 *
 * @author Marco A. Cruz
 */
public class HamcrestCommonMatchersTest {

    @Test
    public void testCommonMatchers() {

        // Code readability
        String[] primaryColors = {"red", "green", "blue"};
        assertThat(primaryColors, hasItemInArray("blue"));

        // Self-documenting code: all of the following do the same thing
        String pageTitle = "Home";
        assertThat(pageTitle, equalTo("Home")); // good
        assertThat(pageTitle, is("Home")); // better
        assertThat(pageTitle, is(equalTo("Home"))); // best

        // Better error massages
        List<Integer> fibonacci = Arrays.asList(0,1,1,2,3,5,8);
//        assertThat(fibonacci, hasSize(5)); // Uncomment this line to see Hamcrest error

        // Custom error message description
//        assertThat(fibonacci, describedAs("the list size to be equal to 5", hasSize(5))); // Uncomment this line to see a custom Hamcrest error

        // Better enforcement of type safety
//        assertThat(123, is("abc")); // Uncomment to see that this Hamcrest assert will not compile

        // Common matchers

        // allOf – this functions as the logical ‘&&’ operator in Java in which it matches if all the matchers match
        String email = "info@automatenow.io";
        assertThat(email, allOf(startsWith("info"), containsString("@"), endsWith(".io")));

        // anyOf – this functions as the logical ‘||’ operator in Java in which it matches if any of the matchers match.
        assertThat(email, anyOf( endsWith(".io"), endsWith(".dev"), endsWith(".com")));

        // equalTo – used to test object equality using Object.equals
        assertThat("Home page", equalTo("Home page"));

        // hasToString – used to test Object.toString
        assertThat(true, hasToString(equalTo("true")));

        // hasKey, hasValue – checks to see if a map contains a given key or value
        HashMap<Integer, String> binary = new HashMap<Integer, String>();
        binary.put(1, "on");
        assertThat(binary, hasKey(1));
        assertThat(binary, hasValue("on"));
    }
}

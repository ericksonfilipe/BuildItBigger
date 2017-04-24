package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class FetchJokeTest {

    public FetchJokeTest() {}

    @Test
    public void testJoke() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        FetchJokeTask task = new FetchJokeTask();
        task.execute(appContext.getApplicationContext());
        String joke = task.get();
        assertNotNull(joke);
        assertTrue(joke.startsWith("Joke"));
    }
}

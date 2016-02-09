package org.sveta.test.factorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sbotnar on 2/9/16.
 */
public class MainTest {


    @Test //(expected = IllegalArgumentException.class)
    public void testNegative(){
        try {
            Main.main();
        } catch (IllegalArgumentException e) {
            assertEquals("No needed error message", "No argument", e.getMessage());
        }
    }
}

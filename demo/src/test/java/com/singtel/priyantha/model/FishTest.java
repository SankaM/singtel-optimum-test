package com.singtel.priyantha.model;

import com.singtel.priyantha.animal.fish.Fish;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FishTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    // Answer B 1.
    @Test
    public void testB1b(){
        // fish don't walk
        Fish f1 = new Fish();
        f1.walk();
        Assert.assertEquals("", outContent.toString());
    }

    @Test
    public void testB1c(){
        // fish can swim
        Fish f2 = new Fish();
        f2.swim();
        Assert.assertEquals("I am swimming"+System.getProperty("line.separator"), outContent.toString());
    }
}

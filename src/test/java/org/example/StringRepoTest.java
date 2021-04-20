package org.example;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class StringRepoTest{

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void boo() {
        System.out.println(Arrays.toString(StringRepo.getStrings()));
    }

    @Test
    public void foo() {
        System.out.println(Arrays.toString(StringRepo.getStrings()));
    }

    @Test
    public void name() {
        System.out.println(Arrays.toString(StringRepo.getStrings()));
    }
}
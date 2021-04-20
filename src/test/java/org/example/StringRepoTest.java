package org.example;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class StringRepoTest{

    @Before
    public void setUp() throws Exception {
        StringRepo.clear(); //First empty the array
        StringRepo.setStrings(new String[]{"Erik", "Olof", "Jörgen"}); //Then adding some data
    }

    @Test
    public void boo() {
        //Before each test we have a predictable environment
        System.out.println(Arrays.toString(StringRepo.getStrings()));
    }

    @Test
    public void foo() {
        //Before each test we have a predictable environment
        System.out.println(Arrays.toString(StringRepo.getStrings()));
    }

    @Test
    public void name() {
        //Before each test we have a predictable environment
        System.out.println(Arrays.toString(StringRepo.getStrings()));
    }
}
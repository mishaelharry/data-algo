package com.algorithm.datastructure.challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {

    OneAway oneAway;

    @Before
    public void setUp() throws Exception {
        oneAway = new OneAway();
    }

    @Test
    public void OneWay() throws Exception {
        Assert.assertTrue(oneAway.oneAway("harry", "harry"));
    }
}
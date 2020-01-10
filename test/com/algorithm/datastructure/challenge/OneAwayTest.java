package com.algorithm.datastructure.challenge;

import com.algorithm.datastructure.challenge.arraysAndStrings.OneAway;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
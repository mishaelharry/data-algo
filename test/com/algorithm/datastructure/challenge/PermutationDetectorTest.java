package com.algorithm.datastructure.challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationDetectorTest {

    private PermutationDetector detector;

    @Before
    public void setUp() throws Exception {
        detector = new PermutationDetector();
    }

    @Test
    public void Permutation(){
        Assert.assertTrue(detector.isPermutation("abc", "cba"));
        Assert.assertFalse(detector.isPermutation("abcd", "cba"));
        Assert.assertFalse(detector.isPermutation("xyz", "cba"));

    }
}
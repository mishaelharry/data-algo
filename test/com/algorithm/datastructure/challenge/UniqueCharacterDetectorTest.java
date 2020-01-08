package com.algorithm.datastructure.challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharacterDetectorTest {

    private UniqueCharacterDetector detector;

    @Before
    public void setUp() throws Exception {
        detector = new UniqueCharacterDetector();
    }

    @Test
    public void UniqueCharacter(){
        Assert.assertTrue(detector.isUnique("ab"));
        Assert.assertFalse(detector.isUnique("harry"));
    }
}
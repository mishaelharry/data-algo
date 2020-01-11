package com.algorithm.datastructure.challenge;

import com.algorithm.datastructure.challenge.arraysAndStrings.*;
import com.algorithm.datastructure.linkedlist.LinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArraysAndStringsTest {

    private UniqueCharacterDetector uniqueCharacterDetector;
    private PermutationDetector permutationDetector;
    private URLify urLify;
    private OneAway oneAway;
    private Compressor compressor;

    @Before
    public void setUp() throws Exception {
        uniqueCharacterDetector = new UniqueCharacterDetector();
        permutationDetector = new PermutationDetector();
        urLify = new URLify();
        oneAway = new OneAway();
        compressor = new Compressor();
    }

    @Test
    public void UniqueCharacter(){
        Assert.assertTrue(uniqueCharacterDetector.isUnique("ab"));
        Assert.assertFalse(uniqueCharacterDetector.isUnique("harry"));
    }

    @Test
    public void Permutation(){
        Assert.assertTrue(permutationDetector.isPermutation("abc", "cba"));
        Assert.assertFalse(permutationDetector.isPermutation("abcd", "cba"));
        Assert.assertFalse(permutationDetector.isPermutation("xyz", "cba"));
    }

    @Test
    public void Urlify(){
        Assert.assertEquals("My%20Home%20Page", urLify.urlify1("My Home Page"));
        Assert.assertEquals("My%20Home%20Page", urLify.urlify2("My Home Page"));
    }

    @Test
    public void OneWay() throws Exception {
        Assert.assertTrue(oneAway.oneAway("harry", "harry"));
    }

    @Test
    public void Compressor() {
        Assert.assertEquals("a3b2", compressor.compress("aaabb"));
        Assert.assertEquals("aabb", compressor.compress("aabb"));
        Assert.assertEquals("ab", compressor.compress("ab"));
        Assert.assertEquals("abc", compressor.compress("abc"));
        Assert.assertEquals("z3", compressor.compress("zzz"));
    }




}

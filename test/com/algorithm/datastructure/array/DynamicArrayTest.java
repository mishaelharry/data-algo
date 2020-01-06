package com.algorithm.datastructure.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest {

    private DynamicArray<String> array;

    @Before
    public void setUp() throws Exception {
        array = new DynamicArray<>(2);
    }

    @Test
    public void GetAndSet() throws Exception {
        array.set(0, "a");
        Assert.assertEquals("a", array.get(0));
    }

    @Test
    public void Insert() throws Exception {
        array.add("a");
        array.add("b");
        array.add("c");

        array.insert(1, "d");

        Assert.assertEquals(4, array.size());
        Assert.assertEquals("a", array.get(0));
        Assert.assertEquals("d", array.get(1));
        Assert.assertEquals("b", array.get(2));
        Assert.assertEquals("c", array.get(3));
    }
}
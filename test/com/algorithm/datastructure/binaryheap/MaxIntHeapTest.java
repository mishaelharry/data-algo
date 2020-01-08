package com.algorithm.datastructure.binaryheap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxIntHeapTest {

    private MaxIntHeap maxIntHeap;

    @Before
    public void setUp() throws Exception {
        maxIntHeap = new MaxIntHeap();
    }

    @Test
    public void ExtractMax() throws Exception{
        maxIntHeap.insert(42);
        maxIntHeap.insert(29);
        maxIntHeap.insert(18);

        maxIntHeap.print();

        maxIntHeap.insert(35);

        Assert.assertEquals(42, maxIntHeap.items[0]);
        Assert.assertEquals(35, maxIntHeap.items[1]);
        Assert.assertEquals(18, maxIntHeap.items[2]);
        Assert.assertEquals(29, maxIntHeap.items[3]);
    }
}
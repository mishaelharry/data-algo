package com.algorithm.datastructure.challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {

    private URLify urLify;

    @Before
    public void setUp() throws Exception {
        urLify = new URLify();
    }

    @Test
    public void Urlify(){
        Assert.assertEquals("My%20Home%20Page", urLify.urlify1("My Home Page"));
        Assert.assertEquals("My%20Home%20Page", urLify.urlify2("My Home Page"));
    }
}
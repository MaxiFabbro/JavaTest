package com.maxi.javatests.util;

import  org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test(expected = IllegalArgumentException.class)
    public void testRepeat_negative_times() {
        StringUtil.repeat("Hola.", -1);
    }

    @Test
    public void testRepeat_0() {
        Assert.assertEquals("HolaHola", StringUtil.repeat("Hola", 0));
    }

    @Test
    public void testRepeat_3() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }

    @Test
    public void testRepeat_2() {
        Assert.assertEquals("HolaHola", StringUtil.repeat("Hola", 2));
    }
}
package com.sen.chars;

import org.junit.Assert;
import org.junit.Test;

class IntToCharTest {

    @Test
    void testStage1method() {
        Assert.assertEquals("adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi", new IntToChar().stage1method(new int[]{2, 3, 4}));
    }

//    @Test
//    void stage2method() {
//    }
//
//    @Test
//    public void testStage1method() {
//    }
//
//    @Test
//    public void testStage2method() {
//    }
}
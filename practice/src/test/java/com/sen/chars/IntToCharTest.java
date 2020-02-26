package com.sen.chars;

import org.junit.Assert;
import org.junit.Test;

class IntToCharTest {

    @Test
    void testStage1method() {
        Assert.assertEquals("adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi", IntToChar.stage1method(new int[]{2, 3, 4}));
        Assert.assertNull(IntToChar.stage1method(new int[]{0, 1}));
        Assert.assertNull(IntToChar.stage1method(new int[]{8, 10}));
        Assert.assertNull(IntToChar.stage1method(new int[]{-1, 1}));
    }

    @Test
    void testStage2method() {
        Assert.assertEquals("att atu atv aut auu auv avt avu avv btt btu btv but buu buv bvt bvu bvv ctt ctu ctv cut cuu cuv cvt cvu cvv", IntToChar.stage2method(new int[]{2, 88}));
        Assert.assertNull(IntToChar.stage2method(new int[]{0, 1}));
        Assert.assertNull(IntToChar.stage2method(new int[]{8, 100}));
        Assert.assertNull(IntToChar.stage2method(new int[]{-1, 1}));
    }
}
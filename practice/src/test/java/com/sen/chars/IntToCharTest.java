package com.sen.chars;

import org.junit.Assert;
import org.junit.Test;

public class IntToCharTest {

    @Test
    public void testStage1method1() {
        Assert.assertEquals("adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi", IntToChar.stage1method(new int[]{2, 3, 4}));
    }

    @Test
    public void testStage1method2() {
        Assert.assertNull(IntToChar.stage1method(new int[]{0, 1}));
    }

    @Test
    public void testStage1method3() {
        Assert.assertNull(IntToChar.stage1method(new int[]{8, 10}));
    }

    @Test
    public void testStage1method4() {
        Assert.assertNull(IntToChar.stage1method(new int[]{-1, 1}));
    }

    @Test
    public void testStage1method5() {
        Assert.assertEquals("w x y z", IntToChar.stage1method(new int[]{0, 1, 9}));
    }

    @Test
    public void testStage2method1() {
        Assert.assertEquals("att atu atv aut auu auv avt avu avv btt btu btv but buu buv bvt bvu bvv ctt ctu ctv cut cuu cuv cvt cvu cvv", IntToChar.stage2method(new int[]{2, 88}));
    }

    @Test
    public void testStage2method2() {
        Assert.assertNull(IntToChar.stage2method(new int[]{0, 1}));
    }


    @Test
    public void testStage2method3() {
        Assert.assertNull(IntToChar.stage2method(new int[]{8, 100}));

    }


    @Test
    public void testStage2method4() {
        Assert.assertNull(IntToChar.stage2method(new int[]{-1, 1}));
    }


    @Test
    public void testStage2method5() {
        Assert.assertEquals("ww wx wy wz xw xx xy xz yw yx yy yz zw zx zy zz", IntToChar.stage2method(new int[]{0, 10, 99}));
    }
}
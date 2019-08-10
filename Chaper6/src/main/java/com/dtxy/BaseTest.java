package com.dtxy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseTest {
    @Test
    public void mytest1()
    {
        Assert.assertEquals(1,2);
    }
    @Test
    public void mytest2()
    {
        Assert.assertEquals(1,1);
    }
    @Test
    public void mytest3()
    {
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void LogDemo()
    {
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }
}

package org.example.smoke;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {


    @Test(retryAnalyzer = Retry.class)
    public void test0() {
        System.out.println("test 0");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"test1"},
    alwaysRun = true)
    public void test01() {
        System.out.println("test 01");
    }



    @DataProvider(name = "dbSql")
    public static Object[][] dbData() {
        return new Object[][] {
                {"SQL", Integer.valueOf("1")},
                {"NOSQL", Integer.valueOf("2")}
        };
    }

    @Parameters({"db"})
    @Test(dataProvider = "dbSql")
    public void test1(String e1, int e2) {
        System.out.println("test " + e1 + " " + e2);
    }

    @Test(groups = {"RegressTest"})
    public void test11() {
        System.out.println("test 11");
    }

    @Test(groups = {"RegressTest"})
    public void test111() {
        System.out.println("test 111");
    }
}
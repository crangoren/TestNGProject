package org.example.smoke;

import org.testng.annotations.Test;

public class Test2 {

    @Test(groups = {"SmokeTest", "RegressTest"})
    public void test2() {
        System.out.println("test 2");
    }
}

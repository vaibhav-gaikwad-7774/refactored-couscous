package com.example.tests;

import org.testng.annotations.Test;

public class GroupExample {

    @Test(groups = {"smoke"})
    public void smokeTest() {
        System.out.println("Executing Smoke Test");
    }

    @Test(groups = {"regression"})
    public void regressionTest() {
        System.out.println("Executing Regression Test");
    }

    @Test(groups = {"smoke", "regression"})
    public void smokeAndRegressionTest() {
        System.out.println("Executing Smoke and Regression Test");
    }
}

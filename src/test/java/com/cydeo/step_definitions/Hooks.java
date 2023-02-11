package com.cydeo.step_definitions;

/*
In this class we will be able to pass pre and post conditions to each
scenario and each step

 */

import io.cucumber.java.Before;

public class Hooks {

    //import from io.cucumber.java not from junit

    @Before
    public void setupScenario(){
        System.out.println("======Setting up browser using cucumber @Before");
    }

}

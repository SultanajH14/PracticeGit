package com.bit.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\SWEETY\\Desktop\\BTC31072021m\\MavenHomecucumber\\login.feature"},
tags = "@smoke", plugin= {"pretty","httml:report"})
public class Runner {

}

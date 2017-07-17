package com.wjk;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Unit test for simple App.
 * 
 * 
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"}, features={"src/test/features/"})
public class AppTest{ 
}

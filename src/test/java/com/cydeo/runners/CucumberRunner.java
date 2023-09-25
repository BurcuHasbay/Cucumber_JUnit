package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/burcuhasbay/IdeaProjects/Cucumber_JUnit/src/test/resources/features",
        glue = "com/cydeo/stepDefinitions",
        dryRun = false,
        tags = "@Regression"
)
public class CucumberRunner {
}

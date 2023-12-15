package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.tzt", "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

        features = "/Users/burcuhasbay/IdeaProjects/Cucumber_JUnit/src/test/resources/features",
        glue = "com/cydeo/stepDefinitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}

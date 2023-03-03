package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",

        }, //generate report
        features = "src/test/resources/myPracticeFeatures",
        glue = "com/cydeo/myPracticeStep_definitions",
        dryRun = false,
        tags = "",
        publish = false
)
public class CukesRunner {


}

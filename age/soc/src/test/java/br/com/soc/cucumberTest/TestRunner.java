package br.com.soc.cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/br/com/soc/feature"}
				, glue = {"br/com/soc/stepDefinition"}
				, plugin = {"html:target/cucumber-reports"}
				, dryRun = false
				, monochrome = true)
public class TestRunner {

}

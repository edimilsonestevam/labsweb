package br.sp.edimilsonestevam.stepdefinition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/br/sp/edimilsonestevam/feature"}
                , glue = { "src/test/java/br/sp/edimilsonestevam/stepDefinition" }
				, dryRun = false
			    )

public class ExecutarTestes {

}

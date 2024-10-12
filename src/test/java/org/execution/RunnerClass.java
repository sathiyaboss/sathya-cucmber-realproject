package org.execution;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions ( features = "src\\test\\resources\\facebook.feature",
                   glue = "org\\execution",
                   dryRun = false,
                   snippets = SnippetType.CAMELCASE,
                   monochrome = false,
                   strict = true,
                   tags = {"@smoke"}
                  
		)


public class RunnerClass {

}
///total cuumber options =8
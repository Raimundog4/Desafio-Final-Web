package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features",
		glue = {"stepdefinitions"},
		snippets = SnippetType.CAMELCASE
		)
public class TesteRunner {

}

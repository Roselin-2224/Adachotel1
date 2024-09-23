package runner;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\IbuRosy\\Ibrahim1\\Cucumber3\\src\\test\\java\\Feature"},glue={"stepdef","hook"},
dryRun = !true,snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,monochrome = true,
plugin = {"pretty","html:reports","json:report1/result.json","junit:report2/xml"}
)


public class Runner {

}

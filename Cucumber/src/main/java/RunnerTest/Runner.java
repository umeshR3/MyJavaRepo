package RunnerTest;


import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"StepDefinition"})
public class Runner {
}

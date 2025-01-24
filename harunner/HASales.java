package harunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/hafeatures/HASalesforce.feature", glue="hastepdefination", publish=true)

public class HASales extends AbstractTestNGCucumberTests{

}

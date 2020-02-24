package dummy1;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@CucumberOptions(monochrome=true,plugin= {"pretty","json:cucumber-reports.json"})
@RunWith(Cucumber.class)
public class Runner {

	
}

package Project20190519;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Resources\\FeatureFile\\",
                tags = "@register,@currencyChange",
                plugin = {"pretty", "html:target/cucumber-reports"})
public class RunTest
{
}

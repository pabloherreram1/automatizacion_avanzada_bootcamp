package automationcraft.delivery.runners.lineal;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/automationcraft/testcreation/jetsmartGrupo5/features"},
        glue = {"automationcraft.testcreation.jetsmartGrupo5.steps", "automationcraft.engine.bdd"},
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                  "timeline:test-output-thread"},
        tags = "@HotelBajo"
)
public class reg_001_jetsmartRunnerG5 {
}

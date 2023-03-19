package shopexample.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shopexample.CoreApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CoreApplication.class })
public class CucumberSpingConfiguration {}

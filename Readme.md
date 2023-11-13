@After
public void tearDown(Scenario scenario) {
if(scenario.isFailed()){
byte [] screenshot = ((TakesScreenshot) Driver.getDriver())
.getScreenshotAs(OutputType.BYTES);
scenario.attach(screenshot, "image/png", "screenshot");
}
Driver.quitDriver();
}


@RunWith(Cucumber.class)//This line will force this class to run with Cucumber
@CucumberOptions(
 # plugin = {"html:target/cucumber-report.html"},
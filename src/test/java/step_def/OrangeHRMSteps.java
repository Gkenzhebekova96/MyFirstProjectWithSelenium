package step_def;

import Utilitis.Config;
import Utilitis.Driver;
import io.cucumber.java.en.When;
import pages.OrangeHRMLoginPage;

public class OrangeHRMSteps {
    OrangeHRMLoginPage orangeHRMLoginPage=new OrangeHRMLoginPage();
    @When("User is on OrangeHRM login page")
    public void user_is_on_orange_hrm_login_page() throws InterruptedException {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

    }
    @When("User enters correct  username2")
    public void user_enters_correct_username2() {
        orangeHRMLoginPage.userName.sendKeys("Admin");

    }
    @When("User enters correct password")
    public void user_enters_correct_password() {
        orangeHRMLoginPage.password.sendKeys("admin123");

    }
    @When("User clicks to login button")
    public void user_clicks_to_login_button() {
        orangeHRMLoginPage.loginBTN.click();

    }

}

package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import pages.LoginPage;
import utilities.Driver;

public class MyStepdefs {
    LoginPage loginPage = new LoginPage();

    @And("password degistirmek icin password butonuna tiklar")
    public void passwordDegistirmekIcinPasswordButonunaTiklar() {
        Driver.wait(1);
        loginPage.cikisButton.click();
        Driver.wait(1);
        loginPage.passwordChangeButton.click();
    }
}

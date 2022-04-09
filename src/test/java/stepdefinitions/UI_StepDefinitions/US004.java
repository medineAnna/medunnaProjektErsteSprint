package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utilities.Driver;

public class US004 {
    LoginPage login = new LoginPage();
//    @And("kullanici oturumu kapatir")
//    public void kullaniciOturumuKapatir() {
//        login.kullaniciMenusu.click();
//        Driver.wait(1);
//        login.signOutButton.click();
//    }

    @Given("beni hatirla secenegini gorur")
    public void beniHatirlaSeceneginiGorur() {
        login.rememberMe.isDisplayed();
    }

    @And("Did you forget your password secenegini gorur")
    public void didYouForgetYourPasswordSeceneginiGorur() {
        login.forgetYourPassword.isDisplayed();
    }

    @And("Register a new Account secenegini gorur")
    public void registerANewAccountSeceneginiGorur() {
        login.registeraNewAccount.isDisplayed();
    }

    @Then("Cancel buttonunu gorur")
    public void cancelButtonunuGorur() {
        login.cancelButton.isDisplayed();
    }

    @And("kullanici browseri kapatir")
    public void kullaniciBrowseriKapatir() {
        Driver.wait(2);
        Driver.closeDriver();
    }
}

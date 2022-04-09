package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.UserSettingPage;
import utilities.Driver;

public class US_008_PasswordDegistirme {
    LoginPage us08 = new LoginPage();
    UserSettingPage us008 = new UserSettingPage();

    @And("simdiki sifre olarak {string}girer")
    public void simdikiSifreOlarakGirer(String arg0) {
        us008.currentPasswordBox.sendKeys(arg0);
    }
    @Then("yeni sifre kutusununa {string} girer")
    public void yeni_sifre_kutusununa_girer(String newPassword) {
       us008.newPasswordBox.sendKeys(newPassword);
    }
    @Then("yeni sifreyi tekrar girer {string}")
    public void yeni_sifreyi_tekrar_girer(String newPasswordConfirmation) {
       us008.newPasswordConfirmationBox.sendKeys(newPasswordConfirmation);
    }
    @Then("yeni sifreyi kaydetmek icin save butonuna basar")
    public void yeni_sifreyi_kaydetmek_icin_save_butonuna_basar() {
       us008.passwordChangeSaveButton.click();
        Driver.wait(2);
    }
    @And("kullanici {string} mesajini gorur")
    public void kullaniciMesajiniGorur(String passwordChanged) {
        String actualMsg=us008.passwordChangeSuccess.getText();
        Assert.assertEquals(passwordChanged,actualMsg);
    }
}

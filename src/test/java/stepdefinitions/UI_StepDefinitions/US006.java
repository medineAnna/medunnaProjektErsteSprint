package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import pages.DoctorPage;
import pages.LoginPage;
import utilities.Driver;

public class US006 {
    LoginPage login = new LoginPage();
    DoctorPage doktor = new DoctorPage();
    @And("Setting butonuna tiklar")
    public void settingButonunaTiklar() {
        login.kullaniciMenusu.click();
        Driver.wait(1);
        login.kullaniciSettingsButton.click();

    }

    @And("firstname olarak {string} girer")
    public void firstnameOlarakGirer(String isim) {
        doktor.settingsFirstNameBox.clear();
        Driver.wait(1);
        doktor.settingsFirstNameBox.sendKeys(isim);
    }

    @And("lastname olarak {string} girer")
    public void lastnameOlarakGirer(String lastname) {
        Driver.wait(1);
        doktor.settingsLastNameBox.clear();
        Driver.wait(1);
        doktor.settingsLastNameBox.sendKeys(lastname);
    }

    @And("email olarak {string} girer")
    public void emailOlarakGirer(String mail) {
        Driver.wait(1);
        doktor.settingsEmailBox.clear();
        doktor.settingsEmailBox.sendKeys(mail);
    }

    @And("Setting sayfasinda save butonuna basar")
    public void settingSayfasindaSaveButonunaBasar() {
        Driver.wait(1);
        doktor.settingsSaveButton.click();
        Driver.wait(1);
    }

    @And("Setting Saved! yazisini gorur")
    public void settingSavedYazisiniGorur() {
        doktor.settingsSaveSavedText.isDisplayed();
    }
}

package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.UserSettingPage;
import utilities.ConfigReader;
import utilities.Driver;


public class US_008_PasswordStrength {
    LoginPage us08 = new LoginPage();
    UserSettingPage us008 = new UserSettingPage();

    @Given("kullanici adrese gider")
    public void kullaniciAdreseGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @Given("kullanici girisi yapar")
    public void kullanici_girisi_yapar() {
        us08.anaSayfaGirisIkonu.click();
        Driver.wait(1);
        us08.anaSayfaSignIn.click();
        Driver.wait(1);
        us08.UserNameBox.sendKeys("usersz");
        Driver.wait(1);
        us08.passwordBox.sendKeys("abc.1111");
        Driver.wait(1);
        us08.signIn.click();
        System.out.println("1 OK");
        Driver.wait(1);
    }
    @Then("yeni sayfadan sifre kismini secer")
    public void yeni_sayfadan_sifre_kismini_secer() {
        us008.userDropdown.click();
        Driver.wait(1);
        us008.passwordChange.click();
        Driver.wait(1);
        System.out.println("2 OK");
        Driver.wait(1);
    }
    @Then("yeni sifre kutusununa {string} girilir")
    public void yeni_sifre_kutusununa_girilir(String AdminNewPassword) {
        us008.newPasswordBox.sendKeys(AdminNewPassword);
        System.out.println("3 OK");
        Driver.wait(1);
    }
    @Then("password {string} seviyesinin degistigi gorulur")
    public void password_seviyesinin_degistigi_gorulur(String strength) {
        renk(strength);
        System.out.println("4 OK");
        Driver.wait(1);
    }

    @Then("cikis yapilir")
    public void cikis_yapilir() {
        us008.userDropdown.click();
        us008.signOut.click();
        System.out.println("5 OK");
        Driver.wait(1);
    }

    private void renk(String strength) {
        if (Integer.parseInt(strength) == 1) {
            Assert.assertTrue(us008.strengthOne.isDisplayed());
            Driver.wait(1);
        } else if (Integer.parseInt(strength) == 2) {
            Assert.assertTrue(us008.strengthTwo.isDisplayed());
            Driver.wait(1);
        } else if (Integer.parseInt(strength) == 3) {
            Assert.assertTrue(us008.strengthThree.isDisplayed());
            Driver.wait(1);
        } else if (Integer.parseInt(strength) == 4) {
            Assert.assertTrue(us008.strengthFour.isDisplayed());
            Driver.wait(1);
        }else if (Integer.parseInt(strength) == 5){
            Assert.assertTrue(us008.strengthFive.isDisplayed());
            Driver.wait(1);
        }

    }


}


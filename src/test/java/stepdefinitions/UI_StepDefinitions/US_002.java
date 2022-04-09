package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegistrationPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_002 {

    RegistrationPage register=new RegistrationPage();

    @Then("UserName kutucuguna tiklar ardından boş bırakır ve {string} uyarı mesajını görüntüler")
    public void user_name_kutucuguna_tiklar_ardından_boş_bırakır_ve_uyarı_mesajını_görüntüler(String string) {
       register.userNameTextBox.click();
       register.emailTextBox.click();
        Assert.assertTrue(register.userNameRequiredMessage.isDisplayed());
    }

    @Then("{string} girildiginde {string} uyari mesaji gorulur")
    public void girildiginde_uyari_mesaji_gorulur(String ozelKarakter, String karakterler) {
        register.userNameTextBox.sendKeys(ozelKarakter+ Keys.TAB);
        Assert.assertTrue(register.usernameInvalidMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
    }

    @Then("harfler ve rakamlardan olusan herhangi bir karakter sinirlamasina tabi tutulmayan {string} girilir ve urari mesaji alinmaz")
    public void harfler_ve_rakamlardan_olusan_herhangi_bir_karakter_sinirlamasina_tabi_tutulmayan_girilir_ve_urari_mesaji_alinmaz(String username) {
        register.userNameTextBox.sendKeys(username+Keys.TAB);
        Assert.assertTrue(register.userNameValidConfirm.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
    }

    @Then("Email kutucuğuna tıklar ardından boş bırakır ve {string} uyarı mesajını görüntüler")
    public void email_kutucuğuna_tıklar_ardından_boş_bırakır_ve_uyarı_mesajını_görüntüler(String string) {
        register.emailTextBox.click();
        register.userNameTextBox.click();
        Assert.assertTrue(register.emailRequiredMessage.isDisplayed());
    }

    @Then("Email kutucuğuna {int} karakterden az {string} yollandığında {string} uyarı mesajı görüntülenmeli")
    public void email_kutucuğuna_karakterden_az_yollandığında_uyarı_mesajı_görüntülenmeli(Integer int1, String karakter, String string2) {
        register.emailTextBox.sendKeys(karakter+Keys.TAB);
        Assert.assertTrue(register.emailCharacterMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
    }

    @Then("{string} ve {string} karakterlerini herhangi bir yerde geçirerek {string}, {string} uyarı mesajı görüntülenmeli")
    public void ve_karakterlerini_herhangi_bir_yerde_geçirerek_uyarı_mesajı_görüntülenmeli(String string, String string2, String gecersizMail, String string4) {
        register.emailTextBox.sendKeys(gecersizMail+Keys.TAB);
        Assert.assertTrue(register.emailInvalidMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
    }

    @Then("{string} adresi icin {string} karakterinden önce  ve sonra karakterler yer almalı ardından {string}  karakteri gelmeli onu takiben de karakterler gelmeli ve herhangi bir uyarı mesajı alınmamalı")
    public void adresi_icin_karakterinden_önce_ve_sonra_karakterler_yer_almalı_ardından_karakteri_gelmeli_onu_takiben_de_karakterler_gelmeli_ve_herhangi_bir_uyarı_mesajı_alınmamalı(String gecerliMail, String string2, String string3) {
        register.emailTextBox.sendKeys(gecerliMail+Keys.TAB);
        Assert.assertTrue(register.emailValidConfirm.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
    }

}

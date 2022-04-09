package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_003 {

    RegistrationPage registrationPage = new RegistrationPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("{string} adresine gider")
    public void adresineGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }

    @And("kullanici giris ikonunu tiklar")
    public void kullaniciGirisIkonunuTiklar() {
        registrationPage.SigninObjeLinki.click();
        Driver.wait(1);
    }

    @Then("RegisterLinki ni tiklar")
    public void registerlinkiNiTiklar() {
        registrationPage.RegisterLinki.click();
        Driver.wait(1);
    }

    @When("Hepsi kucuk, buyuk, rakam veya ozel olan ayni gruptan en az {int} karakterli bir sifreyi New password Box'a girer")
    public void hepsiKucukBuyukRakamVeyaOzelOlanEnAzKarakterliBirSifreyiNewPasswordBoxAGirer(int arg0) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        registrationPage.NewPasswordKutusu.sendKeys("aaaaaaa");
    }

    @And("{string} passwordstregnth seviyesinin degismedigini ve color{int} seviyesinde kaldigini gorur.")
    public void passwordstregnthSeviyesininDegismediginiVeColorSeviyesindeKaldiginiGorur(String arg0, int arg1) {
        Assert.assertTrue(registrationPage.color1.isDisplayed());
    }

    @Given("Kullanici en az {int} en fazla {int} kucuk harf kullanarak {int} karakterli bir sifre girer")
    public void kullaniciEnAzIntEnFazlaIntKucukHarfKullanarakIntKarakterliSifreGirer(int arg0, int arg1, int arg2) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        registrationPage.NewPasswordKutusu.sendKeys("aaaaaaA");
    }

    @And("{string} passwordstregnth seviyesinin degistigini gorur.")
    public void passwordstregnthSeviyesininDegistiginiGorur(String arg0) {
        Assert.assertTrue(registrationPage.color2.isDisplayed());
    }

    @Given("Kullanici en az {int} en fazla {int} buyuk harf kullanarak {int} karakterli sifre girer")
    public void kullaniciEnAzEnFazlaBuyukHarfKullanarakKarakterliSifreGirer(int arg0, int arg1, int arg2) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        registrationPage.NewPasswordKutusu.sendKeys("AAAAAAa");
    }

    @Given("Kullanici en az {int} en fazla {int} rakam harf kullanarak {int} karakterli sifre girer")
    public void kullaniciEnAzEnFazlaRakamHarfKullanarakKarakterliSifreGirer(int arg0, int arg1, int arg2) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        registrationPage.NewPasswordKutusu.sendKeys("111111a");
    }

    @Given("Kullanici en az {int} en fazla {int} ozel karakter kullanarak {int} karakterli sifre girer")
    public void kullaniciEnAzEnFazlaOzelKarakterKullanarakKarakterliSifreGirer(int arg0, int arg1, int arg2) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        registrationPage.NewPasswordKutusu.sendKeys("%%%%%%a");
    }

    @Given("Kullanici {int} farkli gruptan karakter kullanarak {int} karakterli sifre girer")
    public void kullaniciFarkliGruptanKarakterKullanarakKarakterliSifreGirer(int arg0, int arg1) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        registrationPage.NewPasswordKutusu.sendKeys("aaaaAAA");
    }

    @And("{string} passwordstregnth seviyesinin color{int} seviyesine degistigini gorur.")
    public void passwordstregnthSeviyesininColor2SeviyesineDegistiginiGorur(String arg0, int arg1) {
        Assert.assertTrue(registrationPage.color2.isDisplayed());
    }

    @Given("Kullanici {int} farkli gruptan karakterler kullanarak {int} karakterli sifre girer")
    public void kullaniciFarkliGruptanKarakterlerKullanarakKarakterliSifreGirer(int arg0, int arg1) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        registrationPage.NewPasswordKutusu.sendKeys("aaaAA11");
    }

    @And("{string} passwordstregnth seviyesinin color{int} ve color{int} seviyesine degistigini gorur.")
    public void passwordstregnthSeviyesininColorVeColorSeviyesineDegistiginiGorur(String arg0, int arg1, int arg2) {
        Assert.assertTrue(registrationPage.color3.isDisplayed());
        Assert.assertTrue(registrationPage.color4.isDisplayed());
    }

    @Given("Kullanici {int} farkli gruptan da karakterler kullanarak {int} karakterli sifre girer")
    public void kullaniciFarkliGruptanDaKarakterlerKullanarakKarakterliSifreGirer(int arg0, int arg1) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        registrationPage.NewPasswordKutusu.sendKeys("aAA11%%");
    }

    @And("{string} passwordstregnth seviyesinin de color{int} seviyesine degistigini gorur.")
    public void passwordstregnthSeviyesininDeColorSeviyesineDegistiginiGorur(String arg0, int arg1) {
        Assert.assertTrue(registrationPage.color5.isDisplayed());
    }
}

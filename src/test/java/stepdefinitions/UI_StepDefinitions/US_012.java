package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US012MedinePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_012 {
    US012MedinePage us012MedinePage=new US012MedinePage();

    @Given("doktor {string} gider")
    public void doktorMedunnaUrlGider(String url) {
        Driver.wait(1);
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("Login ikonuna tklar")
    public void loginIkonuTikla() {
        Driver.wait(1);
        us012MedinePage.loginButton.click();
    }
    @Given("Sign in sekmesine tiklar")
    public void signInButtonuTikla() {
        Driver.wait(1);
        us012MedinePage.anaSayfadakiSignInButtonu.click();

    }
    @Then("{string} ve {string} bilgileri girilerek, Sign in buttonuna tiklar")
    public void signInBilgileriGirilir(String username, String password) {
        Driver.wait(1);
        us012MedinePage.signInUsernameBox.sendKeys(ConfigReader.getProperty(username));
        us012MedinePage.signInPasswordBox.sendKeys(ConfigReader.getProperty(password));
        us012MedinePage.kisiBilgileriGirildiktenSonraSignInButton.click();
    }
    @Then("My Pages sekmesine tiklar")
    public void myPagesSekmesiTikla() {
        Driver.wait(1);
        us012MedinePage.anasayfadakiMyPagesSekmesi.click();
    }
    @Then("My Appointments secenegini secer ve tiklar")
    public void myAppointmentsSecenegiSec() {
        Driver.wait(1);
        us012MedinePage.myPagesSekmesindekiMyAppointmentsButtonu.click();
    }
    @Given("Test isteyebilmek icin, hastanin satirindaki Edit buttonuna tiklar")
    public void hastaSatirindakiEditButtonuTiklar() {
        Driver.wait(1);
        us012MedinePage.hastaSatirindakiEditButtonu.click();
    }
    @Given("Yeni sayfada acilan Request A Test buttonuna tiklar")
    public void yeniSayfadaAcilanRequestTestTikla() {
        Driver.wait(1);
        us012MedinePage.testIstemeRequestATestButtonu.click();
    }
    @When("Test Items texti gorunur oldugunu dogrular")
    public void textiGorunurluguTestEtr() {
        Driver.wait(1);
        Assert.assertTrue(us012MedinePage.testIstemsTextYazisi.isDisplayed());
       /* System.out.println(Driver.getDriver().switchTo().alert().getText());
        String alertYazisi=Driver.getDriver().switchTo().alert().getText();
        System.out.println(alertYazisi);
        Assert.assertEquals(istenilecekTestYazi,alertYazisi);*/
    }

    @And("Test Item texti altinda, Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin testlerin sagindaki check boxu tiklar")
    public void testItemTextiAltindaTestlerinSagindakiCheckBoxuTiklar() {
        Driver.wait(2);
        us012MedinePage.ureaCheck.click();
        us012MedinePage.creatinineCheck.click();
        us012MedinePage.sodiumCheck.click();
        us012MedinePage.potassiumCheck.click();
        us012MedinePage.totalProteinCheck.click();
        us012MedinePage.hemoglobinCheck.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.click(us012MedinePage.albuminCheck);
        //us012MedinePage.albuminCheck.click();
        Driver.wait(1);
    }
    @Then("Save buttonu gorunene kadar asagiya inilir ve tiklar")
    public void buttonu_gorunene_kadar_asagiya_inilir_ve_tiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us012MedinePage.saveButton);
        actions.doubleClick(us012MedinePage.saveButton);
        Driver.waitAndClick(us012MedinePage.saveButton,3);
    }
    @And("A new is created with identifier yazisi test edilir")
    public void aNewIsCreatedYazisiTestEdilir() {
        Driver.wait(1);
        Assert.assertTrue(us012MedinePage.toastContainerSuccessMessage.isDisplayed());
    }
    @When("Login ikonuna tklar ve Sign out sekmesine tiklar")
    public void signOutSekmesineTiklar() {
        Driver.wait(1);
        us012MedinePage.medineAnnaIkonButtonu.click();
        us012MedinePage.signOutButtonu.click();
        Driver.closeDriver();
    }
}
package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_005 {
    AppointmentPage us05 = new AppointmentPage();

    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Make an Appointment Butonuna tiklar")
    public void makeAnAppointmentButonunaTiklar() {
        Driver.wait(1);
        us05.makeAppointmentButton.click();
        Driver.wait(1);

    }


    @And("soy isim {string} girer")
    public void soyIsimGirer(String lastName) {
        Driver.wait(1);
        us05.lastNameBox.sendKeys(lastName);
    }

    @And("SSN numarasi olarak {string} girer")
    public void ssnNumarasiOlarakGirer(String ssn) {
        Driver.wait(1);
        us05.SSNBox.sendKeys(ssn);
    }

    @And("Email adresi olarak {string} girer")
    public void emailAdresiOlarakGirer(String arg0) {
        Driver.wait(1);
        us05.emailBox.sendKeys(arg0);
    }

    @And("Telefon numarasi olarak {string} girer")
    public void telefonNumarasiOlarakGirer(String arg0) {
        Driver.wait(1);
        us05.phoneBox.sendKeys(arg0);
    }


    @And("Appointment Date olarak {string} girer")
    public void appointmentDateOlarakGirer(String arg0) {
        Driver.wait(1);
        us05.appointmentDateBox.sendKeys(arg0);
    }

    @Then("Send an Appointment Request butonuna tiklar.")
    public void sendAnAppointmentRequestButonunaTiklar() {
        //us05.sendAnAppointmentRequestButton.sendKeys(Keys.END);
        Driver.wait(1);
        us05.sendAnAppointmentRequestButton.click();
    }

    @And("{string} hata mesajini gorur.")
    public void hataMesajiniGorur(String arg0) {
        String expectedText = arg0;
        String actualText = us05.hataMesaji.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @And("isim olarak {string} girer")
    public void isimOlarakGirer(String arg0) {
        us05.firstNameBox.sendKeys(arg0);
    }

    @And("{string} onay mesaji gorulur.")
    public void onayMesajiGorulur(String arg0) {
        Driver.wait(1);
        String expectedText=arg0;
        String actualtext = us05.registerOnayMesaji.getText();
        Assert.assertEquals(expectedText,actualtext);

    }


}
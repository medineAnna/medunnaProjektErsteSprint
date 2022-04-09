package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DoctorPage;
import utilities.Driver;

public class US_014 {
    DoctorPage doctorPage = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;


    @And("kullanici\\(Doktor)InPaients secenegini tiklar")
    public void kullaniciDoktorInPaientsSeceneginiTiklar() {
        Driver.wait(1);
        doctorPage.myInpatientsSeceneği.click();

    }
    @And("kullanici\\(Doktor) {string} sayfasına gelir")
    public void kullaniciDoktorSayfasınaGelir(String arg0) {
        Driver.wait(1);
        String expectedText=arg0;
        String actualText=doctorPage.InPatientsYazisi.getText();
        Assert.assertEquals(expectedText,actualText);
    }


    @Then("kullanici\\(Doktor) hastanin edit butonuna tiklar")
    public void kullaniciDoktorHastaninEditButonunaTiklar() {
        doctorPage.InPatientEditbutonu.click();
    }


    @Given("kullanici\\(Doktor) ID, start and end dates, description, created date bilgilerini goruntuler")
    public void kullaniciDoktorIDStartAndEndDatesDescriptionCreatedDateBilgileriniGoruntuler() {
    }

    @And("kullanici\\(Doktor)appointment id, status, room and patient bilgilerini görüntüler.")
    public void kullaniciDoktorAppointmentIdStatusRoomAndPatientBilgileriniGörüntüler() {
    }

    @Then("kullanici\\(Doktor) ID, start and end dates, description, created date bilgilerini gunceller")
    public void kullaniciDoktorIDStartAndEndDatesDescriptionCreatedDateBilgileriniGunceller() {
    }

    @And("kullanici\\(Doktor) appointment id, status, room and patient bilgilerini gunceller")
    public void kullaniciDoktorAppointmentIdStatusRoomAndPatientBilgileriniGunceller() {
    }

    @Given("kullanici\\(Doktor)Status doktor tarafından UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED olarak guncellenir")
    public void kullaniciDoktorStatusDoktorTarafındanUNAPPROVEDDISCHARGEDSTILLSTAYINGVeyaCANCELLEDOlarakGuncellenir() {
    }

    @Given("kullanici\\(Doktor) rezerve edilmiş odayı gunceller")
    public void kullaniciDoktorRezerveEdilmişOdayıGunceller() {
    }


}
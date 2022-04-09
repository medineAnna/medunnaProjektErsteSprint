package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.US012MedinePage;
import utilities.ConfigReader;
import utilities.Driver;


public class US_013 {
    US012MedinePage us013MedinePage=new US012MedinePage();
    @Given("user {string} gider")
    public void user_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("Login ikonuna tiklar")
    public void login_ikonuna_tiklar() {
        Driver.wait(1);
        us013MedinePage.loginButton.click();
    }
    @Given("Sign in sekmesini tiklar")
    public void sign_in_sekmesini_tiklar() {
        Driver.wait(1);
        us013MedinePage.anaSayfadakiSignInButtonu.click();
    }
    @Given("My Pages sekmesini tiklar")
    public void my_pages_sekmesini_tiklar() {
        Driver.wait(1);
        us013MedinePage.anasayfadakiMyPagesSekmesi.click();
    }
    @Given("Search Patient sekmesini tiklar")
    public void search_patient_sekmesini_tiklar() {
        Driver.wait(1);
        us013MedinePage.myPagesdekiSearchPatientButtonu.click();
    }
    @Given("Patient SSN boxuna, hastanin {string} ni yazar ve entere tiklar")
    public void patient_ssn_boxuna_hastanin_ni_yazar_ve_entere_tiklar(String ssn) {
        Driver.wait(1);
        us013MedinePage.hastaSsnNumarasiIleAramaButtonu.sendKeys(ssn + Keys.ENTER);
    }
    @Given("Cikan hastanin satirindaki Show Appointments tiklar")
    public void cikan_hastanin_satirindaki_show_appointments_tiklar() {
        Driver.wait(1);
        us013MedinePage.ssndekiShowAppointmentsButton.click();
    }
    @Given("acilan yeni pencereden, hastanin satirindaki Show Tests buttonuna tiklar")
    public void acilan_yeni_pencereden_hastanin_satirindaki_show_tests_buttonuna_tiklar() {
        Driver.wait(1);
        us013MedinePage.showAppointmentSonraShowTest.click();
    }
    @Given("View Rasults sekmesini tiklar")
    public void view_rasults_sekmesini_tiklar() {
        Driver.wait(1);
        us013MedinePage.showTestSonraViewResult.click();
    }
    @Then("Testleri guncellemek icin Edit sekmesini tiklar")
    public void testleri_guncellemek_icin_edit_sekmesini_tiklar() {
        Driver.wait(1);
        us013MedinePage.viewResultSonraEditButtonu.click();
    }
    @Then("save buttonuna tiklar")
    public void save_buttonuna_tiklar() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", us013MedinePage.testResulttekiSaveButtonu);
        Driver.wait(1);
        us013MedinePage.testResulttekiSaveButtonu.click();
    }
    @Then("A Test Result is update with identifier texti test edilir")
    public void a_test_result_is_update_with_identifier_texti_test_edilir() {
        Driver.wait(1);
        Assert.assertTrue(us013MedinePage.toastContainerSuccessMessage.isDisplayed());
    }
    @Given("Test sonucunu gormek istedigi hastanin, hasta satirinda bulunan Edit buttonuna tiklar")
    public void test_sonucunu_gormek_istedigi_hastanin_hasta_satirinda_bulunan_edit_buttonuna_tiklar() {
        Driver.wait(1);
        us013MedinePage.hastaSatirindakiEditButtonu.click();
    }
    @Then("Show Test Results buttonunu tiklar")
    public void show_test_results_buttonunu_tiklar() {
        Driver.wait(1);
        us013MedinePage.hastadakiEditSonraShowTestResult.click();
    }
    @Then("View Results buttonuna tiklar")
    public void view_results_buttonuna_tiklar() {
        Driver.wait(1);
        us013MedinePage.testViewResultButtonu.click();
    }
    @Then("Test Results sayfasinda test sonuclarini gordugunu test eder")
    public void test_results_sayfasinda_test_sonuclarini_gordugunu_test_eder() {
        Driver.wait(1);
        Assert.assertTrue(us013MedinePage.potassium.isDisplayed());
        Assert.assertTrue(us013MedinePage.totalProtein.isDisplayed());
        Assert.assertTrue(us013MedinePage.creatinine.isDisplayed());
        Assert.assertTrue(us013MedinePage.hemoglobin.isDisplayed());
        Assert.assertTrue(us013MedinePage.urea.isDisplayed());
        Assert.assertTrue(us013MedinePage.sodium.isDisplayed());
    }
    @Then("Request Inpatient buttonuna tiklar")
    public void request_inpatient_buttonuna_tiklar() {
        Driver.wait(1);
        us013MedinePage.myPatientstekiRequesInpatientButton.click();
    }
    @Then("My Inpatients secenegini secer ve tiklar")
    public void my_inpatients_secenegini_secer_ve_tiklar() {
        Driver.wait(1);
        us013MedinePage.myPatientstekiMyInpatients.click();
    }
    @Then("In patients sayfasinda hastayi gordugunu test eder")
    public void in_patients_sayfasinda_hastayi_gordugunu_test_eder() {
        Driver.wait(1);
        Assert.assertTrue(us013MedinePage.myInpatientsSonraInPatientsButton.isDisplayed());
    }
}

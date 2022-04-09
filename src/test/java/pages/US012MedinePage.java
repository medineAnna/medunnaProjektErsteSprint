package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US012MedinePage {
    public US012MedinePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement anaSayfadakiSignInButtonu;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement kisiBilgileriGirildiktenSonraSignInButton;

    @FindBy(xpath = "//span[.='MY PAGES']")
    public WebElement anasayfadakiMyPagesSekmesi;

    @FindBy(xpath = "//span[.='My Appointments']")
    public WebElement myPagesSekmesindekiMyAppointmentsButtonu;

    @FindBy(xpath = "(//div[@class='btn-group flex-btn-group-container'])[1]")
    public WebElement hastaSatirindakiEditButtonu;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement testIstemeRequestATestButtonu;

    @FindBy(xpath = "//h2[.='Test Items']")
    public WebElement testIstemsTextYazisi;

    @FindBy(xpath = "//input[@id = '1401']")
    public WebElement glucoseCheck;

    @FindBy(id = "1402")
    public WebElement ureaCheck;

    @FindBy(id = "1403")
    public WebElement creatinineCheck;

    @FindBy(id = "1404")
    public WebElement sodiumCheck;

    @FindBy(id = "1405")
    public WebElement potassiumCheck;

    @FindBy(id = "1406")
    public WebElement totalProteinCheck;

    @FindBy(id = "1407")
    public WebElement albuminCheck;

    @FindBy(id = "1408")
    public WebElement hemoglobinCheck;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(className = "Toastify")
    public WebElement toastContainerSuccessMessage;

    @FindBy(xpath = "//span[.='Medine Anna']")
    public WebElement medineAnnaIkonButtonu;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOutButtonu;

    @FindBy(xpath = "//span[.='Search Patient']")
    public WebElement myPagesdekiSearchPatientButtonu;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement hastaSsnNumarasiIleAramaButtonu;

    @FindBy(xpath = "(//span[.='Show Appointments'])[1]")
    public WebElement ssndekiShowAppointmentsButton;

    @FindBy(xpath = "(//span[.='Show Tests'])[1]")
    public WebElement showAppointmentSonraShowTest;

    @FindBy(xpath = "(//span[.='View Results'])[1]")
    public WebElement showTestSonraViewResult;

    @FindBy(xpath = "(//span[.='Edit'])[1]")
    public WebElement viewResultSonraEditButtonu;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement testResulttekiSaveButtonu;

    @FindBy(xpath = "//a[.='Show Test Results']")
    public WebElement hastadakiEditSonraShowTestResult;

    @FindBy(xpath = "(//span[.='View Results'])[1]")
    public WebElement testViewResultButtonu;

    @FindBy(xpath = "//td[.='Potassium']")
    public WebElement potassium;

    @FindBy(xpath = "//td[.='Total protein']")
    public WebElement totalProtein;

    @FindBy(xpath = "//td[.='Creatinine']")
    public WebElement creatinine;

    @FindBy(xpath = "//td[.='Hemoglobin']")
    public WebElement hemoglobin;

    @FindBy(xpath = "//td[.='Urea']")
    public WebElement urea;

    @FindBy(xpath = "//td[.='Sodium']")
    public WebElement sodium;

    @FindBy(xpath = "//button[.='Request Inpatient']")
    public WebElement myPatientstekiRequesInpatientButton;

    @FindBy(xpath = "//span[.='My Inpatients']")
    public WebElement myPatientstekiMyInpatients;

    @FindBy(xpath = " //span[.='In Patients']")
    public WebElement myInpatientsSonraInPatientsButton;



}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class StaffPage {


    public StaffPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement insanFiguru;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement IlkSigIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement UsernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordBox;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement SigInButton;

    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPagesButonu;

    @FindBy(xpath = "//span[normalize-space()='Search Patient']")
    public WebElement searchPatientButonu;

    @FindBy(xpath = "//span[normalize-space()='Patients']")
    public WebElement patientsYazisi;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patentSsnBox;

    @FindBy(xpath = "//*[@id=\"system\"]/td[11]/div/a[3]")
    public WebElement adminDeleteButton;


    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editBox;

    @FindBy(xpath = "//input[@id='patient-firstName']")
    public WebElement firstnameTextbox;

    @FindBy(xpath = "//input[@id='patient-lastName']")
    public WebElement lastnameTextbox;

    @FindBy(xpath = "//input[@id='patient-birthDate']")
    public WebElement birthdateTextbox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextbox;

    @FindBy(xpath = "//input[@id='patient-phone']")
    public WebElement phoneTextbox;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropdownElement;

    @FindBy(xpath = "//select[@id='patient-bloodGroup']")
    public WebElement bloodGroupDropdownElement;

    @FindBy(xpath = "//input[@id='patient-adress']")
    public WebElement addressTextbox;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement descriptionTextbox;

    @FindBy(xpath = "//select[@id='patient-user']")
    public WebElement userBox;

    @FindBy(xpath = "//select[@id='patient-country']")
    public WebElement countryDropdownElement;

    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement stateButton;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement saveToastify;


    @FindBy(xpath = "(//div[text()='This field is required.'])[1]")
    public WebElement deleteHataYazisi;

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy(xpath = "//tbody/tr[1]/td[16]/div[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//table[@class='table']//thead")
    public List<WebElement> headerTable;

    @FindBy(xpath = "//tbody//tr[1]")
    public WebElement satirElementi;

    public List<WebElement> hastaBilgileri() {

        List<WebElement> tabloSatiri = new ArrayList<>();
        WebElement istenenHucreDegeri = null;
        for (int i = 1; i < 16; i++) {
            String dinamikSatirXpath = "//tbody//tr//td[" + i + "]";
            istenenHucreDegeri = Driver.getDriver().findElement(By.xpath(dinamikSatirXpath));
            tabloSatiri.add(istenenHucreDegeri);
        }
        return tabloSatiri;


    }
}

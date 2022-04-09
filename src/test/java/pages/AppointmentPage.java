package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AppointmentPage {

    public AppointmentPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }




@FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAppointmentButton;


@FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameBox;

@FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameBox;

@FindBy(xpath = "//input[@id='ssn']")
    public WebElement SSNBox;

@FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

@FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneBox;

@FindBy(xpath = "//input[@id='appoDate']")
    public WebElement appointmentDateBox;

@FindBy(xpath = "//button[@id='register-submit']")
    public WebElement sendAnAppointmentRequestButton;

@FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement hataMesaji;

@FindBy(xpath = "//strong[normalize-space()='Appointment registration saved!']")
    public WebElement registerOnayMesaji;  // "Appointment registration saved! We will call you as soon as possible."





}
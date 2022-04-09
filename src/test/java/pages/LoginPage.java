package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement anaSayfaGirisIkonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement anaSayfaSignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement UserNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;

    @FindBy(xpath = "//li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement cikisIconu;

    @FindBy(xpath = "//span[normalize-space()='Sign out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//span[normalize-space()='Remember me']")
    public WebElement rememberMe;

    @FindBy(xpath = "//span[normalize-space()='Did you forget your password?']")
    public WebElement forgetYourPassword;

    @FindBy(xpath = "//div[@role='dialog']//div[4]")
    public WebElement registeraNewAccount;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton;
    @FindBy(xpath = "//li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement kullaniciMenusu;

    @FindBy(xpath = "//span[normalize-space()='Settings']")
    public WebElement kullaniciSettingsButton;


    @FindBy(xpath = "//li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement cikisButton;

    @FindBy(xpath = "//a[@class='dropdown-item active']")
    public WebElement passwordChangeButton;

    @FindBy(xpath = "//input[@id='currentPassword']")
    public WebElement cuurentPasswordBox;

    @FindBy(xpath = "//input[@id='newPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement passwordSaveButton;







}

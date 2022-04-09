package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSettingPage {
    public UserSettingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //#######password degisim sayfasi#######
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement userDropdown;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement passwordChange;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordBox;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement newPasswordConfirmationBox;

    @FindBy(xpath = "//ul[@id='strengthBar']")
    public WebElement strengthBar;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 0, 0)')][1]")
    public WebElement strengthOne;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 153, 0)')][2]")
    public WebElement strengthTwo;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(153, 255, 0)')][3]")
    public WebElement strengthThree;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(0, 255, 0)')][4]")
    public WebElement strengthFour;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(0, 255, 0)')][5]")
    public WebElement strengthFive;

    //@FindBy(xpath = "//*[text()='Save']")
    //public WebElement passwordChangeSaveButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement passwordChangeSaveButton;

    @FindBy(xpath = "//*[text()='Password changed!']")
    public WebElement passwordChangeSuccess;

    @FindBy(xpath = "//span[normalize-space()='Sign out']")
    public WebElement signOut;













}

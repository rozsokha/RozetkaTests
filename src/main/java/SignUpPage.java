import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@name ='title']")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@name ='login']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@name ='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@class ='btn-link btn-link-green btn-link-sign']")
    private WebElement registrationButton;

    @FindBy(xpath = "//*[@class='signup-title']")
    private WebElement headingText;

    public SignUpPage clickRegistrationButton() {
        registrationButton.click();
        return this;
    }

    public SignUpPage typeName(String name) {
//        driver.findElement((By) firstNameField).sendKeys(name);
        firstNameField.sendKeys(name);
        return this;
    }

    public SignUpPage typeEmail(String email) {
//        driver.findElement((By) emailField).sendKeys(email);
        emailField.sendKeys(email);
        return this;
    }

    public SignUpPage typePassword(String password) {
//        driver.findElement((By) passwordField).sendKeys(password);
        passwordField.sendKeys(password);
        return this;
    }

    public AccountPage registration(String name, String email, String password) {
        this.typeName(name);
        this.typeEmail(email);
        this.typePassword(password);
        this.clickRegistrationButton();
        return new AccountPage(driver);
    }

    public String getHeadingText() {
        return headingText.getText();
    }


}

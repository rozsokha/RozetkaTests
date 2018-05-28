import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

//    @FindBy(xpath = "//*[@class=\"btn-link btn-link-blue main-popup-user-auth-btn\"]")
//        private WebElement voitiVLichnijKabimetBtn;
//
//    @FindBy(xpath = "//*[@class=\"auth-f-signup\"]")
//        private  WebElement signUpLink;

    @FindBy(xpath = "//*[@class=\"auth-b-reg-user novisited\"]")
    private WebElement newUserRegistrationLink;


    public SignUpPage clickNewUserRegistration() {
        newUserRegistrationLink.click();
        return PageFactory.initElements(driver, SignUpPage.class);
    }
}

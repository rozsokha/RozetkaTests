import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void signUpTest() {
        SignUpPage signUpPage = mainPage.clickNewUserRegistration();
        String headingText = signUpPage.getHeadingText();
        Assert.assertEquals("Регистрация", headingText);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}

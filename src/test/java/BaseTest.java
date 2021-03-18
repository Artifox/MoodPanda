import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.MoodPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    LoginPage loginPage;
    MoodPage moodPage;

    @BeforeMethod
    public void setUp(){
        Configuration.browser = "chrome"; //тип браузера
        Configuration.headless = false; //не открывать браузер
        Configuration.startMaximized = true; //большой экран
        Configuration.timeout = 5000; //implicitly wait
        loginPage = new LoginPage();
        moodPage = new MoodPage();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if (getWebDriver() != null){
            getWebDriver().quit();
        }
    }
}

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MoodPandaTest extends BaseTest{

    String email = "moodpanda123@mailinator.com";
    String password = "moodpanda123@mailinator.com";

    @Test
    public void updateMood(){
        loginPage.openPage();
        loginPage.login(email, password);
        moodPage.clickUpdate();
        moodPage.updateMood(2, "ololo");
    }
}

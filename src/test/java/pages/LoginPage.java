package pages;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public static final String EMAIL_INPUT = "#ContentPlaceHolderContent_TextBoxEmail";
    public static final String PASS_INPUT = "#ContentPlaceHolderContent_TextBoxPassword";
    public static final String LOGIN_BUTTON = "#ContentPlaceHolderContent_ButtonLogin";

    public void openPage() {
        open("https://moodpanda.com/login/");
    }

    public void login(String email, String password) {
        $(EMAIL_INPUT).setValue(email);
        $(PASS_INPUT).setValue(password);
        $(LOGIN_BUTTON).click();
        $(LOGIN_BUTTON).shouldNotBe(Condition.visible);
    }
}

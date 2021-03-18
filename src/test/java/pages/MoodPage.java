package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MoodPage {
    public static final String UPDATE_MOOD_BUTTON = "#LinkUpdate";
    public static final String SLIDER = ".ui-slider-handle";
    public static final String DESCRIPTION = "#TextBoxUpdateMoodTag";
    public static final String UPDATE_BUTTON = ".ButtonUpdate";
    public static final String TO_MY_DIARY_BUTTON = ".ButtonMyDiary";

    public void clickUpdate() {
        $(UPDATE_MOOD_BUTTON).click();
    }

    //TODO update date too
    public void updateMood(int rating, String description) {
        setMood(rating);
        $(DESCRIPTION).sendKeys(description);
        $(UPDATE_BUTTON).click();
        $(TO_MY_DIARY_BUTTON).click();
        /*int current = 5;
        if (rating > current){
            int diff = rating - current;
            for (int i = 0; i > diff; i++){
                $(SLIDER).sendKeys(Keys.ARROW_RIGHT);
            }
        } else if (rating < current){
            int diff = current - rating;
            for (int i = 0; i < diff; i++){
                $(SLIDER).sendKeys(Keys.ARROW_LEFT);
            }
        }*/
        //click to slider
        //move right or left by diff between rating and current value
    }

    private void setMood(int rating){
        $(SLIDER).click();
        int defaultMood = 5;
        Keys direction = Keys.LEFT;
        int steps = Math.abs(rating - defaultMood);
        if (rating > defaultMood){
            direction = Keys.RIGHT;
        }
        for (int i = 0; i < steps; i++){
            $(SLIDER).sendKeys(direction);
        }
    }
}

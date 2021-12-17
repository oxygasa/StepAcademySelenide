package pages.home;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

public class HomePage extends BasePage {

    public static final SelenideElement ADD_BUTTON = $x("//a[@id='create-entry']");
    public static final SelenideElement EDITABLE_AREA =$x("//div[@id='editable']");
    public static final SelenideElement HOME_BUTTON =$x("//a[@id='back-to-overview']");

}
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static void loginHomepage(){
        // Click Login from Homepage
        click(Locators.LOGIN_HOMEPAGE);
        isVisible(Locators.LOGIN_USERNAME_FIELD);
    }
}

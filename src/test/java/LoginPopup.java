import org.openqa.selenium.WebDriver;

public class LoginPopup extends BasePage{
    public LoginPopup(WebDriver driver) {super(driver);}


    public void loginSuccess(){
//        Type Username
        enterText(Locators.LOGIN_USERNAME_FIELD, TestData.VALID_USERNAME);

//        Type Password
        enterText(Locators.LOGIN_PASSWORD_FIELD, TestData.VALID_PASSWORD);

//        Click Login Button
        click(Locators.LOGIN_BUTTON);

//        Wait For Element Visible
        isVisible(Locators.MY_ACCOUNT);
    }

    public void loginFailedWrongUsername() {
//        Objek untuk memanggil non static variabel
        TestData callvar = new TestData();

//        Type Username
        enterText(Locators.LOGIN_USERNAME_FIELD, callvar.INVALID_USERNAME);

//        Type Password
        enterText(Locators.LOGIN_PASSWORD_FIELD, TestData.VALID_PASSWORD);

//        Click Login Button
        click(Locators.LOGIN_BUTTON);

//        Wait for alert visible
        isAlertVisible();
//        isVisible(Locators.LOGIN_LABEL);
//        Thread.sleep(3000);
    }

    public void loginFailedWrongPassword() {
//        Objek untuk memanggil non static variabel
        TestData callvar = new TestData();

//        Type Username
        enterText(Locators.LOGIN_USERNAME_FIELD, TestData.VALID_USERNAME);

//        Type Password
        enterText(Locators.LOGIN_PASSWORD_FIELD, callvar.INVALID_PASSWORD);

//        Click Login Button
        click(Locators.LOGIN_BUTTON);

//        Wait for alert visible
        isAlertVisible();
    }

    public void loginFailedWrongInput(){
//        Objek untuk memanggil non static variabel
        TestData callvar = new TestData();

//        Type Username
        enterText(Locators.LOGIN_USERNAME_FIELD, callvar.INVALID_USERNAME);

//        Type Password
        enterText(Locators.LOGIN_PASSWORD_FIELD, callvar.INVALID_PASSWORD);

//        Click Login Button
        click(Locators.LOGIN_BUTTON);

//        Wait for alert visible
        isAlertVisible();
    }

    public void loginBlankUsername(){
//        Type Password
        enterText(Locators.LOGIN_PASSWORD_FIELD, TestData.VALID_PASSWORD);

//        Click Login Button
        click(Locators.LOGIN_BUTTON);

//        Wait for alert visible
        isAlertVisible();
    }

    public void loginBlankPassword(){
//        Type Username
        enterText(Locators.LOGIN_USERNAME_FIELD, TestData.VALID_USERNAME);

//        Click Login Button
        click(Locators.LOGIN_BUTTON);

//        Wait for alert visible
        isAlertVisible();
    }

    public void loginBlankInput(){
//        Click Login Button
        click(Locators.LOGIN_BUTTON);

//        Wait for alert visible
        isAlertVisible();
    }
}

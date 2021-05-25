import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    // Web Driver
    final static String CHROME_PATH = "chromedriver";

    // URL
    final static String BASE_URL = "https://www.demoblaze.com/index.html";

    // Faker
    Faker faker = new Faker();

//    LOGIN DATA
    final static String VALID_USERNAME = "Takemichi";
    final static String VALID_PASSWORD = "Tkyrvgr@1";

    String INVALID_USERNAME = faker.name().username();
    String INVALID_PASSWORD = faker.internet().password();

    final static String ACCOUNT_INFO = "Welcome Takemichi";

//    ALERTS
    final static String ALERT_WRONG_USERNAME = "User does not exist.";
    final static String ALERT_WRONG_PASSWORD = "Wrong password.";
    final static String ALERT_WRONG_INPUT = "User does not exist.";
    final static String ALERT_BLANK_DATA = "Please fill out Username and Password.";

    final static String ALERT_LOGIN_FAILED = "Log in";

}

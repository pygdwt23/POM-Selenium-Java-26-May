import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void startSession() {
        System.setProperty("webdriver.chrome.driver", TestData.CHROME_PATH);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public static void setUp() {
        driver.get(TestData.BASE_URL);
    }

    @Test(testName = "Login Success - Valid Data", priority = 0)
    public static void testLoginSuccess() {
//        Load Homepage Object
        HomePage homepage = new HomePage(driver);

//        Click Sign In from Homepage
        homepage.loginHomepage();

//        Load Login Pop Up
        LoginPopup popup = new LoginPopup(driver);

//        Execute Login Success
        popup.loginSuccess();

//        Assertion
        String loginInfo = popup.getText(Locators.MY_ACCOUNT);
        Assert.assertEquals(loginInfo, TestData.ACCOUNT_INFO);
    }

    @Test(testName = "Login Failed - Wrong Username", priority = 1)
    public static void testLoginWrongUsername() {
//        Load Homepage Object
        HomePage homepage = new HomePage(driver);

//        Click Sign In from Homepage
        homepage.loginHomepage();

//        Load Login Pop Up
        LoginPopup popup = new LoginPopup(driver);

//        Execute Login Failed - Wrong Username
        popup.loginFailedWrongUsername();

//        Load Basepage
        BasePage load = new BasePage(driver);

//        Assertion
        Alert alert = driver.switchTo().alert();
        String loginstatus = alert.getText();
        alert.accept();
        Assert.assertEquals(loginstatus, TestData.ALERT_WRONG_USERNAME);
        System.out.println(loginstatus);
    }

    @Test(testName = "Login Failed - Wrong Password", priority = 2)
    public static void testLoginWrongPassword(){
//        Load Homepage Object
        HomePage homepage = new HomePage(driver);

//        Click Sign In from Homepage
        homepage.loginHomepage();

//        Load Login Pop Up
        LoginPopup popup = new LoginPopup(driver);

//        Execute Login Failed - Wrong Password
        popup.loginFailedWrongPassword();

//        Assertion
        Alert alert = driver.switchTo().alert();
        String loginstatus = alert.getText();
        alert.accept();
        Assert.assertEquals(loginstatus, TestData.ALERT_WRONG_PASSWORD);
    }

    @Test(testName = "Login Failed - Wrong Input", priority = 3)
    public static void testLoginWrongInput(){
//        Load Homepage Object
        HomePage homepage = new HomePage(driver);

//        Click Sign In from Homepage
        homepage.loginHomepage();

//        Load Login Pop Up
        LoginPopup popup = new LoginPopup(driver);

//        Execute Login Failed - Wrong Password
        popup.loginFailedWrongInput();

//        Assertion
       Alert alert = driver.switchTo().alert();
       String logininfo = alert.getText();
       alert.accept();
       Assert.assertEquals(logininfo, TestData.ALERT_WRONG_INPUT);
    }

    @Test(testName = "Login Failed - Blank Username", priority = 4)
    public static void testLoginBlankUsername(){
//        Load Homepage Object
        HomePage homepage = new HomePage(driver);

//        Click Sign In from Homepage
        homepage.loginHomepage();

//        Load Login Pop Up
        LoginPopup popup = new LoginPopup(driver);

//        Execute Login Failed - Wrong Password
        popup.loginBlankUsername();

//        Assertion
        Alert alert = driver.switchTo().alert();
        String logininfo = alert.getText();
        alert.accept();
        Assert.assertEquals(logininfo, TestData.ALERT_BLANK_DATA);
    }

    @Test(testName = "Login Failed - Blank Password", priority = 5)
    public static void testLoginBlankPassword(){
//        Load Homepage Object
        HomePage homepage = new HomePage(driver);

//        Click Sign In from Homepage
        homepage.loginHomepage();

//        Load Login Pop Up
        LoginPopup popup = new LoginPopup(driver);

//        Execute Login Failed - Blank Password
        popup.loginBlankPassword();

//        Assertion
        Alert alert = driver.switchTo().alert();
        String logininfo = alert.getText();
        alert.accept();
        Assert.assertEquals(logininfo, TestData.ALERT_BLANK_DATA);
    }

    @Test(testName = "Login Failed - Blank Input", priority = 6)
    public static void testLoginFailedBlankInput(){
//        Load Homepage Object
        HomePage homepage = new HomePage(driver);

//        Click Sign In from Homepage
        homepage.loginHomepage();

//        Load Login Pop Up
        LoginPopup popup = new LoginPopup(driver);

//        Execute Login Failed - Blank Input
        popup.loginBlankInput();

//        Assertion
        Alert alert = driver.switchTo().alert();
        String logininfo = alert.getText();
        alert.accept();
        Assert.assertEquals(logininfo, TestData.ALERT_BLANK_DATA);
    }

    @AfterMethod
    public static void tearDown() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void terminateSession() {
        driver.close();
        driver.quit();
    }
}
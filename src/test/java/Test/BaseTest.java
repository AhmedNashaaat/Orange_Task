package Test;


import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Base test class containing common test setup and teardown methods.
 */
public class BaseTest {
    protected WebDriver driver;

    /**
     * Initializes WebDriver and navigates to application URL.
     * Sets up test environment before each test.
     */
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/apps/triangle/triangle001.html");

    }

    /**
     * Cleans up test environment after each test.
     * Closes browser instance if it exists.
     */
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
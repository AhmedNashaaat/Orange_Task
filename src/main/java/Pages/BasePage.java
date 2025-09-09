package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    protected WebDriverWait wait;
    /**
     * Constructor initializing the page with WebDriver instance.
     *
     * @param driver The WebDriver instance to use for page interactions
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }
    /**
     * Waits for an element to be clickable and then clicks it.
     *
     * @param element The WebElement to wait for and click
     * @throws TimeoutException If the element doesn't become clickable within the wait time
     */
    public void waitTheElementAndClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    /**
     * Enters text into a visible web element after clearing it.
     *
     * @param element The WebElement to enter text into
     * @param txt The text to enter
     * @throws TimeoutException If the element doesn't become visible within 15 seconds
     */
    public void enterTxt(WebElement element, String txt) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(txt);
    }
    /**
     * Locates and returns a web element using a By locator.
     *
     * @param by The locator strategy to find the element
     * @return The found WebElement
     * @throws TimeoutException If the element isn't present within 10 seconds
     */
    public static WebElement getElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }

}

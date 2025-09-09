package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrianglePage extends BasePage{

    /**
     * Constructor initializing the page with WebDriver instance.
     *
     * @param driver The WebDriver instance to use for page interactions
     */
    public TrianglePage(WebDriver driver) {
        super(driver);
    }
    WebElement sideOneField,sideTwoField,sideThreeField,identifyButton,triangleType;
    By sideOneLocator = By.id("side1");
    By sideTwoLocator = By.id("side2");
    By sideThreeLocator= By.id("side3");
    By identifyButtonLocator = By.id("identify-triangle-action");
    By triangleTypeLocator = By.id("triangle-type");

    public void enteredSidesOfTriangle(String side1,String side2,String side3)
    {
        sideOneField=getElement(sideOneLocator);
        sideTwoField=getElement(sideTwoLocator);
        sideThreeField=getElement(sideThreeLocator);
        enterTxt(sideOneField,side1);
        enterTxt(sideTwoField,side2);
        enterTxt(sideThreeField,side3);
        identifyButton=getElement(identifyButtonLocator);
        waitTheElementAndClick(identifyButton);
    }

    public WebElement getTriangleType() {
        triangleType=getElement(triangleTypeLocator);
        return triangleType;
    }
}

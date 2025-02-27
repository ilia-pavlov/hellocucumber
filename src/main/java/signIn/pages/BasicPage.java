package signIn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasicPage {

    private static WebDriver driver;

    public BasicPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickButtonSpan(String text) {
        String xpath = "//span[text() = '" + text + "']/..";
        WebElement buttonSpan = driver.findElement(By.xpath(xpath));
        buttonSpan.click();
    }

    public void clickButtonLi(String text) {
        String xpath = "//li[text() = '" + text + "']/..";
        WebElement buttonLi = driver.findElement(By.xpath(xpath));
        buttonLi.click();
    }

    public void clickLoginInButton(String text) {
        String xpath = "//div[text() = '" + text + "']";
        WebElement logInButton = driver.findElement(By.xpath(xpath));
        logInButton.click();
    }

    public boolean contentIsVisible(String text) {
        String xpath = "//*[text() = '" + text + "']";
        ExpectedCondition<WebElement>condition = ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath));
        new WebDriverWait(driver, 10).until(condition);
        WebElement content = driver.findElement(By.xpath(xpath));
        return content.isDisplayed();
    }

}

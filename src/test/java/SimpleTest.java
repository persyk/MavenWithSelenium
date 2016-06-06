import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SimpleTest {
    @Test
    public void searchForIphone(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://ay.by");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchField = driver.findElement(By.id("top_any"));
        searchField.clear();
        searchField.sendKeys("Like");
        WebElement searchButton = driver.findElement(By.cssSelector(".top-panel__search__btn"));
        searchButton.click();
    }
}

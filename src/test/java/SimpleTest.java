import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by filip.fursau on 01.06.2016.
 */
public class SimpleTest {
    @Test
    public void searchForIphone(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.tut.by/");
    }
}

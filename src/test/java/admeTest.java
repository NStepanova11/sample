import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class admeTest {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @Test
    public void loadAdmePage(){
        driver.get("https://www.adme.ru/");
        wait.until(ExpectedConditions.urlToBe("https://www.adme.ru/"));
        driver.close();
    }
}

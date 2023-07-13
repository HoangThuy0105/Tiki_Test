package testing;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test_tensanpham {
    public static void main(String[] args){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://tiki.vn/");

        WebElement p = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div[1]/div[1]/div[2]/div/input"));
        p.sendKeys("toi di code dao");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div[1]/div[1]/div[2]/div/button"));
        button.click();
    }
}

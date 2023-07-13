package testing;

import org.bouncycastle.crypto.ec.ECElGamalDecryptor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://tiki.vn/");

        WebElement p = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div[1]/div[1]/div[2]/div/input"));
        p.sendKeys("Toidi code dạo");

        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div[1]/div[1]/div[2]/div/button"));
        button2.click();

//        WebElement button3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/span"));
//        button3.click();

    }
}
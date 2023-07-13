package testing;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class Test_kytucododailon {public static void main(String[] args){
    WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://tiki.vn/");

    WebElement p = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div[1]/div[1]/div[2]/div/input"));
    p.sendKeys("Cuộc sống đầy ắp những việc không như ý, chúng ta chẳng thể nào né tránh. Điều duy nhất có thể làm là thay đổi góc nhìn về nó.");

    WebElement button = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div[1]/div[1]/div[2]/div/button"));
    button.click();
}

}

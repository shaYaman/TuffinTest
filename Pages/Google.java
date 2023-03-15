package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google {
    //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","libs/chromedriver.exe");
    driver = new void ChromeDriver();
    //DELETE YNET COOCKIE
        driver.manage().deleteCookieNamed("weatherCity");
    //Set<Cookie> allCookies = driver.manage().getCookies();
//for (Cookie cookie : allCookies) {
    //driver.manage().deleteCookieNamed(cookie.getName());
//}
    private WebDriver driver;
    JavascriptExecutor js;
    js = (JavascriptExecutor) driver;

    System.setProperty("webdriver.chrome.driver","libs/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1020, 720));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("ynetnew");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}

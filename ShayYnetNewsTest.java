// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ShayYnetNewsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
	//DELETE YNET COOCKIE
	driver.manage().deleteCookieNamed("weatherCity");
	//Set<Cookie> allCookies = driver.manage().getCookies();
//for (Cookie cookie : allCookies) {
    //driver.manage().deleteCookieNamed(cookie.getName());
//}
	
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void shayYnetNews() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1020, 720));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("ynetnew");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//span[contains(.,\'https://www.ynetnews.com\')]")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\'Ynetnews - news and update 24 hours\']")));
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//img[@alt=\'Ynetnews - news and update 24 hours\']"));
      assert(elements.size() > 0);
    }
    System.out.println( driver.findElement(By.cssSelector(".weathertemps")).getText());
    driver.findElement(By.id("weathercityselect")).click();
    {
      WebElement dropdown = driver.findElement(By.id("weathercityselect"));
      dropdown.findElement(By.xpath("//option[. = 'Eilat']")).click();
    }
    System.out.println( driver.findElement(By.cssSelector(".weathertemps")).getText());
    driver.manage().window().setSize(new Dimension(1920, 1080));
    driver.findElement(By.xpath("//a/div/span")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'send to friend\')]"));
      assert(elements.size() > 0);
    }
  }
}

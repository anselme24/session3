

  package VariousConcepts;
  
  import java.util.concurrent.TimeUnit;
  
  import org.junit.After; import org.junit.Before; import org.junit.Test;
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
  
  public class LoginTe { WebDriver driver;
  
  @Before
   public void LaunchBrowser() {
  
  System.setProperty("webdriver.chrome.driver",
  "C:\\Users\\abasi\\eclipse-workspace\\Selenium\\ssession3\\driver\\chromedriver5.exe"
  ); driver = new ChromeDriver(); driver.get("https://techfios.com/billing/");
  driver.manage().window().maximize(); driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
  
  @Test
  public void LoginTest() { //By SIGNIN_BUTTON_lOCATOR =
  By.xpath("//batton[@name='login']"); WebElement USERNAME_FIELD =
  driver.findElement(By.xpath("//input[@id='username']")); WebElement
  PASSWORD_FIELD = driver.findElement(By.xpath("//input[@id='password']"));
  WebElement SIGNIN_BUTTON =
  driver.findElement(By.xpath("//button[@name='login']"));
  //USERNAME_FIELD.clear(); //By webdash_BORDWEB_TITLE =
  By.xpath("//h2[contains(text(),' Dashboard ')]");
  USERNAME_FIELD.sendKeys("demo@techfios.com");
  PASSWORD_FIELD.sendKeys("abc123"); SIGNIN_BUTTON.click(); WebDriverWait wait
  = new WebDriverWait(driver,3); }
  //driver.findElement(SIGNIN_BUTTON_lOCATOR).click(); }
  
  @After public void Teardown() throws InterruptedException {
  Thread.sleep(3000); driver.close(); driver.quit(); }
  
  }
 
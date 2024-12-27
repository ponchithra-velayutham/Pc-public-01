
public class BaseClass{  
     public static WebDriver driver;  
    
     @BeforeSuite  
     public void initializeWebDriver() throws IOException {  
          System.setProperty(“webdriver.chrome.driver”,.\\chromedriver.exe”);  
          driver = new ChromeDriver();  
      
          // To maximize browser  
          driver.manage().window().maximize();  
      
          // Implicit wait  
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
      
          // To open Gmail site  
          driver.get(“https:// www.gmail.com”);  
     }  
    
     @AfterSuite  
     public void quitDriver() {  
          driver.quit();  
     }  
}

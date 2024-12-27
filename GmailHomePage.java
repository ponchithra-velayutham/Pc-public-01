
public class GmailHomePage {  
    
     WebDriver driver;  
      
     @FindBy(link = “Sign In”)  
     WebElement signInBtn;  
    
     public GmailHomePage (WebDriver driver) {  
          this.driver = driver;  
          PageFactory.initElements(driver, this);  
     }  
   
     // This function is to click on signIn button  
     public GmailLoginPage clickSignInButton() {  
          signInBtn.click();  
          return new GmailLoginPage(driver);  
     }

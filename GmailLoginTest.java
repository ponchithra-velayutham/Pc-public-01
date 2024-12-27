
public class GmailLoginTest extends BaseClass{  
     
     @Test    
     public void init() throws Exception {    
          GmailHomePage gmailHomePage = new GmailHomePage(driver);    
          GmailLoginPage gmailLoginpage =  gmailHomePage.clickSignInButton();    
          gmailLoginpage.setEmail(“abc@gmail.com”);    
          gmailLoginpage.clickNextButton();    
          gmailLoginpage.setPassword(“23456@qwe”);    
         gmailLoginpage.clickNextButton();   
         
     }    
}

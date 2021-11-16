package tea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_out {

	public static void main(String[] args) throws InterruptedException
	{
        //Launch browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium jar\\chromedriver.exe" );
        WebDriver w= new ChromeDriver();
        
        
        //Open url
        w.get("http://www.practiceselenium.com/");
        
        
        //welcome
        w.findElement(By.linkText("Welcome")).click();
        Thread.sleep(1000);
        
        //see collection for harbal tea
      w.findElement(By.linkText("See Collection")).click();
      
        
        //check out 1
        w.findElement(By.linkText("Check Out")).click();
        Thread.sleep(2000);
        
        //email
        w.findElement(By.id("email")).sendKeys("test");
        
        //name
        w.findElement(By.id("name")).sendKeys("test");
        
        //address
        w.findElement(By.id("address")).sendKeys("test");
        
        //Dropdown
        //Visa
        Select s21=new Select(w.findElement(By.id("card_type")));
        s21.selectByVisibleText("Visa");
        Thread.sleep(1000);
        
      //Mastercard
        Select s51=new Select(w.findElement(By.id("card_type")));
        s51.selectByVisibleText("Mastercard");
        Thread.sleep(1000);
        
        //American Express
        Select s52=new Select(w.findElement(By.id("card_type")));
        s52.selectByVisibleText("American Express");
        Thread.sleep(1000);
        
        //Diners Club
        Select s53=new Select(w.findElement(By.id("card_type")));
        s53.selectByVisibleText("Diners Club");
        Thread.sleep(1000);
        
        //card no.
        w.findElement(By.id("card_number")).sendKeys("test");
        
        //cardholder name
        w.findElement(By.id("cardholder_name")).sendKeys("test");
        
        //verification code
        w.findElement(By.id("verification_code")).sendKeys("test");
        
      //place order
        w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
        
        //back window
        w.navigate().back();
        
        //2 check out
        w.findElement(By.linkText("Check Out")).click();
        
        w.findElement(By.id("email")).sendKeys("test");
        
        w.findElement(By.id("name")).sendKeys("test");
        
        w.findElement(By.id("address")).sendKeys("test");
        
        //visa
        Select s22=new Select(w.findElement(By.id("card_type")));
        s22.selectByVisibleText("Visa");
        Thread.sleep(1000);
        
        //Mastercard
        Select s23=new Select(w.findElement(By.id("card_type")));
        s23.selectByVisibleText("Mastercard");
        Thread.sleep(1000);
        
        //American Express
        Select s24=new Select(w.findElement(By.id("card_type")));
        s24.selectByVisibleText("American Express");
        Thread.sleep(1000);
        
        //Diners Club
        Select s25=new Select(w.findElement(By.id("card_type")));
        s25.selectByVisibleText("Diners Club");
        Thread.sleep(1000);
        
        //card no..
        w.findElement(By.id("card_number")).sendKeys("test");
        
        //cardholder name
        w.findElement(By.id("cardholder_name")).sendKeys("test");
        
        //verification code
        w.findElement(By.id("verification_code")).sendKeys("test");
        
        //place order
        w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
        
        Thread.sleep(2000);
       w.navigate().back();
       
       //welcome
      w.findElement(By.linkText("Welcome")).click();
      Thread.sleep(1000);
       
       //see collection for loose tea
       w.findElement(By.linkText("See Collection")).click();
       
       //3 check out
        w.findElement(By.linkText("Check Out")).click();
       
       //email
       w.findElement(By.id("email")).sendKeys("test");
       
       //name
       w.findElement(By.id("name")).sendKeys("test");
       
       //address
       w.findElement(By.id("address")).sendKeys("test");
       
       //radio button
       Select s26=new Select(w.findElement(By.id("card_type")));
       s26.selectByVisibleText("Visa");
       Thread.sleep(1000);
       
       //Mastercard
       Select s27=new Select(w.findElement(By.id("card_type")));
       s27.selectByVisibleText("Mastercard");
       Thread.sleep(1000);
       
       //American Express
       Select s28=new Select(w.findElement(By.id("card_type")));
       s28.selectByVisibleText("American Express");
       Thread.sleep(1000);
       
       //Diners Club
       Select s29=new Select(w.findElement(By.id("card_type")));
       s29.selectByVisibleText("Diners Club");
       Thread.sleep(1000);
       
       //card no.
       w.findElement(By.id("card_number")).sendKeys("test");
       
       //cardholder name
       w.findElement(By.id("cardholder_name")).sendKeys("test");
       
       //verification code
       w.findElement(By.id("verification_code")).sendKeys("test");
       
     //place order
       w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
       
       Thread.sleep(2000);
       
       //back window
       w.navigate().back();
       
       //welcome
       w.findElement(By.linkText("Welcome")).click();
       
       //4 check out
       w.findElement(By.linkText("Check Out")).click();
       
       //email
       w.findElement(By.id("email")).sendKeys("test");
       
       //name
       w.findElement(By.id("name")).sendKeys("test");
       
       //address
       w.findElement(By.id("address")).sendKeys("test");
       
       //radio button
       Select s30=new Select(w.findElement(By.id("card_type")));
       s30.selectByVisibleText("Visa");
       Thread.sleep(1000);
       
       //Mastercard
       Select s31=new Select(w.findElement(By.id("card_type")));
       s31.selectByVisibleText("Mastercard");
       Thread.sleep(1000);
       
       //American Express
       Select s32=new Select(w.findElement(By.id("card_type")));
       s32.selectByVisibleText("American Express");
       Thread.sleep(1000);
       
       //Diners Club
       Select s33=new Select(w.findElement(By.id("card_type")));
       s33.selectByVisibleText("Diners Club");
       Thread.sleep(1000);
       
       
       //card no.
       w.findElement(By.id("card_number")).sendKeys("test");
       
       //cardholder name
       w.findElement(By.id("cardholder_name")).sendKeys("test");
       
       //verification code
       w.findElement(By.id("verification_code")).sendKeys("test");
       
     //place order
       w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
       
       Thread.sleep(2000);
       
       //back window
       w.navigate().back();
       
       //welcome
       w.findElement(By.linkText("Welcome")).click();
       Thread.sleep(1000);
       
       //see collection for flavored tea
       w.findElement(By.linkText("See Collection")).click();
       
       //5 check out
       w.findElement(By.linkText("Check Out")).click();
       
       //email
       w.findElement(By.id("email")).sendKeys("test");
       
       //name
       w.findElement(By.id("name")).sendKeys("test");
       
       //address
       w.findElement(By.id("address")).sendKeys("test");
       
       //radio button
       Select s34=new Select(w.findElement(By.id("card_type")));
       s34.selectByVisibleText("Visa");
       Thread.sleep(1000);
       
       //Mastercard
       Select s35=new Select(w.findElement(By.id("card_type")));
       s35.selectByVisibleText("Mastercard");
       Thread.sleep(1000);
       
       //American Express
       Select s37=new Select(w.findElement(By.id("card_type")));
       s37.selectByVisibleText("American Express");
       Thread.sleep(1000);
       
       //Diners Club
       Select s38=new Select(w.findElement(By.id("card_type")));
       s38.selectByVisibleText("Diners Club");
       Thread.sleep(1000);
       
       
       //card no.
       w.findElement(By.id("card_number")).sendKeys("test");
       
       //cardholder name
       w.findElement(By.id("cardholder_name")).sendKeys("test");
       
       //verification code
       w.findElement(By.id("verification_code")).sendKeys("test");
       
     //place order
       w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
       
       Thread.sleep(2000);
       
       //back window
       w.navigate().back();
       
       //welcome
       w.findElement(By.linkText("Welcome")).click();
       
       //6 check out
       w.findElement(By.linkText("Check Out")).click();
       
       //email
       w.findElement(By.id("email")).sendKeys("test");
       
       //name
       w.findElement(By.id("name")).sendKeys("test");
       
       //address
       w.findElement(By.id("address")).sendKeys("test");
       
       //radio button
       Select s39=new Select(w.findElement(By.id("card_type")));
       s39.selectByVisibleText("Visa");
       Thread.sleep(1000);
       
       //Mastercard
       Select s40=new Select(w.findElement(By.id("card_type")));
       s40.selectByVisibleText("Mastercard");
       Thread.sleep(1000);
       
       //American Express
       Select s41=new Select(w.findElement(By.id("card_type")));
       s41.selectByVisibleText("American Express");
       Thread.sleep(1000);
       
       //Diners Club
       Select s42=new Select(w.findElement(By.id("card_type")));
       s42.selectByVisibleText("Diners Club");
       Thread.sleep(1000);
       
       //card no.
       w.findElement(By.id("card_number")).sendKeys("test");
       
       //cardholder name
       w.findElement(By.id("cardholder_name")).sendKeys("test");
       
       //verification code
       w.findElement(By.id("verification_code")).sendKeys("test");
       
     //place order
       w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
       
       Thread.sleep(2000);
       
       //back window
       w.navigate().back();
      
       
       
       w.navigate().back();
       
       //our passion
       w.findElement(By.linkText("Our Passion")).click();
       
       //back window
       w.navigate().back();
     
       //lets talk tea
       w.findElement(By.linkText("Let's Talk Tea")).click();
       
       //name
       w.findElement(By.name("name")).sendKeys("test");
       
       //email
       w.findElement(By.name("email")).sendKeys("test");
       
       //subject
       w.findElement(By.name("subject")).sendKeys("test");
       
       //message
       w.findElement(By.name("message")).sendKeys("test");
       
       Thread.sleep(2000);
       
       //click on submit
       w.findElement(By.xpath("//*[@id=\"form_78ea690540a24bd8b9dcfbf99e999fea\"]/div[1]/div[5]/input")).click();
             
       //back window
       w.navigate().back();
       
      //7 check out
       w.findElement(By.linkText("Check Out")).click();
       
       //email
       w.findElement(By.id("email")).sendKeys("test");
       
       //name
       w.findElement(By.id("name")).sendKeys("test");
       
       //address
       w.findElement(By.id("address")).sendKeys("test");
       
       //radio button
       Select s43=new Select(w.findElement(By.id("card_type")));
       s43.selectByVisibleText("Visa");
       Thread.sleep(1000);
       
       //Mastercard
       Select s44=new Select(w.findElement(By.id("card_type")));
       s44.selectByVisibleText("Mastercard");
       Thread.sleep(1000);
       
       //American Express
       Select s45=new Select(w.findElement(By.id("card_type")));
       s45.selectByVisibleText("American Express");
       Thread.sleep(1000);
       
       //Diners Club
       Select s46=new Select(w.findElement(By.id("card_type")));
       s46.selectByVisibleText("Diners Club");
       Thread.sleep(1000);
       
       
       //card no.
       w.findElement(By.id("card_number")).sendKeys("test");
       
       //cardholder name
       w.findElement(By.id("cardholder_name")).sendKeys("test");
       
       //verification code
       w.findElement(By.id("verification_code")).sendKeys("test");
       
       //place order
       w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
       
       Thread.sleep(2000);
       
       //back window
       w.navigate().back();
       
       //8 check out
       w.findElement(By.linkText("Check Out")).click();
       
       //email
       w.findElement(By.id("email")).sendKeys("test");
       
       //name
       w.findElement(By.id("name")).sendKeys("test");
       
       //address
       w.findElement(By.id("address")).sendKeys("test");
       
       //radio button
       Select s47=new Select(w.findElement(By.id("card_type")));
       s47.selectByVisibleText("Visa");
       Thread.sleep(1000);
       
       //Mastercard
       Select s48=new Select(w.findElement(By.id("card_type")));
       s48.selectByVisibleText("Mastercard");
       Thread.sleep(1000);
       
       //American Express
       Select s49=new Select(w.findElement(By.id("card_type")));
       s49.selectByVisibleText("American Express");
       Thread.sleep(1000);
       
       //Diners Club
       Select s50=new Select(w.findElement(By.id("card_type")));
       s50.selectByVisibleText("Diners Club");
       Thread.sleep(1000);
       
       
       //card no.
       w.findElement(By.id("card_number")).sendKeys("test");
       
       //cardholder name
       w.findElement(By.id("cardholder_name")).sendKeys("test");
       
       //verification code
       w.findElement(By.id("verification_code")).sendKeys("test");
       
       //place order
       w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
       
       Thread.sleep(2000);
       
       //back window
      w.navigate().back();

       //more1
       w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914883\"]/div/p/a/span")).click();
       
     //back window
       w.navigate().back();
       
       //more 2
       w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914882\"]/div/p/a/span")).click();
       
       //close window
       w.close();
 
     
       
     
	}

}

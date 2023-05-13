package week2.day2assignments;

import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FaceBook {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    //driver.findElement(By.xpath("[//a[text()='Create new account']")).click();
	    driver.findElement(By.linkText("Create new account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Test");
	    driver.findElement(By.name("lastname")).sendKeys("Acct");
	    driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
	    driver.findElement(By.id("password_step_input")).sendKeys("Pass123");
	    WebElement day = driver.findElement(By.id("day"));
	    Select  sec1= new Select (day);
	    sec1.selectByIndex(1);
	    WebElement month = driver.findElement(By.id("month"));
	    Select sec2=new Select(month);
	    sec2.selectByVisibleText("Aug");
	    WebElement year = driver.findElement(By.id("year"));
	    Select sec3 = new Select (year);
	    sec3.selectByValue("2009");
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	    System.out.println("Create FB page details has been filled");
	    //WebElement radio1 =driver.findElement(By.xpath("//label[text()='Female']"));
	    //radio1.click();
	    
	   /*// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            ( A normal click will do for this step) */ 
	    
	    
	    
	    
	    
	    
	}

}

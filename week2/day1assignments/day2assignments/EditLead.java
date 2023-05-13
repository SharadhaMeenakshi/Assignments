package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	/*http://leaftaps.com/opentaps/control/main
	
	* 1	Launch the browser
	* 2	Enter the username
	* 3	Enter the password
	* 4	Click Login
	* 5	Click crm/sfa link
	* 6	Click Leads link
	* 7	Click Find leads
	* 8	Enter first name
	* 9	Click Find leads button
	* 10 Click on first resulting lead
	* 11 Verify title of the page
	* 12 Click Edit
	* 13 Change the company name
	* 14 Click Update
	* 15 Confirm the changed name appears
	* 16 Close the browser (Do not log out)
*/
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sharadha");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	   
        Thread.sleep(3000);
		
		String leadID = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).getText();
		
		System.out.println(leadID);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		String CompanynameChange = "CompanynameChange";
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(CompanynameChange);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String newcompanyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		int length = newcompanyname.length();
		newcompanyname = newcompanyname.substring(0 , length-8);
		System.out.println(newcompanyname);
		
		
		if (newcompanyname.equals(CompanynameChange))
				 
		      {
			System.out.println("company name has been changed!!!");
			
				}
		else 
		{
			System.out.println("Company name not changed");
		}
		
		driver.close();
		
	}
	

}

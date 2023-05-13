package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    String title2 = driver.getTitle();
	    if (title2.equals("Create Lead | opentaps CRM"))
	    {
	    	System.out.println("Verified Title");
	    	
	    }else
	    	System.out.println("Incorrect Title");
	    
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
	    driver.findElement(By.id("createLeadForm_firstName") ).sendKeys("G.Sharadha");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Meenakshi");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Assurance");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys(("Creating Lead"));
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shara@gmail.com");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Charu");
	    WebElement sec2 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select sourceselect = new Select(sec2);
	    sourceselect.selectByIndex(4);
	    WebElement sec3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select sourceselect1 = new Select(sec3);
	    sourceselect1.selectByVisibleText("Automobile");
	    WebElement sec4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select sourceselect2 = new Select(sec4);
	    sourceselect2.selectByValue("OWN_CCORP");
	    WebElement sec5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select sourceselect3 = new Select(sec5);
	    sourceselect3.selectByVisibleText("New York");
	    driver.findElement(By.className("smallSubmit")).click();
	    System.out.println("Lead Created");
	    //Click find leads button
	    //Click find leads button
	     driver.findElement(By.linkText("Find Leads")).click();
	     Thread.sleep(3000);
	     String firstleadname = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).getText();
	     System.out.println(firstleadname);
	     driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).click();
	     driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	     String duplicatelead_title = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
			
			if(duplicatelead_title.equals("Duplicate Lead")) {
			
				driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
				String leadname2 =  driver.findElement(By.id("viewLead_firstName_sp")).getText();
				

				if(firstleadname.equals(leadname2)) {
					
					System.out.println("Test case Pass! duplicate lead matches with the lead Name");
					
				}
				else {
					System.out.println("Test case fail! duplicate lead is not matching with the lead Name");
				}
			}else {
				
				System.out.println("Test case fail! the title is not matching with the duplicate lead");
			}
			
			driver.close();
			
		}
		/* 11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)*/
	    
	    
	}
	   

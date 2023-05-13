package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
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
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    //Clear and add new company and First name
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New ABC");
	    driver.findElement(By.id("createLeadForm_firstName") ).clear();
	    driver.findElement(By.id("createLeadForm_firstName") ).sendKeys("Shara");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	}

}

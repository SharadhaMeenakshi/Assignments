package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Delete Lead:
			1	Launch the browser
			2	Enter the username
			3	Enter the password
			4	Click Login
			5	Click crm/sfa link
			6	Click Leads link
			7	Click Find leads
			8	Click on Phone
			9	Enter phone number
			10	Click find leads button
			11	Capture lead ID of First Resulting lead
			12	Click First Resulting lead
			13	Click Delete
			14	Click Find leads
			15	Enter captured lead ID
			16	Click find leads button
			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			18	Close the browser (Do not log out)
	*/


		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		String leadID = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).getText();
		
		System.out.println(leadID);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")));
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String Error_Message = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		
		if(Error_Message.equals("No records to display")) {
			System.out.println("Test case pass!");
		}
		else {
			System.out.println("Test case failed!");
		}
		
		
		
		driver.close();
	}

}

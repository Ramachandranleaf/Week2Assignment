package week2.day1.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandran");
		WebElement findElement =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select tool=new Select(findElement);
		tool.selectByVisibleText("Employee");
		WebElement findElement1 =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select tool1=new Select(findElement1);
		tool1.selectByValue("9001");
		WebElement findElement2 =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select tool2=new Select(findElement2);
		tool2.selectByIndex(4);
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select tool3=new Select(findElement3);
		tool3.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}

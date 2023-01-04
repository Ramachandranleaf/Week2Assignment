package week2.day1.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Rohith");
        driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
        driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("1000");
        WebElement findElement = driver.findElement(By.name("industryEnumId"));
        Select tool=new Select(findElement);
        tool.selectByIndex(3);
        WebElement findElement1 = driver.findElement(By.name("ownershipEnumId"));
        Select tool1=new Select(findElement1);
        tool1.selectByVisibleText("S-Corporation");
        WebElement findElement2 = driver.findElement(By.id("dataSourceId"));
        Select tool2=new Select(findElement2);
        tool2.selectByValue("LEAD_EMPLOYEE");
        WebElement findElement3 = driver.findElement(By.id("marketingCampaignId"));
        Select tool3=new Select(findElement3);
        tool3.selectByIndex(6);
        WebElement findElement4 = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select tool4=new Select(findElement4);
        tool4.selectByValue("TX");
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        
	}

}

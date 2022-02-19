package learning.day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsApplication {
	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver latest=new ChromeDriver();
	 latest.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 latest.get("http://leaftaps.com/opentaps/control/login");
	 latest.manage().window().maximize();
	 latest.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 latest.findElement(By.id("password")).sendKeys("crmsfa");
	 latest.findElement(By.className("decorativeSubmit")).click();
	 latest.findElement(By.linkText("CRM/SFA")).click();
	 latest.findElement(By.linkText("Leads")).click();
	 latest.findElement(By.linkText("Create Lead")).click();
	 latest.findElement(By.id("createLeadForm_companyName")).sendKeys("MUTHUJAGADESH");
	 latest.findElement(By.id("createLeadForm_firstName")).sendKeys("TESTLEAF");
	 latest.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("TESTLEAF HEAD");
	 latest.findElement(By.id("createLeadForm_lastName")).sendKeys("NAGENDIRAN");
	 WebElement dataSourceId=latest.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select text=new Select(dataSourceId);
		text.selectByVisibleText("Employee");
		latest.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MUTHU");
		latest.findElement(By.name("lastNameLocal")).sendKeys("JAGADESH");
		latest.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("BAGAVATHI");
		latest.findElement(By.id("createLeadForm_personalTitle")).sendKeys("HI");
		latest.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2500000");
		latest.findElement(By.name("departmentName")).sendKeys("EDR");
		latest.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("70");
		latest.findElement(By.name("birthDate")).sendKeys("26.04.2000");
	
		WebElement industryEnumId=latest.findElement(By.name("industryEnumId"));
		Select index=new Select(industryEnumId);
		index.selectByIndex(3);
	}

}

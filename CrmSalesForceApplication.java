package learning.day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class CrmSalesForceApplication {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver sales=new ChromeDriver();
		sales.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		sales.manage().window().maximize();
		sales.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		sales.findElement(By.name("UserFirstName")).sendKeys("MUTHU JAGADESH");
		sales.findElement(By.name("UserLastName")).sendKeys("NAGENDIRAN");
		sales.findElement(By.name("UserEmail")).sendKeys("muthujagadesh14@gmail.com");
		sales.findElement(By.name("CompanyName")).sendKeys("TESTLEAF");
		sales.findElement(By.name("UserPhone")).sendKeys("8124878773");
		
		WebElement Useritle11=sales.findElement(By.name("UserTitle"));
		Select tap=new Select(Useritle11);
		tap.selectByIndex(5);
		
		WebElement CompanyEmployees1=sales.findElement(By.name("CompanyEmployees"));
		Select tap1=new Select(CompanyEmployees1);
		tap1.selectByIndex(2);
		
		sales.findElement(By.name("CompanyCountry")).sendKeys("India");
		sales.findElement(By.xpath("//select[@name='CompanyState']")).sendKeys("Tamil_Nadu");
		sales.findElement(By.className("checkbox-ui")).click();
		sales.close();		
		
	}

}

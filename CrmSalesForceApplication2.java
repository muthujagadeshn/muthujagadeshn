package learning.day14;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrmSalesForceApplication2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver sales1=new ChromeDriver();
		sales1.get("https://www.opencart.com/index.php?route=account/register");
		sales1.manage().window().maximize();
		sales1.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		sales1.findElement(By.xpath("//input[@name='username']")).sendKeys("MUTHU JAGADESH");
		sales1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MUTHUJAGADESH");
		sales1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NAGENDIRAN");
	sales1.findElement(By.name("email")).sendKeys("muthujagadesh14@gmail.com");
	sales1.findElement(By.name("password")).sendKeys("muthu@123");
WebElement inputcountry = sales1.findElement(By.id("input-country"));
	
	Select text=new Select(inputcountry);
	text.selectByVisibleText("Guam");
	
	}
	

}

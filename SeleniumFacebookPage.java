package learning.day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFacebookPage {
	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver kumbi=new ChromeDriver();
	 kumbi.get("https://www.facebook.com/");
	 kumbi.manage().window().maximize();
	 kumbi.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 kumbi.findElement(By.id("email")).sendKeys("muthujagadesh14@gmail.com");
	 kumbi.findElement(By.name("pass")).sendKeys("muthu@123");
	 kumbi.findElement(By.className("_9lsa")).click();
	 kumbi.findElement(By.linkText("Create New Account")).click();
	 kumbi.findElement(By.name("firstname")).sendKeys("MUTHUJAGADESH");
	 kumbi.findElement(By.name("lastname")).sendKeys("NAGENDIRAN");
	 kumbi.findElement(By.name("reg_email__")).sendKeys("8124878773");
	 kumbi.findElement(By.name("reg_passwd__")).sendKeys("muthu@238");
	 WebElement day = kumbi.findElement(By.id("day"));
		Select index=new Select(day);
		index.selectByIndex(3);
		WebElement month = kumbi.findElement(By.id("month"));
		Select kambu=new Select(month);
		kambu.selectByVisibleText("Apr");
		WebElement year = kumbi.findElement(By.id("year"));
		Select sombu=new Select(year);
		sombu.selectByValue("2000");
		kumbi.findElement(By.xpath("//input[@value='2']")).click();
		kumbi.findElement(By.name("websubmit")).click();
	}

}

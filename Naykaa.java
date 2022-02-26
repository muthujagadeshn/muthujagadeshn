package learning.day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naykaa {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.get(" https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ac = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions ab=new Actions(driver);
		ab.moveToElement(ac).perform();
		
		driver.findElement(By.xpath("//div[@id='list_topbrands']//following::div[6]//a")).click();
		String text1 = driver.findElement(By.xpath("//h1[@class='css-27y7m0']")).getText();
		System.out.println(text1);
		
		/*WebElement dd = driver.findElement(By.linkText("MEN"));
	Actions cc=new Actions(driver);
	cc.moveToElement(dd).perform();*/
		
				
		

}
}
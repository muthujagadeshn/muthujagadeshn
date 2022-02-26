package learning.day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ww1 = driver.findElement(By.xpath("//div[@id='content_wrapper']//following::a//following-sibling::span[2]"));
		Actions bbc=new Actions(driver);
		bbc.moveToElement(ww1).perform();
		driver.findElement(By.xpath("//div[@id='category1Data']//following::p[2]//a//span")).click();
		List<WebElement> tp = driver.findElements(By.xpath("//div[@id='category1Data']//following::p[2]//a//span"));
		int count=tp.size();
		System.out.println(count);
		String tex = driver.findElement(By.xpath("//h1[@category='Sports Shoes for Men']")).getText();
		System.out.println(tex);

	
	}

}

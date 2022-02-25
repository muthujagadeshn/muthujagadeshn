package learning.day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver numberofss = new ChromeDriver();
		numberofss.manage().window().maximize();
		numberofss.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		numberofss.get("https://www.snapdeal.com/");
		Actions c = new Actions(numberofss);
		WebElement d = numberofss.findElement(By.linkText("Men's Fashion"));
		c.moveToElement(d).perform();
		numberofss.findElement(By.linkText("Sports Shoes")).click();
		String e =numberofss.getTitle();
		System.out.println(e);

		
		String count=numberofss.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println(count);

		//WebElement f = numberofss.findElement(By.className("child-cat-count"))
		//System.out.println(f);
				
		

}
}
package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement findElement2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.clickAndHold(findElement).moveToElement(findElement2).release().perform();
		
		
	}

}

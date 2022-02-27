package action;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Frame {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//input")).sendKeys("neko");
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//input[@id='a']")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			driver.findElement(By.id("animals")).click();
		   driver.findElement(By.xpath("//option[text()='Baby Cat']")).click();
		}
		}





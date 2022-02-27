package action;

		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Selectable {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://jqueryui.com/selectable/");
			driver.switchTo().frame(0);
			//for (int i = 1; i <=5; i++) 
				
			
			WebElement a=driver.findElement(By.xpath("//ol[@id='selectable']//li[1]"));
			WebElement b=driver.findElement(By.xpath("//ol[@id='selectable']//li[2]"));
			WebElement c=driver.findElement(By.xpath("//ol[@id='selectable']//li[3]"));
			WebElement d=driver.findElement(By.xpath("//ol[@id='selectable']//li[4]"));
			Actions act =new Actions(driver);
			act.keyDown(Keys.CONTROL).click(a).click(b).click(c).click(d).perform();
	}

}

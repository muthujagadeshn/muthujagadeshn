package action;


	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;

	import com.sun.tools.javac.main.Option;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Nykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		option.addArguments("--disable-notification--");
		driver.get("https://www.nykaa.com/");
		WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act =new Actions(driver);
		act.moveToElement(brand).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("//div[@class='css-ov2o3v']/a")).click();
		String title=driver.findElement(By.xpath("//div//h1[@class='css-27y7m0']")).getText();
		System.out.println(title);
		driver.findElement(By.xpath("//button[@class=' css-p2rfnw']")).click();
		driver.findElement(By.xpath("//ul[@class='css-z5o5ca']//div[4]")).click();
	       driver.findElement(By.id("category")).click();
		
	       WebElement hair =driver.findElement(By.xpath("//li[@class='MegaDropdownHeadingbox']//a[text()='hair']"));
	        act.moveToElement(hair).perform();
	       driver.findElement(By.xpath(" //a[text()='Shampoo']")).click();
	     //  option.addArguments("--disable-notification--");
	      
	  	 Alert alert = driver.switchTo().alert();
	  	 alert.accept();
	   //  JavascriptExecutor  js= (JavascriptExecutor) driver;
	    	//js.executeScript("window.scrollBy(350,0)","");
	    	driver.findElement(By.xpath("//span[text()='Concern']")).click();
	    	driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	}
		}




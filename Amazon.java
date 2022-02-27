package action;


	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Amazon {

			public static void main(String[] args) throws IOException {
				WebDriverManager.chromedriver().setup();
				ChromeDriver oneplus= new ChromeDriver();
				oneplus.get("https://www.amazon.in/");
				oneplus.manage().window().maximize();
				oneplus.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				oneplus.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
				
				oneplus.findElement(By.id("nav-search-submit-button")).click();
				
				String a=oneplus.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
				System.out.println(a);
				
				String b=oneplus.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
				System.out.println(b);
				
				oneplus.findElement(By.xpath("//i[@class='a-icon a-icon-popover']")).click();
			
				String e = oneplus.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']")).getText();
				System.out.println(e);
				
				oneplus.findElement(By.xpath("//img[@class='s-image']")).click();
				
				oneplus.get("https://www.amazon.in/Test-Exclusive_2020_1167-Multi-3GB-Storage/dp/B089MV3MVY/ref=sr_1_1?keywords=oneplus+9+pro&qid=1645945187&sr=8-1");
				oneplus.findElement(By.xpath("//input[@class='a-button-input attach-dss-atc']")).click();
				
				String f = oneplus.findElement(By.id("attach-accessory-cart-subtotal")).getText();
				System.out.println(f);
				
				 
				  File source=oneplus.getScreenshotAs(OutputType.FILE);
				  File des=new File("./oneplus/SnapShot.png");
				  FileUtils.copyFile(source, des);
		}

	}


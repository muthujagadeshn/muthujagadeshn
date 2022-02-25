package learning.day14;



	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Nyka {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver title = new ChromeDriver();
		title.manage().window().maximize();
		title.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		title.get("https://www.nykaa.com/");
		Actions a = new Actions(title);
		WebElement b = title.findElement(By.linkText("BRANDS"));
		a.moveToElement(b).perform();
		
		title.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		//title.findElement(By.xpath("//div[@id='brandCont_Popular']//ul//li[5]")).click();
		title.findElement(By.linkText("L'Oreal Paris")).click();
		  String c=title.getTitle();
		  System.out.println(c);
		
		

	
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OrangeHRM {
@Test
	public static void login() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deven\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeOptions ChromeOptions = new ChromeOptions();
		ChromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("oxd-text oxd-text--span oxd-main-menu-item--name")).click();
		
		driver.close();
	}
}

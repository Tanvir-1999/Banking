import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Game {

	public static void main(String[] args) {
		//Have to setup Selenium in this place
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.smartgameslive.com/en/games/roadblock");
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[3]/a")).click();
		//driver.close();	
		

	}
}

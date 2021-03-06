import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class CapitalOneBank{

	private static final CharSequence RETURN = null;

	public static void main(String[] args) {
		try{
		//Have to setup Selenium in this place
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		      
		driver.get("https://www.capitalone.com/");
		driver.findElement(By.xpath("//*[@id=\"card\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"bank\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"auto\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"unav-l1-search\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"searchTextInput\"]")).sendKeys("debit card");
		driver.findElement(By.xpath("//*[@class=\"site-search__text-input\"]")).sendKeys("Credit Card");
		driver.findElement(By.xpath("//*[@class=\"site-search__text-input\"]")).sendKeys(Keys.RETURN); 
		driver.findElement(By.xpath("//*[@id=\"unav-l1-signin\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ods-input-0\"]")).click();
		
		
		
		
		
		
		
		
		

		/*FileInputStream file =    new FileInputStream("C:\\Users\\tanvi\\OneDrive\\Desktop\\Testing Automaiton\\InputData_bkp.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		
		driver.findElement(By.xpath("//*[@id=\"ods-input-0\"]")).sendKeys(st.getCell(0,0).getContents());
		driver.findElement(By.xpath("//*[@id=\"ods-input-1\"]")).sendKeys(st.getCell(1,0).getContents());
		
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-sign-in/ci-content-card/div/div/ngx-ent-signin/form/p[2]/button")).click();*/
		
		/*
		//Create an object of FileInputStream class to read excel file

	    InputStream inputStream = new FileInputStream(file);
		//Path of the excel file
				
				//Creating a workbook
				XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
				XSSFSheet sheet = workbook.getSheetAt(0);
				//Row row = sheet.getRow(0);
				//Cell cell = row.getCell(0);
				System.out.println(sheet.getRow(0).getCell(0));
				workbook.close();*/
		
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

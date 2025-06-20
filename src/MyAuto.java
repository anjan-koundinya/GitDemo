import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class MyAuto {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saipk\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fa-euth-dev70-saasfademo1.ds-fa.oraclepdemos.com/fscmUI/faces/FuseWelcome?");
		
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.name("userid"));
		
		Thread.sleep(1000);

		ele.sendKeys("Curtis.Feitty");
		
		Thread.sleep(1000);
		
		ele = driver.findElement(By.name("password"));
		
		Thread.sleep(1000);
		
		ele.sendKeys("yGA8T^3?");
		
		Thread.sleep(1000);
		
		ele= driver.findElement(By.id("btnActive"));
		
		ele.click();
		
		Thread.sleep(2000);
		
		//ele = driver.findElement(By.id("pt1:_UIScil1u"));
	
		//ele.click();
		
	//	Thread.sleep(1000);
		
		//ele = driver.findElement(By.id("tooltipClose_rau92lv4"));
		
		//ele.click();
		
		//Thread.sleep(3000);
		
		ele = driver.findElement(By.cssSelector("body"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(ele).perform();
		
		//Thread.sleep(500);
		
	//	ele = driver.findElement(By.className("ogl-rw-help-widget--content-group--title ng-tns-c362201107-0"));
		
	//	ele.click();
		
	//	ele = driver.findElement(By.className("ogl-rw-help-widget--content-group--row ng-star-inserted"));
		
	//	ele.click();
		
		Thread.sleep(5000);
		Thread.sleep(5000);
		//driver.quit();
			}
		      

	}

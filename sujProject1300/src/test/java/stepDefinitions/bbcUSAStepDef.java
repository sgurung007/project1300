package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class bbcUSAStepDef {
	 public static WebDriver driver;

	@Given("Get to bbc")
	public void get_to_bbc(){
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","/Users/surajgurung/Documents/java/SujJar/drives/chromedriver");
		driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
		driver.get("https://www.google.com");

	}

	@Then("put Usa in search and search")
	public void put_Usa_in_search_and_search() {
		System.out.println("step2");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("USA"); 
		driver.findElement(By.name("btnK")).click();
	

	}

	@Then("Verity the title of the page")
	public void verity_the_title_of_the_page() throws InterruptedException {
		System.out.println("step3");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("page title is: " + driver.getTitle());
		Thread.sleep(4000);
		driver.quit();

	}
}

package PracticeFormElements;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
public class StudentRegistrationForm {

	@Test
	public void TextBoxtest() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		WebElement Name = driver.findElement(By.id("name"));

		Name.sendKeys("Tester");

		// String value = Name.getAttribute("value");

		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));

		Email.sendKeys("test@gmail.com");

		WebElement Gender = driver.findElement(By.xpath("//input[@name='gender']"));
		Gender.click();

		WebElement Mobile = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));

		Mobile.sendKeys("0771111111");

		// WebElement DOB = driver.findElement(By.xpath("//input[@type='date']"));

		// DOB.sendKeys("02/16/2000");

		WebElement element = driver.findElement(By.xpath("//input[@type='date']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].removeAttribute('type')", element);
		jse.executeScript("arguments[0].setAttribute('value', '12/11/1989')", element);

		WebElement Subject = driver.findElement(By.id("subjects"));

		Subject.sendKeys("Test123");

		WebElement Hobbies = driver.findElement(By.id("hobbies"));

		Hobbies.click();

		File uploadFile = new File("src/test/resources/selenium-snapshot.png");

		WebElement fileInput = driver.findElement(By.id("picture"));
		fileInput.sendKeys(uploadFile.getAbsolutePath());
		//driver.findElement(By.id("file-submit")).click();

		WebElement Address = driver.findElement(By.xpath("//textarea[@placeholder='Currend Address']"));

		Address.sendKeys("Test Address");
		
		WebElement drpState = driver.findElement(By.id("state"));
		Select s = new Select(drpState);
		s.selectByValue("Uttar Pradesh");
		
		WebElement drpCity = driver.findElement(By.id("city"));
		Select c = new Select(drpCity);
		c.selectByValue("Agra");
		
		
		WebElement Submit = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView()", Submit);
		Submit.click();
	}
}

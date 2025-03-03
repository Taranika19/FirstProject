package PracticeFormElements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alerts_and_popups {
	@Test
	public void PopUpandAlerttest() {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

		WebElement Alert = driver.findElement(By.xpath("//button[@onclick='showAlert()']"));
		Alert.click();
		//Sleep
		sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Alert alrt = driver.switchTo().alert();

		alrt.accept();

		// alert in 5 sec

		WebElement Alert1 = driver.findElement(By.xpath("//button[@onclick='myMessage()']"));
		Alert1.click();

		sleep(5000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Alert alrt1 = driver.switchTo().alert();

		alrt1.accept();
	}

	public void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

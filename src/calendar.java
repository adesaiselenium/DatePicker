

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {
	public static void main(String[] args) throws ParseException  {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashwini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		
		  driver.findElement(By.id("RoundTrip")).click();
		  
		  driver.findElement(By.id("FromTag")).sendKeys("Bangalore");
		  
		  driver.findElement(By.id("ToTag")).sendKeys("New Delhi");	
		  
		  driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).click();
		  
		  String month = "November 2019";
		  String date = "22";
		  
		  String NextMonthStr= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/div")).getText(); //MMMM/yyyy
		  String CurrentMonthStr = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div")).getText();
		 
	        System.out.println("Next Month is " + NextMonthStr);
	        System.out.println("Current Month is " + CurrentMonthStr);

		  while(true){
			  if(NextMonthStr.contentEquals(month) ) {
				  break;
			  }
			  else {
				  driver.findElement(By.className("nextMonth")).click();
			  }
		  
		  }   
		 String gettext = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[2]")).getText();
	
	        System.out.println("Date is " + gettext);

	}
	

}

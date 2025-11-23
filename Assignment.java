package Day32;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//enter departure city
		WebElement dep=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select select=new Select(dep);
		select.selectByVisibleText("Boston");
		
		//enter destination city
		WebElement des=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s=new Select(des);
		s.selectByValue("London");
		
		//click the find flight button
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//total rows
		int rows=driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		System.out.println("Total number of rows: "+rows);
		
		// Create arraylist to store all prices
		List<Double> priceList = new ArrayList<>();
		
		//get the lowest price
		for(int r=2;r<rows;r++) 
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			// remove $ sign and convert to double
		    double Fprice = Double.parseDouble(price.replace("$", "").trim());

		    priceList.add(Fprice);
		} 
		
		// Find the cheapest price
		double cheapestPrice = Collections.min(priceList);
		System.out.println("Cheapest price = " + cheapestPrice);
		
		// Find the row index of cheapest price
		int cheapestRow = priceList.indexOf(cheapestPrice) + 1;
		
		// Click on Choose Flight button for the cheapest price
		driver.findElement(By.xpath("//table[@class='table']/tbody/tr[" + cheapestRow + "]/td[1]/input")).click();
		

        System.out.println("Selected flight with cheapest price!");
        
        // Enter name
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Rahul Joshi");
        
        // click on purchase flight
        
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        
        //validate the text
        boolean text=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).isDisplayed();
        if(text=true) 
        {
        	System.out.println("text is displayed ...");
        }else 
        {
        	System.out.println("text is not present....");
        }
        
		driver.close();

	}

}

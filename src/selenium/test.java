package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.manage().window().getPosition();
		System.out.println("title of page :-"+driver.getTitle());
		

	}

}

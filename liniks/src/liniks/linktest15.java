package liniks;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class linktest15 {

	public static void main(String[] args) {
		ProfilesIni PR=new ProfilesIni();
		FirefoxProfile FP=PR.getProfile("MY PROFILE");
		FirefoxDriver driver=new FirefoxDriver(FP);
		driver.get("https://www.expedia.co.in");
		driver.findElement(By.id("primary-header-bus").click());
		
		
		
		
		
		

	}

}

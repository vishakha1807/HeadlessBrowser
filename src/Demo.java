import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/mubashir/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        WebDriver driver = new ChromeDriver(options);
		driver.get("https://dribbble.com/");
        System.out.println("browser opened properly");
        driver.findElement(By.cssSelector("div.Sign-in > span"));
        driver.quit();
		
}
}

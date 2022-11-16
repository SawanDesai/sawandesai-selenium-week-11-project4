import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com";
        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // launch URL
        driver.get(baseurl);

        // Maximise window
        driver.manage().window().maximize();

        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("page tilte is " + title);

        //Get current url
        System.out.println("Current url " + driver.getCurrentUrl());

        //get page source
        System.out.println("page source " + driver.getPageSource());

        //find the email field element
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("tomsmith");

        //Find the password field element
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("SuperSecret");

        //close the browser
        driver.close();
    }
}

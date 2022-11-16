import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {

    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //launch URL
        driver.get(baseurl);

        //maximise window
        driver.manage().window().maximize();

        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);

        //Get current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //get page source
        System.out.println("Page source " + driver.getPageSource());

        //find the email field element
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("tomsmith");

        //type password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecret");

        //close the browser
        driver.close();
    }
}

package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://filelist.io/login.php?returnto=%2Fbrowse.php"); // Replace with your URL
    }


    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        driver.findElement(By.id("username")).sendKeys("your-username");
        driver.findElement(By.id("password")).sendKeys("your-password");
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        driver.findElement(By.name("login-btn")).click();
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard() {
        assertTrue(driver.getCurrentUrl().contains("dashboard"));
        driver.quit();
    }
}
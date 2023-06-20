import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Com_Saucedemo_Edge_HW {

    static String browser = "Firefox";

    static String baseURL = "https://www.saucedemo.com/";

    static WebDriver driver;

    /**
     * 1. Setup chrome browser
     * 2. Open URL
     * 3. Print the title of the page
     * 4. Print the current url
     * 5. Print the page source
     * 6. Enter the email to email field
     * 7. Enter the password to password field
     * 8. Close the browser
     */

    public static void main(String[] args) {
        // 1. Setup chrome browser
        String baseURL = "https://www.saucedemo.com/";
        WebDriver driver = new EdgeDriver();

        // 2. Open URL
        driver.get(baseURL);

        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is :" + title);

        // 4. Print the current URL
        System.out.println("Currunt URL : " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        // 6.1 For Enter Login details need to Maximise the page
        driver.manage().window().maximize();

        // 6.2 Enter the email to username field (need to find "Where to login") Step 1.
        WebElement emailField = driver.findElement(By.id("user-name"));

        // 6.3 Enter the email to username fiels
        emailField.sendKeys("komalspatel@prime.com");

        // 7 Enter the password to paswword field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("LalaHula@.com");

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong Browser name");

            // 8. Close the browser
            driver.close();
        }
    }
}

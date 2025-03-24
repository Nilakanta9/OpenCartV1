package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class BrowserTask implements Runnable {
    private final String browser;

    public BrowserTask(String browser) {
        this.browser = browser;
    }

    @Override
    public void run() {
        WebDriver driver = null;
        try {
           
            if (browser.equalsIgnoreCase("chrome")) {
              
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else {
                System.out.println("Unsupported browser: " + browser);
                return;
            }

            
            driver.get("https://www.ebay.com/");
            System.out.println("Browser: " + browser + " | Title: " + driver.getTitle());

            
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}

public class ParallelBrowserTest {
    public static void main(String[] args) {
        // Define the browsers to test
        String[] browsers = {"chrome", "firefox"};

        // Create and start a thread for each browser
        for (String browser : browsers) {
            Thread thread = new Thread(new BrowserTask(browser));
            thread.start();
        }

        System.out.println("Both browsers are now running in parallel...");
    }
}

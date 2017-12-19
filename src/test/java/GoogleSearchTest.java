import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.reporters.jq.BasePanel.C;

/**
 * Created by sargis on 12/18/17
 */
public class GoogleSearchTest {
    private GoogleSearchPage googleSearchPage;
    private ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        googleSearchPage = new GoogleSearchPage(driver);

    }

    @AfterMethod
    public void tearDown() {

    }

    @Test
    public void searchTest() {
        googleSearchPage.search("Armenia");

    }
}

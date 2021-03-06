import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by sargis on 12/18/17
 */
public class GoogleSearchPage extends BasePage{
    private By searchInput = By.cssSelector("input#lst-ib");
    private By searchButton = By.cssSelector("input[name='btnK']");


    public GoogleSearchPage(WebDriver webDriver) {
        super(webDriver);
        visit("http://google.com");
    }

    public void clickSearchButton() {
        click(searchButton);
    }

    public void typeSearchText(String text) {
        type(searchInput, text);
    }

    public void search(String text) {
        typeSearchText(text);
        clickSearchButton();
    }


}

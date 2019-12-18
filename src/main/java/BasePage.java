import org.openqa.selenium.*;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }
}

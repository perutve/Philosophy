import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class RandomPage extends MainPage {

    @FindBy(xpath =
            ".//div[@class='mw-parser-output']/p/a | " +
                    ".//div[@class='mw-parser-output']/p/span/a")
    protected WebElement firstLink;

    public RandomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public void clickOnFirstLink() {
        firstLink.click();
    }

    public boolean isOnPhilosophy() {
        return getDriver().getCurrentUrl().equals("https://en.wikipedia.org/wiki/Philosophy");
    }
}

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class MainPage extends BasePage {

    @FindBy(xpath = ".//li[@id='n-randompage']/a")
    protected WebElement randomArticle;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public void goToMainPage() {
        getDriver().get("http://en.wikipedia.org");
    }

    public RandomPage goToRandomArticle() {
        randomArticle.click();
        return new RandomPage(getDriver());
    }
}

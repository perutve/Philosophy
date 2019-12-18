import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Task {

    private WebDriver driver = loadDriver();

    @Test
    public void philosophyTest() {
        MainPage mainpage = new MainPage(driver);
        mainpage.goToMainPage();
        RandomPage randomPage = mainpage.goToRandomArticle();
        randomPage.clickOnFirstLink();
        int counter = 0;
        while (!randomPage.isOnPhilosophy() && counter != 100) {
            randomPage.clickOnFirstLink();
            counter++;
        }

        Assert.assertTrue("Philosophy not found, exceeded number of cycles", counter < 100);
        System.out.println("Number of redirects: " + counter);
    }

    @After
    public void closeDriver() {
        driver.close();
    }

    private WebDriver loadDriver() {
        String driverPath = getClass().getResource("chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver", driverPath);
        return new ChromeDriver();
    }

}

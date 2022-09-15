package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard{
        WebDriver driver;
        By DashBoardButton     = By.xpath("//a[contains(@class,'active')]");
        By StartAcceptingOrder = By.xpath("//i[contains(@class,'fa-plus')][1]");
        By AddEmail            = By.xpath("//a[contains(@class,'email-step')]");
        public DashBoard(WebDriver driver)
        {
            this.driver = driver;
        }

        public void Dash(){
            driver.findElement(DashBoardButton).click();
            driver.findElement(StartAcceptingOrder).click();
            driver.findElement(AddEmail).click();
        }
    }


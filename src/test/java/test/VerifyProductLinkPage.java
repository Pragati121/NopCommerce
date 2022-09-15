package test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class VerifyProductLinkPage extends BaseTest {
    public VerifyProductLinkPage(WebDriver driver) {

    }

    @Test
    public void loginUser() {
        pageFactory.getLoginPage().loginUser();
    }

    @Test(dependsOnMethods = "loginUser")
    public void Dash() {
        pageFactory.getDashboard().Dash();
    }

    @Test(dependsOnMethods = "Dash")
    public void Product() {
        pageFactory.getProductLinkPage().Product();
    }
}
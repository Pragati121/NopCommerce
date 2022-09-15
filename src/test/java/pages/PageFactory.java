package pages;
import org.openqa.selenium.WebDriver;
import test.VerifyProductLinkPage;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
    private DashBoard Dashboard;
    private ProductLinkPage Product;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public DashBoard getDashboard() {
        if (Dashboard == null) {
            Dashboard = new DashBoard(driver);
        }

        return Dashboard;
    }

    public ProductLinkPage Product1() {
        if (Product == null) {
            Product = new ProductLinkPage(driver);
        }

        return Product;
    }

    public VerifyProductLinkPage getProductLinkPage() {
        if (getProductLinkPage() == null) {
            VerifyProductLinkPage ProductLinkPage = new VerifyProductLinkPage(driver);
        }
        return getProductLinkPage();

    }
}



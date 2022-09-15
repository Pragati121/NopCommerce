package pages;
import org.openqa.selenium.WebDriver;
    public class PageFactory {
        WebDriver driver;
        private LoginPage loginPage;
        private DashBoard Dashboard;
        public PageFactory(WebDriver driver){
            this.driver = driver;
        }
        public LoginPage getLoginPage() {
            if (loginPage == null){
                loginPage = new LoginPage(driver);
            }
            return loginPage;
        }
        public DashBoard getDashboard()
        {
            if(Dashboard==null)
            {Dashboard = new DashBoard(driver);

            }
            return  Dashboard;
        }
    }


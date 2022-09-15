package pages;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

class ProductLinkPage{
    WebDriver driver;
    By ProductLink         = By.xpath("//a[contains(@class,'copyright-step')]");
    By Column              = By.xpath("//input[@name='product_attribute_1']");
    public ProductLinkPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setProductLinkproduct() {
        driver.findElement(ProductLink).click();
    }
}


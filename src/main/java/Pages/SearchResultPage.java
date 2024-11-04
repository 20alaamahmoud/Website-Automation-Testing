package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Name;

public class SearchResultPage extends PageBase{
    public SearchResultPage(WebDriver driver)
    {
        super(driver);
    }
  //  @FindBy(name = "q")
    @FindBy(xpath = "/html/body/div[1]/div/div/main/div/section/div/div/section/div[2]/div[2]/article/div[1]/div/div/div/div/div[1]/a/picture/img")
    WebElement product;

    public void open_first_product()
    {
        product.click();
    }
}
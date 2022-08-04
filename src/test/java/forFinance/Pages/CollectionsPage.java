package forFinance.Pages;

import forFinance.Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionsPage extends BasePage {

    public CollectionsPage () {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (className = "mygeek-dropdown-username tw-truncate")
    WebElement accButton;

    @FindBy(xpath = "//span[contains(text(),'MariJeparska')]")
    WebElement accNameButton;

    @FindBy(xpath = "//a[contains(text(),'Profile')]")
    WebElement collectButton;

    public void collPage(){
        accNameButton.click();
        collectButton.click();
    }

    @FindBy(xpath= "//tbody/tr[1]/td[1]/div[2]/div[1]/div[1]")
    WebElement accInfo;


    public void checkAcc(){
        Assert.assertTrue(accInfo.getText().contains("MariJeparska"));
    }




}

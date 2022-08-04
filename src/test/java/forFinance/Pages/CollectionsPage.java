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

    @FindBy(className = "mygeek-dropdown-username text-truncate ng-binding")
    WebElement accNameButton;

    @FindBy(linkText = "Collection")
    WebElement collectButton;

    public void collPage(){
        accNameButton.click();
        collectButton.click();
    }

    @FindBy(className= "profile_title")
    WebElement accInfo;


    public void checkAcc(){
        Assert.assertTrue(accInfo.getText().contains("MariJeparska"));
    }




}

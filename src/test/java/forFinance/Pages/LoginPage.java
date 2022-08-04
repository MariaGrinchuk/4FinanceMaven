package forFinance.Pages;

import forFinance.Utilities.ConfigurationReader;
import forFinance.Utilities.Driver;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "inputUsername")
    public WebElement enterUserName;

    @FindBy(id = "inputPassword")
    public WebElement enterPassword;

    @FindBy(className = "btn btn-lg btn-primary")
    public WebElement loginButtonClick;

    public void loginToAcc(String username, String password) throws InterruptedException {

        Thread.sleep(2000);
        enterUsername(username);
        enterPassword(password);
        loginButtonClick.click();
    }

    public void loginAs(String userType) throws InterruptedException {
        if (userType.equalsIgnoreCase("client")) {
            loginAsClient();
             } else {
            System.out.println("Invalid login type");
        }
    }

    public void loginAsClient() throws InterruptedException {
        loginToAcc(ConfigurationReader.get("Username"), ConfigurationReader.get("Password"));
    }
    private void enterUsername(String username) {
        enterUserName.clear();
        enterUserName.sendKeys(username);
    }

    private void enterPassword(String password) {
        enterPassword.sendKeys(password);
    }



}

package forFinance.StepDefs;

import forFinance.Pages.BasePage;
import forFinance.Pages.CollectionsPage;
import forFinance.Pages.LoginPage;
import forFinance.Utilities.ConfigurationReader;
import forFinance.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    @Given("User is at the Home Page")
    public void userIsAtTheBasePage() throws InterruptedException {
      new LoginPage().openLoginMenu();
        }

    @When("User is logging in into the website as a {string}")
    public void userIsLoggingInIntoTheWebsiteAsA(String user) throws InterruptedException{
        new LoginPage().loginAs(user);
        new LoginPage().loginToAcc(ConfigurationReader.get("Username"), ConfigurationReader.get("Password"));
        new LoginPage().clickEnter();
    }

    @Then("User can see his own profile page")
    public void userCanSeeHisOwnProfilePage() {

        new CollectionsPage().collPage();
        new CollectionsPage().checkAcc();

    }

    @Given("User is at the Collections Page")
    public void userIsAtTheAccountPage() {
    new CollectionsPage().goToCollections();
    new CollectionsPage().gamePage();
    }

    @And("Open the Language dependence Window")
    public void openTheLanguageDependenceWindow() throws InterruptedException {
        new CollectionsPage().openSTatsWindow();
    }

    @And("Call API to see the most voted Board game")
    public void callAPIToSeeTheMostVotedBoardGame() {
    }

    @Then("Compare results with the page")
    public void compareResultsWithThePage() {
    }
}

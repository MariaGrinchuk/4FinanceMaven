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
    }

    @Then("User can see his own profile page")
    public void userCanSeeHisOwnProfilePage() {

        new CollectionsPage().collPage();
        new CollectionsPage().checkAcc();
    }

    @Given("User is at the Account Page")
    public void userIsAtTheAccountPage() {

    }
    @When("Go to the Game Page")
    public void goToTheGamePage() {
    }
    @And ("Check that Language Dependence Parameter is present on the page")
    public void checkThatLanguageDependenceParameterIsPresentOnThePage() {
    }

    @And("Open the Language dependence Window")
    public void openTheLanguageDependenceWindow() {
    }

    @And("Call API to see the most voted Board game")
    public void callAPIToSeeTheMostVotedBoardGame() {
    }

    @Then("Compare results with the page")
    public void compareResultsWithThePage() {
    }


}

package forFinance.Pages;

import forFinance.Utilities.Driver;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class API_Page extends BasePage {

    public API_Page () {
        PageFactory.initElements(Driver.get(), this);
    }

    String APIBaseURL = "https://boardgamegeek.com/xmlapi/collection";

    int gameID= 316554;

    @Test



    public void APIcheck(){


        Response response = RestAssured.get("https://boardgamegeek.com/boardgame/316554/dune-imperium");

        int code= response.statusCode();

        Assert.assertEquals(code,200 );

        Response gamePage=RestAssured.get(APIBaseURL+"/"+gameID);

        Response dep = RestAssured.get(APIBaseURL+"/search?search=" + "<Language Dependence>");



    }


}

package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtsyStepDef {
    Wait wait = new WebDriverWait(Driver.getDriver(), 2);
    EtsyPage etsyPage=new EtsyPage();
String expectedTitle="Etsy - Shop for handmade, vintage, custom,and unique gifts for everyone";

    @Given("User is on etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));

    }
    @Then("User sees title as expected {string}.")
    public void user_sees_title_as_expected(String expectedTitle) {

        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
        wait.until(ExpectedConditions.titleContains(expectedTitle));
    }
    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");


    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searchButton.click();

    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden Spoon"));

    }
    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String info) {
        etsyPage.searchBox.sendKeys(info+ Keys.ENTER);

    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String info) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(info));

    }



}

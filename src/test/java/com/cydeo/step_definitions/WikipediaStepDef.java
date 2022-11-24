package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDef {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia.url"));


    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String info) {
        wikipediaPage.searchBox.sendKeys(info);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String NewTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));

    }
    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String info) {
        Assert.assertTrue(wikipediaPage.heading.getText().contains(info));

    }
    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String info) {
Assert.assertTrue(wikipediaPage.imageHeader.getText().contains(info));
    }



}


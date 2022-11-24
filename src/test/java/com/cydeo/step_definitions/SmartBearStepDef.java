package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class SmartBearStepDef {
    SmartBearPage smartBearPage=new SmartBearPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
      Driver.getDriver().get(ConfigurationReader.getProperty("smartBear_url"));
    String username= ConfigurationReader.getProperty("smartBearUsername");
    String password=ConfigurationReader.getProperty("smartBearPassword");
    smartBearPage.usernameField.sendKeys(username);
    smartBearPage.passwordField.sendKeys(password);
    smartBearPage.submitBtn.click();


    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        smartBearPage.orderPage.click();

    }
    @When("User selects {string} from product dropdown")
    public void user_selects_family_album_from_product_dropdown(String productType) {
        
        Select select = new Select(SmartBearPage.product);
        select.selectByVisibleText(productType);
    }
    @When("User enters {int} to quantity")
    public void user_enters_to_quantity(int quan) {
        SmartBearPage.
                quantity.sendKeys(quan+"");

    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customer) {
     SmartBearPage.customerName.sendKeys(customer);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        SmartBearPage.street.sendKeys(street);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
        SmartBearPage.city.sendKeys(city);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
        SmartBearPage.state.sendKeys(state);

    }
    @When("User enters {string}")
    public void user_enters(String zipcode) {
        SmartBearPage.zipCode.sendKeys(zipcode);
    }
   @When("User selects Visa as card type")
  public void user_selects_visa_as_card_type() {
SmartBearPage.creditCard.click();
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String ccNumber) {
SmartBearPage.ccNumber.sendKeys(ccNumber);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String date) {
       SmartBearPage.date.sendKeys(date);
    }
    @Then("User clicks process button")
    public void user_clicks_process_button() {
 SmartBearPage.processBtn.click();
    }

    @And("User clicks on all Orders page")
    public void userClicksOnAllOrdersPage() {
       SmartBearPage.viewAllOrders.click();
    }
 //  @Then("User verifies {string} is in the list")
  //  public void user_verifies_is_in_the_list(String string) {
    //   String actual=smartBearAllOrders.namePick(string);
   //    Assert.assertEquals(string,actual);

  //  }



}

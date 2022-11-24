@smartBear
Feature: SmartBear order process
  User Story:As a user I should be able to login to smartBear web page and verify if the name is in the list

Scenario: SmartBear order process
  Given User is logged into SmartBear Tester account and on Order page
  When User fills out the form as followed:
  And User selects "FamilyAlbum" from product dropdown
  And User enters 4 to quantity
  And User enters "John Wick" to costumer name
  And User enters "Kinzie Ave" to street
  And User enters "Chicago" to city
  And User enters "IL" to state
  And User enters "60056"
  And User selects Visa as card type
  And User enters "1111222233334444" to card number
  And User enters "12/22" to expiration date
  Then User clicks process button
    And User clicks on all Orders page
# Then User verifies "John Wick" is in the list

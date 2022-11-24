@EtsyTitleVerification
Feature: Etsy title verification
  User Story: User should see the title as expected

Background:
  Given User is on etsy home page

  Scenario: Title verification

    Then User sees title as expected "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone".

  Scenario: Wooden Spoon search

    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title


  Scenario: "Wooden Spoon" search

    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden Spoon" is in the title


@WikipediaSearch
Feature:Wikipedia Search Functionality Title Verification
  User Story:As a user,
  I should be able to see new title after I make the search
Background:
  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box
  And User clicks wiki search button

  @TitleVerification
  Scenario:

    Then User sees "Steve Jobs" is in the wiki title

  @HeaderVerification
  Scenario:

    Then User sees "Steve Jobs" is in the main header


  @ImageHeaderVerification
  Scenario:

    Then User sees "Steve Jobs" is in the image header
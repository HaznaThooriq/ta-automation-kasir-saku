Feature: Testing Landing Page kasirsaku

  Narrative:
  As a user
  I want to testing Landing Page of kasirsaku

  @landingPage
  Scenario: user go to landing Page of kasir saku
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    Then user can see logo of kasirsaku
    And navbar user area is visible
    And navbar feature is visible
    And navbar reviews is visible
    And navbar Screens is visible
    And navbar about is visible
    And navbar Get App is visible
    And navbar Support is visible
    And carousel image is visible

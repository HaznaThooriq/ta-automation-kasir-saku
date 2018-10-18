Feature: Go to dashboard kasirsaku

  Narrative:
  As a user
  I want to go to dashboard of kasirsaku

  @dashboard
  Scenario: user go to dashboard of kasir saku
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku


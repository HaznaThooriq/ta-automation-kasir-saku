Feature: Go to dashboard kasirsaku

  Narrative:
  As a user
  I want to go to dashboard of kasirsaku

  @invalidUsername
  Scenario: user go to dashboard of kasir saku
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasirsaku' and password as 'kasir_saku'
    Then toast invalid username and password appear

  @invalidPassword
  Scenario: user go to dashboard of kasir saku
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasirsaku'
    Then toast invalid username and password appear



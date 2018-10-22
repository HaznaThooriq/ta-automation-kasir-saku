Feature: PPOB kasirsaku

  Narrative:
  As a user
  I want to testing PPOB Fitur at kasirsaku webpage

  @PPOB
  Scenario: user login at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button topup
    And user click topup

Feature: Create Member

  Narrative:
  As a user
  I want to Create Member

  @MemberHappyFlow
  Scenario: user create member as HappyFlow Scenario
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When buttton member is displayed
    When user click button member
    Then user in Request Kartu Member page
    When user type nama member as 'Thooriq'
    And user type telephone as '081234561234'
    And user type alamat as 'Mojokerto'
    When user click button create
    Then popup member success created is appear







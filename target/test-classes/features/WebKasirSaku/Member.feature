Feature: Create Member

  Narrative:
  As a user
  I want to Create Member

  @Member
  Scenario: user create member
    Given user go to dashboard of kasirsaku
    When user click button member
    Then user in Request Kartu Member page
    When user type nama member as 'Thooriq'
    And user type telephone as '081234561234'
    And user type alamat as 'Mojokerto'
    When user click button create
    Then popup member success created is appear







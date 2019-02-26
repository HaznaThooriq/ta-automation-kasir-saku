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

  @MemberErrorFlowZeroAll
  Scenario: user create member as ErrorFlow Scenario Zero All Field
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When buttton member is displayed
    When user click button member
    Then user in Request Kartu Member page
    When user type nama member as ''
    And user type telephone as ''
    And user type alamat as ''
    When user click button create

  @MemberErrorFlowTypeNama
  Scenario: user create member as ErrorFlow Scenario Zero All Field except Nama
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
    And user type telephone as ''
    And user type alamat as ''
    When user click button create

  @MemberErrorFlowTypeTelephone
  Scenario: user create member as ErrorFlow Scenario Zero All Field except Telephone
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When buttton member is displayed
    When user click button member
    Then user in Request Kartu Member page
    When user type nama member as ''
    And user type telephone as '1224567'
    And user type alamat as ''
    When user click button create

  @MemberErrorFlowTypeAlamat
  Scenario: user create member as ErrorFlow Scenario Zero All Field except Alamat
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When buttton member is displayed
    When user click button member
    Then user in Request Kartu Member page
    When user type nama member as ''
    And user type telephone as ''
    And user type alamat as 'Mojokerto'
    When user click button create








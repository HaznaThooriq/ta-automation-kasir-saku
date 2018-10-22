Feature: PPOB kasirsaku

  Narrative:
  As a user
  I want to testing PPOB Fitur at kasirsaku webpage

  @PPOBTopup
  Scenario: user topup at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button ppob
    And user click topup
    And user add topup
    Then user can see history of topup

  @PPOBKonfirmasiTopup
  Scenario: user konfirmasi topup at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button ppob
    And user click button konfirmasi topup
    And user add konfirmasi topup
    Then user can see history of konfirmasi topup

  @PPOBDaftarPembelian
  Scenario: user konfirmasi topup at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button ppob
    And user click button daftar pembelian
    Then user can see history of daftar pembelian ppob


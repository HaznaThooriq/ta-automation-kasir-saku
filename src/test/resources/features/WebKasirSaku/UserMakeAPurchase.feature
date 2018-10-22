Feature: Go to homepage kasirsaku

  Narrative:
  As a user
  I want to make a purchase

  @purchase
  Scenario: user make a purchase
    Given user go to dashboard of kasirsaku
    When user click button pembelian
    When user pilh barang as 'Marjan'
    And user click beli button
    And user input Jumlah Bayar As'40000'
    And user click checkout button
    Then user can see popup pengembalian as '39000'

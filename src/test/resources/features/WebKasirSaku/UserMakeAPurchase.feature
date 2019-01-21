Feature: Go to homepage kasirsaku

  Narrative:
  As a user
  I want to make a purchase

  @purchase
  Scenario: user make a purchase
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button pembelian
    When user pilh barang as 'Good Day Caramel Macchiato'
    And user click beli button
    And user input Jumlah Bayar As'10000'
    And user click checkout button
    Then user can see popup pengembalian as '3750'

  @purchaseErrorflowWithoutBarang
  Scenario: user make a purchase
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button pembelian
    When user pilh barang as ''
    And user click checkout button
    Then user can see popup error transaksi


  @purchaseErrorflowWithoutClickBeli
  Scenario: user make a purchase
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button pembelian
    When user pilh barang as 'Botol'
    And user input Jumlah Bayar As'40000'
    And user click checkout button
    Then user can see popup error transaksi

  @purchaseErrorflowWithoutJumlahBayar
  Scenario: user make a purchase
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button pembelian
    When user pilh barang as 'Botol'
    And user click beli button
    And user input Jumlah Bayar As'40000'
    And user input kode member as '10000'
    And user click checkout button
    Then user can see popup error transaksi
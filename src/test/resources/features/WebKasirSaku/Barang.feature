Feature: Automation Fitur Barang

  Narrative:
  As a user
  I want to make testing fitur of Barang

  @CRUDBarang
  Scenario: user make CRUD Barang
    Given user go to dashboard of kasirsaku
    When user click button barang
    And user click Add Barang
    Then user in create barang page
    When user type Nama Barang as 'Tissue Paseo'
    And user input stok as '100'
    And user input harga supplier as '4500'
    And user input harga jual as '8000'
    And user click create button
    Then barang already create
    When user click update icon
    Then user in update page
    When user update name into 'Tissue paseo rename'
    And user update stok into '150'
    And user update harga supplier into '5000'
    And user update harga jual into '10000'
    And user click update button
    Then barang already update
    When user click trash icon
    And barang already delete






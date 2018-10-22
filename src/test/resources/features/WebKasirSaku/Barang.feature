Feature: Automation Fitur Barang

  Narrative:
  As a user
  I want to make testing fitur of Barang

  @CRUDBarangHappyFlow
  Scenario: user make CRUD Barang
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
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

  @AddBarangErroFlowNoNama
  Scenario: user make CRUD Barang Error Flow No Nama
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button barang
    And user click Add Barang
    Then user in create barang page
    When user type Nama Barang as ''
    And user input stok as '100'
    And user input harga supplier as '4500'
    And user input harga jual as '8000'
    And user click create button
    Then toast field 'nama' must be filled is appear

  @AddBarangErroFlowNoStock
  Scenario: user make CRUD Barang Error Flow No Stock
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button barang
    And user click Add Barang
    Then user in create barang page
    When user type Nama Barang as 'Tissue'
    And user input stok as ''
    And user input harga supplier as '4500'
    And user input harga jual as '8000'
    And user click create button
    Then toast field 'stock' must be filled is appear

  @AddBarangErroFlowNoHargaSupplier
  Scenario: user make CRUD Barang Error Flow No Supplier
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button barang
    And user click Add Barang
    Then user in create barang page
    When user type Nama Barang as 'Tissue'
    And user input stok as '100'
    And user input harga supplier as ''
    And user input harga jual as '8000'
    And user click create button
    Then toast field 'Harga Supplier' must be filled is appear

  @AddBarangErroFlowNoHargaJual
  Scenario: user make CRUD Barang Error Flow No Harga Jual
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button barang
    And user click Add Barang
    Then user in create barang page
    When user type Nama Barang as 'Tissue'
    And user input stok as '100'
    And user input harga supplier as '4500'
    And user input harga jual as ''
    And user click create button
    Then toast field 'Harga Jual' must be filled is appear

  @AddBarangErroFlowNoAll
  Scenario: user make CRUD Barang Error Flow No All
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button barang
    And user click Add Barang
    Then user in create barang page
    When user type Nama Barang as ''
    And user input stok as ''
    And user input harga supplier as ''
    And user input harga jual as ''
    And user click create button
    Then toast field ' ' must be filled is appear







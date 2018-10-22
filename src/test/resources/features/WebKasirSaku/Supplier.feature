Feature: Automation Fitur supplier

  Narrative:
  As a user
  I want to make testing fitur of supplier

  @CRUDSupplierHappyFlow
  Scenario: user make CRUD supplier
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button supplier
    And user click Add supplier
    Then user in create supplier page
    When user type Nama supplier as 'Thooriqoh'
    And user input alamat supplier as 'mojokerto'
    And user input telepon supplier as '08923845759102'
    And user input email supplier as 'thooriqoh@gdn-commerce.com'
    And user click create button
    Then supplier already create
    When user click update icon
    Then user in update page
    When user update Nama supplier into 'Thooriqoh Update'
    And user update alamat supplier into 'surabaya'
    And user update telepon supplier into '08923845759102'
    And user update email supplier into 'thooriqoh@gmail.com'
    And user click update button
    Then supplier already update
    When user click trash icon
    And supplier already delete

  @CreateSupplierErrorFlowNoNama
  Scenario: user make CRUD supplier No Nama
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button supplier
    And user click Add supplier
    Then user in create supplier page
    When user type Nama supplier as ''
    And user input alamat supplier as 'mojokerto'
    And user input telepon supplier as '08923845759102'
    And user input email supplier as 'thooriqoh@gdn-commerce.com'
    And user click create button
    Then toast field '' must be filled is appear

  @CreateSupplierErrorFlowNoAlamat
  Scenario: user make CRUD supplier No Nama
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button supplier
    And user click Add supplier
    Then user in create supplier page
    When user type Nama supplier as 'Hazna'
    And user input alamat supplier as ''
    And user input telepon supplier as '08923845759102'
    And user input email supplier as 'thooriqoh@gdn-commerce.com'
    And user click create button
    Then toast field '' must be filled is appear

  @CreateSupplierErrorFlowNoTelepon
  Scenario: user make CRUD supplier No Telepon
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button supplier
    And user click Add supplier
    Then user in create supplier page
    When user type Nama supplier as 'Hazna'
    And user input alamat supplier as 'Mojokerto'
    And user input telepon supplier as ''
    And user input email supplier as 'thooriqoh@gdn-commerce.com'
    And user click create button
    Then toast field '' must be filled is appear

  @CrateSupplierErrorFlowNoEmail
  Scenario: user make CRUD supplier No Email
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button supplier
    And user click Add supplier
    Then user in create supplier page
    When user type Nama supplier as 'Hazna'
    And user input alamat supplier as 'Mojokerto'
    And user input telepon supplier as '089666923911'
    And user input email supplier as ''
    And user click create button
    Then supplier already create

  @CreateSupplierErrorFlowNoAll
  Scenario: user make CRUD supplier No All
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button supplier
    And user click Add supplier
    Then user in create supplier page
    When user type Nama supplier as ''
    And user input alamat supplier as ''
    And user input telepon supplier as ''
    And user input email supplier as ''
    And user click create button
    Then toast field '' must be filled is appear









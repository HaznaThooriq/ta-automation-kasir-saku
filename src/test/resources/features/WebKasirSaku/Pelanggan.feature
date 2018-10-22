Feature: Automation Fitur Pelanggan

  Narrative:
  As a user
  I want to make testing fitur of Pelanggan

  @CRUDPelangganHappyFlow
  Scenario: user make CRUD Pelanggan Happy Flow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button pelanggan
    And user click Add pelanggan
    Then user in create pelanggan page
    When user type Nama Pelanggan as 'Thooriqoh'
    And user input alamat as 'mojokerto'
    And user input telepon as '08923845759102'
    And user input email as 'thooriqoh@gdn-commerce.com'
    And user click create button
    Then pelanggan already create
    When user click update icon
    Then user in update page
    When user update Nama Pelanggan into 'Thooriqoh Update'
    And user update alamat into 'surabaya'
    And user update telepon into '08923845759102'
    And user update email into 'thooriqoh@gmail.com'
    And user click update button
    Then pelanggan already update
    When user click trash icon
    And pelanggan already delete

  @CRUDPelangganErrorFlowNoNama
  Scenario: user make CRUD Pelanggan No Nama
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button pelanggan
    And user click Add pelanggan
    Then user in create pelanggan page
    When user type Nama Pelanggan as ''
    And user input alamat as 'mojokerto'
    And user input telepon as '08923845759102'
    And user input email as 'thooriqoh@gdn-commerce.com'
    And user click create button
    Then toast field '' must be filled is appear

  @CRUDPelangganErrorFlowNoAlamat
  Scenario: user make CRUD Pelanggan No Alamat
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button pelanggan
    And user click Add pelanggan
    Then user in create pelanggan page
    When user type Nama Pelanggan as 'Hazna'
    And user input alamat as ''
    And user input telepon as '08923845759102'
    And user input email as 'thooriqoh@gdn-commerce.com'
    And user click create button
    Then toast field '' must be filled is appear

  @CRUDPelangganErrorFlowNoEmail
  Scenario: user make CRUD Pelanggan No Email
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button pelanggan
    And user click Add pelanggan
    Then user in create pelanggan page
    When user type Nama Pelanggan as 'Hazna'
    And user input alamat as 'Mojokerto'
    And user input telepon as '089666923911'
    And user input email as ''
    And user click create button
    Then pelanggan already create

  @CRUDPelangganErrorFlowNoAlamat
  Scenario: user make CRUD Pelanggan No Alamat
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click button pelanggan
    And user click Add pelanggan
    Then user in create pelanggan page
    When user type Nama Pelanggan as ''
    And user input alamat as ''
    And user input telepon as ''
    And user input email as ''
    And user click create button
    Then toast field '' must be filled is appear

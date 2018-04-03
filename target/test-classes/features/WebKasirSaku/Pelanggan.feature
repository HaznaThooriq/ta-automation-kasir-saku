Feature: Automation Fitur Pelanggan

  Narrative:
  As a user
  I want to make testing fitur of Pelanggan

  @CRUDPelanggan
  Scenario: user make CRUD Pelanggan
    Given user go to dashboard of kasirsaku
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
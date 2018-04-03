Feature: Automation Fitur supplier

  Narrative:
  As a user
  I want to make testing fitur of supplier

  @CRUDSupplier
  Scenario: user make CRUD supplier
    Given user go to dashboard of kasirsaku
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






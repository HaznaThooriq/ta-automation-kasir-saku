Feature: Login kasirsaku

  Narrative:
  As a user
  I want to login at kasirsaku webpage

  @Dashboard
  Scenario: user login at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'

  @Login
  Scenario: user login at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku

  @invalidUsername
  Scenario: user login at kasirsaku webpage error flow invalid Username
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasirsaku' and password as 'kasir_saku'
    Then toast invalid username and password appear

  @invalidPassword
  Scenario: user login at kasirsaku webpage error flow invalid Password
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasirsaku'
    Then toast invalid username and password appear


  @zeroUsername
  Scenario: user login at kasirsaku webpage error flow zero Username
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as '' and password as 'kasir_saku'
    Then toast invalid username and password appear

  @zeroPassword
  Scenario: user login at kasirsaku webpage error flow invalid Password
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as '' and password as 'kasir_saku'
    Then toast invalid username and password appear

  @zeroUsernameAndPassword
  Scenario: user login at kasirsaku webpage error flow zero Username and Password
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as '' and password as ''
    Then toast invalid username and password appear
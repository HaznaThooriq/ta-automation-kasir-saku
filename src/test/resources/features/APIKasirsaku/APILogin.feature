Feature: Api Login

  Narrative:
  As a user
  I want to test API login at kasirsaku

  @APILogin
  Scenario: Happyflow API Login
  Given user test API Login with username 'kasir_saku' and password 'kasir_saku'
    Then user can see the massage login berhasil

  @APIinvalidUsername
  Scenario: Errorflow API Login invalid Username
    Given user test API error Login with username 'kasirsaku' and password 'kasirsaku'
    Then user can see the massage login gagal

  @APILogininvalidPassword
  Scenario: Errorflow API Login invalid Password
    Given user test API error Login with username 'kasir_saku' and password 'kasirsaku'
    Then user can see the massage login gagal


  @APILoginzeroUsername
  Scenario: Errorflow API Login zero Username
    Given user test API error Login with username '' and password 'kasir_saku'
    Then user can see the massage login gagal

  @APILoginzeroPassword
  Scenario: Errorflow API Login invalid Password
    Given user test API error Login with username 'kasir_saku' and password ''
    Then user can see the massage login gagal

  @APILoginzeroUsernameAndPassword
  Scenario: Errorflow API Login zero Username and Password
    Given user test API error Login with username '' and password ''
    Then user can see the massage login gagal

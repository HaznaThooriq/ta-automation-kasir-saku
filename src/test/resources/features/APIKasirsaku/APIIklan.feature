Feature: Api Iklan

  Narrative:
  As a user
  I want to test API Iklan at kasirsaku

  @APIIndexIklan
  Scenario: Happyflow API Index Iklan
  Given user test API Index Iklan
    Then user can see get the result of get Index iklan berhasil

  @APIViewIklan
  Scenario: Happyflow API View Iklan
  Given user test API View Iklan
    Then user can see get the result of get View iklan berhasil

  @APIIndexIklanInvalidAuth
  Scenario: ErrrorFlow API Index Iklan Invalid Auth
    Given user test API Index Iklan Invalid Auth
    Then user can see get the result of get Index iklan gagal

  @APIViewIklanInvalidId
  Scenario: Happyflow API View Iklan Invalid Id
    Given user test API View Iklan Invalid Id
    Then user can see get the result of get View iklan gagal
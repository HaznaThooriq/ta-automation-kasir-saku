Feature: Api Notifikasi

  Narrative:
  As a user
  I want to test API Notifikasi at kasirsaku

  @APIIndexNotifikasi
  Scenario: Happyflow API Notifikasi
  Given user test API Index Notifikasi
    Then user can see get the result of get Index Notifikasi

  @APIIndexNotifikasiInvalidAuth
  Scenario: Errorflow API Notifikasi Invalid Auth
    Given user test API Index Notifikasi Invalid Auth
    Then user can see get the result of get Index Notifikasi gagal
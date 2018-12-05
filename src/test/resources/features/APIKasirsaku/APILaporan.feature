Feature: Api Laporan

  Narrative:
  As a user
  I want to test API Laporan at kasirsaku

  @APILaporanHarian
  Scenario: Happyflow API Laporan
  Given user test API laporan
    Then user can see get the result of get laporan berhasil

  @APILaporanHarianInvalidAuth
  Scenario: Errorflow API Laporan
    Given user test API laporan with Invalid Auth
    Then user can see get the result of get laporan gagal
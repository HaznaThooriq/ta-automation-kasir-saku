Feature: Api Transaksi

  Narrative:
  As a user
  I want to test API Transaksi at kasirsaku

  @APITransaksiBayar
  Scenario: Happyflow API Transaksi Bayar
  Given user test API Transaksi Bayar
    Then user can see the massage Transaksi Bayar berhasil

  @APITransaksiIndex
  Scenario: Happyflow API Index Transaksi
    Given user test API Index Transaksi
    Then user can see the massage of Index Transaksi berhasil

  @APIViewTransaksi
  Scenario: Happyflow API View Transaksi
    Given user test API View Transaksi
    Then user can see the massage of View Transaksi berhasil

  @APISearchTransaksi
  Scenario: Happyflow API Search Transaksi
    Given user test API Search Transaksi
    Then user can see the massage of Search Transaksi berhasil



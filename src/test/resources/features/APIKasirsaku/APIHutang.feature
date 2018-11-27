Feature: Api Hutang

  Narrative:
  As a user
  I want to test API Hutang at kasirsaku

  @APISearchHutang
  Scenario: Happyflow API Search Hutang
    Given user test API Search Hutang
    Then user can see the massage Search Hutang berhasil

  @APIBayarHutang
  Scenario: Happyflow API Bayar Hutang
    Given user test API Bayar Hutang
    Then user can see the massage Transaksi hutang berhasil

  @APIHutangIndex
  Scenario: Happyflow API Index hutang
    Given user test API Index hutang Transaksi
    Then user can see the massage of Index hutang berhasil

  @APIViewHutang
  Scenario: Happyflow API View Hutang
    Given user test API View Hutang
    Then user can see the massage of View Hutang berhasil

  @APIHutangPelanggan
  Scenario: Happyflow API Hutang Pelanggan
    Given user test API Hutang Pelanggan
    Then user can see the massage of Hutang Pelanggan berhasil
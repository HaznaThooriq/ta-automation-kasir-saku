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
    Given user test API Ba yar Hutang
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

  @APISearchHutangInvalidKeyword
  Scenario: Errorflow API Search Hutang Invalid Keyword
    Given user test API Search Hutang Invalid Keyword
    Then user can see the massage Search Hutang gagal

  @APIBayarHutangInvalidJumlahBayar
  Scenario: Errorflow API Bayar Hutang Invalid Jumlah Bayar
    Given user test API Bayar Hutang Invalid Jumlah Bayar
    Then user can see the massage Transaksi hutang gagal

  @APIHutangIndexInvalidAuth
  Scenario: Errorflow API Index hutang Invalid Auth
    Given user test API Index hutang Transaksi with Invalid Auth
    Then user can see the massage of Index hutang gagal

  @APIViewHutangInvalidId
  Scenario: Errorflow API View Hutang Invalid Id
    Given user test API View Hutang Invalid Id
    Then user can see the massage of View Hutang gagal

  @APIHutangPelangganInvalidPelanggan
  Scenario: Happyflow API Hutang Pelanggan Invalid Pelanggan
    Given user test API Hutang Pelanggan Invalid Pelanggan
    Then user can see the massage of Hutang Pelanggan gagal



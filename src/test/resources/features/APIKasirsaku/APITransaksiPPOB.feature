Feature: Api Transaksi PPOB

  Narrative:
  As a user
  I want to test API Transaksi PPOB at kasirsaku

  @APICreateTransaksiPPOB
  Scenario: Happyflow API Create Transaksi PPOB
  Given user test API Create Transaksi PPOB
    Then user can see get the result of create Transaksi PPOB

  @APIIndexTransaksiPPOB
  Scenario: Happyflow API Index Transaksi PPOB
    Given user test API Index Transaksi PPOB
    Then user can see the result of Transaksi topup PPOB

  @APIViewTransaksiPPOB
  Scenario: Happyflow API view Transaksi PPOB
    Given user test API view Transaksi PPOB
    Then user can see the result of Transaksi topup PPOB

  @APICreateTransaksiPPOBInvalidAuth
  Scenario: ErrorFlow API Create Transaksi PPOB Invalid Auth
    Given user test API Create Transaksi PPOB Invalid Auth
    Then user can see get the result of create Transaksi PPOB gagal

  @APIIndexTransaksiPPOBInvalidAuth
  Scenario: ErrorFlow API Index Transaksi PPOB Invalid Auth
    Given user test API Index Transaksi PPOB Invalid Auth
    Then user can see the result of Transaksi topup PPOB gagal

  @APIViewTransaksiPPOBInvalidId
  Scenario: ErrorFlow API view Transaksi PPOB Invalid Id
    Given user test API view Transaksi PPOB Invalid Id
    Then user can see the result of Transaksi topup PPOB gagal
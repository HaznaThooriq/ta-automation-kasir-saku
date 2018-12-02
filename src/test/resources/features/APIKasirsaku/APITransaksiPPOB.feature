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
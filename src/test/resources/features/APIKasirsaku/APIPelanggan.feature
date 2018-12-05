Feature: Api Pelanggan

  Narrative:
  As a user
  I want to test API Pelanggan at kasirsaku

  @APICreatePelanggan
  Scenario: Happyflow API Create Pelanggan
    Given user test API Create Pelanggan
    Then user can see the massage Create Pelanggan berhasil

  @APIUpdatePelanggan
  Scenario: Happyflow API Update Pelanggan
    Given user test API Update Pelanggan
    Then user can see the massage Update Pelanggan berhasil

  @APISearchPelanggan
  Scenario: Happyflow API Search Pelanggan
    Given user test API Search Pelanggan
    Then user can see the massage Search Pelanggan berhasil

  @APIDeletePelanggan
  Scenario: Happyflow API Delete Pelanggan
    Given user test API Delete Pelanggan
    Then user can see the massage API Delete Pelanggan Berhasil

  @APIIndexPelanggan
  Scenario: Happyflow API Index Pelanggan
    Given user test API Index Pelanggan
    Then user can see the massage of Index Pelanggan Berhasil

  @APIViewPelanggan
  Scenario: Happyflow API View Pelanggan
    Given user test API View Pelanggan
    Then user can see the massage of View Pelanggan berhasil

  @APICreatePelangganInvalidAuth
  Scenario: Errorflow API Create Pelanggan Invalid Auth
    Given user test API Create Pelanggan Invalid Auth
    Then user can see the massage Create Pelanggan gagal

  @APIUpdatePelangganInvalidId
  Scenario: Errorflow API Update Pelanggan Invalid Id
    Given user test API Update Pelanggan Invalid Id
    Then user can see the massage Update Pelanggan gagal

  @APISearchPelangganInvalidId
  Scenario: Errorflow API Search Pelanggan Invalid Id
    Given user test API Search Pelanggan Invalid Id
    Then user can see the massage Search Pelanggan gagal

  @APIDeletePelangganInvalidId
  Scenario: Errorflow API Delete Pelanggan Invalid Id
    Given user test API Delete Pelanggan Invalid Id
    Then user can see the massage API Delete Pelanggan gagal

  @APIIndexPelangganInvalidAuth
  Scenario: Errorflow API Index Pelanggan Invalid Auth
    Given user test API Index Pelanggan Invalid Auth
    Then user can see the massage of Index Pelanggan gagal

  @APIViewPelangganInvalidId
  Scenario: Errorflow API View Pelanggan Invalid Id
    Given user test API View Pelanggan Invalid Id
    Then user can see the massage of View Pelanggan gagal


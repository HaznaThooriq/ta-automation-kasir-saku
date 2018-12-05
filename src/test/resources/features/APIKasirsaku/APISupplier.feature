Feature: Api Supplier

  Narrative:
  As a user
  I want to test API Supplier at kasirsaku

  @APICreateSupplier
  Scenario: Happyflow API Create Supplier
    Given user test API Create Supplier
    Then user can see the massage Create Supplier berhasil

  @APIUpdateSupplier
  Scenario: Happyflow API Update Supplier
    Given user test API Update Supplier
    Then user can see the massage Update Supplier berhasil

  @APISearchSupplier
  Scenario: Happyflow API Search Supplier
    Given user test API Search Supplier
    Then user can see the massage Search Supplier berhasil

  @APIDeleteSupplier
  Scenario: Happyflow API Delete Supplier
    Given user test API Delete Supplier
    Then user can see the massage API Delete Supplier Berhasil

  @APIIndexSupplier
  Scenario: Happyflow API Index Supplier
    Given user test API Index Supplier
    Then user can see the massage of Index Supplier Berhasil

  @APIViewSupplier
  Scenario: Happyflow API View Supplier
    Given user test API View Supplier
    Then user can see the massage of View Supplier berhasil

  @APICreateSupplierInvalidAuth
  Scenario: Errorflow API Create Supplier Invalid Auth
    Given user test API Create Supplier Invalid Auth
    Then user can see the massage Create Supplier gagal

  @APIUpdateSupplierInvalidId
  Scenario: Errorflow API Update Supplier Invalid Id
    Given user test API Update Supplier Invalid Id
    Then user can see the massage Update Supplier gagal

  @APISearchSupplierInvalidId
  Scenario: Errorflow API Search Supplier Invalid Id
    Given user test API Search Supplier Invalid Id
    Then user can see the massage Search Supplier gagal

  @APIDeleteSupplierInvalidId
  Scenario: Errorflow API Delete Supplier Invalid Id
    Given user test API Delete Supplier Invalid Id
    Then user can see the massage API Delete Supplier gagal

  @APIIndexSupplierInvalidAuth
  Scenario: Errorflow API Index Supplier Invalid Auth
    Given user test API Index Supplier Invalid Auth
    Then user can see the massage of Index Supplier gagal

  @APIViewSupplierInvalidId
  Scenario: Errorflow API View Supplier Invalid Id
    Given user test API View Supplier Invalid Id
    Then user can see the massage of View Supplier gagal
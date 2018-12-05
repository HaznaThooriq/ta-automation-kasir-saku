Feature: Api Topup PPOB

  Narrative:
  As a user
  I want to test API Topup PPOB at kasirsaku

  @APICreateTopupPPOB
  Scenario: Happyflow API Create Topup PPOB
  Given user test API Create Topup PPOB
    Then user can see the result of create topup PPOB

  @APIIndexTopupPPOB
  Scenario: Happyflow API Index Topup PPOB
    Given user test API Index Topup PPOB
    Then user can see the result of index topup PPOB

  @APIViewTopupPPOB
  Scenario: Happyflow API view Topup PPOB
    Given user test API view Topup PPOB
    Then user can see the result of view topup PPOB

  @APIUpdateTopupPPOB
  Scenario: Happyflow API update Topup PPOB
    Given user test API update Topup PPOB
    Then user can see the result of update topup PPOB

  @APIDeleteTopupPPOB
  Scenario: Happyflow API Delete Topup PPOB
    Given user test API Delete Topup PPOB
    Then user can see the result of Delete topup PPOB

  @APICreateTopupPPOBNoFillRequiredField
  Scenario: ErrorFlow API Create Topup PPOB No Fill Required Field
    Given user test API Create Topup PPOB No Fill Required Field
    Then user can see the result of create topup PPOB gagal

  @APIIndexTopupPPOBInvalid
  Scenario: ErrorFlow API Index Topup PPOB Invalid Index
    Given user test API Index Topup PPOB Invalid Index
    Then user can see the result of index topup PPOB gagal

  @APIViewTopupPPOBInvalidId
  Scenario: ErrorFlow API view Topup PPOB Invalid Id
    Given user test API view Topup PPOB Invalid Id
    Then user can see the result of view topup PPOB gagal

  @APIUpdateTopupPPOBInvalidId
  Scenario: ErrorFlow API update Topup PPOB Invalid Id
    Given user test API update Topup PPOB Invalid Id
    Then user can see the result of update topup PPOB gagal

  @APIDeleteTopupPPOBInvalidId
  Scenario: ErrorFlow API Delete Topup PPOB Invalid Id
    Given user test API Delete Topup PPOB Invalid Id
    Then user can see the result of Delete topup PPOB gagal





Feature: Api Global Settings

  Narrative:
  As a user
  I want to test API Global Settings at kasirsaku

  @APIIndexGlobalSettings
  Scenario: Happyflow Index Global Settings
  Given user test API Index Global Settings
    Then user can see the result of get Index Global Settings

  @APIAppAndroidVersionGlobalSettings
  Scenario: Happyflow App Android Version Global Settings
  Given user test API App Android Version Global Settings
    Then user can see the result of get App Android Global Settings

  @APIIndexGlobalSettingsInvalidAuth
  Scenario: Errorflow Index Global Settings Invalid Auth
    Given user test API Index Global Settings Invalid Auth
    Then user can see the result of get Index Global Settings gagal

  @APIAppAndroidVersionGlobalSettingsInvalidAuth
  Scenario: Happyflow App Android Version Global Settings Invalid Auth
    Given user test API App Android Version Global Settings Invalid Auth
    Then user can see the result of get App Android Global Settings gagal





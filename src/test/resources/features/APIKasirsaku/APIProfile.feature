Feature: Api Profile

  Narrative:
  As a user
  I want to test API Profile at kasirsaku

  @APIViewProfile
  Scenario: Happyflow API View Profile
  Given user test API Profil with Authorization 'Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og=='
    Then user can see the profile

  @APIViewProfileErrorAuthorization
  Scenario: Errorflow API View Profile Error Authorization
    Given user test API Profil with Error Authorization 'Basic a2FzaXJfc2FrdTprYXNpcl9zYWt1=='
    Then user can't see the profile

  @APIViewProfileZeroAuthorization
  Scenario: Errorflow API View Profile Zero Authorization
    Given user test API Profil with Error Authorization ''
    Then user can't see the profile

  @APIUpdateProfile
  Scenario: Happyflow API Update Profile
    Given user test API Update Profil with Authorization 'Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og=='
    Then user can see the profile already update

  @APIUpdateProfileErrorAuthorization
  Scenario: Errorflow API Update Profile Error Authorization
    Given user test API Profil Update with Error Authorization 'Basic a2FzaXJfc2FrdTprYXNpcl9zYWt1=='
    Then user can't see the profile already update

  @APIUpdateProfileZeroAuthorization
  Scenario: Errorflow API Update Profile Zero Authorization
    Given user test API Update Profil with Error Authorization ''
    Then user can't see the profile already update

  @APIUpdateProfileZeroRequiredField
  Scenario: Errorflow API Update Profile Zero Required Field
    Given user test API Update Profil with zero required field
    Then user can't see the profile already update





Feature: Api SignUp

  Narrative:
  As a user
  I want to test API Signup at kasirsaku

  @APISignup
  Scenario: Happyflow API Signup
  Given user test API Signup with data nama 'aaa' and toko 'aaa' at 'aaa' username 'aaa' email 'aaa.android@gmail.com' phone '089666923911' password 'fgghhghgAB11'
    Then user can see the massage Registrasi berhasil

  @APIAccountAlreadyExist
  Scenario: Errorflow API Signup Account Already Exist
    Given user test API Signup error with data nama 'hazna' and toko 'haznashop' at 'Surabaya' username 'haznathooriq' email 'hazna.android@gmail.com' phone '089666923911' password 'haz123'
    Then user can see the massage Registrasi gagal

  @APISignupNamaNull
  Scenario: Errorflow API Signup Nama Null
    Given user test API Signup error with data nama '' and toko 'haznashop' at 'Surabaya' username 'haznathooriq' email 'hazna.android@gmail.com' phone '089666923911' password 'haz123'
    Then user can see the massage Registrasi gagal


  @APISignupTokoNull
  Scenario: Errorflow API Signup Toko Null
    Given user test API Signup error with data nama 'hazna' and toko '' at 'Surabaya' username 'haznathooriq' email 'hazna.android@gmail.com' phone '089666923911' password 'haz123'
    Then user can see the massage Registrasi gagal

  @APISignupKotaNull
  Scenario: Errorflow API Signup Kota Null
    Given user test API Signup error with data nama 'hazna' and toko 'haznashop' at '' username 'haznathooriq' email 'hazna.android@gmail.com' phone '089666923911' password 'haz123'
    Then user can see the massage Registrasi gagal

  @APISignupUsernameNull
  Scenario: Errorflow API Sigup Username Null
    Given user test API Signup error with data nama 'hazna' and toko 'haznashop' at 'Surabaya' username '' email 'hazna.android@gmail.com' phone '089666923911' password 'haz123'
    Then user can see the massage Registrasi gagal

  @APISignupEmailNull
  Scenario: Errorflow API Sigup Email Null
    Given user test API Signup error with data nama 'hazna' and toko 'haznashop' at 'Surabaya' username 'haznathooriq' email '' phone '089666923911' password 'haz123'
    Then user can see the massage Registrasi gagal

  @APISignupPhoneNull
  Scenario: Errorflow API Sigup Phonr Null
    Given user test API Signup error with data nama 'hazna' and toko 'haznashop' at 'Surabaya' username 'haznathooriq' email 'hazna.android@gmail.com' phone '' password 'haz123'
    Then user can see the massage Registrasi gagal

  @APISignupPasswordNull
  Scenario: Errorflow API Sigup Phonr Null
    Given user test API Signup error with data nama 'hazna' and toko 'haznashop' at 'Surabaya' username 'haznathooriq' email 'hazna.android@gmail.com' phone '089666923911' password ''
    Then user can see the massage Registrasi gagal

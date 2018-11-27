Feature: Laporan kasirsaku

  Narrative:
  As a user
  I want to testing Laporan Fitur at kasirsaku webpage

  @LaporanDaftarPenjualan
  Scenario: user see Daftar Penjualan at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click Laporan Button
    And user click Daftar Pembelian Button
    Then user can see Laporan of Data Penjualan


  @LaporanLaba
  Scenario: user konfirmasi topup at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click Laporan Button
    And user click Laba Button
    Then user can see grafik of laba


  @LaporanStokBarang
  Scenario: user konfirmasi topup at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click Laporan Button
    And user click Stock Barang Button
    Then user can see stok barang

  @LaporanBarangTerjual
  Scenario: user konfirmasi topup at kasirsaku webpage happyflow
    Given user go to 'http://kasirsaku.sahabatdeveloper.site/'
    Then user in kasirsaku homepage
    When user click navbar user area
    When user click Login Button
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click Laporan Button
    And user click Barang Terjual Button
    Then user can see grafik of Barang Terjual


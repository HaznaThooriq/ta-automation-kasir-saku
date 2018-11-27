Feature: Api Barang

  Narrative:
  As a user
  I want to test API Barang at kasirsaku

  @APIIndexBarang
  Scenario: Happyflow API Index Barang
  Given user test API Barang with Authorization 'Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og=='
    Then user can see the index of barang

  @APIViewBarang
  Scenario: Happyflow API View Barang
    Given user test API View Barang with Authorization 'Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==' and id '33'
    Then user can see the result of view barang

  @APIScanBarcode
  Scenario: Happyflow API Scan Barcode
    Given user test API Scan Barcode with Authorization 'Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==' and barcode '12345678'
    Then user can see the result of Scan Barcode

  @APISearchBarang
  Scenario: Happyflow API Search Barang
    Given user test API Search Barang with Authorization 'Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==' and keyword 'Marjan'
    Then user can see the result search barang

  @APITambahStock
  Scenario: Happyflow API Tambah Stock Barang
    Given user test API Tambah Stock Barang Id '23' with Authorization 'Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og==', stock '60', harga supplier '5600', harga baru '6250'
    Then user can see the result of tambah stock barang

  @APIDelete
  Scenario: Happyflow API Delete Barang
    Given user test API Delete Barang Id '' with Authorization 'Basic YTJGemFYSmZjMkZyZFRwTlpXWldMVGgwVUVGdk9EbE9SR2M9Og=='
    Then user can see the result of delete barang




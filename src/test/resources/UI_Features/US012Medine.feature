Feature: Doktror_url_gider

  Background:  Doktor_olarak_ana_sayfaya_giris
    Given doktor "medunnaUrl" gider
    And Login ikonuna tklar
    And Sign in sekmesine tiklar
    Then "medineDoktorUser" ve "medineDoktorPassword" bilgileri girilerek, Sign in buttonuna tiklar
    And My Pages sekmesine tiklar
    And My Appointments secenegini secer ve tiklar
    And Test isteyebilmek icin, hastanin satirindaki Edit buttonuna tiklar
    And Yeni sayfada acilan Request A Test buttonuna tiklar

  Scenario: TC001_Doktor_hastaya_test_isteyebilmeli

    When Test Items texti gorunur oldugunu dogrular


  Scenario: TC002_Test_iceriginde_istenilecek_"Glucose_Urea_Creatinine_Sodium_Potassium_TotalProtein_Albumin_Hemoglobin"_testleri_olmali

    And Test Item texti altinda, Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin testlerin sagindaki check boxu tiklar
    Then Save buttonu gorunene kadar asagiya inilir ve tiklar
    And A new is created with identifier yazisi test edilir
    When Login ikonuna tklar ve Sign out sekmesine tiklar
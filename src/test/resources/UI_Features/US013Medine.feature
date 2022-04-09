Feature: Doktor_Test_Result_islemleri_yapabilmeli
  Background: user_HomePage
    Given user "medunnaUrl" gider
    And Login ikonuna tiklar
    And Sign in sekmesini tiklar

  Scenario Outline: TC001_Test_sonuclari_talep_edildikten_sonra_Staff_test_sonuclarini_guncelleyebilmeli

    Given "medineStaffUser" ve "medineStaffPasword" bilgileri girilerek, Sign in buttonuna tiklar
    And My Pages sekmesini tiklar
    And Search Patient sekmesini tiklar
    And Patient SSN boxuna, hastanin "<SSN>" ni yazar ve entere tiklar
    And Cikan hastanin satirindaki Show Appointments tiklar
    And acilan yeni pencereden, hastanin satirindaki Show Tests buttonuna tiklar
    And View Rasults sekmesini tiklar
    Then Testleri guncellemek icin Edit sekmesini tiklar
    And save buttonuna tiklar
    And A Test Result is update with identifier texti test edilir

    Examples:
      |SSN|
      |002-42-2222|

  Scenario: TC002_Doktor_Hastanin_test_bilgilerini_gorebilmeli

    Given "medineDoktorUser" ve "medineDoktorPassword" bilgileri girilerek, Sign in buttonuna tiklar
    And My Pages sekmesine tiklar
    And My Appointments secenegini secer ve tiklar
    And Test sonucunu gormek istedigi hastanin, hasta satirinda bulunan Edit buttonuna tiklar
    Then Show Test Results buttonunu tiklar
    And View Results buttonuna tiklar
    And Test Results sayfasinda test sonuclarini gordugunu test eder

  Scenario: TC003_Doktor_RequestImpatient_isteginde_bulunabilmeli

    Given "medineDoktorUser" ve "medineDoktorPassword" bilgileri girilerek, Sign in buttonuna tiklar
    And My Pages sekmesine tiklar
    And My Appointments secenegini secer ve tiklar
    And Test sonucunu gormek istedigi hastanin, hasta satirinda bulunan Edit buttonuna tiklar
    Then Request Inpatient buttonuna tiklar
    And My Pages sekmesine tiklar
    And My Inpatients secenegini secer ve tiklar
    And In patients sayfasinda hastayi gordugunu test eder
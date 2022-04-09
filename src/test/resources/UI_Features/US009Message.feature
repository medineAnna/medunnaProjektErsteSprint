Feature:US009 Message



  Background:

    Given Kullanici "medunnaUrl" adresine gider.
    Then insan Figurune tiklar
    And Sig in secenegini secer


  Scenario:TC01 Staff olarak hasta bilgilerini gorme testi

    And Staff olarak username ve password girer
    And Sigin  tiklar
    Then My PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patients yazisini ile listenin gorunurlulugunu test eder





    Scenario Outline:TC02:Hasta bilgilerini duzenleme testi

      And Staff olarak username ve password girer
      And Sigin  tiklar
      Then My PAGES sekmesine tiklar
      And Search Patient secenegini secer
      And Patientssn kutusuna "<SSN>" girer
      And  Edit butonuna tiklar
      And Staff hasta bilgilerinde duzenleme yapar
      And Save tiklar
      And Dogrulama gozlemlenir

      Examples:
        | SSN              |
        | 253-98-1249      |



  Scenario Outline:TC03 Staff tüm bilgilerin dolduruldugunu gorme testi

    And Staff olarak username ve password girer
    And Sigin  tiklar
    Then My PAGES sekmesine tiklar
     And Search Patient secenegini secer
    And Patientssn kutusuna "<SSN>" girer
    Then Edit butonuna tiklar
    And ilgili hastanin  bilgilerinin dolduruldugunu dogrular
    Examples:
      |  SSN             |
      |  123-56-9424     |

  Scenario Outline:TC04 Staff herhangi bir hasta bilgi silme Testi


    And Staff olarak username ve password girer
    And Sigin  tiklar
    Then My PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patientssn kutusuna "<SSN>" girer
    Then Edit butonuna tiklar
    And firstname siler ve silindigini test eder
    Examples:
      |  SSN             |
      |  123-56-9424     |


  Scenario Outline: TC05:Staff hastalari silememeli testi

   And Staff olarak username ve password girer
   And Sigin  tiklar
   Then My PAGES sekmesine tiklar
   And Search Patient secenegini secer
   And Patientssn kutusuna "<SSN>" girer
   And Hasta bilgisinde Delete butonunun olmadigi dogrulanir


        Examples:
     |  SSN             |
     |  123-56-9424     |




  Scenario Outline:TC06:Staff,hastalari SSN kimliklerine gore arayabilir.

      And Staff olarak username ve password girer
      And Sigin  tiklar
      Then My PAGES sekmesine tiklar
      And Search Patient secenegini secer
      And Patientssn kutusuna "<SSN>" girer
      And Staff hastalari SSN kimlik numaralarina gore arama yaptigini dogrular

    Examples:
      |  SSN             |
      |  026-06-1990     |
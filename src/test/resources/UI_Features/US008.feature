Feature: Password

  Background: Password Strength
    Given kullanici "medunnaUrl" adresine gider
    And giris icin giris ikonuna tiklar
    And ana sayfa Sign In butonuna tiklar



    Scenario Outline: Password Deneme
      Given username olarak "<username>" girer
      And password olarak "<password>" girer
      Then Sign In butonuna tiklar
      And password degistirmek icin password butonuna tiklar







      Examples:
        |username       |password           |
        |hasanAdminUser |hasanAdminPassword |



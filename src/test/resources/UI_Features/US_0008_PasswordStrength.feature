Feature: US008_PasswordChange

  TC01_Sayfaya erism Testi
  Background:
    Given kullanici adrese gider
    And   kullanici girisi yapar
    Then  yeni sayfadan sifre kismini secer
  Scenario Outline:
    Then yeni sifre kutusununa "<AdminNewPassword>" girilir
    And  password "<Strength>" seviyesinin degistigi gorulur
    Then cikis yapilir



    Examples:
      | AdminNewPassword      | Strength |
      |aaabbbc                |1         |
      |aaabbbc1               |2         |
      |aaabbbc1.              |3         |
      |aaabbbc.1A             |4         |


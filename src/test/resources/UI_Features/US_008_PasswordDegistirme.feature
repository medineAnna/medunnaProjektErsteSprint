Feature:Password Degisimi

  Background:
    Given kullanici adrese gider
    And   kullanici girisi yapar
    Then  yeni sayfadan sifre kismini secer

  Scenario Outline:Eski sifre ile
    And simdiki sifre olarak "<currentPassword>"girer
    Then yeni sifre kutusununa "<newPassword>" girer
    And yeni sifreyi tekrar girer "<newPasswordConfirmation>"
    Then yeni sifreyi kaydetmek icin save butonuna basar
    And kullanici "Password changed!" mesajini gorur

Examples:
|currentPassword|newPassword|newPasswordConfirmation|
 |abc.1111           |abc.1111      |abc.1111|


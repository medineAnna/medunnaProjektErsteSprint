Feature: US003 Registration password


  Background: US003 Registration new password test

    Given "medunnaUrl" adresine gider
    And kullanici giris ikonunu tiklar
    Then RegisterLinki ni tiklar

  Scenario Outline:
    When Hepsi kucuk, buyuk, rakam veya ozel olan ayni gruptan en az <arg0> karakterli bir sifreyi New password Box'a girer
    And <arg01> passwordstregnth seviyesinin degismedigini ve color<arg1> seviyesinde kaldigini gorur.

    Examples:
      | arg0 | arg01                | arg1 |
      | 7    | "Password strength:" | 1    |


  Scenario Outline: TC002 (Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir)
    Given Kullanici en az <arg0> en fazla <arg1> kucuk harf kullanarak <arg2> karakterli bir sifre girer
    And <arg01> passwordstregnth seviyesinin degistigini gorur.

    Examples:
      | arg0 | arg1 | arg2 | arg01                |
      | 1    | 6    | 7    | "Password strength:" |

  Scenario Outline: TC003 (Daha güçlü şifre için en az 1 büyük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir)
    Given Kullanici en az <arg0> en fazla <arg1> buyuk harf kullanarak <arg2> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin degistigini gorur.

    Examples:
      | arg0 | arg1 | arg2 | arg01                |
      | 1    | 6    | 7    | "Password strength:" |

  Scenario Outline: TC004 (Daha güçlü şifre için en az 1 rakam olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir)
    Given Kullanici en az <arg0> en fazla <arg1> rakam harf kullanarak <arg2> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin degistigini gorur.

    Examples:
      | arg0 | arg1 | arg2 | arg01                |
      | 1    | 6    | 7    | "Password strength:" |

  Scenario Outline: TC005 (Daha güçlü şifre için en az 1 ozel karakter olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir)
    Given Kullanici en az <arg0> en fazla <arg1> ozel karakter kullanarak <arg2> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin degistigini gorur.

    Examples:
      | arg0 | arg1 | arg2 | arg01                |
      | 1    | 6    | 7    | "Password strength:" |

  Scenario Outline: Extra1 (Daha güçlü şifre için 2 farkli gruptan (kucuk harf, buyuk harf, rakam veya ozel sembol) karakter kullanildiginda
    Given Kullanici <arg0> farkli gruptan karakter kullanarak <arg1> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin color<arg11> seviyesine degistigini gorur.

    Examples:
      | arg0 | arg1 | arg01                | arg11 |
      | 2    | 7    | "Password strength:" | 2     |

  Scenario Outline: Extra2 (Daha güçlü şifre için 3 farkli gruptan (kucuk harf, buyuk harf, rakam veya ozel sembol) karakter kullanildiginda
    Given Kullanici <arg0> farkli gruptan karakterler kullanarak <arg1> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin color<arg11> ve color<arg2> seviyesine degistigini gorur.

    Examples:
      | arg0 | arg1 | arg01                | arg11 | arg2 |
      | 3    | 7    | "Password strength:" | 3     | 4    |

  Scenario Outline: Extra3 (Daha güçlü şifre için 4 farkli gruptan (kucuk harf, buyuk harf, rakam veya ozel sembol) karakter kullanildiginda
    Given Kullanici <arg0> farkli gruptan da karakterler kullanarak <arg1> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin de color<arg11> seviyesine degistigini gorur.

    Examples:
      | arg0 | arg1 | arg01                | arg11 |
      | 4    | 7    | "Password strength:" | 5     |

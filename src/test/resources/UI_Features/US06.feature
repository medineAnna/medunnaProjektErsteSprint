Feature: Kullanici bilgisi sekmesi duzenlenebilir olmali

Scenario Outline:
  Given kullanici "medunnaUrl" adresine gider
  And giris icin giris ikonuna tiklar
  And ana sayfa Sign In butonuna tiklar
  And username olarak "gaziUsername" girer
  And password olarak "gaziPassword" girer
  Then Sign In butonuna tiklar
  And Setting butonuna tiklar
  And firstname olarak "<firstname>" girer
  And lastname olarak "<lastname>" girer
  And email olarak "<email>" girer
  And Setting sayfasinda save butonuna basar
  And Setting Saved! yazisini gorur



  Examples:
    |firstname    |lastname     |email                  |
    | ali         | veli        |aliveliii@gmail.com      |


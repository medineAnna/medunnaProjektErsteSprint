@US01
Feature: US001_Kayıt olmak icin SSN, Firstname ve Lastname bilgileri girililebilmelidir.
@us1 @deneme
  Scenario Outline:TC_01 Gecerli bir SSN, 3. ve 5. rakamdan sonra "-"  icermeli ve 9 rakamdan olusmalidir
    When kullanici "medunnaUrl" sayfasina gider
    Then sayfada kullanici ikonu altinda yer alan register butonuna tiklar
    And SSN kutucuğuna tıklar ardından boş bırakır ve 'Your SSN is required.' uyarı mesajını görüntüler
    Then kullanici SSN kutucuğuna sadece "<rakamlar>" girilebilmeli, "<harf>" ve "<özel karakter>" kabul edilmemeli, 'Your SSN is invalid' uyarı mesajı görüntülenmeli
    And kullanici geçerli SSN için 3. ve 5. rakamdan sonra '-' karakteri eklemeli ve herhangi bir uyarı yazısı alınmamalıdır
    Examples:
      | rakamlar | harf | özel karakter |
      | 1      |a  |-         |
      |12      |ab |*/        |
      |456     |asd|-*/       |
      |8797    |fjkd|-=*-/    |
      |594942  |dasas|*-/-\-  |
      |56465*/ad| sad564/*|+*/--sad234|

@us1 @deneme
  Scenario: TC_02 SSN boş bırakılmamalıdır
    When kullanici "medunnaUrl" sayfasina gider
    Then sayfada kullanici ikonu altinda yer alan register butonuna tiklar
    And SSN kutucuğuna tıklar ardından boş bırakır ve 'Your SSN is required.' uyarı mesajını görüntüler

@us1 @tc03 @deneme
  Scenario Outline: TC_03 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "First Name" olmalıdır
    When kullanici "medunnaUrl" sayfasina gider
    Then sayfada kullanici ikonu altinda yer alan register butonuna tiklar
    And FirstName kutucuğuna tıklar ardından boş bırakır ve 'Your FirstName is required.' uyarı mesajını görüntüler
    Then herhangi bir "<karakter>" veya "<karakterler>" girilir ve 'Your FirstName is required.' uyarı mesajı alınmadığı görülür
    And yalnizca harfler kullanilarak en az 3 harf olmak uzere FirstName textbox doldurulur
  Examples:
    | karakter | karakterler |
    |a         |as           |
    |1         |12           |
    |*         |*/           |

  @us1 @tc04 @deneme
  Scenario Outline: TC_04 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Last Name" olmalıdır
    When kullanici "medunnaUrl" sayfasina gider
    Then sayfada kullanici ikonu altinda yer alan register butonuna tiklar
    And LastName kutucuğuna tıklar ardından boş bırakır ve 'Your LastName is required.' uyarı mesajını görüntüler
    Then herhangi bir "<karakter>" veya "<karakterler>" girilir ve 'Your FirstName is required.' uyarı mesajı alınmadığı görülür
    And yalnizca harfler kullanilarak en az 3 harf olmak uzere LastName textbox doldurulur
    Examples:
      | karakter | karakterler |
      |a         |as           |
      |2         |23           |
      |=         |-^           |

  @us1 @tc05 @ApiRegistrant
  Scenario: TC_05 Swagger kullanarak tüm kayıt bilgilerini alın ve doğrulanmalıdır
    When kullanici pathparams ayarlamasini yapar
    Then accountlarin bilgilerini alir
    And alinan bilgilerin dogrulamasini yapar

  @tc06 @deneme
  Scenario: TC_06  API kullanarak kayıtlı kişiler oluşturulup doğrulanmalıdır
    When kullanici gerekli path params ayarlar
    Then expected datalari girer
    And kullanici request gonderir ve response alir
    Then kullamici api kayitlarini dosyaya kaydeder
    And kullanici api kayitlarini dogrular

  @tc07 @deneme
  Scenario: TC_07 DB ile SSN kimliklerini doğrulanmalıdır
    When kullanici tablodan gerekli sutunu alir
    Then ssn dogrulamasini yapar





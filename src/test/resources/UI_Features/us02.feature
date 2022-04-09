@US02
Feature: US002_Kayıt olmak için email and username bilgileri girilebilmelidir.

  @us2tc1 @deneme
  Scenario Outline: TC01_Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Username" olmalıdır
    When kullanici "medunnaUrl" sayfasina gider
    Then sayfada kullanici ikonu altinda yer alan register butonuna tiklar
    And UserName kutucuguna tiklar ardından boş bırakır ve 'Your UserName is required.' uyarı mesajını görüntüler
    Then herhangi bir "<karakter>" veya "<karakterler>" girilir ve 'Your FirstName is required.' uyarı mesajı alınmadığı görülür
    And "<ozel karakter>" girildiginde 'Your username is invalid.' uyari mesaji gorulur
    Then harfler ve rakamlardan olusan herhangi bir karakter sinirlamasina tabi tutulmayan "<username>" girilir ve urari mesaji alinmaz
    Examples:
      | karakter | karakterler | ozel karakter | username |
      |a         |1a2sd        |*/*/           |zort123   |
      |5         |asd579       |?!+-           |45liler   |
      |l         |65jgj8       |+_             |07bond07  |
      |j         |54sabf       |*/-/-*+?       |a1        |

  @us2tc2 @deneme
  Scenario: TC02_kullanıcı adı api kullanılarak doğrulanmalıdır
    When kullanici pathparams ve bearer token ayarlamasini yapar
    Then kullanici adini dogrular


  @us2tc3 @deneme
  Scenario Outline: TC03_Email adresi "@" ve "." karakterleri olmadan doldurulamamalıdır
   When kullanici "medunnaUrl" sayfasina gider
   Then sayfada kullanici ikonu altinda yer alan register butonuna tiklar
   And Email kutucuğuna tıklar ardından boş bırakır ve 'Your email is required.' uyarı mesajını görüntüler
   Then Email kutucuğuna 5 karakterden az "<karakter>" yollandığında 'Your email is required to be at least 5 characters.' uyarı mesajı görüntülenmeli
   And "@" ve "." karakterlerini herhangi bir yerde geçirerek "<mail adresi kabul edilmemeli>", 'This field is invalid' uyarı mesajı görüntülenmeli
   Then  "<gecerli email>" adresi icin "@" karakterinden önce  ve sonra karakterler yer almalı ardından "."  karakteri gelmeli onu takiben de karakterler gelmeli ve herhangi bir uyarı mesajı alınmamalı
   Examples:
     | karakter | mail adresi kabul edilmemeli | gecerli email |
     |a         |@sad.                         |as@yandex.com     |
     |1as       |asd@jsj.                      |sdhasj@hotmail.com|
     |gjk2      |asdsd.@sadsd.com              |mr.anderson@gmail.com|

   @us2tc4 @deneme
   Scenario: TC04_e-mail boş bırakılamamalıdır
     When kullanici "medunnaUrl" sayfasina gider
     Then sayfada kullanici ikonu altinda yer alan register butonuna tiklar
     And Email kutucuğuna tıklar ardından boş bırakır ve "Your email is required." uyarı mesajını görüntüler

   @us2tc5 @deneme
   Scenario: TC05_e-mail API ile doğrulanmalıdır
     When kullanici pathparams ve bearer token ayarlamasini yapar
     Then emaili api ile dogrular


   @us2tc6
   Scenario: TC06_DB ile dogrulanmalidir
     When kullanici tablodan gerekli sutunu alir
     Then email dogrulamasini yapar



Feature: Staff Appointment


  Background: Ana sayfa Appointment Test
    Given kullanici "medunnaUrl" adresine gider
    Then Make an Appointment Butonuna tiklar



  Scenario Outline: TC001 (First Name bos birakilamaz.)
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your FirstName is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      |      | lastname    | 256-65-8745 | user@user.com | 333-545-6985 | 24042022|



  Scenario Outline: TC002 (SSN bos birakilamaz.)
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your SSN is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | firstname     | lastname    |  | user@user.com | 333-545-6985 | 24042022|


  Scenario Outline: TC003 (Last Name bos birakilamaz.)
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your LastName is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | firstname     |     | 256-65-8745 | user@user.com | 333-545-6985 | 24042022|


  Scenario Outline: TC004 (Email bos birakilamaz.)
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your email is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | firstname     | lastname    | 256-65-8745 |  | 333-545-6985 | 24042022|


  Scenario Outline: TC005 (Email adresinde @ sembolu olmak zorunda)
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "This field is invalid" hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | firstname     | lastname    | 256-65-8745 |useruser.com  | 333-545-6985 | 24042022|


  Scenario Outline: TC006 (Email adresinde nokta (.) isareti olmak zorunda)
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "This field is invalid" hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | firstname     | lastname    | 256-65-8745 |user@usercom  | 333-545-6985 | 24042022|


  Scenario Outline: TC007
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Appointment registration saved!" onay mesaji gorulur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | firstname     | lastname    | 256-65-8745 |user@user.com  | 333-545-6985 | 24042022|


  Scenario Outline: TC008 (Telefon numarasi bos birakilamaz)
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Phone number is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | firstname     | lastname    | 256-65-8745 |user@user.com  |  | 24042022|


  Scenario Outline: TC009 (Telefon numarasinda 3. ve 6. rakamdan sonra tire (-) olmali ve toplam 10 rakamdan olusmali)
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Phone number is invalid" hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | firstname     | lastname    | 256-65-8745 |user@user.com  | 333-545-6985555  | 24042022|


  Scenario Outline: TC010 (Telefon numarasinda 3. ve 6. rakamdan sonra tire (-) olmali ve toplam 10 rakamdan olusmali)
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Phone number is invalid" hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | firstname     | lastname    | 256-65-8745 |user@user.com  | 3335456985  | 24042022|






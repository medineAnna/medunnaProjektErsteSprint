Feature: US0011_medunna



Background: US011

    Given kullanici(doktor)"MDNUrl" sayfasına gider
        And kullanici(doktor)giris ikonunu tiklar
        Then kullanici(doktor) Sign in i secer
        And kullanici(doktor)"Username" textbox'a  geçerli bir username girer
        And kullanici(doktor)"Password" textbox'a geçerli bir password girer
        And kullanici(doktor) sign in butonunu tiklar
        Then kullanici(doktor)My Pages menu butonuna tıklar
        And kullanici(doktor)My Appoinment secenegini seçer
        Then kullanici(doktor)Edit butonunu tiklar




    Scenario: TC01 (Kullanici(Doktor)  kendine oluşturulan randevuları görebilmeli)
        Given kullanici(doktor) "Create or Edit an Appointment" sayfasına gider
        And kullanici oturumu kapatir




    Scenario: TC02 ("Bir randevu güncellendiğinde; kullanici (doktor), hastanın aşağıdaki bilgilerini görmelidir.
    ""id, start and end date, Status, physician and patient")

        Given kullanici(Doktor)hastanın id bilgilerini görür
        And  kullanici(Doktor)hastanın start and end date bilgilerini görür
        And kullanici(Doktor)hastanın Status bilgilerini görür
        And kullanici(Doktor)hastanın physician and patient bilgilerini görür
        And kullanici oturumu kapatir

    Scenario: TC03 (Kullanici(Doktor) gerekli alanlara "Anamnesis, Treatment ve Diagnosis" yazabilmelidir)
        Then kullanici (Doktor)Anamnesis  textbox a bilgi girer
        Then kullanici Treatment  textbox a bilgi girer
        Then kullanici Diagnosis  textbox a bilgi girer
        And kullanci(Doktor) hastanin bilgilerini kaydeder
        And kullanici oturumu kapatir



    Scenario: TC04 ("Prescription ve Description" isteğe bağlı olmalıdır.)
        Given kullanici(Doktor) Prescription texbox daki bilgileri siler
        And kullanici(Doktor) Desscription texbox daki bilgileri siler
        And kullanci(Doktor) hastanin bilgilerini kaydeder
        And kullanici oturumu kapatir




    Scenario: TC05 ("Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmeli)
        Given Kullanıcı(Doktor) Status dropdown elementini PENDING, COMPLETED veya CANCELLED seklinde secer
        And kullanici oturumu kapatir


















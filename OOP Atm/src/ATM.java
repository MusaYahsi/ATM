
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoş Geldiniz..");
        System.out.println("************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("************************");
        int giris_hakki = 3;
        
        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş işlemi başarılı..");
                break;// ÖNEMLİ BİR DETAY BU BREAK . BU BREAK DÖNGÜYÜ BİTİRİYO EĞER BİTİRMEZSEK KULLANICI ADI VE PAROLA DOĞRU OLSA DAHİ TEKRAR İSTER
            }
            else{
                System.out.println("Giriş işlemi başarısız..");
                giris_hakki -= 1;
                System.out.println("Kalan hatalı giriş hakkınız : " + giris_hakki);
            }
            if(giris_hakki == 0){
                System.out.println("Hatalı giriş hakkınız doldu..");
                return ;
            }
        }
    
        System.out.println("************************");
        String islemler = "1. Bakiye Görüntüleme \n"
                         +"2. Para Yatırma \n"
                         +"3. Para Çekme\n,"
                         +"Çıkmak için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("************************");
        
        while(true){
            System.out.println("işlemlerden birisini seçiniz.");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutarı giriniz.");
                int tutar = scanner.nextInt();
                scanner.nextLine();// HATA GİDERMEK AMAÇLI YAPILDI...
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutarı giriniz.");
                int tutar = scanner.nextInt();
                scanner.nextLine();// HATA GİDERMEK AMAÇLI YAPILDI...
                hesap.paraCek(tutar);
            }
            else{
                System.out.println("Geçersiz işlem...");
               
            }
            
        }
        
        
    }
    
}

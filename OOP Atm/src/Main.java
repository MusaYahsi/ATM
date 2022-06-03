
public class Main {
    
    public static void main(String[] args){
     
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("musa","123",4250);
        
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor..");
        
        
        
    }   
}

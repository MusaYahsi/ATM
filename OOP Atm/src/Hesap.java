
public class Hesap {
    
    
    private String kullaniciAdi;
    private String parola;
    private int bakiye;
    
    public Hesap(String kullaniciAdi, String parola, int bakiye){ // buradaki işleme CONSTRUCTOR deniyor..
        this.bakiye = bakiye;
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
    }

    /**
     * @return the hesapNo
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the hesapNo to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the kullaniciAdi
     */
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    /**
     * @param kullaniciAdi the kullaniciAdi to set
     */
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }
    public void paraYatir(int tutar){
        
        bakiye += tutar;
        System.out.println( tutar + " birim para hesabınıza yüklendi. Güncel bakiyeniz : " + bakiye);
    }
    public void paraCek(int tutar){
        
        if(tutar > bakiye){
            System.out.println("Hesabınızdaki para yetersiz. Bakiyeniz : " + bakiye);
        }
        else{
            bakiye -= tutar;
            System.out.println( tutar + " birim para hesabınızdan çekildi. Güncel bakiyeniz :    " + bakiye);
        }
    }
    
}

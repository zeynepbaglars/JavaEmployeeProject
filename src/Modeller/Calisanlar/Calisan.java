package Modeller.Calisanlar;

import Modeller.Departmanlar.Departman;
import Veritabani.Calisanlar;


public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();
        Calisanlar.addACalisan(this);
    }

    private void setDepartman(String departman) {

        for (Departman d: Veritabani.Departmanlar.getDepartmanList()){
            if (departman.equals(d.getDepartmanKodu()))
                this.Departman=d;
        }
    }

    private void setCalisanId() {
        calisanId= Departman.getDepartmanKodu()+(Calisanlar.getCalisanList().size()+1)+getCalisanIsimKodu();
    }

    private String getCalisanIsimKodu() {
        String [] arrIsimKodu = adSoyad.split(" ");
        for (String a: arrIsimKodu){
            isimKodu=isimKodu.concat(a.substring(0,1).toUpperCase());
        }
        return this.isimKodu;
    }

    public String getCalisanId() {
        return this.calisanId;
    }
    public Departman getDepartman() {
        return this.Departman;
    }
    public String getDepartmanAdi() {

        String departman="";
        if (getDepartman().getDepartmanKodu().equals("YD"))
            departman= "Yönetim Departmanı";
        else if (getDepartman().getDepartmanKodu().equals("BTD"))
            departman= "Bilişim Teknolojileri Departmanı";
        else if (getDepartman().getDepartmanKodu().equals("IKD"))
            departman= "İnsan Kaynakları Departmanı";
        return departman;
    }

    public static void zamYap(String calisanId) {

        for (Calisan c:Calisanlar.getCalisanList()){
            if(calisanId.equals(c.getCalisanId()))
                c.maas= c.maas*c.getDepartman().getZamOrani()/100;
        }
    }

    @Override
    public String toString() {

        return "Calisan ID: "   + getCalisanId()+ ", " +
               "Isim Soyisim: " + adSoyad + ", " +
               "Maas: "         + maas + ", " +
               "Departman: "    + getDepartmanAdi();

    }
}

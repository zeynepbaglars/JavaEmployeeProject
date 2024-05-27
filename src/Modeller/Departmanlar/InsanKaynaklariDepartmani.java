package Modeller.Departmanlar;

public class InsanKaynaklariDepartmani implements Modeller.Departmanlar.Departman {

    final String departmanKodu = "IKD";
    final int zamOrani = 120;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}

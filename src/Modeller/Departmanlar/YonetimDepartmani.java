package Modeller.Departmanlar;

public class YonetimDepartmani implements Modeller.Departmanlar.Departman {

    final String departmanKodu = "YD";

    final int zamOrani = 125;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}

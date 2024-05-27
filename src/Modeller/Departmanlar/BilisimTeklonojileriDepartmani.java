package Modeller.Departmanlar;

public class BilisimTeklonojileriDepartmani implements Modeller.Departmanlar.Departman {

    final String departmanKodu = "BTD";
    final int zamOrani = 130;


    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}

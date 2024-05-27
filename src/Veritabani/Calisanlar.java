package Veritabani;

import Modeller.Calisanlar.Calisan;

import java.util.ArrayList;

public class Calisanlar {

    private static ArrayList<Calisan> calisanList = new ArrayList<>();
    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }
    public static void addACalisan(Calisan calisan) {
        calisanList.add(calisan);
    }
    public static void deleteACalisanWithId(String calisanId) {

        calisanList.removeIf(c -> calisanId.equals(c.getCalisanId()));
    }
    public static void printDepartmandakiCalisanlar(String departmanKodu) {

        for (Calisan c: calisanList) {
            if (departmanKodu.equals(c.getDepartman().getDepartmanKodu()))
                System.out.println(c);
        }
    }

    public static void printCalisanlar() {

        for (Calisan c:calisanList)
            System.out.println(c);
    }
}

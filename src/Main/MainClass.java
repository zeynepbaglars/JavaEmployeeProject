package Main;

import Modeller.Calisanlar.Calisan;
import Veritabani.Calisanlar;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Şirket Paneline Hoşgeldiniz. Lütfen bir islem seciniz.");
            System.out.println("------------------------------------");
            System.out.println("1-Calisan İslemleri\n2-Tüm Calisanlari Görüntüle\n3-Departmandaki Tüm Calisanlari Görüntüle\n4-Çıkış");
            System.out.println("------------------------------------");
            System.out.print("Islem : ");
            int secim1 = input.nextInt();
            System.out.println("İşleminiz gerçekleştiriliyor lütfen bekleyiniz...");
            Thread.sleep(1500);

            if (secim1 == 1) {
                while (true) {
                    System.out.println("---------------------------------");
                    System.out.println("Calisan İslemleri Paneline Hosgeldiniz, Lütfen bir islem seciniz.");
                    System.out.println("1-Calisan Ekle\n2-Calisan Sil\n3-Zam Yap\n4-Onceki Menu\n");
                    System.out.print("İslem : ");
                    int secim2 = input.nextInt();
                    System.out.println("İşleminiz gerçekleştiriliyor lütfen bekleyiniz...\n");
                    Thread.sleep(1000);

                    if (secim2 == 1) {
                        System.out.print("Lutfen isim ve soyisim giriniz : ");
                        String calisanAdSoyad = stringInput.nextLine();

                        System.out.print("Lütfen maas giriniz : ");
                        int calisanMaas = input.nextInt();

                        System.out.print("Lütfen departman kodunu giriniz : ");
                        String calisanDepartmanKod = stringInput.nextLine();

                        new Calisan(calisanAdSoyad, calisanMaas, calisanDepartmanKod);
                        System.out.println("Calisan basari ile eklendi. Onceki menüye aktariliyorsunuz...");
                        Thread.sleep(1000);
                        break;

                    } else if (secim2 == 2) {

                        System.out.print("Lütfen silmek istediğiniz çalışanın ID sini giriniz : ");
                        String calisanId = stringInput.nextLine();
                        Calisanlar.deleteACalisanWithId(calisanId);
                        System.out.println(calisanId + " Başarı ile silindi. Onceki Menuye aktariliyorsunuz....");
                        Thread.sleep(1000);
                        break;

                    } else if (secim2 == 3) {

                        System.out.print("Lütfen zam yapmak istediğiniz çalışanın ID sini giriniz : ");
                        String calisanId = stringInput.nextLine();
                        Calisan.zamYap(calisanId);
                        System.out.println("Islem basari ile gerçekleşti, Onceki menuye aktariliyorsunuz");
                        Thread.sleep(1000);
                        break;

                    } else if (secim2 == 4) {

                        System.out.println("İşleminiz gerçekleştiriliyor lütfen bekleyiniz...\n");
                        Thread.sleep(1000);
                        break;

                    } else {

                        System.out.println("Hatali secim yaptiniz lütfen tekrar deneyiniz.");
                    }
                }

            } else if (secim1 == 2) {
                System.out.println("Tüm calisanlar listeleniyor...");
                Thread.sleep(1000);
                System.out.println("Tüm calisanlar listeleniyor...");
                Thread.sleep(1000);
                System.out.println("Tüm calisanlar listeleniyor...");
                Thread.sleep(1000);
                System.out.println("-------------------------");
                Calisanlar.printCalisanlar();
                System.out.println("-------------------------");

            } else if (secim1 == 3) {
                System.out.print("Lütfen departman kodunu giriniz : ");
                String departmanKodu = stringInput.nextLine();
                System.out.println("Tüm calisanlar listeleniyor...");
                Thread.sleep(1000);
                System.out.println("Tüm calisanlar listeleniyor...");
                Thread.sleep(1000);
                System.out.println("Tüm calisanlar listeleniyor...");
                Thread.sleep(1000);
                System.out.println("-------------------------");
                Calisanlar.printDepartmandakiCalisanlar(departmanKodu);
                System.out.println("-------------------------");
            } else {
                System.out.print("Başarıyla çıkış yaptınız, iyi günler dileriz.");
                break;
            }
        }
    }
}

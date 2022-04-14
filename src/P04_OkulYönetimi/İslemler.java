package P04_OkulYönetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class İslemler {
    static ArrayList<Kisiler> ögrenciListesi = new ArrayList<>();
    static ArrayList<Kisiler> ögretmenListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTürü;

    public static void girisPanelı() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTürü = "ÖGRENCİ";
                islemMenüsü();
                break;
            case "2":
                kisiTürü = "ÖGRETMEN";
                islemMenüsü();
                break;
            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
                girisPanelı();//reqursive method call
                break;
        }


    }

    public static void cıkıs() {
        System.out.println("Yine bekleriz");
    }

    public static void islemMenüsü() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTürü + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenİslem = scan.nextInt();
        switch (secilenİslem) {
            case 1:
                ekle();
                islemMenüsü();
                break;
            case 2:
                arama();
                islemMenüsü();
                break;
            case 3:
                listele();
                islemMenüsü();
                break;
            case 4:
                silme();
                islemMenüsü();
                break;
            case 0:
                girisPanelı();
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
                islemMenüsü();
                break;


        }
    }

    private static void silme() {

    }

    private static void listele() {
        System.out.println("öğrenci listesi =" + ögrenciListesi);
    }

    private static void arama() {
        System.out.println("*** " + kisiTürü + " arama islemi ***");
        System.out.println("aramak istediğiniz " + kisiTürü + "nin tc bilgisini yazınız");

    }


    private static void ekle() {
        System.out.print("***  " + kisiTürü + " ekleme sayfası  *** \n");
        System.out.print("Ad Soyad giriniz");
        scan.nextLine();//DUMMY YANİ HAYALET KOMUT
        String adSoyad = scan.nextLine();
        System.out.print("Kimlik no giriniz");
        String kimlikNo = scan.nextLine();
        System.out.print("Yaş giriniz");
        int yas = scan.nextInt();

        if (kisiTürü.equals("ÖGRENCİ")) {
            System.out.print("Ögrenci no giriniz");
            scan.nextLine();
            String ögrenciNo = scan.next();
            System.out.print("sınıf giriniz");
            String sınıf = scan.next();
            Ögrenci sefilÖgrenci = new Ögrenci(adSoyad, kimlikNo, yas, ögrenciNo, sınıf);//p'li cons dan ögrnci obje create edıldi
            ögrenciListesi.add(sefilÖgrenci);
        } else {
            System.out.print("Sicil no giriniz");
            String sicilNo = scan.next();
            scan.next();
            System.out.print("bölüm giriniz");
            String bölüm = scan.nextLine();
            Ögretmen ögretmen = new Ögretmen(adSoyad, kimlikNo, yas, bölüm, sicilNo);
            ögretmenListesi.add(ögretmen);

        }
        System.out.println("ekleme işleminiz başarıyla gerçekleştirilmiştir");


    }
}

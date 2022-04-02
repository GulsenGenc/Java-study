package _04_SwitchCase;

import java.util.Scanner;

public class QQ2 {
    public static void main(String[] args) {
        //kullanıcının yasadıgı gune gore 100 gun sonra hangı gun oldugunu yazdırınız
        //pazratesi hafta baslangıcı

        Scanner scan = new Scanner(System.in);
        System.out.println(" pazartesi:1\n salı:2\n carsamba:3\n persembe:4\n cuma:5\n cumartesi:6\n pazar:7\n Haftanın kaçıncı gunu oldugunu gırınız : ");
        int kacıncıGun = scan.nextInt();

        if (kacıncıGun > 7 || kacıncıGun <= 0) {
            System.out.println("hatalı veri girdiniz");

        } else {
            System.out.println("kac gun sonrasını ögrenmek ıstıyorsunuz");
            int kacGunSonrası = scan.nextInt();
            int bulunanGun = (kacGunSonrası + kacıncıGun) % 7;

            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonrası + " gün sonra pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrası + " gün sonra salı");
                    break;
                case 3:
                    System.out.println(kacGunSonrası + " gün sonra çarsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonrası + " gün sonra perşembe");
                    break;
                case 5:
                    System.out.println(kacGunSonrası + " gün sonra cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrası + " gün sonra cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonrası + " gün sonra pazar");
                    break;

                default:
                    System.out.println("hafta 7 gün zaten");
                    break;

            }


        }
    }}

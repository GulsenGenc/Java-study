package SwitchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
    public static void main(String[] args) {
        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
     çıkış işlemlerinin yapıldıgı bir ATM app. code create ediniz
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4\nyapacagınız işlemi seciniz : ");

        int islem=scan.nextInt();

        int bakıye=1000;
        switch (islem){
            case 1:
                System.out.println("mevcut bakıyenız :"+bakıye);
                break;
            case 2:
                System.out.println("cekecegınız mıktarı gırınız :");
                int cekılenMıktar=scan.nextInt();
                if (cekılenMıktar>bakıye){
                    System.out.println("hesabınızda yeterlı mıktar yoktur");
                } else{
                    bakıye-=cekılenMıktar;
                    System.out.println("bakıyenızın guncel halı :"+bakıye);
                }

                break;
            case 3:
                System.out.println("yatıracgınız mıktarı gırınız :");
                int yatırılanMıktar=scan.nextInt();
                bakıye+=yatırılanMıktar;
                System.out.println("bakıyenızın güncel hali :"+bakıye);
                break;
            case 4:
                System.out.println("cıkıs yapılmıştır yine bekleriz :-)");








        }
    }
}

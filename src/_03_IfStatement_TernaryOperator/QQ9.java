package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class QQ9 {
    public static void main(String[] args) {

        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı gırınız");
        int sayı=scan.nextInt();
        String sonuc = (sayı > 99 && sayı < 1000) ? ("3 basamaklı sayi") : (sayı % 2 == 0 ?"3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı ");

        System.out.println(sonuc);

    }
}

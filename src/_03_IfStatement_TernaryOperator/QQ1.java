package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class QQ1 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Toplama için 1\n çıkarma için 2\n çarpma için 3\n " +
                "bölme için 4");
        //kullanıcıya seçim içn işlem menusu yazdırdık

        int islem=scan.nextInt() ; //kullanıcının islem tercihi için veriable create edildi
        System.out.println("lütfen işleme girecek iki sayı giriniz"); //kullanıcıya bildirmde bulunuldu.
        double sayı1=scan.nextDouble(); //1. sayı assign edildi
        double sayı2=scan.nextDouble(); //2. sayı assign edildi

        if (islem==1){
            System.out.println("toplama işleminin sonucu :" + sayı1 + " + " + sayı2 + " = " + (sayı1 + sayı2));
        } else if (islem==2){
            System.out.println("çıkarma işleminin sonucu :" + sayı1 + " - " + sayı2 + " = " + (sayı1 - sayı2));
        } else if (islem==3){
            System.out.println("çarpma işleminin sonucu :" + sayı1 + " * " + sayı2 + " = " + (sayı1 * sayı2));
        } else if (islem==4){
            System.out.println("bölme işleminin sonucu :" + sayı1 + " / " + sayı2 + " = " + (sayı1 / sayı2));
        } else{
            System.out.println("lütfen gecerli bir işlem secınız");
        }

    }
}

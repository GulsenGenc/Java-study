package _10_List;

import java.util.Scanner;

public class QQ5 {
    public static void main(String[] args) {
          /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)
         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin=scan.nextLine();

        String arr[]=metin.split("");//kullanıcıdan gelen metın hiçliğe gore parçalanarak
                                           // herbır parca arrayın elemanı olarak atandı

       // System.out.println(_09_Arrays.toString(arr));

        String enCokTekrarEden="";
        int maxSayac=0;//en çok kullanılan karakterın sayısı
        int sayac=1;

        for (int i = 0; i < arr.length ; i++) {//karşılastırılan karakter gelecek burdan
            for (int j = i+1; j < arr.length ; j++) { //karşılastıran karakter kontrolu-->a,y,a,t....

                if (arr[i].equalsIgnoreCase(arr[j])){
                    sayac++;
                }
            }
            if (sayac>maxSayac){
                maxSayac=sayac;
                enCokTekrarEden=arr[i];
            }else if (sayac==maxSayac){
                enCokTekrarEden+=","+arr[i];
            }

        }
        System.out.println("girdiğiniz metinde en çk tekrar eden karakter :" +enCokTekrarEden);


    }
}

package list;

import java.util.ArrayList;
import java.util.List;

public class QQ1 {
    public static void main(String[] args) {
         /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */

        List <Integer> asalSayıListesi =new ArrayList<>();
        int sayac=0;

        for (int sayı = 2; sayı <100 ; sayı++) {

          boolean sonuc=false;
            for (int i = 2; i <sayı ; i++) {
                if (sayı%i==0){
                  sonuc=true;

                }
            }
            if (sonuc==false){
                asalSayıListesi.add(sayı);
                sayac++;
            }

            }
        System.out.println("100 den küçük asal sayılar " +sayac+ "tanedir ve şunlardır :"+asalSayıListesi);


        }

    }


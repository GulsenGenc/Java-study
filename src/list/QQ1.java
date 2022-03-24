package list;

import java.util.ArrayList;
import java.util.List;

public class QQ1 {
    public static void main(String[] args) {
         /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */

        List<Integer> asalaSayıLıstesı=new ArrayList<>();
        int sayac=0;

        for (int sayı = 2; sayı <100 ; sayı++) {

            boolean sonuc=false;
            for (int j = 2; j <sayı ; j++) {
                if (sayı%j==0){
                    sonuc=true;
                }


            }
            if (sonuc==false){
                sayac++;
              asalaSayıLıstesı.add(sayı);
            }

        }
        System.out.println("100 den küçük asal sayılar "+ sayac +" tanedir ve sunlardır :"+asalaSayıLıstesı);


        }

    }


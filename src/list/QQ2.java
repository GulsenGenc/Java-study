package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QQ2 {
    public static void main(String[] args) {
        /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayı=scan.nextInt();
        List<Integer> fıbonaccı=new ArrayList<>();
        int x=1;
        int y=1;
        int z;

        fıbonaccı.add(x);
        fıbonaccı.add(y);

        for (int i = 1; i <=sayı-2 ; i++) {

            z=x+y;
            x=y;
            y=z;
            fıbonaccı.add(z);

        }
        for (int each: fıbonaccı
             ) {
            System.out.print(each+ "-");

        }


        }

    }


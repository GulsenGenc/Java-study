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
        int a=1;
        int b=1;
        int c;

        fıbonaccı.add(a);
        fıbonaccı.add(b);

        for (int i = 1; i <=sayı-2 ; i++) {

            c=a+b;
            a=b;
            b=c;
            fıbonaccı.add(c);

        }
        System.out.println(fıbonaccı);





    }
}

package _04_SwitchCase;

import java.util.ArrayList;
import java.util.Arrays;

public class QQ3 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir _10_List olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        ArrayList<String> isimler =new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));

        System.out.println(isimler);//[Umit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]

        String temp=isimler.get(2);
        isimler.set(2,isimler.get(7));
        isimler.set(7,temp);
        System.out.println(isimler); //[Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]








    }
}

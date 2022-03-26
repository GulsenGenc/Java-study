package list;

import java.util.ArrayList;
import java.util.Arrays;

public class QQ3 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */


        ArrayList<String> isimler=new ArrayList<>(Arrays.asList("Ali","Veli","ayşe","fatma","ömer"));
        ArrayList<String> aOlmayanIsımler=new ArrayList<>(Arrays.asList());

        for (String w:isimler
             ) {
            if (!w.toLowerCase().contains("a")){
                aOlmayanIsımler.add(w);
            }

        }
        System.out.println("a olmayan isimler :"+aOlmayanIsımler);//a olmayan isimler :[Veli, ömer]
        isimler.clear();
        isimler.addAll(aOlmayanIsımler);
        System.out.println(isimler);//[Veli, ömer]
    }
}

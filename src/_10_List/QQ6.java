package _10_List;

import java.util.ArrayList;
import java.util.Arrays;

public class QQ6 {
    public static void main(String[] args) {
        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */

        int arr[]={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        ardisikToplam(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static ArrayList<Integer> ardisikToplam(int[] arr) {
        ArrayList<Integer> toplananSayılarListi=new ArrayList<>();
        int count=0;
        int toplananSayıAdedi=1;
        while(arr.length-toplananSayıAdedi>=count){//sayılar bıtene kadar action
            int toplam=0;
            for (int i = 0; i <=count ; i++) {
                toplam+=toplananSayıAdedi-1+i;

            }
            count++;
            toplananSayıAdedi+=count;
            toplananSayılarListi.add(toplam);
        }


        return toplananSayılarListi;
    }
}

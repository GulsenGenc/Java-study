package _10_List;

import java.util.Arrays;

public class QQ7 {
    public static void main(String[] args) {

        /*
 TASK:
 you have a string "GayetBasarılı"
 with arrays change it to "CoookBasarılı" and write changing array
 (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

 */
        String metın="GayetBasarılı";
        String str=metın.replaceAll("Gayet","Coook");
        System.out.println(str);

        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));





    }
}

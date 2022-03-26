package list;

import java.util.*;

public class QQ4 {
    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */


        int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};

        List<Integer> tekrarsızList=new ArrayList<>();

        for (Integer s:arr
             ) {
            if (!tekrarsızList.contains(s)){
                tekrarsızList.add(s);
            }

        }
        Collections.sort(tekrarsızList);
        int tekrarsızArray[]=new int[tekrarsızList.size()];

        for (int i = 0; i <tekrarsızList.size() ; i++) {
            tekrarsızArray[i]=tekrarsızList.get(i);

        }
        System.out.println(Arrays.toString(tekrarsızArray));//[1, 2, 3, 4, 5, 6, 7, 8, 9]



    }
}

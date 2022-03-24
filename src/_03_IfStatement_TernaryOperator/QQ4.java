package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class QQ4 {
    public static void main(String[] args) {
        //kullanıcıdan koordınatlarını ısteyın ve hangı bölgede oldugunu yazdırın

        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.

        System.out.println("X ve Y degerleriniz giriniz : ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x>0 && y>0){
            System.out.println("girdiğiniz değerler 1. bölgededir");
        } else if (x>0 && y<0){
            System.out.println("girdiğiniz değerler 2. bölgededir");
        } else if (x<0 && y<0){
            System.out.println("girdiğiniz değerler 3. bölgededir");
        } else if (x<0 && y>0){
            System.out.println(" girdiğiniz değerler 4.bölgededir");
        } else if (x==0 && y !=0){
            System.out.println("girdiğiniz değerler y ekseni üzerindedir");
        } else if (y==0 && x!=0){
            System.out.println("girdiğiniz değerler x ekseni üzerindedir");
        } else{
            System.out.println("girdiğiniz değerler orijindedir");
        }
    }
}

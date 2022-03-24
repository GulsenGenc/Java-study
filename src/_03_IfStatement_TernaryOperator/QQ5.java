package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class QQ5 {
    public static void main(String[] args) {
        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.

        System.out.print("ehliyetiniz var ise -> 1 yok ise -> 0 yazınız : ");
        int ehlıyet= scan.nextInt();
        int ceza =0;
        System.out.println("hızınızı gırınız");
        int hız=scan.nextInt();

        if (ehlıyet==0 || ehlıyet ==1){
            if (ehlıyet==0){
                if (hız<0){
                    System.out.println("hız negatif olmaz.kontrol ediniz");
                }if (hız>55 &&hız<75){
                    ceza+=200+100;
                } else if (hız>=75 && hız<85){
                    ceza+=200+150;
                } else if (hız>85 && hız<=94){
                    ceza+=200+320;
                } else if (hız>95){
                    ceza+=200+500;
                } else {
                    System.out.println("hız sınırda seyehat edıyorsunuz." +
                            "ancak ehlıyetınız olmadıgı ıcın cezanız 200 $ dır");
                    ceza+=200;
                }

            } else if (ehlıyet==1){
                if (hız<0){
                    System.out.println("hız negatif olmaz.kontrol ediniz");
                }if (hız>55 &&hız<75){
                    ceza+=100;
                } else if (hız>=75 && hız<85){
                    ceza+=150;
                } else if (hız>85 && hız<=94){
                    ceza+=320;
                } else if (hız>95){
                    ceza+=500;
                } else {
                    System.out.println("hız sınırda seyehat edıyorsunuz.iyi yolculuklar");
                }
            }
            System.out.println("cezanız :" +ceza +"$ dır.");
        } else{
            System.out.println("ehliyetiniz varmı (1) yok mu(2) ?");

        }

    }
}

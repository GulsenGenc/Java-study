import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin {

    public static void main(String[] args) {


         List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.


 yorum :arkadaşlar Film Tahmini projesinde biraz daha gerçeklik sağlama adına,
 film tahmini başlatmadan hemen önce Collections.shuffle(); komutu ekleyebiliriz.
 Bu komut film listesindeki elemanların indexlerini değiştireceği için,
 daha önce bir kere oynayan oyuncunun, filmlerine indexlerini ezberlemeden  oyunu tekrar tekrar oynamasını sağlayacaktır.
  tıpkı torbadan top çekmeden önce torbayı karıştırmak gibi (edited)

 */



            Scanner scan = new Scanner(System.in);

            System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

            System.out.println("0-"+(film.size())+" arasinda bir sayi giriniz");
            int secılenFilmIndeksı=scan.nextInt();
            filmGetir(film,secılenFilmIndeksı);

        }

    private static void filmGetir(List<String> filmler, int ındeks) {
        Scanner scan = new Scanner(System.in);
        System.out.println(filmler.get(ındeks).replaceAll("\\w"," _ "));
        System.out.println(filmler.get(ındeks).length()+"harfli yabancı film tahmin etmek için harf giriniz : ");
        char harf=' ';
        int tahmınSayısı=0;
        int dogruThmınSayısı=0;


        do {


        }while((tahmınSayısı-dogruThmınSayısı)!=2*filmler.get(ındeks).length());//yanlış sayısı verılen hakka ulaşanna kadar do body çalışır.


        if ((tahmınSayısı-dogruThmınSayısı)==2*filmler.get(ındeks).length()){
            System.out.println("yanlış tahmin sayısı :"+(tahmınSayısı-dogruThmınSayısı));
            System.out.println("Game Over \n Yine Bekleriz \n Bulamadıgınız Film :"+filmler.get(ındeks));
        }
    }
}


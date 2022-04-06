package QQ1;

public class ArabaMain {
    public static void main(String[] args) {
        Araba honda =new Araba();
        honda.setModel("accord");
        honda.setRenk("siyah");
        honda.setYıl(2021);
        honda.setMotor(1990);
        System.out.println(honda);




        Araba toyota=new Araba("avensis","beyaz",2000,2020);//parametrelı cons
        Araba volvo=new Araba("s80","gri",2400,2010);//parametrelı cons
        Araba hacıMurat =new Araba(2000,2021);
        System.out.println(honda);//toString methodu ile bu objeye aıt herseyı dırek yazdırabılıyoruz
        System.out.println(volvo);//toString methodu olmazsa referans degerı dondurur
        System.out.println("sectiğiniz araç toyota ->"+"modeli :"+ toyota.getModel()+" rengi :"+toyota.getRenk());

        System.out.println(hacıMurat);

    }
}

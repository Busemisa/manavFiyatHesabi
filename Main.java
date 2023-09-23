import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //meyve ve sebzelerin kg fiyatlandırması yapıldı
        double armutKg =2.14;
        double elmaKg=3.67;
        double domatesKg =1.11;
        double muzKg=0.95;
        double patlicanKg=5.0;
        double kilo,toplamFiyat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kg armut almak istiyorsunuz: ");
        kilo = inp.nextDouble();
        toplamFiyat = kilo * armutKg;


        System.out.print("Kaç kg elma almak istiyorsunuz: ");
        kilo = inp.nextDouble();
        toplamFiyat += kilo * elmaKg;

        System.out.print("Kaç kg domates almak istiyorsunuz: ");
        kilo = inp.nextDouble();
        toplamFiyat += kilo * domatesKg;

        System.out.print("Kaç kg muz almak istiyorsunuz: ");
        kilo = inp.nextDouble();
        toplamFiyat += kilo * muzKg;

        System.out.print("Kaç kg patlıcan almak istiyorsunuz: ");
        kilo = inp.nextDouble();
        toplamFiyat += kilo * patlicanKg;


        //girilen kg ile kg başına fiyat çarpıldı bunun sonucunda genel tutar bulunmuş oldu
        System.out.println("Toplam Tutar: " + toplamFiyat + " TL");



    }
}

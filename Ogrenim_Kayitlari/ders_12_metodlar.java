package intro;

public class ders_12_metodlar {

    public static void main(String[] args) {

        int[] sayilar= {3,4,7,5,20,8};

        System.out.println("en buyuk sayi : " + EnBuyukSayiBulma(sayilar));
        //Yazdirma(max);

    }

    public static int EnBuyukSayiBulma(int... sayilar) {

        int max=sayilar[0];

        for(int i=0 ; i<sayilar.length ; i++) {

            if(sayilar[i]>max) max=sayilar[i];

        }

        return max;

    }

    public static void Yazdirma(int max) {

        System.out.println("En buyuk sayi "+max+"'dir");

    }

}
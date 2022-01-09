import java.util.Scanner;


public class ortalamaHesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz=");
        int matematik=input.nextInt();
        System.out.print("fizik notunuzu giriniz=");
        int fizik=input.nextInt();
        System.out.print("Müzik notunuzu giriniz=");
        int Müzik=input.nextInt();
        System.out.print("kimya notunuzu giriniz=");
        int kimya=input.nextInt();
        System.out.print("türkçe notunuzu giriniz=");
        int türkçe=input.nextInt();
        System.out.print("tarih notunuzu giriniz=");
        int tarih=input.nextInt();
         int ortalama=((matematik+Müzik+kimya+fizik+tarih+türkçe)/6);
        System.out.println((ortalama >60) ?"geçtiniz":"kaldınız");
        


    }



}

package deneme;

import java.util.Scanner;

public class casıo {
	public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner okuyucu = new Scanner(System.in);
    System.out.println("Hesap makineme hoşgeldiniz.");
    System.out.println("Hesap makinesinde kullanmak istediğiniz 2 sayıyı giriniz:");
    double sayıBir = okuyucu.nextDouble();
    double sayıİki = okuyucu.nextDouble();
System.out.println("Hangi işlemleri yapmak istersiniz? (*,/,-,+)");
    char işlem = okuyucu.next().charAt(0);
    double sonuç;
    switch(işlem) {

        case '+':
            sonuç = sayıBir + sayıİki;
            System.out.println(sayıBir + " + "+ sayıİki +" = " +sonuç);
            break;
        case '-':
            sonuç = sayıBir - sayıİki;
            System.out.println(sayıBir + " - "+ sayıİki +" = " +sonuç);
            break;
        case '*':
            sonuç = sayıBir * sayıİki;
            System.out.println(sayıBir + " * "+ sayıİki +" = " +sonuç);
            break;
        case '/':
            sonuç = sayıBir / sayıİki;
            System.out.println(sayıBir + " / "+ sayıİki +" = " +sonuç);
            break;
        default : System.out.println("Çarpma,bölme,çıkarma veya toplama işlemi seçiniz.");


    }
    okuyucu.close();
}
}

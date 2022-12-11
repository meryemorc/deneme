package deneme;

import java.util.Scanner;

public class kardeşYaşı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner okuyucu = new Scanner(System.in);
     System.out.println("Kardeşlerin yaşlarını sırasıyla giriniz.");
     double kardeş1 = okuyucu.nextDouble();
     double kardeş2 = okuyucu.nextDouble();
     
     double toplam= kardeş1 + kardeş2;
     double ortalama= toplam/2;
     System.out.println("kardeşlerin yaşları ortalaması:" + ortalama);
	}

}

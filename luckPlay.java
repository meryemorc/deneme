package deneme;

import java.util.Scanner;

public class luckPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner okuyucu = new Scanner(System.in);
       System.out.println("İsminizi giriniz");
       String isim = okuyucu.next();
       System.out.println("Merhaba" + isim);
       System.out.println("yaşınızı giriniz");
       int yaş = okuyucu.nextInt();
       System.out.println("şanslıSayınız:");
       
       int harfSayısı = isim.length();
       
       int şanslıSayı = 0;
       if(yaş<20) {
    	   şanslıSayı = (harfSayısı * yaş) % 10; 
       } else if(yaş<40) {
    	   şanslıSayı = (yaş*yaş)% 10;
    	   }else if(yaş<60) {
    		   şanslıSayı = (harfSayısı + yaş * yaş) % 10;
       }else { şanslıSayı = (yaş * harfSayısı * harfSayısı) % 10;
       }
       if(şanslıSayı < 0)
    	   şanslıSayı = şanslıSayı * -1;
       System.out.println(şanslıSayı);
	}

}

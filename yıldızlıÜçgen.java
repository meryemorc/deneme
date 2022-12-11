package deneme;

import java.util.Scanner;

public class yıldızlıÜçgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Alt alta kaç sıra oluşturmak istersiniz?");
      Scanner okuyucu = new Scanner(System.in);
      int sira = okuyucu.nextInt();
      
      for(int i=1; i<=sira; i++ )
      {for(int j=0; j<i; j++)
    	  
      {
    	 System.out.print("*");
    	 
         }
     System.out.println("");
      }
      
	}

}

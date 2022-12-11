package deneme;

import java.util.Scanner;

public class şifreTasarlama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String pass = "12345";
      System.out.println("bir şifre giriniz:");
      Scanner tarayıcı = new Scanner(System.in);
      String kullanıcıŞifresi = tarayıcı.nextLine();
      
      if(kullanıcıŞifresi.equals(pass)) {
      System.out.println("giriş başarılı.");
      }else {
    	  System.out.println("Başarısız giriş.");
      }
      
      
	}

}
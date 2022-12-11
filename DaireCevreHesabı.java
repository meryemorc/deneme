package deneme;
import java.util.Scanner;
public class DaireCevreHesabı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI =3.141593;
		Scanner giris =new Scanner(System.in);
		System.out.println("lutfen yarı cap degerini giriniz");
		double yarıcap =giris.nextDouble();
		
		Double cevre = 2*yarıcap*PI;
		System.out.println(yarıcap + "yarı caplı dairenin cevresidir." + cevre );
		

	}

}

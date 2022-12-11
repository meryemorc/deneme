package deneme;

public class fibonnaci {
      
	public static void main (String args[]) 
	{
		
		int birinci = 1, ikinci=1, toplam=0 ;
	
		System.out.print(birinci + "," + ikinci);
		
		
		for(int i=2; i<15; i++)
		{
			toplam=birinci+ikinci ;
			birinci = ikinci ; 
			ikinci = toplam;
			
			
			System.out.print(" ," + toplam); 
		}
		System.out.println("");
		
	}     
}

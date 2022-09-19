package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		//FOR

		System.out.println("TEK RAKAMLAR");

		for (int i = 1; i < 10; i += 2) {

			System.out.println("Sayı: " + i);

		}

		System.out.println("For döngüsü tamamlandı.");
		
		//WHİLE
		
		System.out.println("ÇİFT RAKAMLAR");
		
		int i=0;
		
		while(i<10) {
		System.out.println("Sayı: " + i);
		
		i=i+2 ;
		
		
			
			
		}
		
		System.out.println("While döngüsü tamamlandı.");
		
		//DO-WHİLE 
		
		int j=0;
		
		do {
			System.out.println("Sayı: " + j);
			j++;
			
		}
		
		while(j<10); 
		
		System.out.println("Do-While dögüsü bitti.");
			
		
		
		

	}

}

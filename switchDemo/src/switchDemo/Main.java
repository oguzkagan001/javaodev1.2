package switchDemo;

public class Main {

	public static void main(String[] args) {

		System.out.println("Not: Notlandırma sistemi kendi üniversiteme göre yapılmıştır.");

		String grade = "AA";

		switch (grade) {

		case "AA":

			System.out.println("Sınavı mükemmel notla geçtiniz.");

			break;

		case "BB":
		case "BA":

			System.out.println("Sınavı iyi notla geçtiniz");

			break;
			
		case "CC":
		case "CB":	
			
			System.out.println("Sınavı geçtiniz.");
			
			break;
		
		case "FF":
		case "FD":

			System.out.println("Sınavı geçemediniz.");
			
			break;

		default:

			System.out.println("Geçersiz not girdiniz.");

		}
	}

}

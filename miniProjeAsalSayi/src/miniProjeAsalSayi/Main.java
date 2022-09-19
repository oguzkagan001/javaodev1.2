package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 17;
		int remainder = number % 2;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı asal sayı değildir.");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz sayı girdiniz.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}

		if (isPrime) {
			System.out.println("Sayı asal sayıdır.");
		} else {
			System.out.println("Sayı asal sayı değildir.");

		}

	}
}

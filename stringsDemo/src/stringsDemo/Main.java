package stringsDemo;

public class Main {
	// length = eleman sayisini verir
	// charAt = metindeki istenilen elemani gösterir.
	// concat = ifadeleri birlestirir.
	// startsWith = boolean yapidadir;ifadenin basindaki istenilen sart saglaniyosa
	// true,saglanmiyosa false sonucu verir.
	// startsWith = boolean yapidadir;ifadenin sonundaki istenilen sart saglaniyosa
	// true,saglanmiyosa false sonucu verir.
	// indexOf = mesajdaki kacinci ifade oldugunu bulmaya yarar.

	public static void main(String[] args) {

		String mesaj = "Java eğitimi alıyorum.";
		System.out.println(mesaj);

		
		  /*System.out.println("Metnin Eleman Sayısı = " + mesaj.length());
		  System.out.println("5.Eleman: " + mesaj.charAt(5));
		  System.out.println(mesaj.concat(" Hocama teşekkür ederim."));
		  System.out.println(mesaj.startsWith("J"));
		  System.out.println(mesaj.endsWith("x"));
		  
		  char[] karakterler = new char [4];
		  mesaj.getChars(0, 4, karakterler, 0); //4 dahil degil.
		  System.out.println(karakterler);
		  System.out.println(mesaj.indexOf('a')); //ilk buldugunu verir ve ekrana aktarir.
		  System.out.println(mesaj.indexOf("eğitimi")); //indexOf aramaya soldan baslar.
		  System.out.println(mesaj.lastIndexOf('a'));//lastIndexOf aramaya sagdan baslar.*/
		 

		String mesaj1 = mesaj.replace(' ', '-');
		System.out.println(mesaj1);
		System.out.println(mesaj.substring(5)); // metnin icindeki besinci ifadeden itibaren alir.
		System.out.println(mesaj.substring(5,11));
		
		for (String kelime : mesaj.split(" ")) { //split metindeki kelimeleri böler.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //buyuk harflerin hepsini kucuk harf yapar.
		System.out.println(mesaj.toUpperCase()); //tum harfleri buyuk harf yapar.
		
		String mesaj2 = "      Java eğitimi alıyorum.       ";
		System.out.println(mesaj2.trim()); //ifadenin basindaki ve sonundaki boslukları kaldirir.
		System.out.println(mesaj2);
		
	}

}

package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj="   Bugün hava çok güzel   ";
		System.out.println(mesaj);
		
//		System.out.println("Eleman sayısı : "+mesaj.length());
//		System.out.println("5.eleman : " +mesaj.charAt(4));
//	//charAt ->string ifadenin 5 elemanını bulmak için kullanıldı.
//		
//	System.out.println(mesaj.concat(" Yaşasın!"));
//	//concat mesaj birleştirme için kullanıldı.
//	System.out.println(mesaj.startsWith("B"));
//	//starswith ile mesajın B ile başlayıp başlamadığı gösterildi ve true değeri döndü.
//	System.out.println(mesaj.endsWith("!"));
//	//starswith ile mesajın ! ile bitip bitmediği gösterildi ve false değeri döndü.
//	char [] karakterler=new char[5];
//	mesaj.getChars(0, 5, karakterler, 0);
//	System.out.println(karakterler);
//	System.out.println(mesaj.indexOf("av"));
//	//a karakterinin kaçıncı harfte(indexte) olduğunu indexOf ile bulduk
//	System.out.println(mesaj.lastIndexOf("a"));
		//ctrl+shift+c
		
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		//replace karakter değiştirme
		System.out.println(mesaj.substring(2,5));
		//mesajın 2. indexinden 5. sine kadar  kes
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		//split ayırmak boşluğa göre ayırma yaptık
		System.out.println(mesaj.toLowerCase());
		//lowercase:küçük harf
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		//trim:boşlukları atma
		
	}

}

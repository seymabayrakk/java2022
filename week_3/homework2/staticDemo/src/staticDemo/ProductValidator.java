package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static blok çalıştı...");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı...");
	
	}
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	public void bisey() {
		
	}
	
}
//Bir ürünü kaydederken ya da güncellerken kurallara uygun olup olmadığını bulmak için kullandık.
//is empty boş olup olmadığı.Ürün isminin girilmiş olması lazım.
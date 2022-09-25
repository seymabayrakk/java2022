package oop2;

public class Main {

	private static Object ındividualCustomer;

	public static void main(String[] args) {
		
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnıtsInStock(4);
		product1.setImageUrl("bilmemne.jpg");
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnıtsInStock(4);
		product2.setImageUrl("bilmemne2.jpg");
		
		Product product3 = new Product();
		product3.setName("Delonghi Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnıtsInStock(4);
		product3.setImageUrl("bilmemne3.jpg");
		
		Product[] products = {product1,product2,product3};
		System.out.println("<ul>");
		
		for (Product product : products) {
			System.out.println("<li>"+ product.getName() + "</li>");
		}
		System.out.println("</ul>");
		IndividualCustomer  individualCustomer=new IndividualCustomer ();
		individualCustomer.setId(1);
		individualCustomer.setPhone("123");
		individualCustomer.setCustomerNumber("125555553");
		individualCustomer.setFirstName("Şeyma");
		individualCustomer.setLastName("Bayrak");
		
		CorparateCustomer corparateCustomer=new CorparateCustomer();
		 corparateCustomer.setId(2);
		 corparateCustomer.setCompanyName("kodlama.io");
		 corparateCustomer.setPhone("05333333");
		 corparateCustomer.setTaxNumber("111111");
		 corparateCustomer.setCustomerNumber("54321");
		 
		
		 
		
		
		
		
		
		
	}

}
//class nesnenin özelliklerini tutar...
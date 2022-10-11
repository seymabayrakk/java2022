package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager(BaseLogger logger) {//çalıştığımız loggerı söyledik
		
		this.logger=logger;
		
		//constructor
	}
	public void add() {
		System.out.println("Müşteri eklendi... ");
		this.logger.log("Log mesajı");
	}

}

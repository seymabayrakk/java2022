package oopWeekThree.business;


import oopWeekThree.core.logging.Logger;
import oopWeekThree.dataAccess.EdicatorDao;
import oopWeekThree.entities.Edicator;

public class EdicatorManager {
	
	private EdicatorDao edicatorDao;
	private Logger[] loggers;
	
	public EdicatorManager(EdicatorDao edicatorDao,Logger[] loggers) {
		
		this.edicatorDao = edicatorDao;
		this.loggers=loggers;
	}

	public void add(Edicator edicator) {
		
		edicatorDao.add(edicator);
		for (Logger logger : loggers) {
			logger.log(edicator.getEdicatorFirstName());
			
		}
	}
	
	

}

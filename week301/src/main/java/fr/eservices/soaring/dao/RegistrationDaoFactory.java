package fr.eservices.soaring.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RegistrationDaoFactory {

	public static RegistrationDao createRegistrationDao() {
		EntityManagerFactory emf = null;
		emf = Persistence.createEntityManagerFactory("myApp");
		RegistrationDaoImpl registrationDao = new RegistrationDaoImpl();
		registrationDao.setEntityManager(emf.createEntityManager());
		return registrationDao;

	}
	
}

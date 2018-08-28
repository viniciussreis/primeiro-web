package br.com.primeiroweb.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory fabricaDeSessoes = criarFabricaSessoes();

	public static SessionFactory getFabricadesessoes() {
		return fabricaDeSessoes;
	}
	
	private static SessionFactory criarFabricaSessoes() {
		try {
			Configuration configuracao = new Configuration().configure();
			
			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
			
			SessionFactory fabrica = configuracao.buildSessionFactory(registro);
			
			return fabrica;
		} catch (Exception ex) {
			 System.err.println("Initial SessionFactory creation failed." + ex);
	         throw new ExceptionInInitializerError(ex);
		}
	}
	
}

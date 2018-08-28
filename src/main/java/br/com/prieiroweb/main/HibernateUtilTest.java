package br.com.prieiroweb.main;

import org.hibernate.Session;

import br.com.primeiroweb.util.HibernateUtil;

public class HibernateUtilTest {

	public static void main(String[] args) {
		Session secao = HibernateUtil.getFabricadesessoes().openSession();
		secao.close();
		HibernateUtil.getFabricadesessoes().close();
	}

}

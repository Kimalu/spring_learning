package com.Kimalu.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionFactoryUtil {
	private static SessionFactory sf = new AnnotationConfiguration()
			.configure().buildSessionFactory();

	public static Session getSession() {
		return sf.getCurrentSession();
	}
}

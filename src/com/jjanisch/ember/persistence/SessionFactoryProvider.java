package com.jjanisch.ember.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


/**
 * This file provides a SessionFactory for use with DAOS using Hibernate
 * @author javahonk.com
 */
public class SessionFactoryProvider {

    private static SessionFactory sessionFactory = buildSessionFactory();
    private static ServiceRegistry serviceRegistry;

    private static SessionFactory buildSessionFactory() {
        try {

            Configuration configuration = new Configuration();
            configuration.configure("hibernate/hibernate.cfg.xml");
            //Use config file path explicitly
            //configuration.configure("hibernate/hibernate.cfg.xml");
            serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration
                    .buildSessionFactory(serviceRegistry);
            return sessionFactory;

        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory "
                    + "creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}

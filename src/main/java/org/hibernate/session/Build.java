package org.hibernate.session;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Build {
    public static SessionFactory make(Config config) {
        Configuration configuration = new Configuration();
        configuration.setProperties(config.properties);
        
        for (Class<?> klass : config.classItems) {
            configuration.addAnnotatedClass(klass);
        }
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        return configuration.configure().buildSessionFactory(serviceRegistry);
    }
}

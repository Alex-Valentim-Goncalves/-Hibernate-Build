package org.hibernate.session;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class Config {
    protected Properties properties = new Properties();
    protected List<Class<?>> classItems = new ArrayList<Class<?>>();
    

    public void setDriverClass(DriverClass driverClass) {
        this.properties.put("hibernate.connection.driver_class", driverClass.getClass());
    }
    
    public void setDriverClass(String driverClass) {
        this.properties.put("hibernate.connection.driver_class", driverClass);
    }
    
    public void setURL(String db , String host , String port, String dbname) {
        this.properties.put("hibernate.connection.url", String.format("jdbc:%s://%s:%s/%s", db, host, port, dbname));
    }
    
    public void setURL(String value) {
        this.properties.put("hibernate.connection.url", value);
    }
    
    public void setUsername(String username) {
        this.properties.put("hibernate.connection.username", username);
    }
    
    public void setPassword(String password) {
        this.properties.put("hibernate.connection.password", password);
    }
    
    public void setPoolSize(Integer num) {
        this.properties.put("hibernate.connection.pool_size", num.toString());
    }
    
    public void addBean(Class<?> klass) {
        classItems.add(klass);
    }
}

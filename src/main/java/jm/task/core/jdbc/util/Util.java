package jm.task.core.jdbc.util;

import com.mysql.cj.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root9209";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_CLASS_NAME);
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

//    public static SessionFactory buildSessionFactory() {
//        try {
//            Class.forName(DRIVER_CLASS_NAME);
//            Configuration configuration = new Configuration();
//            configuration.setProperty("hibernate.connection.url", URL);
//            configuration.setProperty("hibernate.connection.username", USERNAME);
//            configuration.setProperty("hibernate.connection.password", PASSWORD);
//            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
//
//            configuration.addAnnotatedClass(Util.class);
//
//            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//
//            return configuration.buildSessionFactory(serviceRegistry);
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new ExceptionInInitializerError(e);
//        }
//    }


}

package com.kevinbooms;

// dependencies added in pom.xml
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/*
    Data Access and DAO review. An RPGStore Database has been created in
    PostgreSQL. Connection to this database is established with the Apache
    BasicDataSource library.
 */
public class RPGStoreApp {

    public static void main(String[] args) {
        RPGStoreApp app = new RPGStoreApp();
        app.run();
    }

    private void run() {
    // Instantiate Datasource and connection String
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/RPGStore");
    // No credentials are supplied in the Connection String above
    // Set connection credentials

    // WARNING: Do not store plain text passwords in code

    // With a Database connection established we need to create a JDBC Template
    // to read the Database (through the datasource)
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    // JDBC Template opens and closes any required connections whenever a Query or SQL action is performed
    // so there is no need to concern ourselves with managing connections to the database.
    }
}

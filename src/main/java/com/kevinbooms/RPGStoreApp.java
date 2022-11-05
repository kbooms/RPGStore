package com.kevinbooms;

// dependencies added in pom.xml
import com.kevinbooms.model.Item;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

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
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
    // WARNING: Do not store plain text passwords in code

    // With a Database connection established we need to create a JDBC Template
    // to read the Database (through the datasource)
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    // JDBC Template opens and closes any required connections whenever a Query or SQL action is performed
    // so there is no need to concern ourselves with managing connections to the database.

    // with the JDBC template initialized with a dataSource (the database)
    /*
     Best practice is to assign the SQL string to a variable, and
     then pass the variable to the JdbcTemplate method.
     It makes for more readable and consequently maintainable code.
    */
        // Select all POTIONs from items table
        String sql = "SELECT item_id, item_name, item_type, price, description FROM items " +
                    "WHERE item_type = 'TOOL';";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
    // results variable returns a SQL Row Set of data parsed by the JDBC Template with the queryForRowSet method
    // using the sql String statement as it's query parameter

    // using .next() in a while loop will iterate over every row returned in the set until .next() does not find a new row
    // to iterate over
        while (results.next()) {
//            private Book mapRowToBook(SqlRowSet results) {
//                Book book = new Book();
//                book.setBookId(results.getInt("book_id"));
//                book.setTitle(results.getString("title"));
//                book.setAuthorId(results.getInt("author_id"));
//                book.setPrice(results.getBigDecimal("price"));
//                if (results.getDate("publish_date") != null) {
//                    book.setPublishDate(results.getDate("publish_date").toLocalDate());
//                }
//                book.setOutOfPrint(results.getBoolean("out_of_print"));
//                return book;
//            }
    // this is a simple example of mapping columns to variables
            int itemId = results.getInt("item_id");
            String itemName = results.getString("item_name");
            String itemType = results.getString("item_type");
            int itemPrice = results.getInt("price");
            String description = results.getString("description");
            // now that the row is mapped let's print it out
            System.out.println("Item {" + "id: " + itemId + ", name: " + itemName + ", type: "  + itemType
                                + ", price: " + itemPrice + ", description: " + description + "}");
        }

    }
}

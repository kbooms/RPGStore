[ 11/28/22 ]

Reestablished the database. Something got corrupted in the transfer of this project between machines. DAO is fully reviewed. In order to make this functional and checkable I will need to write a Client Terminal application for this to manipulate the database. I'm good with that, I like text and terminals.

- Database: 'items' table seems to be missing "Description" column in the actual database, but information is being pulled through somehow. Maybe I need to refresh it. Also a 'sales' table is still needed
- Client: Write a terminal application for the Database with REST Template so the database can be manipulated. This will work for now until I can implement a GUI, which I'd like to build with React.
- Server: Will need Models and DAO for 'items', 'customers', and 'sales'. When those are established, a REST controller can be built for public use.


[ 11/4/22 ] Updates and Progress

- Database
	+ A basic database has been built with two tables: items, customers
		* Still need to make a 'sales' table

- Data Access and DAO
	+ Dependencies for the DataSource and Template were included in pom.xml
	+ With our connection to the database established we are able to use Java JDBC QueryForRowSet methods to make SQL queries.
	+ QueryForRowSet results are returned and iterated over an array, and printed to the screen
	+ The next step is mapping results to objects using the Model Class...
	
	
[ 11/2/22 ] I'm building an RPG Store Database and using it to go over the Module 2 concepts. Starting with Data Access. The actual Database portion is built seperately with PostgreSQL. 

- Data Access and DAO
	+ We built a basic DataSource, and implemented the necessary Dependencies
	+ We connected that DataSource to a JDBC Template, and implemented the necessary Dependencies









<!-- 

Paragraphing 

        import java.util.Whackadoo;
        
        public static void main(String[] args) {
        	System.out.println("Hello Markdown Codeblock")
        }

### 1st order of business
The actual business 

- Thing of Purpose
- Thing of Necessity
- Thing of Importance

1. Assess
2. Approach
3. Assemble

### 2nd Order of Business
TBD 

-->
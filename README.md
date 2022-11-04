# RPG Store App
## Let's Review Module 2

[ 11/4/22 ] Updates and Progress

- Database
	+ A basic database has been built with two tables: items, customers
		* Still need to make a 'sales' table

- Data Access and DAO
	+ We built a basic DataSource, and implemented the necessary Dependencies
	+ We connected that DataSource to a JDBC Template, and implemented the  necessary Dependencies
		* Dependencies for the DataSource and Template were included in pom.xml
	+ With our connection to the database established we are able to use Java JDBC QueryForRowSet methods to make SQL queries.
	+ QueryForRowSet results are returned and iterated over an array, and printed to the screen
	+ The next step is mapping results to objects using the Model Class...
	
{ to be continued ... }
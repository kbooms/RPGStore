DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
	customer_id serial,
	customer_name varchar(50) NOT NULL,
	job_type varchar(20) NOT NULL,
	vip_status boolean NOT NULL,
	email_address varchar(255),
	CONSTRAINT PK_customers PRIMARY KEY(customer_id)
);

-- SELECT * FROM customers;
INSERT INTO customers (customer_name, job_type, vip_status, email_address)
	VALUES ('Kevin the Bard', 'Bard', TRUE, 'kevinthebard@gmail.com')
		RETURNING customer_id;

INSERT INTO customers (customer_name, job_type, vip_status, email_address)
	VALUES ('Guy the Psychic', 'Mage', TRUE, 'psy-guy84@gmail.com')
		RETURNING customer_id;

INSERT INTO customers (customer_name, job_type, vip_status, email_address)
	VALUES ('Urtiel Skinner', 'Carpenter', FALSE, 'woodcraft4ever@yahoo.com')
		RETURNING customer_id;

INSERT INTO customers (customer_name, job_type, vip_status, email_address)
	VALUES ('Morgaine Le Fay', 'Mage', FALSE, 'lefay-of-avalon@gmail.com')
		RETURNING customer_id;

INSERT INTO customers (customer_name, job_type, vip_status, email_address)
	VALUES ('Solaire Astoria', 'Paladin', TRUE, 'gloriouslyincandescent@hotmail.com')
		RETURNING customer_id;

-- SELECT * FROM customers;
DROP TABLE IF EXISTS items;

CREATE TABLE items (
	item_id serial,
	item_name varchar(50) NOT NULL,
	item_type varchar(20) NOT NULL,
	price integer NOT NULL,
	description varchar(255),
	CONSTRAINT PK_items PRIMARY KEY(item_id)
);

-- SELECT * FROM items;
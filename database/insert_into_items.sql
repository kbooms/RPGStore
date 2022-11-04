INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Heal Potion', 'POTION', 10, 'Restores HP')
		RETURNING item_id;
        
INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Cure Potion', 'POTION', 10, 'Cures Poison')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Ether', 'POTION', 10, 'Restores MP')
		RETURNING item_id;
        
INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Medical Herb', 'MAGIC', 5, 'Eliminates Disease')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Fenix Down', 'MAGIC', 50, 'Revives Ally')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Power Tab', 'MAGIC', 500, 'Increases Strength')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Magic Tab', 'MAGIC', 500, 'Increases Magic Power')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Speed Tab', 'MAGIC', 500, 'Increases Agility')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Broadsword', 'WEAPON', 50, 'A basic sword')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Hand axe', 'WEAPON', 40, 'A hand held axe')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Wooden Bow', 'WEAPON', 40, 'It fires arrows')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Bastard Sword', 'WEAPON', 100, 'A large sword with a long blade')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Elven Bow', 'WEAPON', 150, 'A fine bow of brilliant crafstmanship')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Smith Hammer', 'TOOL', 20, 'Used for blacksmithing')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Saw', 'TOOL', 20, 'Used for carpentry')
		RETURNING item_id;

INSERT INTO items (item_name, item_type, price, description)
	VALUES ('Mortar & Pestle', 'TOOL', 20, 'Used for alchemy')
		RETURNING item_id;


-- SELECT * FROM items;
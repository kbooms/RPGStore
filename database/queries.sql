-- Test Queries --
SELECT * FROM items;

SELECT item_name, price, item_type FROM items
    WHERE item_type = 'WEAPON';
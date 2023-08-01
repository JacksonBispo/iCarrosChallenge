
CREATE TABLE orders (

	order_id INT NOT NULL AUTO_INCREMENT,
	galact_credits float,
	customer_name varchar(55),
	PRIMARY KEY (`order_id`)
);

INSERT INTO orders (galact_credits, customer_name) VALUES
(12.34, 'DeathStar'),
(45.67, 'DeathStar'),
(78.90, 'DeathStar'),
(79.90, 'DeathStar'),
(72.90, 'DeathStar'),
(78.90, 'DeathStar'),
(78.90, 'DeathStar'),
(77.90, 'DeathStar');

SELECT o.order_id, o.galact_credits
FROM orders o
WHERE o.customer_name LIKE 'DeathStar'
AND o.galact_credits = (
    SELECT MAX(galact_credits)
    FROM orders
    WHERE customer_name LIKE 'DeathStar'
);
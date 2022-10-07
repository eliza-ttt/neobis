CREATE TABLE category(
	ct_id serial PRIMARY KEY,
	category_name varchar(30) NOT NULL
);


CREATE TABLE product(
	prid serial PRIMARY KEY,
	name varchar(30) NOT NULL,
	quantity int NOT NULL,
	category_id int REFERENCES category(ct_id),
	deliver_id int REFERENCES deliver(dv_id)
);

CREATE TABLE deliver(
	dv_id serial PRIMARY KEY,
	deliver_name varchar(30) NOT NULL,
	country varchar(30) NOT NULL,
	cost numeric NOT NULL
);

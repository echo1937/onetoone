INSERT INTO onetoone.address (id, city, state, street, zip_code) VALUES (1, 'HZ', 'ZJ', 'Street one', '310000');
INSERT INTO onetoone.address (id, city, state, street, zip_code) VALUES (2, 'BJ', 'BJ', 'Street one', '300000');

INSERT INTO onetoone.person (id, first_name, last_name, address_id) VALUES (1, 'xiao', 'qiang', 1);
INSERT INTO onetoone.person (id, first_name, last_name, address_id) VALUES (2, 'xiao', 'hong', 2);


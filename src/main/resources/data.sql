INSERT INTO onetoone.address (id, city, state, street, zip_code) VALUES (1, 'HZ', 'ZJ', 'Street one', '310000');
INSERT INTO onetoone.address (id, city, state, street, zip_code) VALUES (2, 'BJ', 'BJ', 'Street one', '300000');

INSERT INTO onetoone.person (id, first_name, last_name, address_id) VALUES (1, 'xiao', 'qiang', 1);
INSERT INTO onetoone.person (id, first_name, last_name, address_id) VALUES (2, 'xiao', 'hong', 2);


INSERT INTO onetoone.phone (id, phone_number) VALUES (1, '13912345678');
INSERT INTO onetoone.phone (id, phone_number) VALUES (2, '15912345678');

INSERT INTO onetoone.student (id, name, phone_id) VALUES (1, 'tom', '1');
INSERT INTO onetoone.student (id, name, phone_id) VALUES (2, 'jerry', '2');


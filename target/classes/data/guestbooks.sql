DROP TABLE IF EXISTS guestbooks;
DROP SEQUENCE IF EXISTS seq_id;

CREATE SEQUENCE seq_id
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;


CREATE TABLE IF NOT EXISTS guestbooks (
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50) NOT NULL,    
    message TEXT NOT NULL,
    data_st TEXT NOT NULL
);

INSERT INTO guestbooks (name, message, data_st) VALUES
    ('Mikael', 'This is teh first entry to my guest book.', '22.11.2018 20:52:47'),
    ('Mikael', 'This is the second entry in my guest book. Seems to be working well.', '22.11.2018 20:52:52'),
    ('Mikael', 'Well, thats all for this time', '22.11.2018 22:52:50');



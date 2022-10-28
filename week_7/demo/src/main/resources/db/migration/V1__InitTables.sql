CREATE TABLE doctor (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    position TEXT NOT NULL,
    date DATE NOT NULL,
    unique (name)
);

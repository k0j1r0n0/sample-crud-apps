CREATE TABLE IF NOT EXISTS key_value_table (
    id SERIAL NOT NULL,
    val_key VARCHAR(100) NOT NULL,
    val_value VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);

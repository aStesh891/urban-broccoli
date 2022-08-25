-- database creation
CREATE DATABASE IF NOT EXISTS dbName;
-- deleting the database
DROP DATABASE IF EXISTS dbName;
-- database selection
USE dbName;

-- table creation
CREATE TABLE tableName (
                           col1 datatype,
                           col2 datatype,
                           PRIMARY KEY (one or more columns)
);

-- getting a description of the table structure
DESC tableName;

-- deleting a table
DROP TABLE tableName;
-- clearing the table
TRUNCATE TABLE tableName;

-- adding/removing/modifying columns
ALTER TABLE tableName ADD|DROP|MODIFY colName [datatype];
-- table rename
ALTER TABLE tableName RENAME TO newTableName;
-- drop primary key
ALTER TABLE tableName DROP PRIMARY KEY;

-- inserting values
INSERT INTO tableName (col1, col2)
VALUES (val1, val2);

-- updating records
UPDATE tableName
SET col1 = val1, col2 = val2
    [WHERE condition];

-- deleting entries
DELETE FROM tableName
WHERE condition;


-- index creation
CREATE UNIQUE INDEX indexName
    ON tableName (col1, col2);
-- deleting an index
ALTER TABLE tableName
    DROP INDEX indexName;


-- selection
SELECT col1, col2
FROM tableName;

SELECT DISTINCT col1, col2
FROM tableName;

SELECT col1, col2
FROM tableName
WHERE condition;

SELECT col1, col2
FROM tableName
WHERE condition1 AND|OR condition2;

SELECT col2, col2
FROM tableName
WHERE colName IN (val1, val2, ...valN);

SELECT col1, col2
FROM tableName
WHERE colName BETWEEN val1 AND val2;

-- any values containing ann in the second +third positions
SELECT col1, col2
FROM tableName
WHERE colName LIKE '_ann%';

SELECT col1, col2
FROM tableName
WHERE condition
ORDER BY colName [ASC|DESC];

SELECT SUM(colName)
FROM tableName
WHERE condition
GROUP BY colName;

SELECT COUNT(colName)
FROM tableName
WHERE condition;

SELECT SUM(colName)
FROM tableName
WHERE condition
GROUP BY colName
HAVING (function condition);

-- view
CREATE VIEW tableView AS
SELECT col1, col1
FROM tableName
WHERE col1 IS NOT NULL
WITH CHECK OPTION;

DROP VIEW tableView;

-- transactions
START TRANSACTION
SAVEPOINT sp1;
DELETE FROM tableName
WHERE col1 = 30;
COMMIT;

ROLLBACK TO sp1;


-- given table customers(user_id, name, db_date)
-- find all dates in which more than 10 customers have a birthday
SELECT db_date
FROM customers
HAVING count(db_date) >= 10
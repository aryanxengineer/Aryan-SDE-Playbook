# SQL: DBMS vs RDBMS, keys

### DBMS vs RDBMS
> DBMS is a software used to store and manage data. RDBMS is an advanced form of DBMS where data is stored in related tables and relationships are maintained using keys. MySQL, Oracle and PostgreSQL are examples of RDBMS.

**DBMS** 
- stores data
- Relationships not mandatory
- Less secure
- Normalization not necessary
- Small applications

**RDBMS**
- Stores data in tables
- Relationships supported
- More secure
- Uses normalization 
- Large applications

## SQL Keys
>> Keys help identify records and create relationships.

### Primary Key
> A primary key uniquly identifies each record in a table and it cannot contain duplicate and NULL values. Every table must have a primary key.

### Foreign Key
> A foreign key is a column that refers to the primary key of another table and is used to establish relationships between tables.

### Candidate Key
> A candidate key is a column or set of columns that uniqly identify a record. One of them is selected as a primary key. For example in a user table userId, emailId, mobile can be candidate keys.

### Super Key
> A super key is any set of attributes that uniqly identifies a row in a table. For example - EmpId, EmpId + Name, EmpId + Email etc.

### Composite Key
> A composite key is a key formed by combining two or more columns to uniquly identify a record. For example StudentId and CourseId.

# SQL: SELECT, WHERE, DISTINCT, ORDER BY, LIMIT

### SELECT
> Select is used to fetch required data from one or more columns of a table. Either we can select all columns or few columns as per need.

### WHERE
> Where acts like a filter and return only those rows that satisfy a given condition.

### DISTINCT
> Distinct returns only unique values and eliminates duplicates from the result set.

### ORDER BY
> Order by is used to sort the query results in ascending or descending order.

### LIMIT
> LIMIT is used to fetch only specified numbers of records from a result set.


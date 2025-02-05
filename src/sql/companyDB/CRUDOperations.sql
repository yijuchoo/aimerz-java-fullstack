CREATE DATABASE CompanyDB;

DROP DATABASE CompanyDB;

USE CompanyDB;

-- CRUD Operations

CREATE TABLE Departments (
    DepartmentID INT AUTO_INCREMENT PRIMARY KEY,
    DepartmentName VARCHAR(50) NOT NULL
);

-- Table 2: Employees
CREATE TABLE Employees (
    EmployeeID INT AUTO_INCREMENT PRIMARY KEY,
    EmployeeName VARCHAR(50) NOT NULL,
    DepartmentID INT,
    Salary DECIMAL(10 , 2 ),
    FOREIGN KEY (DepartmentID)
        REFERENCES Departments (DepartmentID)
);

-- Insert Data into Departments
INSERT INTO Departments (DepartmentName) VALUES ('HR'), ('IT'), ('Finance');

-- Another Way to Insert Data set with ID
INSERT INTO Departments (DepartmentID, DepartmentName) VALUES
(1, 'HR'),
(2, 'IT'),
(3, 'Finance'),
(4, 'Marketing');

-- Insert Data into Employees
INSERT INTO Employees (EmployeeName, DepartmentID, Salary)
VALUES
	('John Doe', 1, 5000.00),
    ('Jane Smith', 2, 6000.00),
    ('Emily Davis', 3, 5500.00),
    ('Michael Brown', 2 , 6500.00),
    ('Jonathan Tan', NULL , 4500.00),
    ('Jennifer Lopez', NULL , 4000.00),
    ('Kelvin Chew', NULL , 7000.00);
    
-- Another Way to Insert Data set with ID
INSERT INTO Employees (EmployeeID, EmployeeName, DepartmentID, Salary)
VALUES
	('John Doe', 1, 5000.00), -- HR
    ('Jane Smith', 2, 6000.00), -- IT
    ('Emily Davis', 3, 5500.00), -- Finance
    ('Michael Brown', 2 , 6500.00);
    
-- Update Salary Data in Employees
UPDATE Employees 
SET Salary = 7000.00
WHERE EmployeeName = 'Jane Smith';

-- Delete Data in Employees (this DOES NOT RESET Auto-Increment counter)
-- Delete 1 Data
DELETE FROM Employees 
WHERE EmployeeName = 'Emily Davis';

-- Delete all data records
DELETE FROM Employees;

-- Read data
SELECT *
FROM companydb.employees;

SELECT EmployeeID, EmployeeName
FROM companydb.employees;


-- Truncate Table
-- Means clearing the table values empty (Deleting the Data)
TRUNCATE TABLE Departments;
TRUNCATE TABLE Employees;

/* If truncate table FAILED due to referenced table has FORIEGN KEYS. See sample error code below:
Error Code: 1701. Cannot truncate a table referenced in a foreign key constraint (`companydb`.`employees`, CONSTRAINT `employees_ibfk_1`)

Then you need to disable FORIEGN KEY checks. 
SET FOREIGN_KEY_CHECKS = 0;
To temporarily disable foreign key constraints and allow operations like TRUNCATE or DELETE

After performing the operation, you must re-enable the constraints using:
SET FOREIGN_KEY_CHECKS = 1;

See below:
*/
SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE Departments;
SET FOREIGN_KEY_CHECKS = 1;





    
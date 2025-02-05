-- 1. INNER JOIN
--    Definition: Returns rows that have matching values in both tables
/* Typically, the table that logically makes more sense as the primary entity (e.g., Employees in this case, as it's the main focus) is listed first. This improves readability.
	Writing FROM Employees INNER JOIN Departments might be more intuitive for some because employees "belong to" departments.
    However either way FROM Employees or FROM Departments will return the same results as they are identical.
*/
SELECT Employees.EmployeeName, Departments.DepartmentName
FROM Employees
INNER JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

-- 2. LEFT JOIN (Left Outer Join)
/*    Definition: Returns all rows from the left table, and the matching rows from the right table.
      If there is no match, NULL is returned for the right table
*/
SELECT Employees.EmployeeName, Departments.DepartmentName
FROM Employees
LEFT JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

-- 3. RIGHT JOIN (Right Outer Join)
/*    Definition: Returns all rows from the right table,  and the matching rows from the left table.
      If there is no match, NULL is returned for the left table
*/
SELECT Employees.EmployeeName, Departments.DepartmentName
FROM Employees
RIGHT JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

-- 4. FULL JOIN (Full Outer Join)
/*    Definition: Returns all rows when there is a match in either left or right table.
      Rows with no match in one table will have NULLS for the other table.
*/
SELECT Employees.EmployeeName, Departments.DepartmentName
FROM Employees
LEFT JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID
UNION
SELECT Employees.EmployeeName, Departments.DepartmentName
FROM Employees
RIGHT JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

-- 5. CROSS JOIN
/*    Definition: Returns the Cartesian product of two tables.
      Each row from the first table is paired with all rows from the second table.
*/
SELECT Employees.EmployeeName, Departments.DepartmentName
FROM Employees
CROSS JOIN Departments;


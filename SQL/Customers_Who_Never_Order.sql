#Write a solution to find all customrs who never order anything 
#Return the result table in any order
#Return ID column and Name column 

# Schema: 

# Table Customers has attributes id(int) and name (varchar)
# and id is the primary key 
# Table Orders has attributes id(int) and customerId(int)
# and id is the primary key and cusomterId is the foreign key 
  
SELECT name AS Customers 
FROM Customers 
WHERE NOT EXISTS (
    SELECT *
    FROM Orders 
    WHERE Orders.customerID = Customers.ID
)


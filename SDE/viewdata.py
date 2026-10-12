import sqlite3

connection = sqlite3.connect("academics.db")
cursor = connection.cursor()

cursor.execute("SELECT *FROM students")
students = cursor.fetchall()
cursor.execute("SELECT * from departments")
departments = cursor.fetchall()

for students in students:
    print(students)
for departments in departments:
    print(departments)
    
    connection.close()
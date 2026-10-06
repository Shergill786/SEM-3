# import sqlite3

# connection = sqlite3.connect("Student.db")
# cursor = connection.cursor()

# cursor.execute("""
# CREATE TABLE IF NOT EXISTS Students (
#     roll_no TEXT,
#     name TEXT,
#     email TEXT,
#     group_name TEXT
# )
# """)

# cursor.execute("DELETE FROM Students")


# cursor.execute("""
# INSERT INTO Students(roll_no, name, email, group_name)
# VALUES (?, ?, ?, ?)
# """, (
#     "101",
#     "jaskirat Singh",
#     "jas@asd.com",
#     "3G3"
# ))

# print("Value 1 updated successfully")



# cursor.execute("""
# INSERT INTO Students(roll_no, name, email, group_name)
# VALUES (?, ?, ?, ?)
# """, (
#     "102",
#     "aman Singh",
#     "aman21@asd.com",
#     "3G3"
# ))


# students = [
#     ("2510993426", "Jaskirat Singh", "asd@asd.com", "3G3"),
#     ("2510993452", "angad Singh", "asd2@asd.com", "3G3"),
#     ("2510993210", "Harsh Singh", "harsh@asd.com", "3G3"),
#     ("2510993480", "Manjot Singh", "manjot@asd.com", "3G3")
# ]

# cursor.executemany("""
# INSERT INTO Students(roll_no, name, email, group_name)
# VALUES (?, ?, ?, ?)
# """, students)


# connection.commit()

# #### print elements 

# cursor.execute("SELECT * FROM Students")

# students_db = cursor.fetchall()

# for student in students_db:
#     print(student)

# connection.close()

import sqlite3

connection = sqlite3.connect("Student.db")
cursor = connection.cursor()


##### Update student


cursor.execute("""
UPDATE Students
SET name = ?, email = ?, group_name = ?
WHERE roll_no = ?
""", (
    "Jaskirat Singh",
    "jaskirat@gmail.com",
    "3G4",
    "101"
))

connection.commit()
connection.close()

# print("Student updated successfully")


#### Delete student

# cursor.execute("""
# DELETE FROM Students
# WHERE roll_no = ?
# """, ("101",))

# connection.commit()
# connection.close()

# print("Student deleted successfully")
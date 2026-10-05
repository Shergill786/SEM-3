cursor.execute("SELECT * FROM Students")

students_db = cursor.fetchall()

for student in students_db:
    print(student)

connection.close()

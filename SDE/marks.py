import sqlite3

conn = sqlite3.connect("tb_3G3")
cursor = conn.cursor()


cursor.execute("""
CREATE TABLE IF NOT EXISTS students (
    studentid INTEGER PRIMARY KEY,
    studentname TEXT NOT NULL,
    deptid INTEGER,
    FOREIGN KEY (deptid) REFERENCES departments(deptid)
)
""")
 
cursor.execute("""
INSERT INTO students VALUES (?, ?, ?)
""", [
    (1, "Alice", 1),    

])
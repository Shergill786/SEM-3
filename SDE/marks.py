import sqlite3

conn = sqlite3.connect("tb_3G3")
cursor = conn.cursor()

cursor.executemany("""
    create table if not exist 
    
    
)

import sqlite3
def run_query(query):
    connection = sqlite3.connect("academics.db")
    cursor = connection.cursor()
    
    
    cursor.execute(query)
    for row in cursor.fetchall():
        print(row)
    
    connection.close()
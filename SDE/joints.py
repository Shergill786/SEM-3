from pathlib import Path

import pandas as pd

DATA_FILE = Path(__file__).with_name("student.xlsx")


def load_students():
    return pd.read_excel(DATA_FILE)


if __name__ == "__main__":
    students = load_students()
    print("Database removed. Loading student data from Excel instead.")
    print(students.head())
from pathlib import Path

import pandas as pd

DATA_FILE = Path(__file__).with_name("student.xlsx")


if __name__ == "__main__":
    data = pd.read_excel(DATA_FILE)
    print("Database removed. Showing data from Excel file.")
    print(data)

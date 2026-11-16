from pathlib import Path

import pandas as pd

DATA_FILE = Path(__file__).with_name("3G3.csv")


if __name__ == "__main__":
    marks = pd.read_csv(DATA_FILE)
    print("Database removed. Reading marks directly from CSV.")
    print(marks.head())
import pandas as pd

df = pd.read_excel("student.xlsx")

# print(df)
# print(df.shape)
# print(df.columns)
# print(df.dtypes)
# print(df.info())
# print(df.describe())
# print(df.isnull().sum()/len(df)*100)

# print(df.dropna())
print(df.fillna(df.mean(numeric_only=True),inplace=True))

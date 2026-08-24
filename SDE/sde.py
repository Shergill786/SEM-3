import pandas as pd

df = pd.read_excel("SDE/Diabetes_data.xlsx")

# print(df)
# print(df.shape)
# print(df.columns)
# print(df.dtypes)
# print(df.info())
# print(df.describe())
# print(df.isnull().sum()/len(df)*100)

# print(df.dropna())

# df2 = df.fillna(df['Age'].mean())
# df2=df.fillna(df.mean(numeric_only=True), inplace=True)

# print(df[df['Marks1']<90])  
# print(df[df['Group']=='G3'])

# print(df.columns)
# df2=df[['Name','Roll No','Marks Obtained','Group.']]
# print(df2['Group.'].value_counts())

print(df)


# import pandas as pd
# import seaborn as sns
# import matplotlib.pyplot as plt
# df = pd.read_excel("SDE/Diabetes_data.xlsx")

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

# print(df)

# print(df.corr(numeric_only=True))

# plt.figure(figsize=(8, 6))
# sns.heatmap(df.corr(numeric_only=True),
#             annot=True,
#             cmap="coolwarm")

# plt.show()


import pandas as pd
import numpy as np

df = pd.read_excel("SDE/student.xlsx")
print(df)

# Outliers
q1 = np.percentile(df['Marks1'], 25)
q3 = np.percentile(df['Marks1'], 75)

IQR = q3 - q1
print(IQR)

# lower = q1 - 1.5 * IQR
# upper = q3 + 1.5 * IQR

# outliers = df[(df['Marks1'] < lower) | (df['Marks1'] > upper)]

# print(outliers)
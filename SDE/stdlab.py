import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np
df = pd.read_excel("SDE/student.xlsx")
print(df)

# outliers
q1 = np.percentile(df['Marks1'], 25)
q3 = np.percentile(df['Marks1'], 75)
IQR=q3-q1
lower = q1 - 1.5*IQR 
upper = q3 + 1.5*IQR 
outliers = df[(df['Marks1']<lower) | (df['Marks1']>upper)]
print(outliers)

sns.boxplot(x=df['Marks1'])
plt.xlabel("Marks1")

plt.show()

plt.hist(df['Marks1'], bins=100)
plt.xlabel("Marks1")
plt.title("Distribution of Marks")
plt.show()
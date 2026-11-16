# import pandas as pd

# s = pd.Series(['10', '20', 'abc','nigga'])

# result = pd.to_numeric(s, errors='coerce')

# print(result)

# import pandas as pd

# s = pd.Series([1, 2, 3])

# print(s * 2)

stats = df.describe()

print(int(stats.loc['count', 'Marks']))
print(int(stats.loc['min', 'Marks']))
print(int(stats.loc['max', 'Marks']))x  
import pandas as pd

class Parser:
    def __init__(self) -> None:
        pass

    def Parse(filepath):
        pass


file = pd.read_csv(
    '/Users/jones/Desktop/Hack-A-Thon/Slead Shead data 2/salesTestFile.csv')

# Prints the column information for the specified column name.
column_name = "Margin (Sale)"
print(file.filter(regex=column_name))

# file.describe()

# Iterating the columns and displaying the column headers
# for col in file.columns:
#     print(col)

# Another method to display the column headers
# list(data) or
# list(data.columns)


# file["Profit"]
# print(file)

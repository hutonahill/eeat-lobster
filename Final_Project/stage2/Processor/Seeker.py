import pandas as pd

class Seeker:
    def __init__(self) -> None:
        pass

    def Seek(self, filepath, sortBy, filter1):
        file = pd.read_csv(filepath)

        if sortBy in file.columns():

            pass

        filterList = "011profit"

        

        if filterList[0]:
            file.filter(regex="")
        if filterList[1]:
            file.filter(regex="")
        if filter1:
            file.filter(like="$0.00")

        file.filter(regex = sortBy)
        file.sort_values()

        # if filterList[0]:
        #     pass




# file = pd.read_csv(
#     '/Users/jones/Desktop/Hack-A-Thon/Slead Shead data 2/salesTestFile.csv')

# Prints the column information for the specified column name.
# column_name = "Profit"
# print(file.filter(regex=column_name))

# file.describe()

# Iterating the columns and displaying the column headers
# for col in file.columns:
#     print(col)

# Another method to display the column headers
# list(data) or
# list(data.columns)


# file["Profit"]
# print(file)

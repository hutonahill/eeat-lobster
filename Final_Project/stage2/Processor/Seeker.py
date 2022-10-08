import pandas as pd

class Seeker:
    def __init__(self) -> None:
        pass

    def Seek(filepath, sortBy, filterList):
        file = pd.read_csv(filepath)

        filterList = "001Profit"

        

        if filterList[0] == 1:
            file.filter(regex="")
        if filterList[1] == 1:
            file.filter(regex="")
        if filterList[2] == 1:
            file.filter(like="$0.00")

        file.filter(regex = sortBy)
        file.sort_values(sortBy)

        pd.display(file)

        # if filterList[0]:
        #     pass


sk = Seeker
sk.Seek("C:\\Users\\Todd\Downloads\\Slead Shead data(1)\\Slead Shead data\\Sales 7-1 to 9-30.csv", 
"Profit", "001Profit")


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

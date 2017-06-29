prefix = "cellList.add("

with open("cells.csv","r") as f:
    for line in f:
        line = line[:-1]
        data = line.split(",")
        if data[0] == "ï»¿GO":
            string = prefix + "new GOCell());"
        elif data[0] == "Income Tax":
            string = prefix + "new IncomeTaxCell(" + data[1] + "," + data[2] + "));"
        elif data[0] == "Chance":
            string = prefix + "new ChanceCell(" + data[1] + "));"
        elif data[0] == "Free Parking":
            string = prefix + "new FreeParkingCell(" + data[1] + "));"
        elif data[0] == "Community Chest":
            string = prefix + "new CommunityChestCell("+ data[1] +"));"
        elif data[0] == "Luxury Tax":
            string = prefix + "new LuxuryTaxCell("+data[1]+","+data[2]+"));"
        elif data[0] == "Jail":
            string = prefix + "new JailCell("+ data[1] +"));"
        else:
            if data[3].rstrip() == 'null':
                string = prefix + "new Property(\"" + data[0] + "\"," + data[1] + "," + data[2] + "," + data[3].rstrip() + "));"
            else:
                string = prefix + "new Property(\"" + data[0] + "\"," + data[1] + "," + data[2] + ",\"" + data[3].rstrip() + "\"));"

        print(string)

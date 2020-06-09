
import sys

salesTotal = 0.0
oldKey = None

dummy_Data=["Miami 12.34",
            "Miami 99.07",
            "Miami 55.07",
            "NYC 88.97",
            "NYC 33.56",
            "CHN 101.11"]

for line in dummy_Data:
	data = line.strip().split(" ")
	print(data)
	if len(data) != 2:
		# Something has gone wrong. Skip this line.
		continue

	thisKey, thisSale = data
	if oldKey and oldKey != thisKey:
  		print(oldKey, ":", salesTotal)
  		oldKey = thisKey
  		salesTotal = 0

	oldKey = thisKey
	salesTotal += float(thisSale)
	
if oldKey != None:
	print(oldKey, ":", salesTotal)
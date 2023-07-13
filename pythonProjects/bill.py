ItPrice = float( input("the price of the prodact "))
Tax = float(input("ratio of tax "))
tip = int(input("ratio of the tip "))

bill1 = ItPrice + ((Tax/100)*ItPrice) + ((tip/100.0)*ItPrice) 
bill2  = bill1/2 
print(bill1)
print(bill2)

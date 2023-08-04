# casting Project 
def converToint(Mylist:list) -> list[int] :
    arr = []
    for i in Mylist :
        try:
            arr.append(int(i))
        
        except:
            arr.append(0)
    return arr

def covTostr(Mylist:list) -> list[str]:
    lis=[]
    for i in Mylist:
        try:
            lis.append(str(i))
        except:
            lis.append(None)
    return lis

def covToCom(Mylist:list) -> list[complex]:
    lis=[]
    for i in Mylist:
        try:
            lis.append(complex(i))
        except:
            lis.append(0j)
    return lis

def covTofloat(Mylist:list) -> list[float]:
    lis=[]
    for i in Mylist:
        try:
            lis.append(float(i))
        except:
            lis.append(0.0)
    return lis

def covTobool(Mylist:list) -> list[bool] :
    lis=[]
    for i in Mylist :
        try:
            lis.append(bool(i))
        except:
            lis.append(None)
    return lis
    
Mylist = ["waqqas","muhmaed",1122,False,True,17+14j,0+0j,0,12.34]
print(covTobool(Mylist))


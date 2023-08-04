def oparritars():
    Num = [10 , 10 , 12 , 5 , 2 , 40 , 3]
    str0 = ["sjad", "ali","hassin","sayed","radah"]
    add = Num[0] + Num[1] # = 20\
    sub = Num[2] - Num[0] # = 2 
    div = Num[0] / Num[3]# = 2.0
    fdiv = Num[0] // Num[1] # = 1
    remDiv = Num[0] % Num[6] # = 1
    mul = Num[0] * Num[3] # = 50
    Pow =  Num[0] ** Num[6] # = 1000
    addN = str0[1] + " " + str0[2] # = ali hassin
    math = [add,sub,div,fdiv,remDiv,mul,Pow,addN]

    # in  or not in 
    str0 = ["sjad", "ali","hassin","sayed","radah"]
    def mp():
        if "hashem" in str0 :
            print("true")
        else :
            print("false")
            # true 
        if "ali" not in str0 :
            print("true")
        else :
            print("false")
            # true 
        
        # is or is not  
    def idd() :
        if Num[0] is  Num[1] :
            print("yes" ,'\n',  id(Num[0]), id(Num[1]))
        else :
            print("no")
            # yes 
        if Num[0]  is not  Num[2]:
            print("yes")
        else :
            print("no")
            # no

    def reOp() :
        if Num[0] == Num[1] :
            print("true")
        else :
            print("false")
            #true
        if Num[0] > Num[6]:
            print("true")
        else :
            print("false")
            # true 
        if Num[0] < Num[6]:
            print("true")
        else :
            print("false")
            # false 
        if Num[0] >= Num[1]:
            print("true")
        else :
            print("false")
            #true
        if Num[0] <= Num[6]:
            print("true")
        else :
            print("false")
            # false
        if Num[0] != Num[6]:
            print("true")
        else :
            print("false")
            # true 
    def logOp() :
        a = True
        b = False
        c = True
        d = False
        print(
            a and b , # false 
            a and c , # true 
            a or b , # True 
            a or c , # true
            b or d , # false 
            not  a, # false 
            not b  ,  # true 
        )
    def bitwas() :
        a = 10
        b = 12 
        c = 7 
        print(
            a & b , bin(a) , bin(b) ,bin(8),'\n', # = 8 
            a | c , bin(a) ,  bin(c), bin(15) #15 
        )
    print(math)
    mp()
    idd()
    reOp()
    logOp()
    bitwas()
oparritars()
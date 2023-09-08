import math 
r = 5 
h = 20 

def mathematics(r , y, pi = 3.14  ):
    result = math.sqrt(math.pow(r,2) + math.pow(y,2))
    result2 = ( math.pow(r,2)* pi ) +  (pi * r * result)    
    print(result)
    print(result2)

mathematics(30,10)
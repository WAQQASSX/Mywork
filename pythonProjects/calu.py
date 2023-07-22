class caluc :
    def __init__(self,a ,b ):
        self.a = a 
        self.b = b

    def add(self):              
        return self.a + self.b

    def sub(self):
        return self.a - self.b

    def mul(self):
        return self.a * self.b

    def div(self):
        return self.a / self.b

    def __str__(self):
        return '%s +%s'%(self.a,self.b)
    def power(self):
        return self.a**self.b
a = caluc(2,2)
b = caluc(5,6)   
print(a.power())
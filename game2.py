from random import randint 

def game2():
    playername = input("what's your name ??")
    print("Hi  "+playername+" our game about gussing what is the number that  cp choise ")
    compueterg= randint(0,10)
    G1=input("I am Guessing a number between 1 and 10:")
    if compueterg == int(G1) :
        print(" you are right u gusess it from the first time  ")

    
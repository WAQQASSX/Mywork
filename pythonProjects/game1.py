from random import randint

def game() :
    playername = input("what's your name ?? \n")
    #optins 
    options = ["Rock","Paper","Scissors"]
    #random choise
    Op = randint(0,2)
    #computer choise 
    cp = options[Op]
    #ask player about his choise 
    Hplayer = input("chose P or R or S \n")
    #game code 
    if playername != None :
        #shows what the computer play 
        print("computer plays : " ,cp)
        if Hplayer == "R" and cp == "Rock" :
            print("Draw")
        elif Hplayer== "R" and  cp== "Paper" :
            print("computer win ",playername,"loser ;)")
        elif Hplayer== "R" and  cp== "Scissors" :
            print(playername, " win")
        elif Hplayer== "S" and  cp== "Paper" :
            print(playername, " win")
        elif Hplayer== "S" and  cp== "Scissors" :
            print("Draw ")
        elif Hplayer== "S" and  cp== "Rock" :
            print("computer win ",playername,"loser ;)")
        elif Hplayer== "P" and cp== "Paper" :
            print("Draw")
        elif Hplayer== "P" and  cp== "Scissors" :
            print("computer win ",playername,"loser ;)")
        elif Hplayer== "P" and cp== "Rock" :
            print(playername, " win")
        else :
            # reutrn erorr
            print(" Erorr ")
#start game 
game()
    
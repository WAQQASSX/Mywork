# salary = 100 + 50 + \
#           60 + 70 + 400 
# salary = (10 + 12 + 14
#           + 11 
          
          
          
# #           + 15 )

# wives = ("mary" + " zahraa" +
#         " dana" + " alaa")
# print(int(0x41414141))
# n21= bin(1094795585)
# print(n21)
# print(wives)

# # Name = 10 
# name = 12
# NAME = 13
# NAme = 24
# print(
# id(name),
# id(Name),
# id(NAme)
# )

# waqqas = 19 ; hashem = 18 

# print(waqqas,hashem)

# if waqqas > hashem : 
#    print(waqqas)
# i= 0 
# while i <= 10 :
#     print(i) 
#     i+=1 
# hashem = 12 
# waqqas = 13 
# whab = 2 
# cinma = 4.7 
# if whab >= cinma : 
#     print("welcom") pass 
# else:
#     print("go out ")
# def sup(x,y) :
#     return x +  y 

# res = sup(12,45)
# # print(res)
# # import datetime 

# # The_Time = datetime.datetime.now()
# # Correct_Time = The_Time.strftime("%d/%m/%Y   %I:%M")

# # print(Correct_Time)
    
# # NAME = "Waqqa"
# # NAME ="asssd"
# # print(NAME) 
# print(0b011)
 
#  #string 
# name = "waqqas"
# name = str("ali")
# #int
# age = 18 
# age = int(19)
# #float 
# salary= 1000.676
# salary= float(1098.23)
# #bool 
# a = True
# b = False
# #complex
# mycomplex =  12 + 9j
# comp = complex(10)
# #list
# id = ["waqqas",18,96.4,True]
# id2= list(["hashem","polythinic",19,80.13 , False])
# #dict
# id1 = {"name":"waqqas","age":18,"gpa":96.4}
# id3 = dict({"name":"waqqas","age":18,"gpa":96.4})
# #tuple
# WTT = ("waqqsa","hamed",10,10.8,True)
# n= tuple(("mohammad",26,True))
# #set 
# s= {"w",12,10.4,12+4j}
# se = set({"g",12,34.5,a+12j})
# #byte
# n = bytes(12)
# h= bytearray(8)
# print(h)

# from pytube import YouTube
# url = 'https://youtube.com/shorts/0-5E46CaTsw?feature=share'
# yt = YouTube(url)
# stream = yt.streams.filter(progressive=True, file_extension='mp4').order_by('resolution').desc().first()
# print('Downloading...')
# stream.download(output_path='downloads', filename=f'{yt.title}.mp4')
# print('Download complete!')

from pytube import YouTube
url = input(" youtube link \n")
yt = YouTube(url)
stream = yt.streams.filter(progressive=True, file_extension='mp4').order_by('resolution').desc().first()
print('Downloading...')
stream.download(output_path='downloads', filename=f'{yt.title}.mp4')
print('Download complete!')

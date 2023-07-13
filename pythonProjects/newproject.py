# import requests

# def GetQAS()-> list[dict[{"text": str , "author":str}]]:
#     url = "https://raw.githubusercontent.com/harbi/short-quotes/master/ar/success.json"
#     req = requests.get(url=url)
#     data= req.json()
#     return data;


# def GetQAR()-> list[dict[{"text": str , "author":str}]]:
#     url= "https://raw.githubusercontent.com/harbi/short-quotes/master/ar/risk.json"
#     req = requests.get(url=url)
#     data= req.json()
#     return data;


# def GetQAL()-> list[dict[{"text": str , "author":str}]]:
#     url = "https://raw.githubusercontent.com/harbi/short-quotes/master/ar/love.json"
#     req = requests.get(url=url)
#     data= req.json()
#     return data;

# def SendToDis(text: str):
#     urlOfApi = "https://discord.com/api/webhooks/1123308128038043688/SPsy-4QcIBJpSnOWfWirSa9C44BWyUiBLK3pzeX5oD46T_hLK1mqOUwhTitIOCgrdece"
#     req = requests.post(url=urlOfApi, data={"content": f"{text}" })
#     return req.status_code

# Quates = GetQAL();
# Quates.extend(GetQAR())
# Quates.extend(GetQAS())
# for i in Quates :
#     SendToDis(f"**{i['text']}**\n صاحب المقولة :{i['author']} \n **send it by WAQQASSX**")


class Qmanger:
    def __init__(self , wK: str =""):
        self.name = "qouts"
        self.wK = wK
        


    def getapi(url):
        url =str 
        


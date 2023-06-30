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

# def SendToDis(text: str , author:str):
#     urlOfApi = "https://discord.com/api/webhooks/1123003625489305681/pevZkdvOlcV8zX3AOTagS20m5dhMKL2NYYTT5_PVqW_-omY9dGVLGUMy1vpA_cFp5Hdk"
#     req = requests.post(url=urlOfApi, data={
#         "content": f"{text,author}"
#     })
#     return req.status_code

# Quates = GetQAL();
# #  , GetQAR() , GetQAS() ;
# Quates.extend(GetQAR())
# Quates.extend(GetQAS())
# for i in Quates :
#     # print(f"**{i['text']}**\n")
#     SendToDis(f"{i['text']}\n")
# [19:09]
import requests
import random
import time

class Qmanager:
    def __init__(self, webhook: str = ""):
        self.name = "QManager"
        self.webhook = webhook
        self.generatedArabic: list[dict[{"text": str}]] = []
        self.allRandomE: list[dict[{"_id": str, "content":str, "author": str, "tags": list[str], "authorSlug": str, "length": int, 'dateAdded': str, 'dateModified': str}]] = []
    def __str__(self):
        return self.name
    
    def getRandomArabic(self):
        TypeQ = random.choice(["love", "risk", "success", "friendship"])
        url = f"https://raw.githubusercontent.com/harbi/short-quotes/master/ar/{TypeQ}.json"
        try: 
            r = requests.get(url=url)
            data = r.json()
            data = random.choice(data)
            if data not in self.generatedArabic:
                self.generatedArabic.append(data)
        except:
            data = None
        return data

    def getArabicQ(self, TypeQ: str = "friendship") -> list[dict[{"text": str}]] or None:
        vaild_types = ["love", "risk", "success", "friendship"]
        data = None
        if TypeQ not in vaild_types:
            TypeQ = "friendship"
        url = f"https://raw.githubusercontent.com/harbi/short-quotes/master/ar/{TypeQ}.json"
        try: 
            r = requests.get(url=url)
            data = r.json()
            for d in data:
                if d not in self.generatedArabic:
                    self.generatedArabic.append(d)
        except:
            data = None
        return data
    
    def getRandomQEn(self)->  dict[{"_id": str, "content":str, "author": str, "tags": list[str], "authorSlug": str, "length": int, 'dateAdded': str, 'dateModified': str}] or None:
        url = "https://api.quotable.io/random"
        try:
            r = requests.get(url=url)
            data = r.json()
            if data not in self.allRandomE:
                self.allRandomE.append(data)
        except:
            data = None
        return data
    def sendToDiscord(self):
        try:
            for data in self.generatedArabic:
                try:
                    content = data["text"]
                    index = self.generatedArabic.index(data) + 1
                    payload = {
                        "content": f"**{content}**\nرقم الاقتباس {index}"
                    }
                    r = requests.post(self.webhook, data=payload)
                    time.sleep(1)
                except Exception as e:
                    print(e)
            
            for data in self.allRandomE:
                try:
                    content = data["content"]
                    index = self.allRandomE.index(data) + 1
                    payload = {
                        "content": f"**{content}**\nQ Number: {index}"
                    }
                    r = requests.post(self.webhook, data=payload)
                    time.sleep(1)
                except Exception as e:
                    print(e)
            
        except Exception as e:
            print(str(e))


manager = Qmanager(webhook="https://discord.com/api/webhooks/1123022689318224063/6btDXrxDUAKt4Ywc97s5G5hoTF8FPshdZYYM68UsENnB9J1Wdekc3nsePXELoW5DEhRQ")
manager.getArabicQ("love")
manager.getArabicQ("risk")
print(len(manager.generatedArabic))

def randomQ(c: int):
    for _ in range(c):
        manager.getRandomQEn()
        manager.getRandomArabic()
randomQ(10)
print(len(manager.generatedArabic))
print(len(manager.allRandomE))



manager.sendToDiscord()
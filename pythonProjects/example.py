import requests
# import asyncio
# get quotes from internet 
# send it via webhook to discord
# libary -> Requests (GET, POST, DELETE)
# API 1: http://api.forismatic.com/api/1.0/ 
# API 2: https://api.quotable.io/random
# API 3: https://raw.githubusercontent.com/harbi/short-quotes/master/ar/friendship.json

def getQFromForIsMatic() -> dict[{"quoteText": str, "quoteAuthor": str, "senderName": str, "senderLink": str, "quoteLink": str}]:
    url = "http://api.forismatic.com/api/1.0/"
    params = {
        "method": "getQuote",
        "format": "json",
        "lang": "en"
    }
    res = requests.get(url=url, params=params)
    data = res.json()
    return data

def getQFromQuotable() -> dict[{"_id": str, "content":str, "author": str, "tags": list[str], "authorSlug": str, "length": int, 'dateAdded': str, 'dateModified': str}]:
    url = "https://api.quotable.io/random"
    res = requests.get(url);data = res.json(); return data

def sendDataToDiscord(text: str):
    url = "https://discord.com/api/webhooks/1123003625489305681/pevZkdvOlcV8zX3AOTagS20m5dhMKL2NYYTT5_PVqW_-omY9dGVLGUMy1vpA_cFp5Hdk"
    res = requests.post(url=url, data={
        "content": f"{text}"
    })
    return res.status_code

def AarabicQ()-> list[dict[{"text": str}]]:
    url = "https://raw.githubusercontent.com/harbi/short-quotes/master/ar/friendship.json"
    res = requests.get(url=url); data= res.json(); return data;

data = AarabicQ();
for d in data:
    # sendDataToDiscord(f"**{d['text']}**")
    print(data)
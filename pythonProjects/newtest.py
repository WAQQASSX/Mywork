import requests;
import json
def sendMessage(token: str, channelID: str, message: str):
    enpoint = f"https://discordapp.com/api/v9/channels/{channelID}/messages"
    headers =     {'Content-Type': 'application/json', 'Authorization': f'{token}'}
    body = {"content": message}
    data = json.dumps(body)
    r = requests.post(enpoint, data=data, headers=headers)
    return r.json()
token = ""
channel = ""
print(sendMessage(token=token, channelID=channel, message="**Hello World**"))
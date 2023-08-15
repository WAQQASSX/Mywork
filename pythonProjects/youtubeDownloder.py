from pytube import YouTube
w = True
while w :
    url = "https://youtu.be/Po5zT1krKOc"
    yt = YouTube(url)
    stream = yt.streams.filter(progressive=True, file_extension='mp4').order_by('resolution').desc().first()
    print('Downloading...')
    stream.download(output_path='downloads', filename=f'{yt.title}.mp4')
    print('Download complete!')
    y= input("do you need  to download another video? y/n")
    if y == "y":
       continue
    else:
        break 

import tiktok_scraper as ts

def download_tiktok_video(video_url):
    try:
        # Create an instance of TikTokScraper
        scraper = ts.TikTokScraper()
        
        # Get video metadata
        video_data = scraper.get_video_by_url(video_url)
        
        # Get the video download URL without a watermark
        video_download_url = video_data["itemInfo"]["itemStruct"]["video"]["downloadAddr"]
        
        # Download the video
        ts.download_video(video_download_url, output_dir="./")
        
        print("Video downloaded successfully!")
    except Exception as e:
        print("An error occurred:", str(e))

# Example usage
video_url = input(" the link please ")
download_tiktok_video(video_url)
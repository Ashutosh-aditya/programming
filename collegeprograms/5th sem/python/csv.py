import requests

# Send a GET request to the web server for the .csv file
response = requests.get('https://sample-videos.com/csv/Sample-Spreadsheet-1000-rows.csv')

# Check if the request was successful
if response.status_code == 200:
    # Display the contents of the .csv file
    print(response.text)
else:
    print(f"Request failed with status code {response.status_code}")
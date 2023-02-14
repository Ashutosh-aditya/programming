import requests
url='https://media.geeksforgeeks.org/\
wp-content/uploads/20210224040124/JSBinColla\
borativeJavaScriptDebugging6-300x160.png'
response=requests.get(url)
with open("image.jpg","wb") as f:
    f.open(response.content)
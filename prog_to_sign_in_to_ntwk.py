import requests

# set up the login details
username = '1js20cs038'
password = '123456'
login_url = 'http://172.16.50.2:2280/cportal/ip/user_login.php?url=http://172.16.50.2:2280/'

# create a session
session = requests.Session()

# send a GET request to the login page to get any required tokens or cookies
response = session.get(login_url)

# send a POST request to the login page with the username and password
response = session.post(login_url, data={'username': username, 'password': password})

# check the response to see if the login was successful
if response.status_code == 200:
    print('Login successful!')
else:
    print('Login failed.')

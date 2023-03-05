import re
s=r"\d{3}-\d{3}-\d{4}"
phone_regex = re.compile(s)
string = "My phone number is 123-456-7890"

match = phone_regex.search(string)

if match:
    print("Phone number found:", match.group())
else:
    print("Phone number not found.")

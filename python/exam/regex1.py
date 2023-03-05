import re
pattern=r"[a-zA-Z0-9]+@[a-zA-Z]+\.[a-z]+"
reg=re.compile(pattern)
r=reg.search("My email id is : aditya12@gmail.com")
if r:
    print(r.group())
else:
    print("not found")

# import re

# pattern = r"[a-zA-Z0-9]+@[a-zA-Z]+\.[a-z]+"
# reg = re.compile(pattern)
# r = reg.search("My email id is: aditya@gmail.com")

# if r:
#     print(r.group())
# else:
#     print("not found")
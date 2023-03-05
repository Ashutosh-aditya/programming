
import re
ph=r"\d{3}-\d{3}-\d{3}"
email=r"[a-zA-z0-9]+@[a-zA-Z]+\.[a-zA-Z]+"
reg1=re.compile(ph)
reg2=re.compile(email)
str="myemailis abc@xya.com,phone is 789-632-145"
r1=reg1.search(str)
r2=reg2.search(str)
if r1:
    print("phone is ",r1.group())
if r2:
    print("email is ",r2.group())

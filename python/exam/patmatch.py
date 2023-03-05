
import re
ph=r"\d{3}-\d{3}-\d{3}"

reg1=re.compile(ph)

str="myemailis abc@xya.com,phone is 789-632-145,789-632-845,787-632-145"
r1=reg1.find(str)
print(r1.group())
# for i in r1:
#     print(i)



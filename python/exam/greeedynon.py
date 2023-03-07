

import re
reg1=re.compile(r"(ha){3,5}")
str="hahahahahahahahahahaha"
r=reg1.search(str)
print("greedy - ",r.group())

reg2=re.compile(r"(ha){3,5}?")
str1="hahahahahahahahahahaha"
r1=reg2.search(str1)
print("non-greedy - n",r1.group())

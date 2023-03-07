f1=open('harsh.txt','w')
str='aaaaaaaaa'
f1.write(str)
f1.close()
f1=open('harsh.txt','r')
str=f1.readlines()
print(str)
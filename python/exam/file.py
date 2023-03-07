f1=open("f1.txt",'w')
f1.write("vtu")
f1.close()

f2=open("f2.txt",'w')
f2.write(" university")
f2.close()

f1=open("f1.txt",'r')
f2=open("f2.txt",'r')
s1=f1.readlines()
s2=f2.readlines()

s3=s1+s2
f3=open("f3.txt",'w')
f3.writelines(s3)
f1.close()
f2.close()
f3.close()

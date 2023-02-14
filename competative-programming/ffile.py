f1=open("a.txt","w")
f2=open("b.txt","w")
f3=open("c.txt","a")
f1.write("vtu")
f2.write(" university")
f1.close()
f2.close()
f1=open("a.txt","r+")
f2=open("b.txt","r+")
con1=f1.read()
con2=f2.read()
f3.write(con1)
f3.write(con2)




lst=[]
lmt=int(input("Enter the limit : "))
for i in range(0,lmt):
    # print("i=",i)
    lst.append(i)
e=0
o=0
for i in lst:
    if(i%2==0):
        e=e+1
    else:
        o=o+1
print("No. of even are ",e,"\nNo. of odd are ",o,"\n")
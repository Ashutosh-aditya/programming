print("hello "*3)
x=int(input("Enter a number : "))
if(x>0):
    print("x is +ve")
elif(x<0):
    print("x is -ve")
else:
    print("x is 0")
count=0
mylist=[]
for i in range(1,10):
    count=count+1
    mylist.append(i)
for i in range(0,9):
    print(mylist[i], " ")
n=10
while(n>0):
    print(n)
    n=n-1
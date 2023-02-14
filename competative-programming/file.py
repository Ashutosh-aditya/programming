f1=open("x.txt","w")
con="para1/\npara2/\npara3/\npara4/\npara5/\npara6/\npara7/\npara8/\npara9/\npara10"
f1.write(con)
f1.close()
f1=open("x.txt","r+")
for i in range(1,5):
    con=f1.readline()
    print(con)



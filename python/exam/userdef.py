def prime(n):
    f=0
    for i in range(2,n,1):
        if (n%i==0):
            f=1
    if f==0:
        print("Prime ")
    else:
        print("Non-Prime")
x=int(input("Enter a number : "))
prime(x)
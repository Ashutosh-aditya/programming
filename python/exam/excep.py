try:
    a=int(input("Enter value of a : "))
    b=int(input("Enter value of b : "))
    c=a/b
    print(c)
except ZeroDivisionError:
    print("exception : Divided by zero\n")
except ValueError :
    print("value error")

print("Hello user, Glad that you are here!")
print("Are you ready for a game?")
print("I will choose a number between 1 and 10 and you have to make a guess on basis of the hints I will give!")
a= input("Are you ready? Yes or No\n")
if a== 'Yes':
    import random
    i=0
    b=random.randrange(1,10)
    while i<1 :
        c=int(input("Try guessing the number:"))
        if c>b:
            print("The number chosen is less than ", c)
        elif c<b:
            print("The number chosen is greater than ", c)
        else:
            print("Your guess is correct the number is ", c)
            i=1
else :
    print("See you next time!")
    
#     c=int(input("Try guessing the number:"))
#     if c>b:
#         print("The number chosen is less than", c)
#         c=int(input("Enter the number: "))
#         if c==b:
#             print("Your guess is right!")
#     else:
#         print("Try guessing number which is greater than", c)
#         c=int(input("Enter the number: "))
#         if c==b:
#             print("Your guess is right!")
#     if c==b:
#         print("Your guess is right!")
# else:
#     print("See you next time!")
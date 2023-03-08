n1 = int(input("Enter a: "))
n2 = int(input("Enter b: "))

my_list = []

my_name = input("Enter your name: ")


def add(a,b):
    return a+b

def store_character(lst, name):
    for c in name:
        lst.append(c)
        
print(f"Sum is {add(n1,n2)}")
store_character(my_list,my_name)
print(my_list)
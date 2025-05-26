#concatenation

first = "hello"
second = "world"

p = f"{len(first)} {second}"
print(p)

#input 

x = input("x:")
print(int(x)+1)
print(type(x))

y = int(input("enter an integer: " ))
print(y+1)

z = float(input("enter the decimal value: "))


#Take input from the user: "yes" or "no"
#Print "Access denied" only if the user does not enter "yes".

a = input("Do you agree?  (Yes/No):")
if not a.lower() == "yes":
  print("Acces Denied")
else:
  print("Acees Granted")
  
  
  b = int(input("Enter a number:"))
  
  if(b%3==0):
    print("Is divisible")
  else:
    print("Not divisible")
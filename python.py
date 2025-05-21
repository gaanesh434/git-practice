'''print("Hello world")'''

'''Varibles'''
'''primitive DataTyped'''
'''
students_count = 1000 
print(students_count)

rating = 4.99       #float
print(rating)

is_published = False  #boolean
print(is_published)
 
course_name = "python programming"  #string
print(course_name)

print(len(course_name))
print(course_name[0])
print(course_name[-1])
print(course_name[0:3])
print(course_name[0:])

course1 = "python \"Programming\" " #escape character
print(course1)

course = "python programming"

first = "Mosh"
last = "Hamedani"
full = first + " " + last      #formatted string for concetatination
print(full)

full1 = f"{first} {last}"
print(full1)


#string methods

print(course.upper())
print(course.lower())
print(course.title())     #capitalise the start 
print(course.strip())     #remove white spaces
print(course.find("Pro"))
print(course.replace("p","j"))
print("pro" in course)
print("swift" not in course)


#Numbers
x = 1+2j #complex numbers
print(x)
print(10/3)
print(10//3)
print(10**3) #power
print(round(2.9))


#type conversion

#x = input("x: ")
#y = int(x)+1

#int(x)
#float(x)
#bool(x)   #0 and empty string are false

#comparision operators

print(10>3)

#conditional statements

temperature = 35

if temperature > 30:
  print("Its warm")
  print("Drink water")
  print("done")
elif temperature > 20:
  print("its nice")
else:
  print("done")


#and , or and not operator

high_income = True
good_credit = True
student = True

if (high_income or good_credit) and not student:
 print("eligible")

 if high_income or good_credit:
  print("Ok")
elif (high_income and good_credit) and student:
  print("Done")
else:
  print("no")


  #for loops
for number in range(1,4):
  print("Attempt",number)
  break
  #while
#command = ""
#while command!="quit":
 # command = input(">")
 # print("Echo",command)
  
  
for i in range(10):
  if(i%2==0):
    print(i)
  
  
#functions

def greet():
  print("Hi there")
  print("Welcome aboard")
  
greet()

#with parameters and arguments



def greet1(first_name,last_name):
  print(f"hello {first_name} {last_name}")
  print("The function with parameters")
  
greet1("josh","autusania")
greet1("mosh","hamedani")


#keyword argument

def increment(number,by):
  return number+by

print(increment(number=3,by=2))

'''



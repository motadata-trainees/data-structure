l=[]
m=int(input("Enter the number of elements in the array:  "))
for i in range(0,m):
    l.append(input())
str=""
for i in range(0,len(l)):
    str=str+l[i]

if(str==str[::-1]):
    print("The list is a pallindrome ")
else:
    print("The list is not a pallindrome")
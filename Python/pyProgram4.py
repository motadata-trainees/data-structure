number=int(input("Enter the number:"))
number2=number
number3=0
list1=[]
while(n!=0):
    number3=n%10
    list1.append(number3)
    number=number//10
length=len(list1)
number4=0
number5=0
i=length-1
while((number2!=0) and (i>=0)):
    number4=int(number2%10)
    if(number4==list1[i]):
        number5=number5+1
    number2=int(number2/10)
    i=i-1
if(number5==length):
    print("Palindrome Number")
else:
    print("Not a Palindrome")

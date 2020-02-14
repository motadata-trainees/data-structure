n=int(input("Enter the number:"))
m=n
d=0
lst=[]
while(n!=0):
    d=n%10
    lst.append(d)
    n=n//10
length=len(lst)
d1=0
c=0
i=length-1
while((m!=0) and (i>=0)):
    d1=int(m%10)
    if(d1==lst[i]):
        c=c+1
    m=int(m/10)
    i=i-1
if(c==length):
    print("Palindrome Number")
else:
    print("Not a Palindrome")
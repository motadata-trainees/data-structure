l=[]
m=int(input("Enter number of elements you want in an array"))
for i in range(0,m):
    l.append(int(input()))

max=l[0]
inde=0

for i in range(1,len(l)):
    if(l[i]>max):
        max=l[i]
        inde=i

print("The peak is "+str(max)+" at index"+str(inde))



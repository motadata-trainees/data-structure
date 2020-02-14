l=[]
m=int(input("Enter the number of elements in the array"))

for i in range(0,m):
    l.append(int(input()))

c=len(l)
count=((c+1)*(c+2))/2
sum=0
for i in range(len(l)):
    sum=sum+l[i]
missing=count-sum
print(missing)
l=[]

print("Enter number of elements in an array: ")
m=int(input())

for i in range(0,m):
    l.append(int(input()))

Dict={}
l2=[]
for i in range(0,len(l)-1):
    for j in range(i+1,len(l)):
        l2.append(l[i]-l[j])
        Dict[l[i]-l[j]]=[i,j]
l2.sort()
for i in Dict:
    if(l2[0]==i):
        print("Max profit can be gained by buying at "+str(Dict[i][0])+" day and selling at "+str(Dict[i][1]))
        print("Max Profit = "+str(-i))
  


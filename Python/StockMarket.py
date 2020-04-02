list1=[]

print("Enter number of elements in an array: ")
m=int(input())

for i in range(0,m):
    list1.append(int(input()))

Dict={}
list2=[]
for i in range(0,len(list1)-1):
    for j in range(i+1,len(list1)):
        list2.append(list1[i]-list1[j])
        Dict[list1[i]-list1[j]]=[i,j]
list2.sort()
for i in Dict:
    if(list2[0]==i):
        print("Max profit can be gained by buying at "+str(Dict[i][0])+" day and selling at "+str(Dict[i][1]))
        print("Max Profit = "+str(-i))

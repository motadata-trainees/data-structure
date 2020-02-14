a=[]
m=int(input("Enter the number of elements in the array"))
for i in range(m):
    a.append(int(input()))
a.sort()
# processing


l1=[]
l3=[]
count=0
for i in range(0,len(a)-1):
    
    if(a[i+1]-a[i]==1):
        count=count+1
        l1.append(a[i])
        l1.append(a[i+1])
    
    l3.append(count)  
    
    
            
l3.sort(reverse=True)   
print("The longest consecutive subsequence is: "+str(l3[0]))


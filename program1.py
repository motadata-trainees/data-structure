n=int(input("Enter the length of array:"))
lst=[]
for i in range(0, n): 
    ele = int(input()) 
    lst.append(ele) 

maxpos = lst.index(max(lst))
print("The maximum is at position", maxpos + 1)


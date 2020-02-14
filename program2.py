n=int(input("Enter the length of array:"))
lst=[]
for i in range(0, n): 
    ele = int(input()) 
    lst.append(ele) 
length=len(lst)
print("Middle element is: ",lst[int(length/2)])
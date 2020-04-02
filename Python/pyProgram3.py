number=int(input("Enter the length of array:"))
list1=[]
for i in range(0, n): 
    element = int(input()) 
    list1.append(element) 
length=len(list1)
sum1=0
for i in range(0,length):
    sum1=sum1+list1[i]
miss=(length*(length+1))//2
print(miss)
print("Missing element is: ",sum1)

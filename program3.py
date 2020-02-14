n=int(input("Enter the length of array:"))
lst=[]
for i in range(0, n): 
    ele = int(input()) 
    lst.append(ele) 
length=len(lst)
sm=0
for i in range(0,length):
    sm=sm+lst[i]
mis=(length*(length+1))//2
print(mis)
print("Missing element is: ",sm)
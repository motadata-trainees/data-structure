number=int(input("Enter the length of array:"))
list1=[]
for i in range(0, number): 
    element = int(input()) 
    list1.append(element) 

max_position = list1.index(max(list1))
print("The maximum is at position", max_pos + 1)

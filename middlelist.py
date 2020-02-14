print("Enter number of elements for list :")
n=int(input())
list = []
for i in range(0,n):
    list.append(input())
print("Middle element is ",list[n//2])
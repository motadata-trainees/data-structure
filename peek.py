print("Enter elements of array seperated by space :")
s = str(input())
l = s.split(" ")
n = len(l)
arr = []
for i in range(0,n):
    arr.append(int(l[i]))
m =max(arr)
print(m)
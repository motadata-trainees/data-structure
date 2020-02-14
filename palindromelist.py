print("Enter number of elements for list :")
n=int(input())
list = []
s=""
for i in range(0,n):
    list.append(input())
    s=s+list[i]
print("Is list palindrome ?")
print(str(s==s[::-1]))
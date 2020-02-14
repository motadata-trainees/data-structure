print("Enter elements of array seperated by space :")
s = str(input())
l = s.split(" ")
n = len(l)
arr = []
for i in range(0,n):
    arr.append(int(l[i]))
cdiff=0
diff=0
min=arr[0]
for i in range(0,n):
    cdiff=arr[i]-min
    if(cdiff>diff):
        diff=cdiff
        sell = i
    if(arr[i]<min):
        min=arr[i]
        buy=i
print("Output is in 1 based indexing")
print("Stock is  bought on day "+str(buy+1)+" sold on day "+str(sell+1)+" with profit of "+str(diff))
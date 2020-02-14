print("Enter elements of array seperated by space :")
s = str(input())
l = s.split(" ")
n = len(l)
arr = []
for i in range(0,n):
    arr.append(int(l[i]))
st = []
buy=0
sell=0
profit=0
top=0
bottom=0
count =0
st.append(arr[0])
for i in range(0,n):
    if(st[len(st)-1]>arr[i]):
        top = st[len(st)-1]
        count=0
        while(len(st)!=0):
            bottom=st.pop()
            count=count+1
        profit=profit+top-bottom
        print("Stock bought on day "+str(i-(count-1))+" and sold on day "+str(i)+" with profit "+str(top-bottom))
    st.append(arr[i])
top=st[len(st)-1]
count=0
while(len(st)!=0):
    bottom=st.pop()
    count=count+1
profit=profit+top-bottom
print("Stock bought on day "+str(n+1-count)+" and sold on day "+str(n)+" with profit "+str(top-bottom))
print("Total profit is : "+str(profit))
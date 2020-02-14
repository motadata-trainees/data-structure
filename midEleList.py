if __name__=='__main__':
    list=[]
    print("Enter numberof elements you want in a list")
    m=int(input())

    for i in range(0,m):
        list.append(input())
    
    count=0
    for j in range(0,len(list)):
        count=count+1
    
    print(list[(int)(count/2)])


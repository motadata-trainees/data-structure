if __name__ == "__main__":
    stack=[]
    str=input("Enter a string:  ")
    for i in str:
        stack.append(i)
    str2=""
    for i in range(len(stack)):
        str2=str2+stack.pop()
    

    print(str2)

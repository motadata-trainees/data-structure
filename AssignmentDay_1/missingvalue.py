def find_missing(lst): 
    start = lst[0] 
    end = lst[-1] 
    return sorted(set(range(start, end + 1)).difference(lst)) 
  
# Driver code 
lst = [1, 2, 4, 6, 7, 9, 10] 
print(find_missing(lst)) 
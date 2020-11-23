def count(S, m, n): 
    table = [0 for k in range(n+1)] 
  
 
    table[0] = 1
  

    for i in range(0,m): 
        for j in range(S[i],n+1): 
            table[j] += table[j-S[i]] 
  
    return table[n] 
  

n = int(input())
m = int(input())
arr = list()

for element in range(m):
    a = int(input())
    arr.append(a)

x = count(arr, m, n) 
print (x) 
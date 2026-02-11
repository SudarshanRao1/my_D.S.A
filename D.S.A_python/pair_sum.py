import random
n = int(input("enter the size: "))
arr = [0]*n
for i in range(n):
    arr[i] = random.randint(-10,10)
print("the array:")
for i in range(n):
    print(arr[i],end=" ")
count = 0
k = int(input("\nenter any number: "))
for i in range(n):
    for j in range(i+1,n):
        if arr[i]+arr[j]==k:
            count+=1 
            break

print("Number of valid pairs =",count)

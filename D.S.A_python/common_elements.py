import random
n = int(input("enter the size: "))
arr = [0]*n
arr2 = [0]*n
arr3 = [0]*n
count = 0
#first array
for i in range(n):
    arr[i] = random.randint(-10,10)
print("\nA:")
for i in range(n):
    print(arr[i],end=" ")
#second array
for i in range(n):
    arr2[i] = random.randint(-10,10)
print("\nB:")
for i in range(n):
    print(arr2[i],end=" ")
#third array
for i in range(n):
    arr3[i] = random.randint(-10,10)
print("\nC:")
for i in range(n):
    print(arr3[i],end=" ")
for i in range(n):
    for j in range(n):
        for k in range(n):
            if arr[i]==arr2[j] and arr[i]==arr3[k]:
                count+=1
                break
print("\nnumber of common triplets:",count)

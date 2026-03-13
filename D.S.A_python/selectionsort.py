n = int(input("Enter the number of elements: "))

arr = [0]*n

for i in range(n):
    arr[i] = int(input("Enter element: "))

print("the array\n")

for i in range(n):
    print(arr[i],end = " ")

for i in range(0,n-1):
    min = i
    for j in range(i+1,n):
        if arr[j] < arr[min]:
            min = j
    if min !=i:
        temp = arr[i]
        arr[i] = arr[min]
        arr[min] = temp
print("\nSorted array\n")
for i in range(n):
    print(arr[i],end = " ")

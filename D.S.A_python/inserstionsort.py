n = int(input("Enter the number of elements: "))

arr = [0]*n

for i in range(n):
    arr[i] = int(input("Enter element: "))

print("the array\n")

for i in range(n):
    print(arr[i],end = " ")

for i in range(1,n):
    key = arr[i]
    j = i-1
    while j>=0 and arr[j] > key:
        arr[j+1] = arr[j]
        j-=1
    arr[j+1] = key
print("\nSorted array\n")
for i in range(n):
    print(arr[i],end = " ")

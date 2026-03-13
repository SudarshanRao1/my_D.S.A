n = int(input("Enter the number of elements: "))
count = 0
arr = [0]*n

for i in range(n):
    arr[i] = int(input("Enter element: "))

print("the array\n")

for i in range(n):
    print(arr[i],end = " ")

for i in range(0,n-1):
    for j in range(0,n-1-i):
        if arr[j] > arr[j+1]:
            temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp
            count += 1
print(f"the count is {count}")

print("\nSorted array\n")
for i in range(n):
    print(arr[i],end = " ")
print(f"the loweset marks is {arr[0]}")
print(f"the highest marks is {arr[n-1]}")

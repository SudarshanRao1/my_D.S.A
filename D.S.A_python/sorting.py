# bubble sort

n = int(input("enter the size of array: "))
aar = [0]*n
count = 0
for i in range(n):
    aar[i] = int(input(f"enter marks of student{i+1} "))
for i in range(n):
    print(aar[i] , end = " ")
swapped = False
for i in range(n):
    for j in range(1,n-i):
        if aar[j-1] > aar[j]:
            temp = aar[j-1]
            aar[j-1] = aar[j]
            aar[j] = temp
            count += 1
            swapped = True
    if not swapped:
        break

print("the sorted array is:")
print(aar)
print(f"total swaps:{count}")
print(f"the topper is {aar[-1]}")
print(f"the lowest scorer is {aar[0]}")

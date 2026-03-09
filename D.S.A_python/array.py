n = int(input("enter size: "))

a = [0]*(n)

for i in range(n):
    a[i] = int(input("enter: "))

print("\nthe array is\n")

for i in range(n):
    print(a[i] , end=" ")

c = int(input("\nthe element:"))
for i in range(n):
    if a[i] == c:
        for j in range(i,n-1):
            a[j] = a[j+1]
        n = n-1
        break
print("\nthe array is\n")
for i in range(n):
    print(a[i] , end=" ")



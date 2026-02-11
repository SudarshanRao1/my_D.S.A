#linear search
import random
n = int(input("enter the size: "))
arr = [0]*n
for i in range(n):
    arr[i] = random.randint(-10,10)
print("the array:")
for i in range(n):
    print(arr[i],end=" ")

x = int(input("\nenter the element you want: "))
result = -1

for i in range(n):
    if arr[i]==x:
        result = i
        break

if result!=-1:
    print("the index is: ",result)
else:
    print("unna elemnts enter chei ra pooka!!!")

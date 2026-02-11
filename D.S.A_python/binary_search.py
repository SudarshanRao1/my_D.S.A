#binary search
import time
import random

t = int(input("enter the no. of test cases: "))

def binarysearch(arr, n, x):
    low = 0
    high = n - 1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            low = mid + 1
        else:
            high = mid - 1

    return -1


for _ in range(t):
    start = time.perf_counter()

    n = int(input("enter the size: "))
    arr = [random.randint(-10,10) for _ in range(n)]

    arr.sort() 

    for i in range(n):
        print(arr[i], end=" ")
    print()

    x = int(input("enter the element you want: "))

    result = binarysearch(arr, n, x)

    if result != -1:
        print("the element found at the index:", result)
    else:
        print("element not found!!")

    end = time.perf_counter()
    print(f"time = {end - start}")

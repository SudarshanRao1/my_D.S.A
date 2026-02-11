import time
import random
import matplotlib.pyplot as plt

def binary_search(arr, n, x):
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


sizes = [1000, 5000, 10000, 50000, 100000, 200000]
times = []

for n in sizes:
    arr = sorted([random.randint(0, n) for _ in range(n)])
    x = arr[n // 2]   # guaranteed to exist

    start = time.perf_counter()
    for _ in range(1000):         # many runs
        binary_search(arr, n, x)
    end = time.perf_counter()

    avg_time = (end - start) / 1000
    times.append(avg_time)

plt.plot(sizes, times)
plt.xlabel("Input Size (n)")
plt.ylabel("Average Execution Time")
plt.title("Binary Search Time Complexity (O(log n))")
plt.show()

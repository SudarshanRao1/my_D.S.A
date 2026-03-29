x = input("enter anything you want: ")
s = str(x).upper()
left = 0
right = len(s) - 1
while left < right:
    if s[left] != s[right]:
        print(False)
        break
    left += 1
    right -= 1
else:
    print(True)

MAX = 5
stack = [0]*MAX
top = -1

def push(x):
    global top
    if top == MAX-1:
        print("stack overflow ")
    else:
        top = top+1
        stack[top] = x
push(1)
push(2)
push(3)


def pop():
    global top
    if top == -1:
        print("stack underflow ")
    else:
        x = stack[top]
        top = top-1
        return x
print(pop())

for i in range(top+1):
    print(stack[i])


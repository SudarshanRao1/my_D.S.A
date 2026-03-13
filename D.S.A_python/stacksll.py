top = None

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def push(x):
    global top

    new_node = Node(x)

    new_node.next = top
    top = new_node


def pop():
    global top

    if top == None:
        print("Stack Underflow")
    else:
        element = top.data
        top = top.next
        return element


def display():
    temp = top

    while temp != None:
        print(temp.data, end=" ")
        temp = temp.next


push(10)
push(20)
push(30)

print("Popped:", pop())

print("Stack elements:")
display()

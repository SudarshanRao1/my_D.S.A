class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def traverse(head):
    temp = head
    count = 0

    while temp != None:
        count = count + 1
        temp = temp.next

    print("the number of students:", count)
    print("the students in the project:")

    temp = head
    while temp != None:
        print(temp.data)
        temp = temp.next


n = int(input("enter a num: "))
head = None
tail = None
i = 0

while i < n:
    name = input("enter name: ")
    newnode = Node(name)

    if head == None:
        head = newnode
        tail = newnode
    else:
        tail.next = newnode
        tail = newnode

    i = i + 1

traverse(head)

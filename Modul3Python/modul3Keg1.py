class Stack:
    def __init__(self):
        self.items = []
        
    def is_empty(self):
        return self.items == []
        
    def push(self, item): 
        self.items.append(item)
        
    def pop(self):
        return self.items.pop()

def reverse_string(input_str):
    stack = Stack()
    for char in input_str:
        stack.push(char)
    
    output_str = ""
    while not stack.is_empty():
        output_str += stack.pop()
        
    return output_str

#input
input_str = input("Masukkan Input : ")
output_str = reverse_string(input_str)
print("Reserved : ", output_str)

class Node:
    def __init__(self, data): 
        self.data = data #nyimpen
        self.next = None 

class Queue:
    def __init__(self):
        self.front = None
        self.rear = None

    def enqueue(self, data):
        temp = Node(data)
        if self.rear is None:
            self.front = self.rear = temp
            return
        self.rear.next = temp
        self.rear = temp

    def dequeue(self):
        if self.front is None:
            return None
        temp = self.front
        self.front = temp.next
        if self.front is None:
            self.rear = None
        return temp.data

    def peek(self):
        if self.front is None:
            return None
        return self.front.data

    def isEmpty(self):
        return self.front is None

    def size(self):
        count = 0
        temp = self.front
        while temp is not None:
            count += 1
            temp = temp.next
        return count

reservations = Queue()

while True: #milih 6 break
    print("1. Pesan Kamar Hotel")
    print("2. Batalkan Pemesanan")
    print("3. Cek Pemesanan")
    print("4. Cek Jumlah Kamar yang di pesan")
    print("5. Cek Data Paling Atas")
    print("6. Exit")
    choice = input("Enter your choice: ")

    if choice == "1":
        name = input("Masukkan nama tamu: ")
        reservations.enqueue(name)
        print("Kamar dipesan untuk", name, "\n")
    elif choice == "2":
        cancelled = reservations.dequeue()
        if cancelled is None:
            print("Tidak ada pemesanan yang dapat dibatalkan\n")
        else:
            print("Pemesanan dibatalkan oleh", cancelled, "\n")
    elif choice == "3":
        if reservations.isEmpty():
            print("Belum ada pemesanan\n")
        else:
            print("Daftar nama tamu:")
            temp = reservations.front
            while temp is not None:
                print(temp.data)
                temp = temp.next
    elif choice == "4":
        print("Jumlah Kamar Pesanan:", reservations.size(), "\n")
    elif choice == "5":
        print("Data Paling Atas adalah:", reservations.peek(), "\n")
    elif choice == "6":
        print("Exiting program")
        break
    else:
        print("Invalid choice, please try again\n")

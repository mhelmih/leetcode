class MyLinkedList {
    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int length;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= this.length) {
            return -1;
        }
        if (index == this.length - 1) {
            return tail.val;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = this.head;
        this.head = newHead;
        this.length++;
        if (this.tail == null) {
            this.tail = this.head;
        }
    }
    
    public void addAtTail(int val) {
        Node newTail = new Node(val);
        if (this.tail == null) {
            this.addAtHead(val);
        } else {
            tail.next = newTail;
            this.tail = newTail;
            this.length++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.length) {
            return;
        }
        if (index == 0) {
            this.addAtHead(val);
        } else if (index == this.length) {
            this.addAtTail(val);
        } else {
            Node temp = new Node(val);
            Node ptr = this.head;
            Node ptrPrev = null;
            for (int i = 0; i < index; i++) {
                ptrPrev = ptr;
                ptr = ptr.next;
            }
            temp.next = ptr;
            ptrPrev.next = temp;
            this.length++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.length) {
            return;
        }
        if (index == 0) {
            this.head = this.head.next;
            length--;
        } else if (index == this.length - 1) {
            Node beforeTail = this.head;
            for (int i = 0; i < this.length - 2; i++) {
                beforeTail = beforeTail.next;
            }
            beforeTail.next = null;
            this.tail = beforeTail;
            length--;
        } else {
            Node ptr = this.head;
            Node ptrPrev = null;
            for (int i = 0; i < index; i++) {
                ptrPrev = ptr;
                ptr = ptr.next;
            }
            ptrPrev.next = ptr.next;
            length--;
        }
    }

    public void print() {
        Node ptr = this.head;
        System.out.print("[");
        for (int i = 0; i < this.length; i++) {
            System.out.print(ptr.val + " ");
            ptr = ptr.next;
        }
        System.out.print("]");
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
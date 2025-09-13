package org.example;

public class LinkedList {
        Node head;
        int size;

        // Add node at the end
        public void add(int data) {
            Node NewNode = new Node(data);

            if (head == null) {
                head = NewNode;
            } else {
                Node current = head;

                while (current.next != null) {
                    current = current.next;
                }
                current.next = NewNode;
            }
            size++;
        } // end of add at the end

        // print the list
        public void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.print("null");
            System.out.println();
        } // end of print

        // Get Size
        public int getSize() {
            return size;
        } // End Get Size

        //Search for a specific target and see if it exists True or False
        public boolean search(int target) {
            Node current = head;
            while (current != null) {
                if (current.data == target) {
                    System.out.println("The target does exist in the list");
                    return true;
                }
                current = current.next;
            }
            System.out.println("The target does not exist in the list");
            return false;
        } // End Search

        // Remove first Node
        public void removeFirst() {
            if (head == null) {
                return;
            }
            head = head.next;
            size--;
        } // end RemoveFirst

        // Remove the last Node in the list
        public void removeLast() {
            if (head == null) {
                return;
            }
            if (head.next == null) {
                head = null;
                size--;
                return;
            }
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        } // end remove last

        // Clear the entire list
        public void clear() {
            head = null;
            size = 0;
        }

        // Add element to a specific index
        public void insertAt(int Index, int data) {
            if (Index < 0 || Index > size) {
                throw new IndexOutOfBoundsException();
            }
            Node NewNode = new Node(data);
            if (Index == 0) {
                NewNode.next = head;
                head = NewNode;
            } else {
                Node current = head;
                for (int i = 0; i < Index - 1; i++) {
                    current = current.next;
                }
                NewNode.next = current.next;
                current.next = NewNode;
            }
            size++;
        }// End indexAT

        // Remove element at a specific index
        public void removeAt(int Index) {
            if (Index < 0 || Index >= size) {
                throw new IndexOutOfBoundsException();
            }
            if (Index == 0) {
                head = head.next;
                size--;
            } else {
                Node current = head;
                for (int i = 0; i < Index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
                size--;
            } // End removeAt
        }

        public void addFirst(int data) {
            insertAt(0, data);
        }

        public void addLast(int data) {
            add(data);
        }

        // Is the list empty?
        public boolean isEmpty(){
            if (size == 0){
                return true;
            }
            return false;
        }

        //Search for a specific target and see if it exists True or False
        public boolean contains(int target) {
            Node current = head;
            while (current != null) {
                if (current.data == target) {
                    return true;
                }
                current = current.next;
            }
            return false;
        } // End Search
    }


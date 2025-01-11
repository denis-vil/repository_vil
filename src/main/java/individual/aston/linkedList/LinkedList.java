package aston.linkedList;

import java.util.List;

public class LinkedList<T> {
    private Node head;
    private Node tail;
    private int currentSize;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.currentSize = 0;
    }

    public class Node {
        private T data;
        public Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    /**
     * Returns a sublist containing elements from the specified range in the list.
     * The sublist is inclusive of the starting index (fromIndex) and exclusive of the ending index (toIndex).
     *
     * @param fromIndex the starting index (inclusive) of the sublist.
     * @param toIndex   the ending index (exclusive) of the sublist.
     * @return a list containing the elements in the specified range.
     * @throws IndexOutOfBoundsException if {@code fromIndex} is less than 0,
     *                                   or {@code toIndex} is greater than the size of the list.
     * @throws IllegalArgumentException  if {@code toIndex} is less than {@code fromIndex}.
     */
    public List sublist(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > currentSize) {
            throw new IndexOutOfBoundsException();
        }
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        List<T> sublist = new java.util.LinkedList<>();
        Node currentNode = head;
        for (int i = 0; i < fromIndex; i++) {
            currentNode = currentNode.next;
        }
        for (int i = fromIndex; i < toIndex; i++) {
            sublist.add(currentNode.data);
            currentNode = currentNode.next;
        }
        return sublist;
    }

    /**
     * Adds the specified element to the end of the list.
     *
     * @param value the element to be added to the list.
     * @return {@code true} if the element was successfully added,
     * {@code false} if an exception occurred during the addition.
     */
    public boolean add(T value) {
        try {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            currentSize++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Inserts the specified element at the specified position in the list.
     * Shifts any subsequent elements to the right (adds one to their indices).
     *
     * @param index the index at which the element should be inserted.
     * @param value the element to be inserted.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index > currentSize).
     */
    public void add(int index, T value) {
        if (index < 0 || index > currentSize) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else if (index == currentSize) {
            tail.next = newNode;
            tail = newNode;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        currentSize++;
    }

    /**
     * Removes the element at the specified position in the list.
     * Shifts any subsequent elements to the left (removes one from their indices).
     *
     * @param index the index of the element to be removed.
     * @return the element that was removed from the list.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= currentSize).
     */
    public T remove(int index) {
        Node currentNode = head;
        Node previousNode = null;
        T removedData;
        if (index == 0) {
            removedData = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            for (int i = 0; i < index; i++) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            removedData = currentNode.data;
            previousNode.next = currentNode.next;

            if (currentNode == tail) {
                tail = previousNode;
            }
        }
        currentSize--;
        return removedData;
    }

    /**
     * Removes the first occurrence of the specified element from the list.
     * Shifts any subsequent elements to the left (removes one from their indices).
     *
     * @param value the element to be removed from the list.
     * @return {@code true} if the element was found and removed,
     * {@code false} if the element was not found in the list.
     */
    public boolean remove(T value) {
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode != null) {
            if ((currentNode.data == value) || (currentNode.data.equals(value))) {
                if (currentNode == head) {
                    head = currentNode.next;
                    if (head == null) {
                        tail = null;
                    }
                } else {
                    previousNode.next = currentNode.next;
                    if (currentNode == tail) {
                        tail = previousNode;
                    }
                }
                currentSize--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    /**
     * Retrieves the element at the specified position in the list.
     *
     * @param index the index of the element to be retrieved.
     * @return the element at the specified index in the list.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= currentSize).
     */
    public T get(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    /**
     * Replaces the element at the specified position in the list with the specified element.
     *
     * @param index the index of the element to be replaced.
     * @param value the new element to be stored at the specified index.
     * @return the element previously at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= currentSize).
     */
    public T set(int index, T value) {
        if (index < 0 || index >= currentSize) {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        T oldReturnValue = currentNode.data;
        currentNode.data = value;
        return oldReturnValue;
    }
}
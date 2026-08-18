# Singly Linked List: Methods, Implementation & Reference Guide

This document provides a comprehensive overview of the `App` (Singly Linked List) class methods, step-by-step logic breakdowns, and suggested methods to build a production-grade data structure.

---

## 1. Summary Table of Existing Methods

The following table summarizes all methods currently implemented in `com.SinglyLinkList.App`:

| Method | Signature | Return Type | Time Complexity | Description / Use Case |
| :--- | :--- | :--- | :--- | :--- |
| **Constructor** | `App()` | `void` | $\mathcal{O}(1)$ | Initializes an empty linked list with `head = null`, `tail = null`, and `size = 0`. |
| **`size()`** | `public int size()` | `int` | $\mathcal{O}(1)$ | Returns the total count of elements currently present in the list. |
| **`isEmpty()`** | `public boolean isEmpty()` | `boolean` | $\mathcal{O}(1)$ | Checks whether the list contains zero elements. Returns `true` if empty, `false` otherwise. |
| **`first()`** | `public int first() throws IllegalStateException` | `int` | $\mathcal{O}(1)$ | Retrieves the value of the head node without removing it. Throws an exception if empty. |
| **`last()`** | `public int last() throws IllegalStateException` | `int` | $\mathcal{O}(1)$ | Retrieves the value of the tail node without removing it. Throws an exception if empty. |
| **`addFirst()`** | `public void addFirst(int element)` | `void` | $\mathcal{O}(1)$ | Inserts a new node containing `element` at the beginning (front) of the list. |
| **`addLast()`** | `public void addLast(int element)` | `void` | $\mathcal{O}(1)$ | Appends a new node containing `element` at the end (tail) of the list. |
| **`add()`** | `public void add(int element, int index)` | `void` | $\mathcal{O}(n)$ | Inserts a new node with `element` immediately after the node at position `index`. |
| **`removeFirst()`** | `public void removeFirst() throws IllegalStateException` | `void` | $\mathcal{O}(1)$ | Removes the first node (head) from the list. Throws an exception if empty. |
| **`showList()`** | `public void showList() throws IllegalStateException` | `void` | $\mathcal{O}(n)$ | Iterates through all nodes starting from `head` and prints their values separated by tabs. |

---

## 2. Detailed Method Explanations & Logic

### 2.1. `addFirst(int element)`
* **Concept:** Inserts an item at the beginning of the chain.
* **Algorithm:**
  1. Create a new `Node` whose `next` reference points to the existing `head`.
  2. Point `head` to this newly created node.
  3. If the list was previously empty (`size == 0`), the new node also becomes the `tail`.
  4. Increment `size`.
* **Diagram:**
  ```text
  Before:  head -> [ A ] -> [ B ] -> null
  Action:  newNode.next = head
           head = newNode
  After:   head -> [ NEW ] -> [ A ] -> [ B ] -> null
  ```

---

### 2.2. `addLast(int element)`
* **Concept:** Appends an item to the end of the chain.
* **Algorithm:**
  1. Create a new `Node` whose `next` is `null`.
  2. If the list is empty (`size == 0`), both `head` and `tail` point to the new node.
  3. Otherwise, set the current `tail.next = tailN`, and then update `tail = tailN`.
  4. Increment `size`.
* **Diagram:**
  ```text
  Before:  head -> [ A ] -> [ B (tail) ] -> null
  Action:  tail.next = newNode
           tail = newNode
  After:   head -> [ A ] -> [ B ] -> [ NEW (tail) ] -> null
  ```

---

### 2.3. `add(int element, int index)`
* **Concept:** Inserts an item in between nodes (specifically after index `index`).
* **Algorithm:**
  1. Start a traversal pointer `temp` at `head`.
  2. Advance `temp` forward `index` times to find the preceding node.
  3. Instantiate `new Node(element, temp.getNext())`.
  4. Link `temp.setNext(newest)`.
  5. Increment `size`.
* **Note on Edge Cases:** If `index == 0`, adding before head is equivalent to `addFirst`. If inserting at the very end, `tail` should also be updated.

---

### 2.4. `removeFirst()`
* **Concept:** Detaches the first node, allowing the Garbage Collector to free its memory.
* **Algorithm:**
  1. Guard against empty list: throw `IllegalStateException` if `isEmpty()`.
  2. Advance `head` to `head.getNext()`.
  3. Decrement `size`.
  4. If `size == 0`, reset `tail = null`.

---

### 2.5. `showList()`
* **Concept:** Traverses the linked list sequentially.
* **Algorithm:**
  1. Check if the list is empty.
  2. Set `temp = head`.
  3. Loop while `temp != null` (or across `size` steps), printing `temp.getElement()` and updating `temp = temp.getNext()`.

---

## 3. Suggested Additional Methods Table

To make your Singly Linked List robust, complete, and standard across data structure libraries (like Java's `java.util.LinkedList`), consider adding the following methods:

| Method | Proposed Signature | Return Type | Time Complexity | Functionality & Practical Work |
| :--- | :--- | :--- | :--- | :--- |
| **`removeLast()`** | `public int removeLast()` | `int` | $\mathcal{O}(n)$ | Removes and returns the last element. Requires traversing to the second-to-last node to update `tail`. |
| **`removeAt()`** | `public int removeAt(int index)` | `int` | $\mathcal{O}(n)$ | Removes the node at a specific index and relinks the surrounding nodes. |
| **`get()`** | `public int get(int index)` | `int` | $\mathcal{O}(n)$ | Returns the element stored at a given 0-based index without modifying the list. |
| **`set()`** | `public void set(int index, int val)` | `void` | $\mathcal{O}(n)$ | Replaces the value stored at `index` with a new value `val`. |
| **`contains()`** | `public boolean contains(int val)` | `boolean` | $\mathcal{O}(n)$ | Linear search: returns `true` if `val` exists in the list, `false` otherwise. |
| **`indexOf()`** | `public int indexOf(int val)` | `int` | $\mathcal{O}(n)$ | Returns the index of the first occurrence of `val`, or `-1` if not found. |
| **`reverse()`** | `public void reverse()` | `void` | $\mathcal{O}(n)$ | In-place reverses the entire linked list by flipping the direction of all `next` pointers. |
| **`clear()`** | `public void clear()` | `void` | $\mathcal{O}(1)$ | Resets `head = null`, `tail = null`, and `size = 0`, discarding all nodes. |
| **`toArray()`** | `public int[] toArray()` | `int[]` | $\mathcal{O}(n)$ | Converts the linked list into a standard primitive `int[]` array. |

---

## 4. Implementation Code for Suggested Methods

Here is ready-to-use Java code implementing the most requested enhancements:

```java
package com.SinglyLinkList;

public class AppExtended extends App {

    // 1. Remove Last Node
    public int removeLast() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        
        int val = last();
        if (size() == 1) {
            removeFirst();
            return val;
        }
        
        Node temp = head;
        while (temp.getNext() != tail) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        tail = temp;
        size--;
        return val;
    }

    // 2. Contains Search
    public boolean contains(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.getElement() == target) return true;
            temp = temp.getNext();
        }
        return false;
    }

    // 3. In-Place Reversal
    public void reverse() {
        Node prev = null;
        Node curr = head;
        tail = head; // Current head will become the new tail
        
        while (curr != null) {
            Node nextTemp = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = nextTemp;
        }
        head = prev;
    }

    // 4. Clear List
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
```

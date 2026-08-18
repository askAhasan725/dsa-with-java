# Singly Linked List: Terminology & Methods Reference

## Core Terminology
* **Node**: A basic building block containing two parts: `data` (the value) and `next` (reference to the next node).
* **Head**: The pointer/reference variable storing the address of the very first node in the list.
* **Tail**: The final node in the list whose `next` pointer is set to `null`.
* **Traversal**: The process of visiting each node sequentially from the head to the tail.
* **Null/None Pointer**: Indicates the end of the linked list.

---

## Complete Methods & Operations

### 1. `insertAtBeginning(data)` / `prepend(data)`
* **What it does**: Adds a brand new node right at the start of the list.
* **How it works**: 
  1. Create a new node with the input data.
  2. Set the new node's `next` pointer to current `head`.
  3. Reassign `head` to point to the new node.
* **Time Complexity**: $O(1)$

### 2. `insertAtEnd(data)` / `append(data)`
* **What it does**: Adds a new node at the very end of the list.
* **How it works**:
  1. Create a new node.
  2. If the list is empty (`head == null`), make the new node the `head`.
  3. Else, traverse starting from `head` until reaching the last node (`node.next == null`).
  4. Set the last node's `next` pointer to the new node.
* **Time Complexity**: $O(n)$

### 3. `insertAfter(targetNode, data)`
* **What it does**: Inserts a new node immediately after a specified target node.
* **How it works**:
  1. Create a new node.
  2. Set the new node's `next` to `targetNode.next`.
  3. Set `targetNode.next` to the new node.
* **Time Complexity**: $O(1)$ (if target node reference is given)

### 4. `deleteFromBeginning()` / `removeFirst()`
* **What it does**: Removes the first node (head) from the list.
* **How it works**:
  1. Check if the list is empty (`head == null`).
  2. Reassign `head` to `head.next`.
  3. Clear or let garbage collection clear the old head node.
* **Time Complexity**: $O(1)$

### 5. `deleteFromEnd()` / `removeLast()`
* **What it does**: Removes the final node of the list.
* **How it works**:
  1. If the list is empty or has only one node, handle it by setting `head = null`.
  2. Traverse until the second-to-last node (where `node.next.next == null`).
  3. Set `node.next = null`.
* **Time Complexity**: $O(n)$

### 6. `deleteByValue(key)` / `remove(key)`
* **What it does**: Deletes the first node containing a specific matchable data value.
* **How it works**:
  1. Search for the target value while keeping track of the previous node.
  2. When found, bypass the target node by setting `prev.next = current.next`.
* **Time Complexity**: $O(n)$

### 7. `search(key)` / `find(key)`
* **What it does**: Checks whether a specified value exists within the list.
* **How it works**:
  1. Initialize a pointer at `head`.
  2. Loop through nodes (`ptr != null`), checking `ptr.data == key`.
  3. Return node/boolean if found, or `null` if the end is reached.
* **Time Complexity**: $O(n)$

### 8. `traverse()` / `display()`
* **What it does**: Prints or visits all elements sequentially.
* **How it works**:
  1. Start at `head`.
  2. Read/print node data and step forward: `ptr = ptr.next` until `ptr == null`.
* **Time Complexity**: $O(n)$

### 9. `reverse()`
* **What it does**: Flips the direction of the entire linked list so the tail becomes the head.
* **How it works**:
  1. Maintain three pointers: `prev = null`, `current = head`, and `next = null`.
  2. Loop through the list, saving `next = current.next`, changing `current.next = prev`, then shifting `prev = current` and `current = next`.
  3. Set `head = prev` at the end.
* **Time Complexity**: $O(n)$

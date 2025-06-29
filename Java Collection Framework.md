## 🔰 What is the Java Collections Framework?

The **Java Collections Framework** is a set of **classes and interfaces** that help you **store, retrieve, and manipulate groups of objects** (collections) in Java — like lists, sets, and maps.

Think of it like a **toolbox** of data structures.

## 🧰 Main Interfaces in the Collections Framework

These are the **core types** of collections:

### 1. **List**

- **Ordered** collection (you can access elements by index).
- Allows **duplicates**.
- Examples: `ArrayList`, `LinkedList`.

```java
List<String> list = new ArrayList<>();
list.add("apple");
list.add("banana");
list.add("apple");  // Duplicates allowed
```

------

### 2. **Set**

- **Unordered** (no indexing).
- **No duplicates** allowed.
- Examples: `HashSet`, `LinkedHashSet`, `TreeSet`.

```java
Set<String> set = new HashSet<>();
set.add("apple");
set.add("banana");
set.add("apple");  // Duplicate is ignored
```

------

### 3. **Map**

- Stores **key-value pairs**.
- Keys must be **unique**.
- Examples: `HashMap`, `TreeMap`, `LinkedHashMap`.

```java
Map<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.put("banana", 2);
map.put("apple", 5);  // Value for "apple" is updated
```

------

## ⚙️ Common Implementations and When to Use Them

| Type         | Implementation | Best For                      |
| ------------ | -------------- | ----------------------------- |
| `ArrayList`  | List           | Fast access, frequent reads   |
| `LinkedList` | List           | Frequent insertions/deletions |
| `HashSet`    | Set            | Fast lookup, no duplicates    |
| `TreeSet`    | Set            | Sorted set                    |
| `HashMap`    | Map            | Fast key-based lookup         |
| `TreeMap`    | Map            | Sorted keys                   |



------

## 🧠 Key Features

- **Generics**: You can specify the type of elements (e.g., `List<String>`).
- **Iterator**: Easily loop through collections.
- **Utility Methods**: Provided by `Collections` class (e.g., `Collections.sort()`).

------

## 🔁 Example: Iterating a Collection

```java
for (String item : list) {
    System.out.println(item);
}
```

Or using an **Iterator**:

```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

------

## 🧩 Summary

| Feature         | List    | Set  | Map                   |
| --------------- | ------- | ---- | --------------------- |
| Ordered         | Yes     | No   | Keys: No              |
| Duplicates      | Allowed | No   | Keys: No, Values: Yes |
| Access by index | Yes     | No   | Keys only             |



------

## 🗺️ Collections Framework Overview Diagram

```typescript
          Collection (interface)
               /    |     \
              /     |      \
         List     Set     Queue
          |        |         |
  ------------------       Deque
  |              |           |
ArrayList     HashSet     ArrayDeque
LinkedList    TreeSet
              LinkedHashSet

        Map (interface)
          |
  --------------------------
  |           |            |
HashMap   TreeMap   LinkedHashMap
```

## 🎯 1. **List Interface**

- ✅ Ordered
- ✅ Allows duplicates
- ✅ Access via index

### 🔹 ArrayList (uses dynamic array)

```java
List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple"); // Duplicate allowed
System.out.println(fruits.get(0)); // Apple
```

### 🔹 LinkedList (uses nodes)

```java
List<String> cities = new LinkedList<>();
cities.add("Delhi");
cities.add("Mumbai");
cities.addFirst("Kolkata"); // Only LinkedList supports this
```

------

## 🎯 2. **Set Interface**

- 🚫 No duplicates
- ❌ No index
- ✅ Fast search (especially HashSet)

### 🔹 HashSet (unordered)

```java
Set<String> colors = new HashSet<>();
colors.add("Red");
colors.add("Green");
colors.add("Red"); // Ignored
System.out.println(colors); // [Red, Green]
```

### 🔹 TreeSet (sorted)

```java
Set<Integer> nums = new TreeSet<>();
nums.add(5); nums.add(1); nums.add(3);
System.out.println(nums); // [1, 3, 5]
```

------

## 🎯 3. **Map Interface**

- 🔑 Stores key–value pairs
- ❌ Duplicate keys (latest overwrites)
- ✅ Values can be duplicated

### 🔹 HashMap

```java
Map<String, Integer> prices = new HashMap<>();
prices.put("Apple", 50);
prices.put("Banana", 20);
prices.put("Apple", 60); // Overwrites

System.out.println(prices.get("Apple")); // 60
```

### 🔹 TreeMap (sorted by key)

```java
Map<String, String> dict = new TreeMap<>();
dict.put("b", "banana");
dict.put("a", "apple");		
System.out.println(dict); // {a=apple, b=banana}
```

------

## 🔄 Looping Collections

### ✅ For-each

```java
for (String color : colors) {
    System.out.println(color);
}
```

### ✅ Iterator

```java
Iterator<String> it = fruits.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

------

## 🧰 Collections Utility Class

```java
List<Integer> nums = Arrays.asList(5, 2, 9, 1);
Collections.sort(nums);  // [1, 2, 5, 9]
Collections.reverse(nums); // [9, 5, 2, 1]
Collections.max(nums); // 9
```

------

## 🎓 Tip: When to Use What?

| Goal                       | Use             |
| -------------------------- | --------------- |
| Random access              | `ArrayList`     |
| Frequent insert/delete     | `LinkedList`    |
| Unique items               | `HashSet`       |
| Sorted unique items        | `TreeSet`       |
| Key–value with fast access | `HashMap`       |
| Key–value in sorted order  | `TreeMap`       |
| Maintain insertion order   | `LinkedHashMap` |

------

## ✅ Summary

The **Java Collections Framework** gives you ready-to-use, efficient data structures for different needs. You just need to pick the **right tool for the job**.

-----

Great! Let’s now explore **multithreading with collections** in Java — specifically how to **use collections safely in concurrent environments**.

## 🔥 Problem: Normal Collections Are Not Thread-Safe

If multiple threads access a collection (like `ArrayList`, `HashMap`, etc.) **without synchronization**, you may get:

- Data corruption
- `ConcurrentModificationException`
- Unexpected behavior

------

## ✅ Solution Options

Java provides **three main ways** to make collections thread-safe:

### 1. **Legacy Thread-safe Classes**

- `Vector` (instead of `ArrayList`)
- `Hashtable` (instead of `HashMap`)

> These are thread-safe but **not efficient** today.

------

### 2. **Collections.synchronizedXXX()**

Wraps a collection with synchronized methods.

```
java


CopyEdit
List<String> syncList = Collections.synchronizedList(new ArrayList<>());

synchronized (syncList) {
    syncList.add("A");
}
```

> 🔒 You still need to **manually synchronize** during iteration:

```
java


CopyEdit
synchronized (syncList) {
    for (String item : syncList) {
        System.out.println(item);
    }
}
```

------

### 3. **java.util.concurrent Package**

Modern, **high-performance concurrent collections**:

| Interface | Thread-safe Implementation |
| --------- | -------------------------- |
| `List`    | `CopyOnWriteArrayList`     |
| `Map`     | `ConcurrentHashMap`        |
| `Queue`   | `ConcurrentLinkedQueue`    |
| `Set`     | `ConcurrentSkipListSet`    |



------

## 🚀 Examples

### ✅ Example 1: `CopyOnWriteArrayList`

```java
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                list.add(Thread.currentThread().getName() + " - " + i);
            }
        };

        Thread t1 = new Thread(writer, "Writer1");
        Thread t2 = new Thread(writer, "Writer2");

        t1.start();
        t2.start();

        // Delay to let writers finish
        try { Thread.sleep(100); } catch (Exception e) {}

        for (String s : list) {
            System.out.println(s);
        }
    }
}
```

> `CopyOnWriteArrayList` is great for **more reads, fewer writes**.

------

### ✅ Example 2: `ConcurrentHashMap`

```
import java.util.concurrent.ConcurrentHashMap;

public class DemoMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                map.put(Thread.currentThread().getName() + "-" + i, i);
            }
        };

        Thread t1 = new Thread(writer, "T1");
        Thread t2 = new Thread(writer, "T2");

        t1.start();
        t2.start();

        try { Thread.sleep(100); } catch (Exception e) {}

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
```

------

### ✅ Example 3: Producer–Consumer with `ConcurrentLinkedQueue`

```java
import java.util.concurrent.ConcurrentLinkedQueue;

public class DemoQueue {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        Runnable producer = () -> {
            for (int i = 0; i < 5; i++) {
                queue.add(i);
                System.out.println("Produced: " + i);
            }
        };

        Runnable consumer = () -> {
            for (int i = 0; i < 5; i++) {
                Integer item = queue.poll();
                System.out.println("Consumed: " + item);
            }
        };

        new Thread(producer).start();
        try { 
          Thread.sleep(100); 
        } catch (Exception e) {
        }
        new Thread(consumer).start();
    }
}
```

------

## 💡 Summary Table

| Use Case | Collection              | Thread-Safe? | Use In                                        |
| -------- | ----------------------- | ------------ | --------------------------------------------- |
| List     | `ArrayList`             | ❌            | Single-threaded only                          |
| List     | `CopyOnWriteArrayList`  | ✅            | Many reads, few writes                        |
| Map      | `HashMap`               | ❌            | Single-threaded only                          |
| Map      | `ConcurrentHashMap`     | ✅            | High-concurrency                              |
| Queue    | `ArrayDeque`            | ❌            | Not thread-safe                               |
| Queue    | `ConcurrentLinkedQueue` | ✅            | Producer-Consumer                             |
| Set      | `HashSet`               | ❌            | Use `ConcurrentSkipListSet` for thread safety |
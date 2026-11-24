## Big O Notation

### What is Big O ?
> Big O notation is a mathematical way to describe how runtime and memory usage of an algorithm grows as input size increases. It helps us compare efficiency of different algorithms.

**For example:**
>We have a loop of n = 10 size so it will run 10 times what if size is increased by 1000 now it will run 1000 times. The work grows as input size increases. Therefore, time complexity = O (n)

### Important complexities

- O (1)
- O (log n) - Each step cuts the search space in half.
- O (n) - One complete traversal of loop
- O (n log n) - Merge / Quick sort
- O (n^2) - Nested loops
- O (2^n)
- O (n!)

## Data Structure in DSA

### Array
> An array is a collection of elements of the same datatype stored in a contiguous memory location.

- Array access is O (1) because it access using address = base address + ( Index * size ), no searching required.
- Search, Insert and delete can take O (n) in a worst case.

> Arrays provide very fast random access because elements can be accessed directly using an Index. However, deletion and insertion are costly because shifting may be required.


### ArrayList
> ArrayList is a resizable array implementation provided by java collection framework. It is dynamic because when array becomes full, new array created, old elements copied, reference updated. This happens automatically.

- add () - O (1) average
- get () - O (1)
- remove() - O (n)
- contains() - O (n)

### Difference between Array and ArrayList
> Array is fixed size, faster, can hold primitives and it has length property.

> ArrayList has dynamic size, slightly overhead, uses wrapper classes and has size() method.


### HashMap
> Hashmap stores data in key-value pairs and provide near-constant-time insertion and retrieval using hashing.

#### How hashmap works ?
- It calculates the code using hashcode()
- Search for bucket
- Store in key value pair

and for retrieval java again computes hash and directly goes to the bucket.

- get() 
- set()
- containsKey()

All takes O (1) time complexity.

> Java 8 improves collision handling by converting highly populated bucket into balance trees. Which improves worst case performance.

### String vs StringBuilder
- Strings are immutable means once created they cannot be modified. If we concatenate something then new object will be created with new value. Repeated concatenation becomes expensive.

- StringBuilder is a efficient way to perform operations on strings, because it does not create new string object everytime. It modifies existing buffer, it is better than repeated string concatenation.

> String is immutable, so repeated concatenation creates many intermediate string objects. StringBuilder is mutable and is preferred when frequence modifications are required.
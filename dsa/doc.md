## java.lang.System

#### `System.arraycopy(...)`
- **Signature**: `System.arraycopy(arrayToBeCopied, startPos, destArray, destPos, numElements)`
- **Description**: Copies elements from one array to another.
- **Example**:
  ```java
  System.arraycopy(nums, 0, ans, 0, nums.length);
  ```
---
  #### `System.gc();`
  -  serves as a suggestion to the Java Virtual Machine (JVM) to run the garbage collector.
  - good for memory efficiency.
  - But, can cause __TLE__.
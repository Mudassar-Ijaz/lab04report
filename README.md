Lab Task 04 — Data Types, Mutability, and Collections

Objective
Apply concepts of mutability, interface implementations (List, Map, Set), and safe iterator traversal using Java Collections.

What I Implemented
Completed all 4 lab tasks and 2 homework tasks in Java:

- **StringPerformance**: compares String concatenation vs StringBuilder performance for n = 10000
- **CourseManager**: demonstrates ConcurrentModificationException and fixes it using Iterator.remove()
- **TreasureMap**: HashMap operations: updating a value and summing all values with a for-each loop
- **Zoo**: wraps a List in Collections.unmodifiableList() and catches UnsupportedOperationException
- **Homework 1: StudentDirectory**: Map<Integer, String> with an unmodifiable Set returned from getAllIDs()
- **Homework 2: Point**: a fully immutable class using `final` class/fields and no setters

## How to Run
1. Open the project in NetBeans.
2. For Lab Tasks 1–4: right-click the relevant `.java` file → **Run File** to see console output.
3. For Homework 1 and 2: right-click the matching `*Test.java` file → **Test File** to run the JUnit tests.
4. View results in the **Output** panel (for Run File) or **Test Results** panel (for tests).

# Feature of Java 8

1. List down the new features introduced in Java 8?

Answer: New features that are introduced in Java 8 are enlisted below:

1. Lambda Expressions
2. Method References
3. Optional Class
4. Functional Interface
5. Default methods
6. Nashorn, JavaScript Engine
7. Stream API
8. Date API

2. What are Functional Interfaces?

Answer: Functional Interface is an interface that has only one abstract method. The implementation of these interfaces is provided using a Lambda Expression which means that to use the Lambda Expression, you need to create a new functional interface or you can use the predefined functional interface of Java 8. The annotation used for creating a new Functional Interface is "@FunctionalInterface".

3. What is an optional class?

Answer: Optional class is a special wrapper class introduced in Java 8 which is used to avoid NullPointerExceptions. This final class is present under java.util package. NullPointerExceptions occurs when we fail to perform the Null checks.

4. What are the default methods?

Answer: Default methods are the methods of the Interface which has a body. These methods, as the name suggests, use the default keywords. The use of these default methods is “Backward Compatibility” which means if JDK modifies any Interface (without default method) then the classes which implement this Interface will break. On the other hand, if you add the default method in an Interface then you will be able to provide the default implementation. This won’t affect the implementing classes.

Syntax:

```java
public interface questions{
  default void print() {
    System.out.println("www.softwaretestinghelp.com");
  }
}
```

5. What are the main characteristics of the Lambda Function?

Answer: Main characteristics of the Lambda Function are as follows:

1. A method that is defined as Lambda Expression can be passed as a parameter to another method.

2. A method can exist standalone without belonging to a class.
3. There is no need to declare the parameter type because the compiler can fetch the type from the parameter’s value.
4. We can use parentheses when using multiple parameters but there is no need to have parenthesis when we use a single parameter. If the body of expression has a single statement then there is no need to include curly braces.



6. What was wrong with the old date and time?

   Answer: Enlisted below are the drawbacks of the old date and time:

   1. Java.util.Date is mutable and is not thread-safe whereas the new Java 8 Date and Time API are thread-safe.
   2. Java 8 Date and Time API meets the ISO standards whereas the old date and time were poorly designed.
   3. It has introduced several API classes for a date like LocalDate, LocalTime, LocalDateTime, etc.
   4. Talking about the performance between the two, Java 8 works faster than the old regime of date and time.

7. What is the difference between the Collection API and Stream API?

   Answer: The difference between the Stream API and the Collection API can be understood from the below table:

   | Stream API                                                   | Collection API                                               |
   | ------------------------------------------------------------ | ------------------------------------------------------------ |
   | It was introduced in Java 8 Standard Edition version.        | It was introduced in Java version 1.2                        |
   | There is no use of the Iterator and Spliterators.            | With the help of forEach, we can use the Iterator and Spliterators to iterate the elements and perform an action on each item or the element. |
   | An infinite number of features can be stored.                | A countable number of elements can be stored.                |
   | Consumption and Iteration of elements from the Stream object can be done only once. | Consumption and Iteration of elements from the Collection object can be done multiple times. |
   | It is used to compute data.                                  | It is used to store data.                                    |

   

8. How can you create a Functional Interface?
   Answer: Although Java can identify a Functional Interface, you can define one with the
   annotation `@FunctionalInterface`. Once you have defined the functional interface, you can have only one abstract method.
   Since you have only one abstract method, you can write multiple static methods and default methods.

   Below is the programming example of FunctionalInterface written for multiplication of two numbers.

   ```java
   @FunctionalInterface // annotation for functional interface
   interface FuncInterface {
   	public int multiply(int a, int b);
   }
   
   public class Java8 {
   	public static void main(String args[]) {
   			FuncInterface Total = (a, b) -> a * b;
   			// simple operation of multiplication of 'a' and 'b'
   			System.out.println("Result: "+Total.multiply(30, 60)); // 1800
   		}
   }
   ```

9. What is a SAM Interface?
   Answer: Java 8 has introduced the concept of `Functional Interface` that can have only one abstract method. Since these Interfaces specify only one abstract method, they are sometimes called as SAM Interfaces. SAM stands for "Single Abstract Method".

10. Q #10) What is Method Reference?
    Answer: In Java 8, a new feature was introduced known as Method Reference. This is used to refer to the method of functional interface. It can be used to replace Lambda Expression while referring to a method. 

    For Example: If the Lambda Expression looks like `num -> System.out.println(num)`. Then the corresponding Method Reference would be,
    `System.out::println` where `::` is an operator that distinguishes class name from the method name.


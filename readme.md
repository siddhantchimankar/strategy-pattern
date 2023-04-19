# 🚀 How to Use This Project

Follow these simple steps to use this project:

1. Open the project in Intellij or any Java IDE.
2. Make sure you have specified the SDK in the project. If not, go to `File->Project Structure` and specify the SDK.
3. Run the project or run the `src/main` Java class.
4. You should see bubble-sort being implemented in runtime.

# 🧐 Strategy Pattern Theory

The strategy pattern is a software design pattern that enables an algorithm's behavior to be selected at runtime.

Let's say we have a class which performs some functionality.

But this functionality may vary at runtime depending on certain factors.

So instead of hardcoding a bunch of if-else statements in our class, we can use the Strategy pattern.

So let's say, we have a class called **Sorter**, but based on the size and contents of the array, we might perform a different implementation of sort.

We have 3 ways of sorting - Bubble Sort, Merge Sort and Quick Sort and the client which will call the **Sorter** class, would definitely know about the nature of the array.

So according to Strategy pattern, we can have an Interface called **sortStrategy** with a **sort()** method.

Three classes will extend this interface - **bubbleSort**, **mergeSort** and **quickSort** and all three will have their own implementations of the **sort()** method.

Now in our main **Sorter** class, we will have a **sortStrategy** member object which will be provided by the client code.

And finally the **Sorter** class will have a **sort()** method which will use the **sortStrategy** member object and perform - **sortStrategy.sort()**

This will enable us to select the behavior of sort at runtime which is the goal of the Strategy pattern.

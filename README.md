# snap-push-pop
Recursion examples of 1, 2, 3 steps of n stair steps and a palindrome.

Stairs:

Objective -- "Create a class with a method that calls itself to calculate the number of ways a person could climb a staircase of n steps if they can take 1 step at a time, 3 steps at a time, 5 steps at a time, or any combination thereof.    Allow the user to specify the number of steps n. Assume at the top of the stairs there is a flat surface so it doesn't matter if the user oversteps on their last step."

![image](https://user-images.githubusercontent.com/31526815/39289651-db608d36-48e1-11e8-962e-f94d3baa3d97.png)

The table above calculates these combinations manually for 5 stair steps.  Notice that order matters?  

The answers follow a type of Fibonacci sequence:

a = (a - 1) + (a - 2) - 1

Palindrome:

The recursion works by taking the outer two characters that make the string and compares them.  If that fails, then the method ends and says that the string is not a palindrome.  If it passes, it sends the remaining string back into the method to do it again until the bases cases are satisfied.  The base cases of 0 and 1 string length are self explanatory.

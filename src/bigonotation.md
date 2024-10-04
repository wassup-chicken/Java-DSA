## Basic Algorithm
- Number of desired sugars = N
- Total number of steps = 2n + 2
  - have to repeate steps 2 + 2
- The "2" in 2n and the " + 2" remain constant so they dont factor into the complexity.
- Time complexity is O(n) = linear


## Best to Worst time complexity:

- O(1) = Constant
- O(logn) = Logarithmic
  - log to the base 2
- O(n) = Linear
- O(nlogn) = n log-star n
  - N times log to the base N
- O(n^2) = Quadratic

## Operation: Time Complexity
- Retrieve with Index: O(1) Retrieve without Index:
- Retrieve without Index: O(N)
- Add an element to full array: O(N)
- Add an element to the end of an array: O(1)
- Insert or update an element at a specific index: O(1)
- Delete an element by setting it to null: O(1)
- Delete an element by shifting elements: O(N)


## Tips:
- Look at the number of loops
  - for ex. if nested loops, there are 2 Ns so N * N = Quadratic which means 
    - O(n^2)
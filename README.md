## Problem description
In order to ensure maximum security, the developer at Amazon emply multiple encryption methods to keep user data protected.

In one method, numbers are ncrypted using a scheme called 'Pascal Triangle'. When an aray of digits is fed to this system, it sums the adjascent digits. It then takes the right most digit of each addition for the next step. Thus the number of digitd in each step is reduced by 1. This procedure is repeated until there are only 2 digits remaining, and this sequence forms the encrypted number.

The method findNumber takes an array of numbers and returns a string of 2 characters.

## Example
Input: [4, 5, 6, 7]
Output: "04"
## Problem procedure
4  5  6  7
 \/ \/ \/
  9 11 13 -> 9  1  3   (took out right most digits of each sum)
             \ / \ /
              0   4    (length is 2, encrupted string)

Since an arraylist can shrink and grow dynamically, we loop our program until size is 2, after analyzing the entire generation (say level) we can remove last element in the array. For any adjacent numbers, say number.get(i) and number.get(i+i), we convert the sum to a string and take a substring( right most digit) and then replace with back to the arraylist, say numbers.set(i, rightMostDigit).

Repeating this process will ensure that arraylist shrinks eafter each generation, leaving only the two numbers in the list.
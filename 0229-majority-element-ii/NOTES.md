Approach:
The steps are as follows:
​
Use a hashmap and store the elements as <key, value> pairs. (Can also use frequency array based on the size of nums).
Here the key will be the element of the array and the value will be the number of times it occurs.
Traverse the whole array and update the occurrence of each element.
After that, check the map if the value for any element is greater than the floor of N/3.
If yes, include it in the list.
Else iterate forward.
Finally, return the list.
​
Complexity Analysis
Time Complexity: O(N*logN), where N = size of the given array.
Reason: We are using a map data structure. Insertion in the map takes logN time. And we are doing it for N elements. So, it results in the first term O(N*logN).
If we use unordered_map instead, the first term will be O(N) for the best and average case and for the worst case, it will be O(N2).
​
Space Complexity: O(N) as we are using a map data structure. We are also using a list that stores a maximum of 2 elements. That space used is so small that it can be considered constant
​
Optimal Approach (Extended Boyer Moore’s Voting Algorithm):
Approach:
Initialize 4 variables:
cnt1 & cnt2 –  for tracking the counts of elements
el1 & el2 – for storing the majority of elements.
Traverse through the given array.
If cnt1 is 0 and the current element is not el2 then store the current element of the array as el1 along with increasing the cnt1 value by 1.
If cnt2 is 0 and the current element is not el1 then store the current element of the array as el2 along with increasing the cnt2 value by 1.
If the current element and el1 are the same increase the cnt1 by 1.
If the current element and el2 are the same increase the cnt2 by 1.
Other than all the above cases: decrease cnt1 and cnt2 by 1.
The integers present in el1 & el2 should be the result we are expecting. So, using another loop, we will manually check their counts if they are greater than the floor(N/3).
Intuition: If the array contains the majority of elements, their occurrence must be greater than the floor(N/3). Now, we can say that the count of minority elements and majority elements is equal up to a certain point in the array. So when we traverse through the array we try to keep track of the counts of elements and the elements themselves for which we are tracking the counts.
​
After traversing the whole array, we will check the elements stored in the variables. Then we need to check if the stored elements are the majority elements or not by manually checking their counts.
​
import java.util.*;
​
public class tUf {
public static List<Integer> majorityElement(int []v) {
int n = v.length; //size of the array
​
int cnt1 = 0, cnt2 = 0; // counts
int el1 = Integer.MIN_VALUE; // element 1
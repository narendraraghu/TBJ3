package Daily_Problem.DP29032020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
A majority element is an element that appears more than half the time.
Given a list with a majority element, find the majority element.
def majority_element(nums):
  # Fill this in.
print(majority_element([3, 5, 3, 3, 2, 4, 3]))
# 3
*/
public class Solution {
    public static void main(String[] args) {
        int[] array = {3, 5, 3, 3, 2, 4, 3};
        System.out.println(majority_element(array));
    }

    private static int majority_element(int[] array) {
        Map<Integer, Integer> data = new HashMap<>();
        for (int number : array) {
            if (data.containsKey(number)) {
                data.put(number, data.size() + 1);
            } else
                data.put(number, 1);
        }

        data.forEach((k, v) -> System.out.println((k + ":" + v)));
        final Integer[] key = {0};
        data.entrySet().stream().filter(entry -> entry.getValue().equals(5))
                .forEach(entry -> key[0] = entry.getKey());

        return key[0];

    }
}

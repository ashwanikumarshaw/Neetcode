package ArrayAndHashing;

import java.util.*;
/*
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.
 */
public class TopKFrequentElements_347 {
    static public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        // find the frequency of each number
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();

        for (int n: nums) {
            numFrequencyMap.put(n, numFrequencyMap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        // go through all numbers of map & push them in a minHeap which will have top k elements
        // If at any time it has > K elements, then remove the smallest element.

        for(Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

       int[] ret=new  int[k];
        while (!minHeap.isEmpty()) {
           ret[k-1]=(minHeap.poll().getKey());
           k--;
           if(k<0)
               break;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,1,2,2 ,2,3,3},2)));
    }
}

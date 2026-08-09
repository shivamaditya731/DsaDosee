class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> hash = new HashMap<>();

        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int element = 0;

        for (int num : hash.keySet()) {
            if (hash.get(num) > maxCount) {
                maxCount = hash.get(num);
                element = num;
            }
        }

        return element;
    }
    }

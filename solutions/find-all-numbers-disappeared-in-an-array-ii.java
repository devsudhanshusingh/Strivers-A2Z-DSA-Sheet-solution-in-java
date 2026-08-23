class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        int start = lower;

        for (int num : nums) {

            // Ignore numbers outside the range
            if (num < lower) {
                continue;
            }

            if (num > upper) {
                break;
            }

            // There is a missing range before num
            if (num > start) {
                ans.add(Arrays.asList(start, num - 1));
            }

            // Move start forward
            start = num + 1;
        }

        // Missing range after the last number
        if (start <= upper) {
            ans.add(Arrays.asList(start, upper));
        }

        return ans;
    }
}
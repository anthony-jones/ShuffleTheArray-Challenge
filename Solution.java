class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i = 0, j = 0, k = n; j < n; i+=2, j++, k++){
            result[i] = nums[j];
            result[i+1] = nums[k];
        }
        return result;
    }
}

// i = resultant array index
// j = input array index, first half
// k = input array index, second half (beginning at n)

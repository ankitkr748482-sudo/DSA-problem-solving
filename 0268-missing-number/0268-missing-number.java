class Solution {
    public int missingNumber(int[] nums) {
        int anotherNumsXOR = nums.length;
        for (int i=0; i< nums.length; i++){
            anotherNumsXOR ^= i;
            anotherNumsXOR ^= nums[i];
        }
        return anotherNumsXOR;
    }
}
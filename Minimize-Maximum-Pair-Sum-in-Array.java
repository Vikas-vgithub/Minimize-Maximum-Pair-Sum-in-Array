class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length-1;
        int sum = 0;
        int ans = 0;

        while(i<=j){
            sum = nums[i]+nums[j];

            ans = Math.max(ans,sum);
            i++;
            j--;
        }

        return ans;
    }
}

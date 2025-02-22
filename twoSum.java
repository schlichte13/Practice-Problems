class Solution3{
    public static int[] twoSum(int[] nums, int target) {
        int[] newNums;
        newNums = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    newNums[0] = i;
                    newNums[1] = j;
                } 
            }
        }
        for(int k = 0; k < newNums.length; k++){
            System.out.println(newNums[k]);
        }
        return newNums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        twoSum(nums, target);

    }
}
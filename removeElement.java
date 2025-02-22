class Solution{
    public static int removeElement(int[] nums, int val){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 5, 3, 8};
        
        int val = 1;
        removeElement(nums, val);
        for(int i = 0; i < nums.length; i++ ){
            System.out.println(nums[i]);
        }
    }
}
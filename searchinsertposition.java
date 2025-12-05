class searchinsertposition {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if(target>nums[i] && target<=nums[i+1]){
                i=i+1;
                break;
            }
            if(target <=nums[i]){
                i=i;
                break;
            }
        }
        if(target>nums[nums.length-1]){
            i=nums.length;
        }
        return i;
    }
}

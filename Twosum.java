class Twosum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
               int sum=nums[i]+nums[j];
               if(sum==target){
                System.out.println(i+","+j);
                return new int[]{i,j};
               }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
     Twosum ss=new Twosum();
        int a=s.nextInt();
      //  int b=s.nextInt();
        int c[]=new int[5];
        for(int i=0;i<5;i++){
                c[i]=s.nextInt();
        }
        ss.twoSum(c,a);


    }
}

public class peak_element_in_mountain_arr {
    public static void main(String[] args) {
        int nums[]={1,3,5,7,6,4,2};
       int ans=peekelement(nums);
        System.out.println(nums[ans]);

    }
    public static int peekelement(int nums[]){
        int start=0;
        int end=nums.length-1;



        while(start<end){

            int mid=start+(end-start)/2;

            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;

    }
}

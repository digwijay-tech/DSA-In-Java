public class LinearAndBinary {
    public static void main(String[] args) {
        int[] nums ={1,4,7,20,18,56,60,98};

        int target =1;

        int result=linearSearch(nums,target);
        int result2=binarySearch(nums,target,0,nums.length-1);

        if(result != -1){
            System.out.println("Element found at " + result +" in Linear Search"  );

            System.out.println("Element found at " + result2 +" in binary Search");
        }
        else
            System.out.println("Element not Found");
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {  //binary search

        int steps=0; // To Find How Many Steps It Takes To Find The Element

        while(left<=right){

            steps++;

            int mid = (left+right)/2;

            if(nums[mid]== target){

                System.out.println("Steps taken by binary search "+steps);

                return mid;

            } else if (nums[mid]< target) {

                left=mid+1;

            }else
                right=mid-1;
        }

        return -1;
    }

    public static int linearSearch(int[] nums, int target) { //Linear Search

        int step=0; // To Find How Many Steps It Takes To Find The Element

        for(int i=0;i<nums.length;i++) {

            step++;

            if (nums[i] == target) {

                System.out.println("Steps taken by linear search "+step);

                return i;
            }
        }

        return -1;
    }
}

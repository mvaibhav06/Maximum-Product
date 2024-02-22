public class MaxProduct {
    public static int maxProduct(int[] nums){
        int highest = Integer.MIN_VALUE;
        int secondHigh = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++){
            int temp = nums[i] - 1;
            if (temp > secondHigh && temp < highest){
                secondHigh = temp;
            } else if (temp >= highest && temp > secondHigh) {
                secondHigh = highest;
                highest = temp;
            }
        }
        return highest*secondHigh;
    }
    public static void main(String[] args) {
        int[] nums = {3,7};
        System.out.println(maxProduct(nums));
    }
}

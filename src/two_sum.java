import java.util.HashMap;

public class two_sum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> sum = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(sum.containsKey(target-nums[i]))
            {
                return new int[]{sum.get(target-nums[i]), i};
            }
            else
            {
                sum.put(nums[i],i);
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] res = twoSum(nums,target);

        for(int a:res)
            System.out.println(a);


    }
}

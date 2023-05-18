import java.util.HashMap;

public class contains_duplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> check = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(check.containsKey(nums[i]))
            {
                System.out.println("Contains duplicate");
                return true;
            }
            else
            {
                check.put(nums[i],1);
            }
        }

        System.out.println("No duplicates");
        return false;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,3,45,5,6};
        containsDuplicate(nums);
    }
}

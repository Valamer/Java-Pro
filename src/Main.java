import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static boolean isPalindrome (String text) { // 1,2,2,4,5
        text= text.replaceAll("[^a-zA-Z0-9]", "");
        text= text.toLowerCase();
        int left=0;
        int right = text.length()-1;

        while(left<right){
            if(text.charAt(left)!= text.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static boolean containDuplicate (int[] nums) {
        HashSet<Integer> set  = new HashSet();
        for (int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static int[] twoSum (int[] nums, int target) {
        Map<Integer, Integer> checkedNums = new HashMap<>();

        for (int firstNum = 0; firstNum < nums.length; firstNum++) {
            int secondNum = target - nums[firstNum];
            if (checkedNums.containsKey(secondNum)) {
                return new int[]{checkedNums.get(secondNum), firstNum};
            }
            checkedNums.put(nums[firstNum], firstNum);
        }

        return new int[0];
    }

}

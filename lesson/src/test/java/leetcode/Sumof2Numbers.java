package leetcode;

//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答案。
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/two-sum

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Sumof2Numbers {

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println(Arrays.toString(result));
                    return result;
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>(length - 1);
        hashtable.put(nums[0], 0);
        for (int i = 1; i < length; ++i) {
            int another = target - nums[i];
            if (hashtable.containsKey(another)) {
                System.out.println(Arrays.toString(new int[]{hashtable.get(another), i}));
                return new int[]{i, hashtable.get(target - nums[i])};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Sumof2Numbers a = new Sumof2Numbers();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int target = 8;
        a.twoSum(nums, target);
        a.twoSum2(nums, target);

    }
}

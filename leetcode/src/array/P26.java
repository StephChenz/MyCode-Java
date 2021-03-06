package array;

/**
 * description: 删除排序数组中的重复项
 *定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/8 16:46
 */
public class P26 {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int p=0;
        int q=1;
        while (q<nums.length){
            if(nums[p]!=nums[q]){
                nums[p++]=nums[q];
            }
            q++;
        }
        return p+1;///
    }
}

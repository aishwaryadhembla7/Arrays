import java.util.*;
public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> set = new HashSet<>();
            List<List<Integer>> list = new ArrayList<>();
            Arrays.sort(nums);
            for(int i=0; i<nums.length-2; i++){
                int target = 0 - nums[i];
                int j = i+1;
                int k = nums.length-1;
                while(j<k){
                    int sum = nums[j] + nums[k];
                    if(sum==target){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        set.add(l);
                        j++;
                        k--;
                    }else if(sum < target){
                        j++;
                    }else if(sum > target){
                        k--;
                    }
                }
            }
            for(List<Integer> l : set){
                list.add(l);
            }
            return list;
        }
}

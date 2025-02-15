import java.util.HashMap;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        solution(nums, val);
    }

    public static void solution(int[] nums, int val) {
        // nums = [0,1,2,2,3,0,4,2]

        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 0; // indexing

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                map.put(k, nums[i]);
                k++;
            }
        }

        for(int i = 0; i < k; i++) {
            nums[i] = map.get(i);
        }

        System.out.println(nums);
    }
}

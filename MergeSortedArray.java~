import java.util.ArrayList;
import java.util.Collections;

class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3}, b = {2,5,6};
        MergeSortedArray ans = new MergeSortedArray();
        System.out.println(ans.solution(a, b));
    }

    public ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> arrayOne = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int aEle : a) {
            arrayOne.add(aEle);
        }

        // arrayOne = [1,2,3]

        for (Integer bEle : b) {
            arrayOne.add(bEle);
        }

        // arrayOne = [1,2,3,2,5,6]

        Collections.sort(arrayOne);
        // arrayOne = [1,2,2,3,5,6]

        ans = arrayOne;
        return ans;
    }
}

/**
 * Ethiopia
 * Morocco
 * Nigeria
 * Sri Lanka
 * Pakistan *** 7
 * Nepal
 * Bangla *** 6
 * Syria *** 8.5
 * Afg *** - 11
 * Iran - 11
 * Iraq - 22
 * China - 17
 * India - 15
 * Somalia - 14
 * SEA - 30
 */
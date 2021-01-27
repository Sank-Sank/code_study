package linked;

/**
 * 递归
 */
public class Recursion {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
    }

    /**
     * 使用递归对数组进行求和
     * @param arr
     * @return
     */
    public static int sum(int[] arr){
        return sum(arr,0);
    }

    private static int sum(int[] arr, int l){
        if(l == arr.length)
            return 0;
        return arr[l] + sum(arr,l + 1);
    }

}

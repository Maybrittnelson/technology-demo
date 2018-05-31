package sort;

/**
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/31
 */
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        //0-n-2 与 1-n-1
        for (int i = 0; i < A.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < A.length; j++) {
                //记录最小的索引
                min = A[min] > A[j] ? j : min;
            }
            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
        return A;
    }

}

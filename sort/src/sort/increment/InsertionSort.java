package sort.increment;

/**
 * 增量排序
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/31
 */
public class InsertionSort {

    public int[] insertionSort(int[] A, int n) {
        // write code here
        for (int i = 1; i < n; i++) {
            int pre = i - 1;
            int cn = A[i];
            while (pre >= 0 && A[pre] > cn) {
                A[pre + 1] = A[pre];
                pre--;
            }
            A[pre + 1] = cn;
        }
        return A;
    }
}

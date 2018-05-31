package sort;

/**
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/31
 */
public class ShellSort {

    public int[] shellSort(int[] A, int n) {
        // write code here
        if (A == null || n < 2) {
            return null;
        }
        int feet = n / 2;
        while (feet > 0) {
            for (int i = feet; i < n; i++) {
                while (i >= feet) {
                    if (A[i - feet] > A[i]) {
                        swap(A, i - feet, i);
                        i -= feet;
                    } else {
                        break;
                    }
                }
            }
            feet /= 2;
        }
        return A;
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

package sort.divide;

/**
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/31
 */
public class MergerSort {

    public int[] mergeSort(int[] A, int n) {
        // write code here
        if (A == null || A.length < 2) {
            return A;
        }
        process(A, 0, n - 1);
        return A;
    }

    public void process(int[] A, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (right + left) / 2;
        process(A, left, mid);
        process(A, mid + 1, right);
        merge(A, left, mid, right);
    }

    public void merge(int[] A, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        int index = 0;
        int l = left;
        int r = mid + 1;
        while (l <= mid && r <= right) {
            if (A[r] <= A[l]) {
                help[index++] = A[r++];
            } else {
                help[index++] = A[l++];
            }
        }
        while (l <= mid) {
            help[index++] = A[l++];
        }
        while (r <= right) {
            help[index++] = A[r++];
        }
        for (int i = 0; i < help.length; i++) {
            A[left + i] = help[i];
        }
    }
}

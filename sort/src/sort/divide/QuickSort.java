package sort.divide;

/**
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/31
 */
public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        // write code here
        if (A == null || A.length <= 0) {

            return null;
        }
        process(A, 0, A.length - 1);
        return A;
    }

    public void process(int[] A, int left, int right) {
        if (left < right) {
            int random = left + (int) (Math.random() * (right - left + 1));
            //交换划分值
            swap(A, random, right);
            //partition
            int mid = partition(A, left, right);
            process(A, left, mid - 1);
            process(A, mid + 1, right);
        }
    }

    //划分
    public int partition(int[] A, int left, int right) {
        int index = left;
        //枢轴
        int pivot = left - 1;
        while (index <= right) {
            if (A[index] <= A[right]) {
                //小于等于区间的下个元素与当前元素交换
                swap(A, index, ++pivot);
            }
            index++;
        }
        return pivot;
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

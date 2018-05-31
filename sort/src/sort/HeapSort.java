package sort;

/**
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/31
 */
public class HeapSort {
    public int[] heapSort(int[] A, int n) {
        // write code here
        buildMaxHeap(A);
        for (int i = A.length - 1; i >= 1; i--) {//堆的大小从n-1到1，
            swap(A, 0, i);//将最大堆的根结点（即最大值）与数组末尾交换
            if (i != 1) {
                maxHeapIFY(A, 0, i);//然后i设置为heap-size，将0上的数继续做最大堆化。
            }
        }
        return A;
    }

    //建堆
    public void buildMaxHeap(int[] A) {
        for (int i = A.length / 2; i >= 0; i--) {//最大父节点至最末尾
            maxHeapIFY(A, i, A.length);
        }
    }

    //维护最大堆性质
    public void maxHeapIFY(int[] A, int i, int heapSize) {
        int r = right(i);
        int l = left(i);
        int largest = i;
        if (l < heapSize && A[l] > A[i]) {
            largest = l;
        }
        if (r < heapSize && A[r] > A[largest]) {
            largest = r;
        }
        if (largest != i) {//如果largest等于i，则以i为根结点的子树已经是最大堆，则无需交换，不再递归。
            swap(A, i, largest);
            //此时largest索引所在的值，被交换为的原i索引的值,于是以该节点为根的子树又有可能违反最大堆性质。
            maxHeapIFY(A, largest, heapSize);
        }
    }

    //i(父节点)的右孩子
    public int right(int i) {
        return i * 2 + 2;
    }

    //i的左孩子
    public int left(int i) {
        return i * 2 + 1;
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}

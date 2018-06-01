[TOC]



# 图解算法

枚举过程+伪代码

～：至，例如：A[1]～A[3]，A[1]、A[2]、A[3]

n：数组长度

## 7种比较排序

### [插入排序](https://github.com/Maybrittnelson/technology-demo/tree/feature/6-01/img/sort/insert)

* A[1]～A[n-1]的元素，A[i]依次插入长度为1～n-1的有序数组（{A[0]}…{A[0]...A[n-2]}）。(1<=i<=n-1)

### [冒泡排序](https://github.com/Maybrittnelson/technology-demo/tree/feature/6-01/img/sort/bubble)

* A[0]～A[n-1]的元素，两两（A[i] 与 A[i-1]）比较，依次向后，构建长度为1～n的有序数组({A[n-1]}...{A[n-1]...A[0]})。(0<=i<=n-1)

### [选择排序](https://github.com/Maybrittnelson/technology-demo/tree/feature/6-01/img/sort/selection)

- A[i]与A[i+1]...A[n-1]，依次比较，将最小的放前面A[i]。(0<=i<n-1)。

### [归并排序](https://github.com/Maybrittnelson/technology-demo/tree/feature/6-01/img/sort/merger)

* 分治思想

### [快速排序](https://github.com/Maybrittnelson/technology-demo/tree/feature/6-01/img/sort/quick)

* 分治思想

### [堆排序](https://github.com/Maybrittnelson/technology-demo/tree/feature/6-01/img/sort/heap)

* maxHeapify(维护堆性质)
* buildMaxHeap(构建大根堆)
* heapSort(堆排序)










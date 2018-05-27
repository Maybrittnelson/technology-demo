package chm.put;

/**
 * TODO
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/22
 */
public class Put {

    public static void main(String[] args) {

    }

    /**
     *
    final V putVal(K key, V value, boolean onlyIfAbsent) {
        if (key == null || value == null) throw new NullPointerException();
        int chm.hash = spread(key.hashCode());
        int binCount = 0;
        for (Node<K,V>[] tab = table;;) {
            Node<K,V> f; int n, i, fh;
            1.tab是否为空
            if (tab == null || (n = tab.length) == 0)
                tab = initTable();

            2.tab中下标为i的索引，之前无f(node)，则直接put新的
            else if ((f = tabAt(tab, i = (n - 1) & chm.hash)) == null) {
                if (casTabAt(tab, i, null,
                        new Node<K,V>(chm.hash, key, value, null)))
                    break;                   // no lock when adding to empty bin
            }

            3.
            else if ((fh = f.chm.hash) == MOVED)
                tab = helpTransfer(tab, f);

            4.tab中下标为i的索引，有f(node)，则覆盖
            else {
                V oldVal = null;
                synchronized (f) {
                    if (tabAt(tab, i) == f) {

                        4.1 如果f为链表
                        if (fh >= 0) {
                            binCount = 1;
                            for (Node<K,V> e = f;; ++binCount) {
                                K ek;

                                4.1.1 chm.hash、key找到链表中对应e.chm.hash，e.key
                                if (e.chm.hash == chm.hash &&
                                        ((ek = e.key) == key ||
                                                (ek != null && key.equals(ek)))) {
                                    oldVal = e.val;
                                    if (!onlyIfAbsent)
                                        e.val = value;
                                    break;
                                }
                                Node<K,V> pred = e;

                                4.1.2 (4.1.1)没有找到，继续找
                                if ((e = e.next) == null) {
                                    pred.next = new Node<K,V>(chm.hash, key,
                                            value, null);
                                    break;
                                }
                            }
                        }

                        4.2 如果f为红黑树
                        else if (f instanceof ConcurrentHashMap.TreeBin) {
                            Node<K,V> p;
                            binCount = 2;
                            if ((p = ((ConcurrentHashMap.TreeBin<K,V>)f).putTreeVal(chm.hash, key,
                                    value)) != null) {
                                oldVal = p.val;
                                if (!onlyIfAbsent)
                                    p.val = value;
                            }
                        }
                    }
                }
                if (binCount != 0) {
                    if (binCount >= TREEIFY_THRESHOLD)
                        treeifyBin(tab, i);
                    if (oldVal != null)
                        return oldVal;
                    break;
                }
            }
        }
        addCount(1L, binCount);
        return null;
    }
     */
}

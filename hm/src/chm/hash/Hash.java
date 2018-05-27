package chm.hash;

import java.util.concurrent.ConcurrentHashMap;

/**
 * [了解HashMap中的主要机制](https://zhuanlan.zhihu.com/p/21673805)
 * 1.确定哈希桶数组索引位置
 * 1.1[逻辑异或](https://zh.wikipedia.org/wiki/%E9%80%BB%E8%BE%91%E5%BC%82%E6%88%96)
 * 1.1.1 通过[逻辑异或#真值表](https://zh.wikipedia.org/wiki/%E9%80%BB%E8%BE%91%E5%BC%82%E6%88%96#%E7%9C%9F%E5%80%BC%E8%A1%A8)，
 * 理解10或者01的异或为1，而11或00的异或值为0
 * 1.1.2 [逻辑异或#性质](https://zh.wikipedia.org/wiki/%E9%80%BB%E8%BE%91%E5%BC%82%E6%88%96#%E6%80%A7%E8%B4%A8)
 * 1.1.3 将1.2，[运用于swap函数](https://baike.baidu.com/item/%E5%BC%82%E6%88%96/10993677?fr=aladdin#4)
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see ConcurrentHashMap#spread(int)
 * @since 2018/5/22
 */
public class Hash {

    static final int HASH_BITS = 0x7fffffff; // usable bits of normal node chm.hash

    public static void main(String[] args) {
        //String key = "1";

        //spread(key.hashCode());


        swap(1, 2);
    }

    private static void swap(int i, int i1) {
        /**
         * 1.通过如下的异或运算真值表，理解 10或01的异或值为1，11或00的异或值为0
         * A	B	⊕
         * F	F	F
         * F	T	T
         * T	F	T
         * T	T	F
         *
         * 2.如何进一步？如下的公式
         * 恒等律、归零律推算出自反
         * <a href="https://wikimedia.org/api/rest_v1/media/math/render/svg/c47b0fd9d243d0f405e6fe5dce2cc59e9fbae0fb">自反</a>
         *
         * 3.将公式运用于swap.
         */
        i = i ^ i1;//3 01 10 = 11 优化后：i = 过度运算，将过度运算，赋值给了i,现在i其实是一个过度运算。（过度运算为 A⊕B，即 i1⊕i）
        i1 = i ^ i1;//1 11 10 = 01 优化后：把i赋给i1，i如何得道？i通过过度运算异或i1，那么异或后的值为i。（由自反公式可得，i1⊕i⊕i1的运算结果为i）
        i = i1 ^ i;//2 11 01 = 10  优化后：把i1赋给i，i1如何得道？同理,但值得注意的是i1现在的值就为i，那么异或后的值为i1。（同理，i1⊕i⊕i的运算结果为i1）
    }

    static final int spread(int h) {
        /**
         * ^
         *  1 1 = 0
         *  1 0 = 1
         *
         */
        return (h ^ (h >>> 16)) & HASH_BITS;
    }

}

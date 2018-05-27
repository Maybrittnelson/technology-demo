package hm.v7;

import java.util.HashMap;

/**
 * 4.线程安全性
 * 4.1 关于这篇文章中的线程安全性测试前提：[满足测试要求的jdk版本 Java SE Development Kit 7u5](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase7-521261.html)
 * 和[Idea Intellij多线程调试](https://blog.csdn.net/fuzzytalker/article/details/50925218)
 * 4.2 这篇文章中线程安全性：注意，Thread1的 e 指向了key(3)，而next指向了key(7)，其在线程二rehash后，
 * 指向了线程二重组后的链表。但是我测试时指向的还是thread1原来的链表，而且thread2rehash后，打印的map为null。
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/22
 */
public class HashMapInfiniteLoop {

    private static HashMap<Integer, String> map = new HashMap<Integer, String>(2, 0.75f);

    public static void main(String[] args) throws InterruptedException {

        map.put(5, "C");

        new Thread("Thread1") {
            public void run() {
                map.put(7, "B");
                System.out.println(map);
            }

            ;
        }.start();

        new Thread("Thread2") {
            public void run() {
                map.put(3, "A");
                System.out.println(map);
            }

            ;
        }.start();

        String s = map.get(3);//01111
        System.out.println(s);
    }
}

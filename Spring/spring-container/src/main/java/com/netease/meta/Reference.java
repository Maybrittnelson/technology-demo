package com.netease.meta;

/**
 * TODO
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/11
 */
public class Reference {

    public int id;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The Object in Reference " + id + "is going!......");
    }

    @Override
    public String toString() {
        return "Reference{" +
                "id=" + id +
                '}';
    }
}

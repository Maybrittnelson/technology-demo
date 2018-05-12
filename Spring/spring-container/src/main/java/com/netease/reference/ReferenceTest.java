package com.netease.reference;

import com.netease.meta.Reference;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * TODO
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/11
 */
public class ReferenceTest {

    public static void main(String[] args) {
        Reference r1 = new Reference();
        Reference r2 = new Reference();

        r1.id = 1;
        r2.id = 2;


        ArrayList<Reference> list = new ArrayList<Reference>();
        list.add(r1);
        list.add(r2);

        list.sort(new Comparator<Reference>() {
            public int compare(Reference o1, Reference o2) {
                return o1.id -o2.id;
            }
        });

        System.out.println(list);

    }
}

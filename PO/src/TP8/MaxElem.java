package TP8;

import java.util.Collection;
import java.util.Iterator;

public class MaxElem<T extends Collection, E extends Comparable> {

    E maxElem(T<E> col){
        Iterator<E> iter = col.iterator();
        if (!iter.hasNext()) throw new RuntimeException("hi");
        T lastMax = iter.next();
        while(iter.hasNext()) {
            if (lastMax.)
        }
    }
}
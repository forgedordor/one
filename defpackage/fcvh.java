package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcvh extends fcvg {
    public static final void A(Iterable iterable, fdap fdapVar) {
        iterable.getClass();
        w(iterable, fdapVar, true);
    }

    public static final void B(Collection collection, Iterable iterable) {
        collection.getClass();
        collection.removeAll(fcva.v(iterable));
    }

    public static final Object t(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static final Object u(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(fcva.e(list));
    }

    public static final Collection v(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : fcva.ao(iterable);
    }

    public static final boolean w(Iterable iterable, fdap fdapVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) fdapVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean x(List list, fdap fdapVar) {
        int i;
        list.getClass();
        fdapVar.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof fdcn) && !(list instanceof fdcp)) {
                fdcm.a(list, "kotlin.collections.MutableIterable");
            }
            return w(list, fdapVar, true);
        }
        int iE = fcva.e(list);
        if (iE >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) fdapVar.invoke(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int iE2 = fcva.e(list);
        if (i <= iE2) {
            while (true) {
                list.remove(iE2);
                if (iE2 == i) {
                    break;
                }
                iE2--;
            }
        }
        return true;
    }

    public static final void y(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final void z(Collection collection, Object[] objArr) {
        objArr.getClass();
        collection.addAll(fcur.c(objArr));
    }
}

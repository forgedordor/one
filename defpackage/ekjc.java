package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjc {
    public static int a(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        ejwl.b(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static int b(Iterator it, ejwm ejwmVar) {
        ejwmVar.getClass();
        int i = 0;
        while (it.hasNext()) {
            if (ejwmVar.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static ekqg c(Iterator it, ejwm ejwmVar) {
        it.getClass();
        ejwmVar.getClass();
        return new ekiu(it, ejwmVar);
    }

    public static ekqg d(Iterator it) {
        it.getClass();
        return it instanceof ekqg ? (ekqg) it : new ekit(it);
    }

    public static Object e(Iterator it, ejwm ejwmVar) {
        it.getClass();
        ejwmVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ejwmVar.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object f(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object g(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object h(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    static Object i(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static Iterator j(Iterator it, ejvr ejvrVar) {
        ejvrVar.getClass();
        return new ekiv(it, ejvrVar);
    }

    static void k(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean l(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean m(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean o(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekis {
    public static int a(Iterable iterable, ejwm ejwmVar) {
        return ekjc.b(iterable.iterator(), ejwmVar);
    }

    public static int b(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return eonc.f(j);
    }

    public static ejwi c(Iterable iterable, ejwm ejwmVar) {
        Iterator it = iterable.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ejwmVar.a(next)) {
                return ejwi.j(next);
            }
        }
        return ejud.a;
    }

    public static Iterable d(Iterable iterable, ejwm ejwmVar) {
        iterable.getClass();
        return new ekin(iterable, ejwmVar);
    }

    public static Iterable e(Iterable iterable, int i) {
        iterable.getClass();
        ejwl.b(i >= 0, "number to skip cannot be negative");
        return new ekiq(iterable, i);
    }

    public static Iterable f(Iterable iterable, ejvr ejvrVar) {
        iterable.getClass();
        return new ekio(iterable, ejvrVar);
    }

    public static Object g(Iterable iterable, ejwm ejwmVar) {
        return ekjc.e(iterable.iterator(), ejwmVar);
    }

    public static Object h(Iterable iterable, int i) {
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        Iterator it = iterable.iterator();
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.e(i, "position (", ") must not be negative"));
        }
        int iA = ekjc.a(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException(a.z(iA, i, "position (", ") must be less than the number of elements that remained (", ")"));
    }

    public static Object i(Iterable iterable, Object obj) {
        return ekjc.g(iterable.iterator(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object j(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return ekjc.f(iterable.iterator());
        }
        if (iterable.isEmpty()) {
            throw new NoSuchElementException();
        }
        return k(iterable);
    }

    public static Object k(List list) {
        return list.get(list.size() - 1);
    }

    public static Object l(Iterable iterable) {
        return ekjc.h(iterable.iterator());
    }

    public static Object m(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? ekjc.h(it) : obj;
    }

    public static String n(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static boolean o(Collection collection, Iterable iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : ekjc.l(collection, iterable.iterator());
    }

    public static boolean p(Iterable iterable, ejwm ejwmVar) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!ejwmVar.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(Iterable iterable, ejwm ejwmVar) {
        return ekjc.b(iterable.iterator(), ejwmVar) != -1;
    }

    public static Object[] r(Iterable iterable) {
        return v(iterable).toArray();
    }

    public static Object[] s(Iterable iterable, Class cls) {
        return t(iterable, eknr.c(cls, 0));
    }

    static Object[] t(Iterable iterable, Object[] objArr) {
        return v(iterable).toArray(objArr);
    }

    public static void u(List list, ejwm ejwmVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!ejwmVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        w(list, ejwmVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        w(list, ejwmVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    private static Collection v(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : ekjz.b(iterable.iterator());
    }

    private static void w(List list, ejwm ejwmVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (ejwmVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }
}

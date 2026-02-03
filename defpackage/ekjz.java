package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjz {
    public static ArrayList a(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : b(iterable.iterator());
    }

    public static ArrayList b(Iterator it) {
        ArrayList arrayList = new ArrayList();
        ekjc.l(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList c(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        ekcw.c(length, "arraySize");
        ArrayList arrayList = new ArrayList(eonc.f(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList d(int i) {
        ekcw.c(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List e(List list, int i) {
        list.getClass();
        ejwl.a(i > 0);
        return list instanceof RandomAccess ? new ekjr(list, i) : new ekjq(list, i);
    }

    public static List f(List list) {
        return list instanceof ekgb ? ((ekgb) list).a() : list instanceof ekju ? ((ekju) list).a : list instanceof RandomAccess ? new ekjs(list) : new ekju(list);
    }

    public static List g(List list, ejvr ejvrVar) {
        return list instanceof RandomAccess ? new ekjw(list, ejvrVar) : new ekjy(list, ejvrVar);
    }

    public static boolean h(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!ejwh.a(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !ejwh.a(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }
}

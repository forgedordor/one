package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobt {
    public static final Collection a(cnyz cnyzVar) {
        cnyzVar.getClass();
        evtg evtgVar = cnyzVar.f;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : evtgVar) {
            cnyz cnyzVar2 = (cnyz) obj;
            cnyzVar2.getClass();
            if (g(cnyzVar2)) {
                arrayList.add(obj);
            }
        }
        List listAq = fcva.aq(arrayList);
        evtg evtgVar2 = cnyzVar.h;
        evtgVar2.getClass();
        listAq.addAll(evtgVar2);
        if (g(cnyzVar)) {
            cnyu cnyuVar = (cnyu) cnyzVar.toBuilder();
            cnyuVar.getClass();
            DesugarCollections.unmodifiableList(((cnyz) cnyuVar.instance).f).getClass();
            cnzi.j(cnyuVar);
            DesugarCollections.unmodifiableList(((cnyz) cnyuVar.instance).h).getClass();
            cnzi.i(cnyuVar);
            listAq.add(cnzi.c(cnyuVar));
        }
        return listAq;
    }

    public static final boolean b(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (e((cnyz) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (f((cnyz) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (g((cnyz) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(cnyz cnyzVar) {
        cnyzVar.getClass();
        return cnyzVar.c == 3;
    }

    public static final boolean f(cnyz cnyzVar) {
        cnyzVar.getClass();
        return cnyzVar.c == 4;
    }

    public static final boolean g(cnyz cnyzVar) {
        cnyzVar.getClass();
        return cnyzVar.c == 5;
    }
}

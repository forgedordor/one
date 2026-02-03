package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcvb {
    public static final List a(List list) {
        list.getClass();
        fcww fcwwVar = (fcww) list;
        fcwwVar.h();
        fcwwVar.d = true;
        return fcwwVar.c > 0 ? fcwwVar : fcww.a;
    }

    public static final List b(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static final List c(Iterable iterable) {
        iterable.getClass();
        List listAp = fcva.ap(iterable);
        Collections.shuffle(listAp);
        return listAp;
    }

    public static final void d(int i, Object[] objArr) {
        objArr.getClass();
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbns {
    public static final fbns a = new fbns(new fbno(), fbnp.a);
    public final ConcurrentMap b = new ConcurrentHashMap();

    public fbns(fbnr... fbnrVarArr) {
        for (fbnr fbnrVar : fbnrVarArr) {
            this.b.put(fbnrVar.c(), fbnrVar);
        }
    }

    public static fbns a() {
        return new fbns(new fbnr[0]);
    }
}

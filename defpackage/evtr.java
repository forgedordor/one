package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evtr {
    static evtg a(Object obj, long j) {
        return (evtg) evvz.h(obj, j);
    }

    public static final List b(Object obj, long j) {
        evtg evtgVarA = a(obj, j);
        if (evtgVarA.c()) {
            return evtgVarA;
        }
        int size = evtgVarA.size();
        evtg evtgVarE = evtgVarA.e(size == 0 ? 10 : size + size);
        evvz.u(obj, j, evtgVarE);
        return evtgVarE;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswb implements ekue {
    private static final ekta a;
    private final eygg b;

    static {
        int i = ekgb.d;
        a = new esvx("", ekoe.a);
    }

    public eswb(eygg eyggVar) {
        this.b = eyggVar;
    }

    @Override // defpackage.ekue
    public final ekta a(String str) {
        Set set = (Set) this.b.b();
        int size = set.size();
        if (size == 0) {
            return a;
        }
        if (size == 1) {
            return ((ekue) set.iterator().next()).a(str);
        }
        ekfw ekfwVarD = ekgb.d(size);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ekfwVarD.h(((ekue) it.next()).a(str));
        }
        return new esvx(str, ekfwVarD.g());
    }
}

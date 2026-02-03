package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rlz {
    private static final rlq a = new rlx();
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final lcd d;

    public rlz(lcd lcdVar) {
        this.d = lcdVar;
    }

    private final rlq f(rly rlyVar) {
        rlq rlqVarB = rlyVar.b.b(this);
        rvi.f(rlqVarB);
        return rlqVarB;
    }

    private final void g(Class cls, Class cls2, rlr rlrVar, boolean z) {
        this.b.add(z ? this.b.size() : 0, new rly(cls, cls2, rlrVar));
    }

    public final synchronized rlq a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (rly rlyVar : this.b) {
                Set set = this.c;
                if (set.contains(rlyVar)) {
                    z = true;
                } else if (rlyVar.a(cls) && rlyVar.a.isAssignableFrom(cls2)) {
                    set.add(rlyVar);
                    arrayList.add(f(rlyVar));
                    set.remove(rlyVar);
                }
            }
            if (arrayList.size() > 1) {
                return new rlw(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (rlq) arrayList.get(0);
            }
            if (!z) {
                throw new rbk(cls, cls2);
            }
            return a;
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (rly rlyVar : this.b) {
                Set set = this.c;
                if (!set.contains(rlyVar) && rlyVar.a(cls)) {
                    set.add(rlyVar);
                    arrayList.add(f(rlyVar));
                    set.remove(rlyVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (rly rlyVar : this.b) {
            Class cls2 = rlyVar.a;
            if (!arrayList.contains(cls2) && rlyVar.a(cls)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    final synchronized void d(Class cls, Class cls2, rlr rlrVar) {
        g(cls, cls2, rlrVar, true);
    }

    final synchronized void e(Class cls, Class cls2, rlr rlrVar) {
        g(cls, cls2, rlrVar, false);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eiez {
    public static final eiew c = new eiew();
    private final eiez a;
    public final cvw d;
    public boolean e = false;

    public eiez(eiez eiezVar, cvw cvwVar) {
        if (eiezVar != null) {
            ejwl.a(eiezVar.e);
        }
        this.a = eiezVar;
        this.d = cvwVar;
    }

    public static eiex b() {
        return eiey.a.c();
    }

    static eiez d(Set set) {
        if (set.isEmpty()) {
            return eiey.a;
        }
        if (set.size() == 1) {
            return (eiez) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            eiez eiezVar = (eiez) it.next();
            do {
                i += eiezVar.d.d;
                eiezVar = eiezVar.a;
            } while (eiezVar != null);
        }
        if (i == 0) {
            return eiey.a;
        }
        cvw cvwVar = new cvw(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            eiez eiezVar2 = (eiez) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    cvw cvwVar2 = eiezVar2.d;
                    if (i2 >= cvwVar2.d) {
                        break;
                    }
                    ejwl.f(cvwVar.put((eiew) cvwVar2.d(i2), cvwVar2.g(i2)) == null, "Duplicate bindings: %s", cvwVar2.d(i2));
                    i2++;
                }
                eiezVar2 = eiezVar2.a;
            } while (eiezVar2 != null);
        }
        return new eiey(null, cvwVar).f();
    }

    static eiez e(eiez eiezVar, eiez eiezVar2) {
        return eiezVar.i() ? eiezVar2 : eiezVar2.i() ? eiezVar : d(ekhx.r(eiezVar, eiezVar2));
    }

    public static eiev j(eiew eiewVar, eiez eiezVar) {
        Object objG = eiezVar.g(eiewVar);
        if (objG == null) {
            return eiev.d(true != eiezVar.d.containsKey(c) ? 3 : 2);
        }
        return new eiev(1, objG, false);
    }

    public final eiex c() {
        return new eiey(this, new cvw());
    }

    public final eiez f() {
        if (this.e) {
            throw new IllegalStateException("Already frozen");
        }
        this.e = true;
        eiez eiezVar = this.a;
        return (eiezVar == null || !this.d.isEmpty()) ? this : eiezVar;
    }

    final Object g(eiew eiewVar) {
        eiez eiezVar;
        ejwl.l(this.e);
        Object obj = this.d.get(eiewVar);
        return (obj != null || (eiezVar = this.a) == null) ? obj : eiezVar.g(eiewVar);
    }

    final boolean h(eiew eiewVar) {
        if (this.d.containsKey(eiewVar)) {
            return true;
        }
        eiez eiezVar = this.a;
        return eiezVar != null && eiezVar.h(eiewVar);
    }

    public final boolean i() {
        return this == eiey.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (eiez eiezVar = this; eiezVar != null; eiezVar = eiezVar.a) {
            for (int i = 0; i < eiezVar.d.d; i++) {
                sb.append(this.d.g(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}

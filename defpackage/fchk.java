package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fchk {
    public final fcko a;
    public final Object b;
    public final Map c;
    private final fchi d;
    private final Map e;
    private final Map f;

    public fchk(fchi fchiVar, Map map, Map map2, fcko fckoVar, Object obj, Map map3) {
        this.d = fchiVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = fckoVar;
        this.b = obj;
        this.c = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final fbpk a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new fchj(this);
    }

    final fchi b(fbrk fbrkVar) {
        fchi fchiVar = (fchi) this.e.get(fbrkVar.b);
        if (fchiVar == null) {
            fchiVar = (fchi) this.f.get(fbrkVar.c);
        }
        return fchiVar == null ? this.d : fchiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fchk fchkVar = (fchk) obj;
            if (ejwh.a(this.d, fchkVar.d) && ejwh.a(this.e, fchkVar.e) && ejwh.a(this.f, fchkVar.f) && ejwh.a(this.a, fchkVar.a) && ejwh.a(this.b, fchkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("defaultMethodConfig", this.d);
        ejwfVarB.b("serviceMethodMap", this.e);
        ejwfVarB.b("serviceMap", this.f);
        ejwfVarB.b("retryThrottling", this.a);
        ejwfVarB.b("loadBalancingConfig", this.b);
        return ejwfVarB.toString();
    }
}

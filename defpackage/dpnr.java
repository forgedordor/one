package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnr {
    public final List a;
    public final dfw b;

    public dpnr(List list, dfw dfwVar) {
        list.getClass();
        dfwVar.getClass();
        this.a = list;
        this.b = dfwVar;
    }

    public final hox a(dpns dpnsVar) {
        Object next;
        dpnsVar.getClass();
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((dpnq) next).c() == dpnsVar) {
                break;
            }
        }
        dpnq dpnqVar = (dpnq) next;
        return dpnqVar != null ? dpnqVar.b() : new hpl(null, hsi.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpnr)) {
            return false;
        }
        dpnr dpnrVar = (dpnr) obj;
        return fdbq.f(this.a, dpnrVar.a) && fdbq.f(this.b, dpnrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ProjectorLayersState(layers=" + this.a + ", focusModeDisabledTransitionState=" + this.b + ")";
    }
}

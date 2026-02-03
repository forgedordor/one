package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oiz extends olb {
    public final oky a;
    public final /* synthetic */ ojc b;

    public oiz(ojc ojcVar, oky okyVar) {
        this.b = ojcVar;
        this.a = okyVar;
    }

    @Override // defpackage.olb
    public final oip a(ojx ojxVar, Bundle bundle) {
        ona onaVar = this.b.b;
        return oio.b(onaVar.g(), ojxVar, bundle, onaVar.a(), onaVar.l);
    }

    public final void b(oip oipVar) {
        oipVar.getClass();
        synchronized (this.c) {
            fduf fdufVar = this.d;
            fdufVar.f(fcva.ai((Collection) fdufVar.c(), oipVar));
        }
    }

    @Override // defpackage.olb
    public final void c(final oip oipVar) {
        oje ojeVar;
        oipVar.getClass();
        fdae fdaeVar = new fdae() { // from class: oix
            @Override // defpackage.fdae
            public final Object invoke() {
                fduf fdufVar = this.a.e;
                fdufVar.f(fcwm.f((Set) fdufVar.c(), oipVar));
                return fctx.a;
            }
        };
        ona onaVar = this.b.b;
        Map map = onaVar.t;
        boolean zF = fdbq.f(map.get(oipVar), true);
        fdaeVar.invoke();
        map.remove(oipVar);
        fcuq fcuqVar = onaVar.f;
        if (fcuqVar.contains(oipVar)) {
            if (this.f) {
                return;
            }
            onaVar.m();
            onaVar.g.h(fcva.aq(fcuqVar));
            onaVar.h.h(onaVar.h());
            return;
        }
        onaVar.v(oipVar);
        if (((lvn) oipVar.P()).c.a(lvb.c)) {
            oipVar.c(lvb.a);
        }
        if (!fcuqVar.isEmpty()) {
            Iterator<E> it = fcuqVar.iterator();
            while (it.hasNext()) {
                if (fdbq.f(((oip) it.next()).d, oipVar.d)) {
                    break;
                }
            }
            if (!zF) {
                ojeVar.a(oipVar.d);
            }
        } else if (!zF && (ojeVar = onaVar.l) != null) {
            ojeVar.a(oipVar.d);
        }
        onaVar.m();
        onaVar.h.h(onaVar.h());
    }

    @Override // defpackage.olb
    public final void d(final oip oipVar, boolean z) {
        final fdae fdaeVar = new fdae() { // from class: oiy
            @Override // defpackage.fdae
            public final Object invoke() {
                oip oipVar2 = oipVar;
                oiz oizVar = this.a;
                synchronized (oizVar.c) {
                    fduf fdufVar = oizVar.d;
                    Iterable iterable = (Iterable) fdufVar.c();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : iterable) {
                        if (fdbq.f((oip) obj, oipVar2)) {
                            break;
                        }
                        arrayList.add(obj);
                    }
                    fdufVar.f(arrayList);
                }
                return fctx.a;
            }
        };
        ona onaVar = this.b.b;
        oky okyVarA = onaVar.p.a(oipVar.a.c);
        onaVar.t.put(oipVar, Boolean.valueOf(z));
        if (!fdbq.f(okyVarA, this.a)) {
            Object obj = onaVar.q.get(okyVarA);
            obj.getClass();
            ((oiz) obj).d(oipVar, z);
            return;
        }
        fdap fdapVar = onaVar.s;
        if (fdapVar != null) {
            fdapVar.invoke(oipVar);
            fdaeVar.invoke();
            return;
        }
        fdae fdaeVar2 = new fdae() { // from class: omx
            @Override // defpackage.fdae
            public final Object invoke() {
                fdaeVar.invoke();
                return fctx.a;
            }
        };
        fcuq fcuqVar = onaVar.f;
        int iIndexOf = fcuqVar.indexOf(oipVar);
        if (iIndexOf < 0) {
            omg.a(a.h(oipVar, "Ignoring pop of ", " as it was not found on the current back stack"));
            return;
        }
        int i = iIndexOf + 1;
        if (i != fcuqVar.a) {
            onaVar.o(((oip) fcuqVar.get(i)).a.c(), true, false);
        }
        ona.u(onaVar, oipVar);
        fdaeVar2.invoke();
        onaVar.b.invoke();
        onaVar.n();
    }

    @Override // defpackage.olb
    public final void e(oip oipVar) {
        oipVar.getClass();
        ona onaVar = this.b.b;
        oky okyVarA = onaVar.p.a(oipVar.a.c);
        if (!fdbq.f(okyVarA, this.a)) {
            Object obj = onaVar.q.get(okyVarA);
            if (obj != null) {
                ((oiz) obj).e(oipVar);
                return;
            }
            throw new IllegalStateException("NavigatorBackStack for " + oipVar.a.c + " should already be created");
        }
        fdap fdapVar = onaVar.r;
        if (fdapVar != null) {
            fdapVar.invoke(oipVar);
            b(oipVar);
        } else {
            omg.a("Ignoring add of destination " + oipVar.a + " outside of the call to navigate(). ");
        }
    }
}

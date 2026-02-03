package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oly implements fl {
    final /* synthetic */ olb a;
    final /* synthetic */ oma b;

    public oly(olb olbVar, oma omaVar) {
        this.a = olbVar;
        this.b = omaVar;
    }

    @Override // defpackage.fl
    public final void b(ea eaVar, boolean z) {
        Object obj;
        Object objPrevious;
        eaVar.getClass();
        olb olbVar = this.a;
        List listAh = fcva.ah((Collection) olbVar.g.c(), (Iterable) olbVar.h.c());
        ListIterator listIterator = listAh.listIterator(listAh.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (fdbq.f(((oip) objPrevious).d, eaVar.H)) {
                    break;
                }
            }
        }
        oip oipVar = (oip) objPrevious;
        boolean z2 = z && this.b.c.isEmpty() && eaVar.s;
        List list = this.b.c;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (fdbq.f(((fcti) next).a, eaVar.H)) {
                obj = next;
                break;
            }
        }
        fcti fctiVar = (fcti) obj;
        if (fctiVar != null) {
            list.remove(fctiVar);
        }
        if (!z2 && oma.l()) {
            Log.v("FragmentNavigator", a.i(oipVar, eaVar, "OnBackStackChangedCommitted for fragment ", " associated with entry "));
        }
        boolean z3 = fctiVar != null && ((Boolean) fctiVar.b).booleanValue();
        if (!z && !z3 && oipVar == null) {
            throw new IllegalArgumentException(a.h(eaVar, "The fragment ", " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
        }
        if (oipVar != null) {
            oma.m(eaVar, olbVar);
            if (z2) {
                if (oma.l()) {
                    Log.v("FragmentNavigator", a.j(oipVar, eaVar, "OnBackStackChangedCommitted for fragment ", " popping associated entry ", " via system back"));
                }
                olbVar.g(oipVar, false);
            }
        }
    }

    @Override // defpackage.fl
    public final void c(ea eaVar, boolean z) {
        Object objPrevious;
        eaVar.getClass();
        if (z) {
            olb olbVar = this.a;
            List list = (List) olbVar.g.c();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (fdbq.f(((oip) objPrevious).d, eaVar.H)) {
                        break;
                    }
                }
            }
            oip oipVar = (oip) objPrevious;
            if (oma.l()) {
                Log.v("FragmentNavigator", a.i(oipVar, eaVar, "OnBackStackChangedStarted for fragment ", " associated with entry "));
            }
            if (oipVar != null) {
                fduf fdufVar = olbVar.e;
                fdufVar.f(fcwm.h((Set) fdufVar.c(), oipVar));
                if (!((oiz) olbVar).b.b.f.contains(oipVar)) {
                    throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                oipVar.c(lvb.d);
            }
        }
    }

    @Override // defpackage.fl
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.fl
    public final void d() {
    }

    @Override // defpackage.fl
    public final /* synthetic */ void e() {
    }
}

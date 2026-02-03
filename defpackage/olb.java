package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class olb {
    public final oni c = new oni();
    public final fduf d;
    public final fduf e;
    public boolean f;
    public final fdvc g;
    public final fdvc h;

    public olb() {
        fduf fdufVarA = fdvf.a(fcvo.a);
        this.d = fdufVarA;
        fduf fdufVarA2 = fdvf.a(fcvq.a);
        this.e = fdufVarA2;
        this.g = new fduh(fdufVarA);
        this.h = new fduh(fdufVarA2);
    }

    public abstract oip a(ojx ojxVar, Bundle bundle);

    public void c(oip oipVar) {
        throw null;
    }

    public void d(oip oipVar, boolean z) {
        throw null;
    }

    public void e(oip oipVar) {
        throw null;
    }

    public final void f(oip oipVar) {
        int iNextIndex;
        synchronized (this.c) {
            List listAq = fcva.aq((Collection) this.g.c());
            ListIterator listIterator = listAq.listIterator(listAq.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (fdbq.f(((oip) listIterator.previous()).d, oipVar.d)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listAq.set(iNextIndex, oipVar);
            this.d.f(listAq);
        }
    }

    public final void g(oip oipVar, boolean z) {
        Object objPrevious;
        fduf fdufVar = this.e;
        Iterable iterable = (Iterable) fdufVar.c();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((oip) it.next()) == oipVar) {
                    Iterable iterable2 = (Iterable) this.g.c();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((oip) it2.next()) == oipVar) {
                        }
                    }
                    return;
                }
            }
        }
        fdufVar.f(fcwm.h((Set) fdufVar.c(), oipVar));
        fdvc fdvcVar = this.g;
        List list = (List) fdvcVar.c();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            oip oipVar2 = (oip) objPrevious;
            if (!fdbq.f(oipVar2, oipVar) && ((List) fdvcVar.c()).lastIndexOf(oipVar2) < ((List) fdvcVar.c()).lastIndexOf(oipVar)) {
                break;
            }
        }
        oip oipVar3 = (oip) objPrevious;
        if (oipVar3 != null) {
            fdufVar.f(fcwm.h((Set) fdufVar.c(), oipVar3));
        }
        d(oipVar, z);
    }

    public final void h(oip oipVar) {
        oipVar.getClass();
        fduf fdufVar = this.e;
        Iterable iterable = (Iterable) fdufVar.c();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((oip) it.next()) == oipVar) {
                    Iterable iterable2 = (Iterable) this.g.c();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((oip) it2.next()) == oipVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        oip oipVar2 = (oip) fcva.T((List) this.g.c());
        if (oipVar2 != null) {
            fdufVar.f(fcwm.h((Set) fdufVar.c(), oipVar2));
        }
        fdufVar.f(fcwm.h((Set) fdufVar.c(), oipVar));
        e(oipVar);
    }
}

package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oll implements lvh {
    final /* synthetic */ olm a;

    public oll(olm olmVar) {
        this.a = olmVar;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        int iNextIndex;
        int iOrdinal = lvaVar.ordinal();
        if (iOrdinal == 0) {
            dn dnVar = (dn) lvjVar;
            Iterable iterable = (Iterable) this.a.f().g.c();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (fdbq.f(((oip) it.next()).d, dnVar.H)) {
                        return;
                    }
                }
            }
            dnVar.hh();
            return;
        }
        Object obj = null;
        if (iOrdinal == 2) {
            dn dnVar2 = (dn) lvjVar;
            olm olmVar = this.a;
            for (Object obj2 : (Iterable) olmVar.f().h.c()) {
                if (fdbq.f(((oip) obj2).d, dnVar2.H)) {
                    obj = obj2;
                }
            }
            oip oipVar = (oip) obj;
            if (oipVar != null) {
                olmVar.f().c(oipVar);
                return;
            }
            return;
        }
        if (iOrdinal != 4) {
            if (iOrdinal != 5) {
                return;
            }
            dn dnVar3 = (dn) lvjVar;
            olm olmVar2 = this.a;
            for (Object obj3 : (Iterable) olmVar2.f().h.c()) {
                if (fdbq.f(((oip) obj3).d, dnVar3.H)) {
                    obj = obj3;
                }
            }
            oip oipVar2 = (oip) obj;
            if (oipVar2 != null) {
                olmVar2.f().c(oipVar2);
            }
            dnVar3.P().d(this);
            return;
        }
        dn dnVar4 = (dn) lvjVar;
        if (dnVar4.gV().isShowing()) {
            return;
        }
        olm olmVar3 = this.a;
        List list = (List) olmVar3.f().g.c();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (fdbq.f(((oip) listIterator.previous()).d, dnVar4.H)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        oip oipVar3 = (oip) fcva.Q(list, iNextIndex);
        if (!fdbq.f(fcva.T(list), oipVar3)) {
            Log.i("DialogFragmentNavigator", a.h(dnVar4, "Dialog ", " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"));
        }
        if (oipVar3 != null) {
            olmVar3.k(iNextIndex, oipVar3, false);
        }
    }
}

package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsex implements ejug {
    @Override // defpackage.ejug
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        if (obj != null) {
            etoo etooVar = (etoo) obj;
            if (etooVar.b == 4) {
                dsbm dsbmVar = ((dsdy) obj2).a;
                if (dsbmVar.b == 2) {
                    dsbq dsbqVar = (dsbq) dsbmVar.c;
                    etot etotVar = (etot) etooVar.c;
                    etor etorVarB = etor.b(dsbqVar.b);
                    if (etorVarB == null) {
                        etorVarB = etor.UNKNOWN;
                    }
                    etor etorVarB2 = etor.b(etotVar.d);
                    if (etorVarB2 == null) {
                        etorVarB2 = etor.UNKNOWN;
                    }
                    if (etorVarB != etorVarB2) {
                        return false;
                    }
                    if (etotVar.c.size() == 0) {
                        return true;
                    }
                    Iterator<E> it = dsbqVar.c.iterator();
                    while (it.hasNext()) {
                        if (dsen.b(((dsbp) it.next()).b, etotVar)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

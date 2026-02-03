package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onh {
    public final oka a;
    public final cvx b = new cvx(null);
    public int c;
    public String d;

    public onh(oka okaVar) {
        this.a = okaVar;
    }

    public final ojx a(int i, ojx ojxVar, boolean z, ojx ojxVar2) {
        ojx ojxVarM;
        cvx cvxVar = this.b;
        ojx ojxVar3 = (ojx) cvy.a(cvxVar, i);
        if (ojxVar2 == null ? ojxVar3 != null : fdbq.f(ojxVar3, ojxVar2) && fdbq.f(ojxVar3.e, ojxVar2.e)) {
            return ojxVar3;
        }
        if (z) {
            Iterator itA = fdey.b(cwb.a(cvxVar)).a();
            while (itA.hasNext()) {
                ojx ojxVar4 = (ojx) itA.next();
                ojxVarM = (!(ojxVar4 instanceof oka) || fdbq.f(ojxVar4, ojxVar)) ? null : ((oka) ojxVar4).m(i, this.a, true, ojxVar2);
                if (ojxVarM != null) {
                    break;
                }
            }
            ojxVarM = null;
        } else {
            ojxVarM = null;
        }
        if (ojxVarM != null) {
            return ojxVarM;
        }
        oka okaVar = this.a;
        oka okaVar2 = okaVar.e;
        if (okaVar2 == null || fdbq.f(okaVar2, ojxVar)) {
            return null;
        }
        oka okaVar3 = okaVar.e;
        okaVar3.getClass();
        return okaVar3.m(i, okaVar, z, ojxVar2);
    }

    public final ojw b(ojw ojwVar, ojt ojtVar, boolean z, ojx ojxVar) {
        ojw ojwVarP;
        ArrayList arrayList = new ArrayList();
        oka okaVar = this.a;
        Iterator<ojx> it = okaVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ojx next = it.next();
            ojwVarP = fdbq.f(next, ojxVar) ? null : next.f(ojtVar);
            if (ojwVarP != null) {
                arrayList.add(ojwVarP);
            }
        }
        ojw ojwVar2 = (ojw) fcva.I(arrayList);
        oka okaVar2 = okaVar.e;
        if (okaVar2 != null && z && !fdbq.f(okaVar2, ojxVar)) {
            ojwVarP = okaVar2.p(ojtVar, okaVar);
        }
        return (ojw) fcva.I(fcur.K(new ojw[]{ojwVar, ojwVar2, ojwVarP}));
    }
}

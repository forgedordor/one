package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpc implements dxnp {
    private final dxkt a;
    private final dxkw b;

    public dxpc(dxkt dxktVar, dxkw dxkwVar) {
        dxktVar.getClass();
        dxkwVar.getClass();
        this.a = dxktVar;
        this.b = dxkwVar;
    }

    private final void c(dxhe dxheVar) {
        dxku dxkuVarB = this.b.b(33);
        dxkuVarB.b(dxheVar);
        this.a.a(dxkuVarB);
    }

    private final void d(int i, dxhe dxheVar, int i2, dxfo dxfoVar) {
        dxku dxkuVarA = this.b.a(i);
        dxkuVarA.b(dxheVar);
        dxkx dxkxVar = (dxkx) dxkuVarA;
        dxkxVar.u = i2;
        String simpleName = dxfoVar.a().getClass().getSimpleName();
        simpleName.getClass();
        dxkxVar.m = simpleName;
        this.a.a(dxkuVarA);
    }

    private static final int e(dxfo dxfoVar) {
        int i = 2;
        if (!(dxfoVar instanceof dxqj)) {
            if (dxfoVar instanceof dxqh) {
                return 2;
            }
            i = 4;
            if (!(dxfoVar instanceof dxqp)) {
                if (dxfoVar instanceof dxqn) {
                    return 4;
                }
                if (dxfoVar instanceof dxnt) {
                    return 3;
                }
                if (dxfoVar instanceof dxpo) {
                    return ((dxpo) dxfoVar).l() ? 6 : 5;
                }
                return 1;
            }
        }
        return i;
    }

    @Override // defpackage.dxnp
    public final void a(dxft dxftVar, Set set) {
        dxftVar.getClass();
        if (!(dxftVar instanceof dxfx)) {
            if (!(dxftVar instanceof dxfo)) {
                throw new fctg();
            }
            dxfo dxfoVar = (dxfo) dxftVar;
            int iE = e(dxfoVar);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                d(15, (dxhe) it.next(), iE, dxfoVar);
            }
            return;
        }
        for (Map.Entry entry : ((Map) ((dxfx) dxftVar).a).entrySet()) {
            if (entry.getValue() instanceof dxfx) {
                c((dxhe) entry.getKey());
            } else {
                Object value = entry.getValue();
                value.getClass();
                dxfo dxfoVar2 = (dxfo) value;
                d(15, (dxhe) entry.getKey(), e(dxfoVar2), dxfoVar2);
            }
        }
    }

    @Override // defpackage.dxnp
    public final void b(Map map, dxft dxftVar) {
        map.getClass();
        dxftVar.getClass();
        if (dxftVar instanceof dxfx) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                c((dxhe) it.next());
            }
            return;
        }
        if (!(dxftVar instanceof dxfo)) {
            throw new fctg();
        }
        dxfo dxfoVar = (dxfo) dxftVar;
        int iE = e(dxfoVar);
        for (Map.Entry entry : map.entrySet()) {
            dxvi dxviVar = (dxvi) entry.getKey();
            dxhe dxheVar = (dxhe) entry.getValue();
            int i = 15;
            if (dxfoVar instanceof dxqi) {
                if (!fdbq.f(((dxqi) dxfoVar).l(), dxviVar)) {
                    i = 64;
                }
            } else if ((dxfoVar instanceof dxqq) && !((dxqq) dxfoVar).a.contains(dxviVar)) {
                i = 0;
            }
            if (i != 0) {
                d(i, dxheVar, iE, dxfoVar);
            } else {
                c(dxheVar);
            }
        }
    }
}

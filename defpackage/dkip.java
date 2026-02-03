package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkip implements fdau {
    final /* synthetic */ ddp a;
    final /* synthetic */ dkkr b;

    public dkip(ddp ddpVar, dkkr dkkrVar) {
        this.a = ddpVar;
        this.b = dkkrVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        efd efdVar = (efd) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        efdVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(efdVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            String str = ((Number) this.a.d()).floatValue() == 0.0f ? "" : (String) this.b.d.invoke();
            ico icoVar = ics.e;
            icc iccVar = ibw.n;
            dthx.b(str, efdVar.b(icoVar, iccVar), glz.a(hmlVar).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).l, hmlVar, 0, 0, 65528);
            hmlVar.v(1025354404);
            dkkr dkkrVar = this.b;
            for (djrr djrrVar : dkkrVar.b) {
                dtfn.a(djrs.b(djrrVar, hmlVar), djrrVar.name(), egq.k(efdVar.b(icoVar, iccVar), 12.0f), glz.a(hmlVar).o, hmlVar, 0, 0);
            }
            hmlVar.o();
            Iterator it = dkkrVar.c.iterator();
            while (it.hasNext()) {
                dthx.b((String) it.next(), null, glz.a(hmlVar).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).l, hmlVar, 0, 0, 65530);
            }
        }
        return fctx.a;
    }
}

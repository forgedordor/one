package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlar implements fdau {
    final /* synthetic */ dlax a;

    public dlar(dlax dlaxVar) {
        this.a = dlaxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            egt.a(egq.e(icoVar, 6.0f), hmlVar);
            dlax dlaxVar = this.a;
            dlaw.d(dlaxVar.a, dlaxVar.b, dlaxVar.h, hmlVar, 0);
            dlaw.e(dlaxVar.c, hmlVar, 0);
            egt.a(egq.e(icoVar, 8.0f), hmlVar);
            dlaw.c(dlaxVar.d, dlaxVar.e, hmlVar, 0);
            hmlVar.v(1994902066);
            dlad dladVar = dlaxVar.f;
            if (dladVar != null || dlaxVar.g != null) {
                egt.a(egq.e(icoVar, 18.0f), hmlVar);
                dlaw.b(dladVar, dlaxVar.g, hmlVar, 0);
            }
            hmlVar.o();
            egt.a(egq.e(icoVar, 16.0f), hmlVar);
        }
        return fctx.a;
    }
}

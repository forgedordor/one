package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlat implements fdau {
    final /* synthetic */ dlad a;
    final /* synthetic */ dlad b;

    public dlat(dlad dladVar, dlad dladVar2) {
        this.a = dladVar;
        this.b = dladVar2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((efd) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlad dladVar = this.a;
            hmlVar.v(909715860);
            if (dladVar != null) {
                dlaw.j(dladVar, hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.v(909716953);
            dlad dladVar2 = this.b;
            if (dladVar2 != null && dladVar != null) {
                egt.a(egq.o(ics.e, 8.0f), hmlVar);
            }
            hmlVar.o();
            if (dladVar2 != null) {
                dlaw.i(dladVar2, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}

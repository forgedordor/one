package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlbn implements fdau {
    final /* synthetic */ dlbr a;

    public dlbn(dlbr dlbrVar) {
        this.a = dlbrVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlbp.c(hmlVar, 0);
            String str = this.a.c;
            if (str != null) {
                egt.a(egq.o(ics.e, 8.0f), hmlVar);
                dlbp.f(str, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}

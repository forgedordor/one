package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirn implements fdau {
    final /* synthetic */ diqh a;

    public dirn(diqh diqhVar) {
        this.a = diqhVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        diqp diqpVar = (diqp) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        diqpVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(diqpVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dirw.b(diqpVar, this.a.c, hmlVar, iIntValue & 14);
        }
        return fctx.a;
    }
}

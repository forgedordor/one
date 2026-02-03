package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkrd implements fdau {
    final /* synthetic */ dkri a;
    final /* synthetic */ int b;

    public dkrd(dkri dkriVar, int i) {
        this.a = dkriVar;
        this.b = i;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ede) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkri dkriVar = this.a;
            dkqr.o(new dkpg(((dkrj) dkriVar).a.size() - this.b), "", null, 0, null, hmlVar, 48, 28);
        }
        return fctx.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkre implements fdau {
    final /* synthetic */ dkri a;
    final /* synthetic */ int b;

    public dkre(dkri dkriVar, int i) {
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
            dkqr.o((dkpi) ((dkrj) dkriVar).a.get(this.b), null, null, 0, null, hmlVar, 0, 28);
        }
        return fctx.a;
    }
}

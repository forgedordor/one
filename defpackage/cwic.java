package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwic implements fdav {
    final /* synthetic */ dbs a;
    final /* synthetic */ cwhs b;
    final /* synthetic */ hsf c;

    public cwic(dbs dbsVar, cwhs cwhsVar, hsf hsfVar) {
        this.a = dbsVar;
        this.b = cwhsVar;
        this.c = hsfVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cxa cxaVar = (cxa) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        hml hmlVar = (hml) obj3;
        int iIntValue = ((Number) obj4).intValue() << 6;
        cxaVar.getClass();
        int i = iIntValue & 896;
        if (zBooleanValue) {
            hmlVar.v(-122592026);
            cwhc.d(this.a, this.b.h, cxaVar, hmlVar, i | 64);
            hmlVar.o();
        } else {
            hmlVar.v(-122745228);
            dbs dbsVar = this.a;
            cwhg cwhgVarA = cwil.a(this.c);
            cwhgVarA.getClass();
            cwil.c(dbsVar, cwhgVarA, cxaVar, hmlVar, i);
            hmlVar.o();
        }
        return fctx.a;
    }
}

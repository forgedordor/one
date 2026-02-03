package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpqd implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ dpqs b;
    final /* synthetic */ dpqs c;
    final /* synthetic */ dpll d;

    public dpqd(dpll dpllVar, ics icsVar, dpqs dpqsVar, dpqs dpqsVar2) {
        this.d = dpllVar;
        this.a = icsVar;
        this.b = dpqsVar;
        this.c = dpqsVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dpll dpllVar = this.d;
            ics icsVar = this.a;
            dpqs dpqsVar = this.b;
            dpqf.c(dpllVar, icsVar, dpqsVar.a, dpqsVar.b, hmlVar, 0);
            dpqs dpqsVar2 = this.c;
            dpqf.c(dpllVar, icsVar, dpqsVar2.a, dpqsVar2.b, hmlVar, 0);
        }
        return fctx.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eoc implements fdat {
    final /* synthetic */ eoe a;
    final /* synthetic */ eod b;

    public eoc(eoe eoeVar, eod eodVar) {
        this.a = eoeVar;
        this.b = eodVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eoi, java.lang.Object] */
    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            eoe eoeVar = this.a;
            final eod eodVar = this.b;
            ?? Invoke = eoeVar.b.invoke();
            int iA = eodVar.c;
            if ((iA >= Invoke.b() || !fdbq.f(Invoke.d(iA), eodVar.a)) && (iA = Invoke.a(eodVar.a)) != -1) {
                eodVar.c = iA;
            }
            int i2 = iA;
            if (i2 != -1) {
                hmlVar.v(-1664741302);
                eoh.a(Invoke, eoeVar.a, i2, eodVar.a, hmlVar, 0);
                hmlVar.o();
            } else {
                hmlVar.v(-1664506818);
                hmlVar.o();
            }
            Object obj3 = eodVar.a;
            boolean zF = hmlVar.F(eodVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdap() { // from class: eoa
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        return new eob(eodVar);
                    }
                };
                hmlVar.y(objF);
            }
            hob.c(obj3, (fdap) objF, hmlVar);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

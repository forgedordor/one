package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djov implements fdat {
    final /* synthetic */ dkpc a;
    final /* synthetic */ ede b;
    final /* synthetic */ djpa c;

    public djov(dkpc dkpcVar, ede edeVar, djpa djpaVar) {
        this.a = dkpcVar;
        this.b = edeVar;
        this.c = djpaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkpc dkpcVar = this.a;
            ede edeVar = this.b;
            ico icoVar = ics.e;
            ics icsVarA = edeVar.a(egq.h(icoVar, 16.0f), ibw.i);
            if (diho.a(this.c.m.d, hmlVar)) {
                icsVarA = icsVarA.a(dihi.c(icoVar));
            }
            dkpa.e(dkpcVar, icsVarA, hmlVar, 0);
        }
        return fctx.a;
    }
}

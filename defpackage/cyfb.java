package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyfb implements fdat {
    final /* synthetic */ ioi a;
    final /* synthetic */ hox b;

    public cyfb(ioi ioiVar, hox hoxVar) {
        this.a = ioiVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ioi ioiVar = this.a;
            ico icoVar = ics.e;
            hmlVar.v(5004770);
            final hox hoxVar = this.b;
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdae() { // from class: cyfa
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        cyfu.f(hoxVar, !cyfu.g(r0));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            ics icsVarA = joj.a(dli.e(icoVar, false, null, (fdae) objF, 15), "accountDropDownIcon");
            int i = fql.a;
            long j = ((ije) hmlVar.e(C0001for.a)).i;
            fql.a(ipv.b(ioiVar, hmlVar), icsVarA, ijg.f(ije.d(j), ije.c(j), ije.b(j), ((Number) hmlVar.e(fop.a)).floatValue(), ije.f(j)), hmlVar, 56);
        }
        return fctx.a;
    }
}

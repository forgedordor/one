package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwpy implements fdat {
    final /* synthetic */ dlfg a;
    final /* synthetic */ fdae b;

    public cwpy(dlfg dlfgVar, fdae fdaeVar) {
        this.a = dlfgVar;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarJ = efy.j(ics.e, 8.0f, 0.0f, 0.0f, 4.0f, 6);
            dlfg dlfgVar = this.a;
            if (dlfgVar instanceof dlfk) {
                hmlVar.v(-1657348363);
                dldw.e(dlfk.e((dlfk) dlfgVar, this.b), icsVarJ, hmlVar, 48, 0);
                hmlVar.o();
            } else if (dlfgVar instanceof dlfq) {
                hmlVar.v(-1657344491);
                dldw.e(dlfq.e((dlfq) dlfgVar, this.b), icsVarJ, hmlVar, 48, 0);
                hmlVar.o();
            } else if (dlfgVar instanceof dldf) {
                hmlVar.v(-1657340868);
                dldc.a(dldf.b((dldf) dlfgVar, this.b), icsVarJ, hmlVar, 48, 0);
                hmlVar.o();
            } else {
                hmlVar.v(162120223);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}

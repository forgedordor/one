package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ykt implements fdat {
    final /* synthetic */ dkgq a;
    final /* synthetic */ eve b;
    final /* synthetic */ evxl c;
    final /* synthetic */ dkgv d;
    final /* synthetic */ Object e;
    final /* synthetic */ yrx f;

    public ykt(dkgq dkgqVar, eve eveVar, evxl evxlVar, dkgv dkgvVar, Object obj, yrx yrxVar) {
        this.a = dkgqVar;
        this.b = eveVar;
        this.c = evxlVar;
        this.d = dkgvVar;
        this.e = obj;
        this.f = yrxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkgq dkgqVarE = this.a;
            if (dkgqVarE instanceof dlhm) {
                dkgqVarE = dlhm.l((dlhm) dkgqVarE, null, null, null, null, null, false, false, 4194239);
            } else if (dkgqVarE instanceof djpa) {
                dkgqVarE = djpa.l((djpa) dkgqVarE, null, false, false, 524255);
            } else if (dkgqVarE instanceof djtq) {
                dkgqVarE = djtq.r((djtq) dkgqVarE, null, null, null, null, false, null, null, null, 260095);
            } else if (dkgqVarE instanceof zij) {
                dkgqVarE = zij.k((zij) dkgqVarE, null, null, null, null, null, null, 522239);
            } else if (dkgqVarE instanceof diot) {
                dkgqVarE = diot.e((diot) dkgqVarE, null, null, false, 55);
            } else if (dkgqVarE instanceof ypn) {
                dkgqVarE = ypn.e((ypn) dkgqVarE, null, 16375);
            }
            eve eveVar = this.b;
            ykv.a(dkgqVarE, eveVar, this.c, this.d, this.e, hmlVar, 0, 0);
            divm.a(this.f.a, null, eveVar, hmlVar, 0);
        }
        return fctx.a;
    }
}

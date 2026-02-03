package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctwx implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ ctwr b;

    public ctwx(ics icsVar, ctwr ctwrVar) {
        this.a = icsVar;
        this.b = ctwrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVar = this.a;
            ctwr ctwrVar = this.b;
            ics icsVarE = ctxd.e(icsVar, ctwrVar.k.b, hmlVar);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarE);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            cudw.c(ctwrVar.b, hmlVar, 8);
            ctjv ctjvVar = ctwrVar.c;
            hmlVar.v(1325321641);
            if (ctjvVar != null) {
                ctlw.a(ctjvVar, hmlVar, 8);
            }
            hmlVar.o();
            fdpl fdplVar = ctwrVar.d;
            hmlVar.v(1325323657);
            if (fdplVar != null) {
                ctlw.b(fdplVar, hmlVar, 0);
            }
            hmlVar.o();
            cubs.a(ctwrVar.h, hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}

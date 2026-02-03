package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diyx implements fdat {
    final /* synthetic */ diys a;
    final /* synthetic */ long b;

    public diyx(diys diysVar, long j) {
        this.a = diysVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarE = efy.e(ics.e, 16.0f, 10.0f);
            diys diysVar = this.a;
            long j = this.b;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVar, 48);
            long jB = hmg.b(hmlVar);
            long j2 = jB ^ (jB >>> 32);
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
            int i = (int) j2;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            hmlVar.v(208283131);
            hmlVar.o();
            dthx.b(diysVar.a, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).m, hmlVar, 0, 0, 65530);
            hmlVar.n();
        }
        return fctx.a;
    }
}

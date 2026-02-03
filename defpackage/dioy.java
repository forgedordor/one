package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dioy implements fdat {
    final /* synthetic */ fdau a;

    public dioy(fdau fdauVar) {
        this.a = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            hmlVar.v(-1052953640);
            if (dljt.g(hmlVar)) {
                hmlVar.v(1899322803);
                j = glz.a(hmlVar).I;
                hmlVar.o();
            } else {
                hmlVar.v(1899383036);
                j = glz.a(hmlVar).n;
                hmlVar.o();
            }
            hmlVar.o();
            ics icsVarW = egq.w(dkl.a(icoVar, j, ikj.a), 0.0f, 0.0f, 200.0f, 72.0f, 3);
            fdau fdauVar = this.a;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j2 = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarW);
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
            fdauVar.a(edf.a, hmlVar, 6);
            hmlVar.n();
        }
        return fctx.a;
    }
}

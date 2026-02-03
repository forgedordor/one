package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwaa implements fdat {
    final /* synthetic */ cvzs a;
    final /* synthetic */ dbs b;
    final /* synthetic */ cyg c;
    final /* synthetic */ float d;

    public cwaa(cvzs cvzsVar, dbs dbsVar, cyg cygVar, float f) {
        this.a = cvzsVar;
        this.b = dbsVar;
        this.c = cygVar;
        this.d = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar;
        hml hmlVar2 = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar2.I()) {
            hmlVar2.s();
        } else {
            cvzs cvzsVar = this.a;
            dbs dbsVar = this.b;
            cyg cygVar = this.c;
            float f = this.d;
            eci eciVar = ecr.a;
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(eciVar, iccVar, hmlVar2, 54);
            long jB = hmg.b(hmlVar2);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar2.N();
            ics icsVarB = icj.b(hmlVar2, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVar2.M();
            hmlVar2.x();
            if (hmlVar2.H()) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            int i = (int) j;
            hsk.b(hmlVar2, ixmVarA, jbb.e);
            hsk.b(hmlVar2, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar2.H() || !fdbq.f(hmlVar2.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar2.y(numValueOf);
                hmlVar2.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar2, icsVarB, jbb.c);
            cwab.a(cvzsVar.d, hmlVar2, 0);
            egt.a(egq.o(icoVar, 8.0f), hmlVar2);
            boolean z = false;
            ics icsVarA = ien.a(icoVar, f);
            if (f >= 1.0f) {
                z = true;
            }
            cwab.c(dbsVar, cvzsVar, cygVar, 36.0f, icsVarA, z, f, hmlVar2, 3072);
            egt.a(egq.o(icoVar, 12.0f), hmlVar2);
            cwbj cwbjVar = cvzsVar.b;
            hmlVar2.v(1155476876);
            String str = cwbjVar.a;
            if (str != null) {
                hmlVar = hmlVar2;
                dthx.b(str, ien.a(icoVar, f), glz.a(hmlVar2).q, 0L, null, null, 0L, new khk(3), 0L, 2, false, 1, 0, null, glz.d(hmlVar2).h, hmlVar, 0, 3120, 54776);
            } else {
                hmlVar = hmlVar2;
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}

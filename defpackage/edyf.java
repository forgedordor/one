package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edyf implements fdau {
    final /* synthetic */ fdae a;
    final /* synthetic */ String b;
    final /* synthetic */ fdat c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;

    public edyf(fdae fdaeVar, String str, fdat fdatVar, int i, long j) {
        this.a = fdaeVar;
        this.b = str;
        this.c = fdatVar;
        this.d = i;
        this.e = j;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ecyg ecygVar = (ecyg) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ecygVar.getClass();
        icc iccVar = ibw.n;
        ico icoVar = ics.e;
        hmlVar.v(5004770);
        final fdae fdaeVar = this.a;
        boolean zD = hmlVar.D(fdaeVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new fdae() { // from class: edyd
                @Override // defpackage.fdae
                public final Object invoke() {
                    fdaeVar.invoke();
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        ics icsVarE = efy.e(egq.d(dli.e(icoVar, false, null, ecygVar.a((fdae) objF), 15), 1.0f), 32.0f, 16.0f);
        hmlVar.v(5004770);
        final String str = this.b;
        boolean zD2 = hmlVar.D(str);
        Object objF2 = hmlVar.f();
        if (zD2 || objF2 == hmk.a) {
            objF2 = new fdap() { // from class: edye
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    jto jtoVar = (jto) obj4;
                    jtoVar.getClass();
                    jtk.u(jtoVar, str);
                    return fctx.a;
                }
            };
            hmlVar.y(objF2);
        }
        hmlVar.o();
        ics icsVarC = jsh.c(icsVarE, false, (fdap) objF2);
        fdat fdatVar = this.c;
        int i = this.d;
        long j = this.e;
        ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVar, 48);
        long jB = hmg.b(hmlVar);
        long j2 = jB ^ (jB >>> 32);
        hxi hxiVarN = hmlVar.N();
        ics icsVarB = icj.b(hmlVar, icsVarC);
        fdae fdaeVar2 = jbb.a;
        hmlVar.M();
        hmlVar.x();
        if (hmlVar.H()) {
            hmlVar.j(fdaeVar2);
        } else {
            hmlVar.z();
        }
        int i2 = (int) j2;
        hsk.b(hmlVar, ixmVarA, jbb.e);
        hsk.b(hmlVar, hxiVarN, jbb.d);
        fdat fdatVar2 = jbb.f;
        if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i2))) {
            Integer numValueOf = Integer.valueOf(i2);
            hmlVar.y(numValueOf);
            hmlVar.h(numValueOf, fdatVar2);
        }
        hsk.b(hmlVar, icsVarB, jbb.c);
        fdatVar.a(hmlVar, 0);
        dthx.b(jqu.b(i, hmlVar), efy.i(icoVar, 32.0f, 0.0f, 2), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 48, 0, 131064);
        hmlVar.n();
        return fctx.a;
    }
}

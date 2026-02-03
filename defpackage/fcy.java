package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcy implements fdau {
    final /* synthetic */ jyq a;

    public fcy(jyq jyqVar) {
        this.a = jyqVar;
    }

    private static final Object b(hsf hsfVar) {
        return hsfVar.a();
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(1582736677);
        kio kioVar = (kio) hmlVar.e(jmh.e);
        kbi kbiVar = (kbi) hmlVar.e(jmh.g);
        kji kjiVar = (kji) hmlVar.e(jmh.j);
        jyq jyqVar = this.a;
        boolean zD = hmlVar.D(jyqVar) | hmlVar.B(kjiVar.ordinal());
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = jyr.b(jyqVar, kjiVar);
            hmlVar.y(objF);
        }
        jyq jyqVar2 = (jyq) objF;
        boolean zD2 = hmlVar.D(kbiVar) | hmlVar.D(jyqVar2);
        Object objF2 = hmlVar.f();
        if (zD2 || objF2 == hmk.a) {
            kbj kbjVarN = jyqVar2.n();
            kcc kccVarQ = jyqVar2.q();
            if (kccVarQ == null) {
                kccVarQ = kcc.e;
            }
            kbw kbwVarO = jyqVar2.o();
            int i = kbwVarO != null ? kbwVarO.a : 0;
            kbx kbxVarP = jyqVar2.p();
            objF2 = kbiVar.a(kbjVarN, kccVarQ, i, kbxVarP != null ? kbxVarP.a : 65535);
            hmlVar.y(objF2);
        }
        hsf hsfVar = (hsf) objF2;
        Object objF3 = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF3 == obj4) {
            objF3 = new fcv(kjiVar, kioVar, kbiVar, jyqVar, b(hsfVar));
            hmlVar.y(objF3);
        }
        final fcv fcvVar = (fcv) objF3;
        Object objB = b(hsfVar);
        if (kjiVar != fcvVar.a || !fdbq.f(kioVar, fcvVar.b) || !fdbq.f(kbiVar, fcvVar.c) || !fdbq.f(jyqVar2, fcvVar.d) || !fdbq.f(objB, fcvVar.e)) {
            fcvVar.a = kjiVar;
            fcvVar.b = kioVar;
            fcvVar.c = kbiVar;
            fcvVar.d = jyqVar2;
            fcvVar.e = objB;
            fcvVar.f = fcvVar.a();
        }
        ico icoVar = ics.e;
        boolean zF = hmlVar.F(fcvVar);
        Object objF4 = hmlVar.f();
        if (zF || objF4 == obj4) {
            objF4 = new fdau() { // from class: fcx
                @Override // defpackage.fdau
                public final Object a(Object obj5, Object obj6, Object obj7) {
                    long j = ((kil) obj7).a;
                    long j2 = fcvVar.f;
                    int iD = kil.d(j);
                    int iB = kil.b(j);
                    final iyl iylVarE = ((ixk) obj6).e(kil.m(j, fddu.i((int) (j2 >> 32), iD, iB), 0, fddu.i((int) (j2 & 4294967295L), kil.c(j), kil.a(j)), 0, 10));
                    return ((ixp) obj5).ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: fcw
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj8) {
                            iyk.A((iyk) obj8, iylVarE, 0, 0);
                            return fctx.a;
                        }
                    });
                }
            };
            hmlVar.y(objF4);
        }
        ics icsVarA = iwl.a(icoVar, (fdau) objF4);
        hmlVar.o();
        return icsVarA;
    }
}

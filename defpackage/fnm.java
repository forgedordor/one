package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnm implements fdau {
    final /* synthetic */ fmx a;

    public fnm(fmx fmxVar) {
        this.a = fmxVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(1980580247);
        final kio kioVar = (kio) hmlVar.e(jmh.e);
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            hpl hplVar = new hpl(new kjg(0L), hsi.a);
            hmlVar.y(hplVar);
            objF = hplVar;
        }
        final fmx fmxVar = this.a;
        final hox hoxVar = (hox) objF;
        boolean zF = hmlVar.F(fmxVar);
        Object objF2 = hmlVar.f();
        if (zF || objF2 == obj4) {
            objF2 = new fdae() { // from class: fnk
                @Override // defpackage.fdae
                public final Object invoke() {
                    juo juoVarE;
                    ezl ezlVarC;
                    int iE;
                    fda fdaVarD;
                    faj fajVar;
                    fbf fbfVar;
                    juo juoVar;
                    long j = ((kjg) hoxVar.a()).a;
                    fmx fmxVar2 = fmxVar;
                    ihs ihsVarD = fmxVar2.d();
                    long jFloatToRawIntBits = 9205357640488583168L;
                    if (ihsVarD != null && (juoVarE = fmxVar2.e()) != null && juoVarE.a() != 0 && (ezlVarC = fmxVar2.c()) != null) {
                        int iOrdinal = ezlVarC.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1) {
                            iE = jyo.e(fmxVar2.f().c);
                        } else {
                            if (iOrdinal != 2) {
                                throw new fctg();
                            }
                            iE = jyo.a(fmxVar2.f().c);
                        }
                        faj fajVar2 = fmxVar2.d;
                        if (fajVar2 != null && (fdaVarD = fajVar2.d()) != null && (fajVar = fmxVar2.d) != null && (fbfVar = fajVar.a) != null && (juoVar = fbfVar.a) != null) {
                            long j2 = ihsVarD.a;
                            int i = fddu.i(fmxVar2.b.a(iE), 0, juoVar.a());
                            long jB = fdaVarD.b(j2) >> 32;
                            jyi jyiVar = fdaVarD.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) jB);
                            int iH = jyiVar.h(i);
                            float fC = jyiVar.c(iH);
                            float fD = jyiVar.d(iH);
                            float fE = fddu.e(fIntBitsToFloat, Math.min(fC, fD), Math.max(fC, fD));
                            if (kjg.e(j, 0L) || Math.abs(fIntBitsToFloat - fE) <= ((int) (j >> 32)) / 2) {
                                float fE2 = jyiVar.e(iH);
                                jFloatToRawIntBits = (Float.floatToRawIntBits(fE) << 32) | (Float.floatToRawIntBits(((jyiVar.b(iH) - fE2) / 2.0f) + fE2) & 4294967295L);
                            }
                        }
                    }
                    return new ihs(jFloatToRawIntBits);
                }
            };
            hmlVar.y(objF2);
        }
        fdae fdaeVar = (fdae) objF2;
        boolean zD = hmlVar.D(kioVar);
        Object objF3 = hmlVar.f();
        if (zD || objF3 == obj4) {
            objF3 = new fdap() { // from class: fnl
                @Override // defpackage.fdap
                public final Object invoke(Object obj5) {
                    final fdae fdaeVar2 = (fdae) obj5;
                    ico icoVar = ics.e;
                    fdap fdapVar = new fdap() { // from class: fni
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj6) {
                            return (ihs) fdaeVar2.invoke();
                        }
                    };
                    final kio kioVar2 = kioVar;
                    final hox hoxVar2 = hoxVar;
                    return dnr.b(icoVar, fdapVar, new fdap() { // from class: fnj
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj6) {
                            float fB = kiw.b(((kiw) obj6).a);
                            kio kioVar3 = kioVar2;
                            hoxVar2.b(new kjg((kioVar3.ep(fB) << 32) | (kioVar3.ep(kiw.a(r0)) & 4294967295L)));
                            return fctx.a;
                        }
                    }, dos.a());
                }
            };
            hmlVar.y(objF3);
        }
        ics icsVarB = fkl.b(icsVar, fdaeVar, (fdap) objF3);
        hmlVar.o();
        return icsVarB;
    }
}

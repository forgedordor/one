package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flp implements fdau {
    final /* synthetic */ flg a;

    public flp(flg flgVar) {
        this.a = flgVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-1914520728);
        final kio kioVar = (kio) hmlVar.e(jmh.e);
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            hpl hplVar = new hpl(new kjg(0L), hsi.a);
            hmlVar.y(hplVar);
            objF = hplVar;
        }
        final flg flgVar = this.a;
        final hox hoxVar = (hox) objF;
        boolean zF = hmlVar.F(flgVar);
        Object objF2 = hmlVar.f();
        if (zF || objF2 == obj4) {
            objF2 = new fdae() { // from class: fln
                @Override // defpackage.fdae
                public final Object invoke() {
                    ezl ezlVarD;
                    long jA;
                    long j = ((kjg) hoxVar.a()).a;
                    flg flgVar2 = flgVar;
                    fil filVarF = flgVar2.f();
                    long j2 = 9205357640488583168L;
                    if (filVarF != null && (ezlVarD = flgVar2.d()) != null) {
                        int iOrdinal = ezlVarD.ordinal();
                        if (iOrdinal == 0) {
                            throw new IllegalStateException("SelectionContainer does not support cursor");
                        }
                        if (iOrdinal == 1) {
                            jA = flh.a(flgVar2, j, filVarF.a);
                        } else {
                            if (iOrdinal != 2) {
                                throw new fctg();
                            }
                            jA = flh.a(flgVar2, j, filVarF.b);
                        }
                        j2 = jA;
                    }
                    return new ihs(j2);
                }
            };
            hmlVar.y(objF2);
        }
        fdae fdaeVar = (fdae) objF2;
        boolean zD = hmlVar.D(kioVar);
        Object objF3 = hmlVar.f();
        if (zD || objF3 == obj4) {
            objF3 = new fdap() { // from class: flo
                @Override // defpackage.fdap
                public final Object invoke(Object obj5) {
                    final fdae fdaeVar2 = (fdae) obj5;
                    ico icoVar = ics.e;
                    fdap fdapVar = new fdap() { // from class: fll
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj6) {
                            return (ihs) fdaeVar2.invoke();
                        }
                    };
                    final kio kioVar2 = kioVar;
                    final hox hoxVar2 = hoxVar;
                    return dnr.b(icoVar, fdapVar, new fdap() { // from class: flm
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

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdx {
    public static final Integer a(hox hoxVar) {
        return (Integer) hoxVar.a();
    }

    public static final void b(final djdy djdyVar, final Integer num, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1114341312);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djdyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(num) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (num == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: djdp
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            djdx.b(djdyVar, null, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            int iB = fdcu.b(((int) (((jpb) hmlVarC.e(jmh.o)).a() & 4294967295L)) * 0.45f);
            int iB2 = fdcu.b(kioVar.en(8.0f));
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            kna.c(ibw.a, ((-Math.min(a(hoxVar) != null ? r2.intValue() : 0, iB)) - iB2) & 4294967295L, null, null, hxe.d(-590962269, new djdu(kioVar, hoxVar, num, iB, djdyVar), hmlVarC), hmlVarC, 24582, 12);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: djdq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djdy djdyVar2 = djdyVar;
                    int i4 = i;
                    djdx.b(djdyVar2, num, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final djhy djhyVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1402446066);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djhyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !hmlVarC.I()) {
            throw null;
        }
        hmlVarC.s();
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djdr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djdx.c(djhyVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final djhz djhzVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1531071226);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djhzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfr.a(hxe.d(-1463614244, new djdv(djhzVar), hmlVarC), dli.e(ics.e, false, null, djhzVar.c, 15), null, null, hxe.d(-446056616, new djdw(djhzVar), hmlVarC), null, dtfp.a(ije.g, hmlVarC, 510), hmlVarC, 24582, 428);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djds
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djdx.d(djhzVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

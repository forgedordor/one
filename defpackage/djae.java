package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djae {
    public static final void a(final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1400902942);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = dkl.a(egq.h(ics.e, 20.0f), glz.a(hmlVarC).a, evn.a);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: dizw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        if (!z) {
                            jtk.g(jtoVar);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtfn.a(djrs.b(djrr.af, hmlVarC), null, jsh.c(icsVarA, false, (fdap) objS), glz.a(hmlVarC).b, hmlVarC, 48, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dizx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    djae.a(z, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final djah djahVar, final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(1971594751);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(djahVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            hmlVarC.v(5004770);
            int i6 = i3 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i6 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: dizy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        String str = djahVar.a;
                        if (str != null) {
                            jtk.k(jtoVar, str);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarA = joj.a(jsh.c(icsVar, false, (fdap) objS), "circle_checkbox");
            ixm ixmVarA = ecz.a(ibw.e, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i7 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i7))) {
                Integer numValueOf = Integer.valueOf(i7);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(5004770);
            Object objS2 = hmwVar.S();
            if (i6 == 4 || objS2 == hmk.a) {
                objS2 = new fdae() { // from class: dizz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djahVar.c.invoke(Boolean.valueOf(!r0.b));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            dtfk.b((fdae) objS2, null, false, null, null, hxe.d(942190243, new djad(djahVar), hmlVarC), hmlVarC, 1572864, 62);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djaa
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djah djahVar2 = djahVar;
                    int i8 = i;
                    djae.b(djahVar2, icsVar, (hml) obj, hpy.a(i8 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1626461833);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarC = dkr.c(egq.h(ics.e, 20.0f), 1.5f, glz.a(hmlVarC).s, evn.a);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: djab
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        if (!z) {
                            jtk.g(jtoVar);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            egt.a(jsh.c(icsVarC, false, (fdap) objS), hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djac
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    djae.c(z, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

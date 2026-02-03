package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctxd {
    public static final dktt a(hsf hsfVar) {
        return (dktt) hsfVar.a();
    }

    public static final void b(final ctwr ctwrVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(150024628);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctwrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (ctwrVar.a) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: ctwv
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ctwr ctwrVar2 = ctwrVar;
                            int i4 = i;
                            ctxd.b(ctwrVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            ctpq.b(ctwrVar.f, hmlVarC, 0);
            gvk.c(null, null, 0L, 0L, 0.0f, 0.0f, null, hxe.d(-1435411655, new ctwx(icsVar, ctwrVar), hmlVarC), hmlVarC, 127);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: ctww
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ctwr ctwrVar2 = ctwrVar;
                    int i4 = i;
                    ctxd.b(ctwrVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fduj fdujVar, final gun gunVar, hml hmlVar, final int i) {
        int i2;
        gunVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(876214113);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdujVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(gunVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(fdujVar) | ((i2 & 112) == 32);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new ctxa(fdujVar, gunVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(gunVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctws
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fduj fdujVar2 = fdujVar;
                    int i4 = i;
                    ctxd.c(fdujVar2, gunVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ctwr ctwrVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1851118647);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctwrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            sgd sgdVarA = sgg.a(hmlVarC);
            cuib.b(sgdVarA, ije.g, false, null, hmlVarC, 48, 12);
            hsf hsfVarA = hro.a(ctwrVar.i, hmlVarC);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new gun();
                hmwVar.af(objS);
            }
            gun gunVar = (gun) objS;
            hmwVar.ab();
            c(ctwrVar.j, gunVar, hmlVarC, 48);
            hmlVarC.v(-808538501);
            ico icoVar = ics.e;
            ics icsVarA = dkl.a(ehm.b(egq.c(icoVar, 1.0f), new efr(ehv.f(hmlVarC), 15)), glz.a(hmlVarC).p, ikj.a);
            if (!ctwrVar.k.a) {
                icsVarA = icsVarA.a(ehm.b(icoVar, new efr(ehv.f(hmlVarC), 32)));
            }
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: ctwt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        jto jtoVar = (jto) obj2;
                        jtoVar.getClass();
                        jtl.a(jtoVar);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dtgq.a(jsh.c(icsVarA, false, (fdap) objS2), null, null, hxe.d(31857807, new ctxb(gunVar), hmlVarC), null, 0, 0L, 0L, null, hxe.d(-1788911784, new ctxc(ctwrVar, sgdVarA, hsfVarA), hmlVarC), hmlVar2, 805309440, 502);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctwu
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    ctxd.d(ctwrVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final ics e(ics icsVar, boolean z, hml hmlVar) {
        hmlVar.v(-1528629865);
        if (z) {
            icsVar = dkl.a(icsVar, glz.a(hmlVar).F, ikj.a);
        }
        hmlVar.o();
        return icsVar;
    }
}

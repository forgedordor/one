package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zya {
    public static final hpt a = new hsg(new fdae() { // from class: zxp
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = zya.a;
            throw new IllegalStateException("PopupCameraLoader must be provided");
        }
    });

    public static final float a(hox hoxVar) {
        return ((kir) hoxVar.a()).a;
    }

    public static final void b(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void c(final zxa zxaVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(864551685);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zxaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cweb.a((cwem) hro.a(zxaVar.n, hmlVarC).a(), hmlVarC, 0);
            hsf hsfVarA = hro.a(zxaVar.d, hmlVarC);
            dktt dkttVarL = l(hsfVarA);
            djmy djmyVar = dkttVarL instanceof djmy ? (djmy) dkttVarL : null;
            hmlVarC.v(1905491518);
            if (djmyVar != null) {
                djmf.a(djmyVar, null, hmlVarC, 0);
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            dktt dkttVarL2 = l(hsfVarA);
            divg divgVar = dkttVarL2 instanceof divg ? (divg) dkttVarL2 : null;
            hmlVarC.v(1905493607);
            if (divgVar != null) {
                zyl.b(divgVar, null, hmlVarC, 0);
            }
            hmwVar.ab();
            dktt dkttVarL3 = l(hsfVarA);
            aaam aaamVar = dkttVarL3 instanceof aaam ? (aaam) dkttVarL3 : null;
            hmlVarC.v(1905496473);
            if (aaamVar != null) {
                aaamVar.a.a(hmlVarC, 0);
            }
            hmwVar.ab();
            dktt dkttVarL4 = l(hsfVarA);
            dmgp dmgpVar = dkttVarL4 instanceof dmgp ? (dmgp) dkttVarL4 : null;
            hmlVarC.v(1905498423);
            if (dmgpVar != null) {
                ((dmgl) hmlVarC.e(a)).a(dmgpVar, hmlVarC, 0);
            }
            hmwVar.ab();
            dktt dkttVarL5 = l(hsfVarA);
            aaet aaetVar = dkttVarL5 instanceof aaet ? (aaet) dkttVarL5 : null;
            if (aaetVar != null) {
                aafg.a(aaetVar, hmlVarC, 0);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zxd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = hpy.a(i | 1);
                    zya.c(zxaVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final zxa zxaVar, final gun gunVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(130331963);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(zxaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(gunVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            fdpl fdplVar = zxaVar.o;
            if (fdplVar != null) {
                dpmw.c((dpmg) hsb.b(fdplVar, null, null, hmlVarC, 2).a(), hmlVarC, 0);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zxc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    zxa zxaVar2 = zxaVar;
                    int iA = hpy.a(i3 | 1);
                    zya.d(zxaVar2, gunVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.ede r11, final defpackage.zxa r12, defpackage.hml r13, final int r14) {
        /*
            r0 = r14 & 6
            r1 = -110886222(0xfffffffff96402b2, float:-7.3993647E34)
            hml r6 = r13.c(r1)
            r13 = 2
            r1 = 1
            if (r0 != 0) goto L18
            boolean r0 = r6.D(r11)
            if (r1 == r0) goto L15
            r0 = r13
            goto L16
        L15:
            r0 = 4
        L16:
            r0 = r0 | r14
            goto L19
        L18:
            r0 = r14
        L19:
            r2 = r14 & 48
            if (r2 != 0) goto L29
            boolean r2 = r6.D(r12)
            if (r1 == r2) goto L26
            r2 = 16
            goto L28
        L26:
            r2 = 32
        L28:
            r0 = r0 | r2
        L29:
            r2 = r0 & 19
            r3 = 18
            if (r2 != r3) goto L3c
            boolean r2 = r6.I()
            if (r2 != 0) goto L36
            goto L3c
        L36:
            r6.s()
        L39:
            r2 = r11
            goto Lab
        L3c:
            fdvc r2 = r12.i
            hsf r2 = defpackage.hro.a(r2, r6)
            java.lang.Object r2 = r2.a()
            xuy r2 = (defpackage.xuy) r2
            r9 = 0
            if (r2 == 0) goto L62
            evxw r2 = r2.a
            if (r2 == 0) goto L62
            evye r2 = defpackage.evxx.a(r2)
            if (r2 == 0) goto L62
            int r3 = r2.b
            r3 = r3 & r1
            if (r3 == 0) goto L62
            evyc r2 = r2.c
            if (r2 != 0) goto L60
            evyc r2 = defpackage.evyc.a
        L60:
            r10 = r2
            goto L63
        L62:
            r10 = r9
        L63:
            if (r10 == 0) goto L39
            int r2 = r10.b
            r1 = r1 & r2
            if (r1 == 0) goto L72
            evya r1 = r10.c
            if (r1 != 0) goto L70
            evya r1 = defpackage.evya.a
        L70:
            r3 = r1
            goto L73
        L72:
            r3 = r9
        L73:
            r1 = 812532162(0x306e41c2, float:8.6677343E-10)
            r6.v(r1)
            if (r3 == 0) goto L85
            r7 = r0 & 14
            r8 = 6
            r4 = 0
            r5 = 0
            r2 = r11
            defpackage.djoj.a(r2, r3, r4, r5, r6, r7, r8)
            goto L86
        L85:
            r2 = r11
        L86:
            r11 = r6
            hmw r11 = (defpackage.hmw) r11
            r11.ab()
            int r1 = r10.b
            r13 = r13 & r1
            if (r13 == 0) goto L97
            evya r9 = r10.d
            if (r9 != 0) goto L97
            evya r9 = defpackage.evya.a
        L97:
            r3 = r9
            r13 = 812534946(0x306e4ca2, float:8.66928E-10)
            r6.v(r13)
            if (r3 == 0) goto La8
            r7 = r0 & 14
            r8 = 6
            r4 = 0
            r5 = 0
            defpackage.djoj.a(r2, r3, r4, r5, r6, r7, r8)
        La8:
            r11.ab()
        Lab:
            hpx r11 = r6.L()
            if (r11 == 0) goto Lb8
            zxe r13 = new zxe
            r13.<init>()
            r11.d = r13
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zya.e(ede, zxa, hml, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.ede r9, final defpackage.zxa r10, defpackage.hml r11, final int r12) {
        /*
            r0 = r12 & 6
            r1 = -1295705785(0xffffffffb2c51947, float:-2.2945313E-8)
            hml r6 = r11.c(r1)
            r11 = 2
            r1 = 1
            if (r0 != 0) goto L18
            boolean r0 = r6.D(r9)
            if (r1 == r0) goto L15
            r0 = r11
            goto L16
        L15:
            r0 = 4
        L16:
            r0 = r0 | r12
            goto L19
        L18:
            r0 = r12
        L19:
            r2 = r12 & 48
            if (r2 != 0) goto L29
            boolean r2 = r6.D(r10)
            if (r1 == r2) goto L26
            r2 = 16
            goto L28
        L26:
            r2 = 32
        L28:
            r0 = r0 | r2
        L29:
            r2 = r0 & 19
            r3 = 18
            if (r2 != r3) goto L3b
            boolean r2 = r6.I()
            if (r2 != 0) goto L36
            goto L3b
        L36:
            r6.s()
        L39:
            r2 = r9
            goto L88
        L3b:
            fdvc r2 = r10.i
            hsf r2 = defpackage.hro.a(r2, r6)
            java.lang.Object r2 = r2.a()
            xuy r2 = (defpackage.xuy) r2
            r3 = 0
            if (r2 == 0) goto L60
            evxw r2 = r2.a
            if (r2 == 0) goto L60
            evye r2 = defpackage.evxx.a(r2)
            if (r2 == 0) goto L60
            int r4 = r2.b
            r11 = r11 & r4
            if (r11 == 0) goto L60
            evyg r11 = r2.d
            if (r11 != 0) goto L61
            evyg r11 = defpackage.evyg.a
            goto L61
        L60:
            r11 = r3
        L61:
            if (r11 == 0) goto L39
            int r2 = r11.b
            r1 = r1 & r2
            if (r1 == 0) goto L6e
            evya r3 = r11.c
            if (r3 != 0) goto L6e
            evya r3 = defpackage.evya.a
        L6e:
            r11 = 367265483(0x15e406cb, float:9.2099184E-26)
            r6.v(r11)
            if (r3 == 0) goto L81
            fdae r5 = r10.l
            r7 = r0 & 14
            r8 = 2
            r4 = 0
            r2 = r9
            defpackage.djoj.a(r2, r3, r4, r5, r6, r7, r8)
            goto L82
        L81:
            r2 = r9
        L82:
            r9 = r6
            hmw r9 = (defpackage.hmw) r9
            r9.ab()
        L88:
            hpx r9 = r6.L()
            if (r9 == 0) goto L95
            zxl r11 = new zxl
            r11.<init>()
            r9.d = r11
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zya.f(ede, zxa, hml, int):void");
    }

    public static final void g(final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1213713004);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final sgd sgdVarA = sgg.a(hmlVarC);
            hmlVarC.v(1852911710);
            boolean z2 = z && !dlv.a(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            if (z2) {
                hmlVarC.v(1605744987);
                long j = ije.g;
                hmlVarC.v(5004770);
                boolean zD = hmlVarC.D(sgdVarA);
                Object objS = hmwVar.S();
                if (zD || objS == hmk.a) {
                    objS = new fdae() { // from class: zxf
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            hpt hptVar = zya.a;
                            sgdVarA.a(ije.g, true, sgg.b);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                cuib.b(sgdVarA, j, false, (fdae) objS, hmlVarC, 432, 0);
                hmlVarC.v(5004770);
                boolean zD2 = hmlVarC.D(sgdVarA);
                Object objS2 = hmwVar.S();
                if (zD2 || objS2 == hmk.a) {
                    objS2 = new fdae() { // from class: zxg
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            hpt hptVar = zya.a;
                            sgdVarA.b(ije.g, true, sgg.b);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                hmwVar.ab();
                cuib.a(sgdVarA, j, false, (fdae) objS2, hmlVarC, 432, 0);
                hmwVar.ab();
            } else {
                hmlVarC.v(1606203787);
                long j2 = ije.g;
                cuib.b(sgdVarA, j2, false, null, hmlVarC, 48, 12);
                cuib.a(sgdVarA, j2, false, null, hmlVarC, 48, 12);
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zxh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = hpy.a(i | 1);
                    zya.g(z, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final zxa zxaVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-947673567);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zxaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hpx hpxVarL = hmlVarC.L();
            if (hpxVarL != null) {
                hpxVarL.d = new fdat() { // from class: zxk
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int i4 = i;
                        zxa zxaVar2 = zxaVar;
                        int iA = hpy.a(i4 | 1);
                        zya.h(zxaVar2, fdatVar, (hml) obj, iA);
                        return fctx.a;
                    }
                };
                return;
            }
            return;
        }
        hmlVarC.v(-181226670);
        fdatVar.a(hmlVarC, Integer.valueOf((i2 >> 3) & 14));
        ((hmw) hmlVarC).ab();
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: zxj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    zxa zxaVar2 = zxaVar;
                    int iA = hpy.a(i4 | 1);
                    zya.h(zxaVar2, fdatVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final zxa zxaVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int iIntValue;
        float f;
        long j;
        hox hoxVar;
        long j2;
        hml hmlVar2;
        zxaVar.getClass();
        hml hmlVarC = hmlVar.c(-1203075803);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(zxaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            g(z, hmlVarC, (i2 >> 3) & 14);
            hcq hcqVarC = dtct.c(-3.4028235E38f, hmlVarC, 0);
            hmlVarC.v(671267609);
            hmlVarC.v(-2121367903);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdae() { // from class: dtik
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return true;
                    }
                };
                hmwVar.af(objS);
            }
            fdae fdaeVar = (fdae) objS;
            hmwVar.ab();
            boolean zD = hmlVarC.D(hcqVarC) | hmlVarC.D(fdaeVar);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj) {
                objS2 = new gqg(hcqVarC, fdaeVar);
                hmwVar.af(objS2);
            }
            gqg gqgVar = (gqg) objS2;
            hmwVar.ab();
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = new gun();
                hmwVar.af(objS3);
            }
            gun gunVar = (gun) objS3;
            hmwVar.ab();
            hmlVarC.v(-1633490746);
            int i3 = i2 & 14;
            Object objS4 = hmwVar.S();
            if (i3 == 4 || objS4 == obj) {
                objS4 = new zxs(zxaVar, gunVar, null);
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            hob.g(gunVar, (fdat) objS4, hmlVarC);
            hpt hptVar = jmh.e;
            final kio kioVar = (kio) hmlVarC.e(hptVar);
            boolean z2 = false;
            zwz zwzVar = zxaVar.r;
            boolean z3 = zwzVar.a;
            if (z3) {
                Object objE = vcv.d.e();
                objE.getClass();
                iIntValue = ((Number) objE).intValue();
            } else {
                Object objE2 = vcv.c.e();
                objE2.getClass();
                iIntValue = ((Number) objE2).intValue();
            }
            float f2 = iIntValue;
            hmlVarC.v(1849434622);
            Object objS5 = hmwVar.S();
            if (objS5 == obj) {
                f = f2;
                hpl hplVar = new hpl(new kir(480.0f), hsi.a);
                hmwVar.af(hplVar);
                objS5 = hplVar;
            } else {
                f = f2;
            }
            final hox hoxVar2 = (hox) objS5;
            hmwVar.ab();
            kioVar.getClass();
            hmlVarC.v(1086948913);
            hsf hsfVarA = hsc.a(new kir(new efj(ehv.d(hmlVarC), kioVar).a()), hmlVarC);
            hmwVar.ab();
            hmlVarC.v(-809596228);
            float f3 = z3 ? ((kir) fddu.n(new kir(((kio) hmlVarC.e(hptVar)).el(((Number) hsb.b(zxaVar.h, 0, null, hmlVarC, 2).a()).intValue())), new kir(0.0f))).a : ((kir) hsfVarA.a()).a;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS6 = hmwVar.S();
            if (objS6 == obj) {
                hpl hplVar2 = new hpl(true, hsi.a);
                hmwVar.af(hplVar2);
                objS6 = hplVar2;
            }
            hox hoxVar3 = (hox) objS6;
            hmwVar.ab();
            if (((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() || !zxaVar.m) {
                hmlVarC.v(672912686);
                j = glz.a(hmlVarC).p;
                hmwVar.ab();
            } else {
                hmlVarC.v(672855305);
                j = dljt.a(hmlVarC).E;
                hmwVar.ab();
            }
            hmlVarC.v(-809573375);
            ico icoVar = ics.e;
            float f4 = f3;
            ics icsVarC = egq.c(icoVar, 1.0f);
            if (zwzVar.d) {
                hoxVar = hoxVar3;
                j2 = j;
            } else {
                hoxVar = hoxVar3;
                j2 = j;
                icsVarC = icsVarC.a(ehm.b(icoVar, new efr(ehv.f(hmlVarC), 15)));
            }
            hmwVar.ab();
            ics icsVarA = iqu.a(icsVarC, gqgVar.c, null);
            hmlVarC.v(1849434622);
            Object objS7 = hmwVar.S();
            if (objS7 == obj) {
                objS7 = new fdap() { // from class: zxm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        jto jtoVar = (jto) obj2;
                        hpt hptVar2 = zya.a;
                        jtoVar.getClass();
                        jtl.a(jtoVar);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS7);
            }
            hmwVar.ab();
            ics icsVarC2 = jsh.c(icsVarA, false, (fdap) objS7);
            hmlVarC.v(-1746271574);
            if (i3 == 4) {
                z2 = true;
            }
            boolean zD2 = z2 | hmlVarC.D(kioVar);
            Object objS8 = hmwVar.S();
            if (zD2 || objS8 == obj) {
                objS8 = new fdap() { // from class: zxn
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ivy ivyVar = (ivy) obj2;
                        hpt hptVar2 = zya.a;
                        ivyVar.getClass();
                        ihu ihuVarD = ivz.d(ivyVar);
                        zxaVar.j.a(Integer.valueOf((int) ihuVarD.b), Integer.valueOf((int) ihuVarD.c), Integer.valueOf((int) ihuVarD.d), Integer.valueOf((int) ihuVarD.e));
                        hoxVar2.b(new kir(kioVar.el((int) (ivyVar.g() & 4294967295L))));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS8);
            }
            hmwVar.ab();
            long j3 = j2;
            hmlVar2 = hmlVarC;
            dtgq.a(ixy.a(icsVarC2, (fdap) objS8), hxe.d(-1761635615, new zxu(f4, f, kioVar, zxaVar, gqgVar, hoxVar2, hoxVar), hmlVarC), null, hxe.d(-1252856801, new zxv(gunVar, zxaVar, f4), hmlVarC), null, 0, j3, 0L, null, hxe.d(1352036598, new zxz(zxaVar, gunVar, hoxVar2), hmlVarC), hmlVar2, 805309488, 436);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zxo
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    zxa zxaVar2 = zxaVar;
                    int iA = hpy.a(i4 | 1);
                    zya.i(zxaVar2, z, (hml) obj2, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-237202428);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfn.a(jqq.a(R.drawable.gs_sports_and_outdoors_vd_theme_24, hmlVarC, 0), null, joj.a(icsVar, "mlsWatermark"), glz.a(hmlVarC).s, hmlVarC, 48, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zxi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = hpy.a(i | 1);
                    zya.j(icsVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    private static final dktt l(hsf hsfVar) {
        return (dktt) hsfVar.a();
    }
}

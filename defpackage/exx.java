package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exx {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.fmx r4, defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.exw
            if (r0 == 0) goto L13
            r0 = r5
            exw r0 = (defpackage.exw) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            exw r0 = new exw
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fmx r4 = r0.c
            defpackage.fctl.b(r5)
            goto L3e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fctl.b(r5)
            r0.c = r4
            r0.b = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 == r1) goto L73
        L3e:
            boolean r5 = r4.v()
            boolean r0 = r4.x()
            r1 = 0
            if (r3 == r0) goto L4b
            r0 = r1
            goto L4c
        L4b:
            r0 = 2
        L4c:
            r5 = r5 | r0
            boolean r0 = r4.w()
            if (r3 == r0) goto L55
            r0 = r1
            goto L56
        L55:
            r0 = 4
        L56:
            boolean r2 = r4.y()
            if (r3 == r2) goto L5e
            r2 = r1
            goto L60
        L5e:
            r2 = 8
        L60:
            boolean r4 = r4.u()
            if (r3 == r4) goto L67
            goto L69
        L67:
            r1 = 16
        L69:
            r4 = r5 | r0
            r4 = r4 | r2
            fay r5 = new fay
            r4 = r4 | r1
            r5.<init>(r4)
            return r5
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exx.a(fmx, fcxy):java.lang.Object");
    }

    public static final void b(final flg flgVar, fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        final fdat fdatVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-954926513);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(flgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if (hmlVarC.J((i2 & 19) != 18, i2 & 1)) {
            hmlVarC.v(1647943935);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new dqo(null);
                hmwVar.af(objS);
            }
            final dqo dqoVar = (dqo) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdae() { // from class: exo
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dqp.a(dqoVar);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            fdatVar2 = fdatVar;
            dqa.a(dqoVar, (fdae) objS2, new fdap() { // from class: fli
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    final flg flgVar2 = flgVar;
                    dqj dqjVar = (dqj) obj2;
                    fbe fbeVar = fbe.b;
                    boolean zD = flgVar2.D();
                    fdae fdaeVar = new fdae() { // from class: flj
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            flgVar2.k();
                            return fctx.a;
                        }
                    };
                    dqo dqoVar2 = dqoVar;
                    flq.a(dqjVar, dqoVar2, fbeVar, zD, fdaeVar);
                    fctx fctxVar = fctx.a;
                    flq.a(dqjVar, dqoVar2, fbe.d, !flgVar2.B(), new fdae() { // from class: flk
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            flgVar2.m();
                            return fctx.a;
                        }
                    });
                    fcva.g(fctxVar, fctxVar);
                    return fctxVar;
                }
            }, null, false, null, fdatVar2, hmlVarC, ((i2 << 15) & 3670016) | 54, 56);
            hmwVar.ab();
        } else {
            fdatVar2 = fdatVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: exp
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    flg flgVar2 = flgVar;
                    int i4 = i;
                    exx.b(flgVar2, fdatVar2, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fmx fmxVar, fdat fdatVar, hml hmlVar, final int i) throws Resources.NotFoundException {
        int i2;
        final fdat fdatVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2080741862);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fmxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if (hmlVarC.J((i2 & 19) != 18, i2 & 1)) {
            hmlVarC.v(-1881815793);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new dqo(null);
                hmwVar.af(objS);
            }
            final dqo dqoVar = (dqo) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS2);
            }
            final fdjx fdjxVar = (fdjx) objS2;
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                hpl hplVar = new hpl(new fay(0), hsi.a);
                hmwVar.af(hplVar);
                objS3 = hplVar;
            }
            final hox hoxVar = (hox) objS3;
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                objS4 = new fdae() { // from class: exq
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dqp.a(dqoVar);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            fdae fdaeVar = (fdae) objS4;
            fdap fdapVar = new fdap() { // from class: fnc
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    dqj dqjVar = (dqj) obj2;
                    int i4 = ((fay) hoxVar.a()).a;
                    int i5 = i4 & 4;
                    fbe fbeVar = fbe.a;
                    final fmx fmxVar2 = fmxVar;
                    fdae fdaeVar2 = new fdae() { // from class: fnd
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fmxVar2.D();
                            return fctx.a;
                        }
                    };
                    boolean z = i5 == 4;
                    dqo dqoVar2 = dqoVar;
                    fnn.a(dqjVar, dqoVar2, fbeVar, z, fdaeVar2);
                    fnn.a(dqjVar, dqoVar2, fbe.b, 1 == (i4 & 1), new fdae() { // from class: fne
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fmxVar2.H(false);
                            return fctx.a;
                        }
                    });
                    int i6 = i4 & 2;
                    fnn.a(dqjVar, dqoVar2, fbe.c, i6 == 2, new fdae() { // from class: fnf
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fmxVar2.G();
                            return fctx.a;
                        }
                    });
                    int i7 = i4 & 8;
                    fnn.a(dqjVar, dqoVar2, fbe.d, i7 == 8, new fdae() { // from class: fng
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fmxVar2.m();
                            return fctx.a;
                        }
                    });
                    int i8 = i4 & 16;
                    fnn.a(dqjVar, dqoVar2, fbe.e, i8 == 16, new fdae() { // from class: fnh
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fmxVar2.h();
                            return fctx.a;
                        }
                    });
                    return fctx.a;
                }
            };
            boolean zA = fmxVar.A();
            boolean zF = hmlVarC.F(fdjxVar) | hmlVarC.F(fmxVar);
            Object objS5 = hmwVar.S();
            if (zF || objS5 == obj) {
                objS5 = new fdae() { // from class: exr
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdil.d(fdjxVar, null, fdjz.d, new ext(hoxVar, fmxVar, null), 1);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            fdatVar2 = fdatVar;
            dqa.a(dqoVar, fdaeVar, fdapVar, null, zA, (fdae) objS5, fdatVar2, hmlVarC, ((i2 << 15) & 3670016) | 54, 8);
            hmwVar.ab();
        } else {
            fdatVar2 = fdatVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: exs
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) throws Resources.NotFoundException {
                    ((Integer) obj3).intValue();
                    fmx fmxVar2 = fmxVar;
                    int i4 = i;
                    exx.c(fmxVar2, fdatVar2, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

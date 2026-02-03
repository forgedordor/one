package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fob {
    public static final /* synthetic */ int a = 0;
    private static final koc b = new koc(true, false, 14);

    public static final void a(final boolean z, final fdae fdaeVar, final ics icsVar, long j, dpn dpnVar, koc kocVar, final fdau fdauVar, hml hmlVar, final int i) {
        boolean z2;
        int i2;
        fdau fdauVar2;
        long j2;
        koc kocVar2;
        dpn dpnVar2;
        long j3;
        koc kocVar3;
        final koc kocVar4;
        final dpn dpnVar3;
        hml hmlVarC = hmlVar.c(1275450738);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (true != hmlVarC.E(z2) ? 2 : 4) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 = i2 | 11264;
        }
        int i4 = 196608 | i3;
        if ((1572864 & i) == 0) {
            fdauVar2 = fdauVar;
            i4 |= true != hmlVarC.F(fdauVar2) ? 524288 : 1048576;
        } else {
            fdauVar2 = fdauVar;
        }
        if ((599187 & i4) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
            j3 = j;
            dpnVar3 = dpnVar;
            kocVar4 = kocVar;
        } else {
            int i5 = i4 >> 9;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                dpn dpnVarA = dpc.a(0, hmlVarC, 0, 1);
                j2 = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
                kocVar2 = b;
                dpnVar2 = dpnVarA;
            } else {
                hmlVarC.s();
                j2 = j;
                dpnVar2 = dpnVar;
                kocVar2 = kocVar;
            }
            hmlVarC.l();
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new dfw(false);
                hmwVar.af(objS);
            }
            dfw dfwVar = (dfw) objS;
            dfwVar.d(Boolean.valueOf(z2));
            if (((Boolean) dfwVar.a()).booleanValue() || ((Boolean) dfwVar.b()).booleanValue()) {
                hmlVarC.v(-622276872);
                Object objS2 = hmwVar.S();
                int i6 = i4;
                koc kocVar5 = kocVar2;
                if (objS2 == obj) {
                    hpl hplVar = new hpl(new ikz(ikz.a), hsi.a);
                    hmwVar.af(hplVar);
                    objS2 = hplVar;
                }
                final hox hoxVar = (hox) objS2;
                kio kioVar = (kio) hmlVarC.e(jmh.e);
                Object objS3 = hmwVar.S();
                if (objS3 == obj) {
                    objS3 = new fdat() { // from class: fny
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
                        /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
                        @Override // defpackage.fdat
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object a(java.lang.Object r8, java.lang.Object r9) {
                            /*
                                r7 = this;
                                kjd r8 = (defpackage.kjd) r8
                                kjd r9 = (defpackage.kjd) r9
                                int r0 = r9.b
                                int r1 = r8.d
                                int r2 = defpackage.fob.a
                                r2 = 1065353216(0x3f800000, float:1.0)
                                r3 = 0
                                if (r0 < r1) goto L11
                            Lf:
                                r0 = r3
                                goto L33
                            L11:
                                int r4 = r9.d
                                int r5 = r8.b
                                if (r4 > r5) goto L19
                                r0 = r2
                                goto L33
                            L19:
                                int r6 = r9.b()
                                if (r6 != 0) goto L20
                                goto Lf
                            L20:
                                int r5 = java.lang.Math.max(r5, r0)
                                int r1 = java.lang.Math.min(r1, r4)
                                int r5 = r5 + r1
                                int r5 = r5 / 2
                                int r1 = r9.b()
                                float r1 = (float) r1
                                int r5 = r5 - r0
                                float r0 = (float) r5
                                float r0 = r0 / r1
                            L33:
                                int r1 = r9.c
                                int r4 = r8.e
                                if (r1 < r4) goto L3b
                            L39:
                                r2 = r3
                                goto L5d
                            L3b:
                                int r5 = r9.e
                                int r8 = r8.c
                                if (r5 > r8) goto L42
                                goto L5d
                            L42:
                                int r2 = r9.a()
                                if (r2 != 0) goto L49
                                goto L39
                            L49:
                                int r8 = java.lang.Math.max(r8, r1)
                                int r2 = java.lang.Math.min(r4, r5)
                                int r8 = r8 + r2
                                int r8 = r8 / 2
                                int r9 = r9.a()
                                float r9 = (float) r9
                                int r8 = r8 - r1
                                float r8 = (float) r8
                                float r2 = r8 / r9
                            L5d:
                                hox r8 = r1
                                long r0 = defpackage.ila.a(r0, r2)
                                ikz r9 = new ikz
                                r9.<init>(r0)
                                r8.b(r9)
                                fctx r8 = defpackage.fctx.a
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.fny.a(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    };
                    hmwVar.af(objS3);
                }
                j3 = j2;
                kocVar3 = kocVar5;
                kna.b(new fpp(j2, kioVar, (fdat) objS3), fdaeVar, kocVar3, hxe.d(1788768427, new foa(dfwVar, hoxVar, dpnVar2, icsVar, fdauVar2), hmlVarC), hmlVarC, (i5 & 896) | (i6 & 112) | 3072, 0);
                hmwVar.ab();
            } else {
                hmlVarC.v(-621485008);
                hmwVar.ab();
                j3 = j2;
                kocVar3 = kocVar2;
            }
            kocVar4 = kocVar3;
            dpnVar3 = dpnVar2;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final long j4 = j3;
            hpxVarL.d = new fdat() { // from class: fnz
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    hml hmlVar2 = (hml) obj2;
                    ((Integer) obj3).intValue();
                    boolean z3 = z;
                    fdae fdaeVar2 = fdaeVar;
                    ics icsVar2 = icsVar;
                    long j5 = j4;
                    dpn dpnVar4 = dpnVar3;
                    int i7 = i;
                    fob.a(z3, fdaeVar2, icsVar2, j5, dpnVar4, kocVar4, fdauVar, hmlVar2, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdae fdaeVar, ics icsVar, boolean z, egc egcVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        final egc egcVar2;
        final boolean z2;
        hml hmlVarC = hmlVar.c(670540513);
        if ((i & 6) == 0) {
            i2 = i | (true != hmlVarC.F(fdaeVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i3 = i2 | 28080;
        if ((i & 196608) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            z2 = z;
            egcVar2 = egcVar;
        } else {
            ico icoVar = ics.e;
            egc egcVar3 = fqr.a;
            egc egcVar4 = fqr.a;
            fra.c(fdaeVar, icoVar, egcVar4, fdauVar, hmlVarC, i3 & 524286);
            icsVar2 = icoVar;
            egcVar2 = egcVar4;
            z2 = true;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fnx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fdae fdaeVar2 = fdaeVar;
                    ics icsVar3 = icsVar2;
                    boolean z3 = z2;
                    int i4 = i;
                    fob.b(fdaeVar2, icsVar3, z3, egcVar2, fdauVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

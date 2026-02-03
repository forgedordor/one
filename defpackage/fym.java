package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fym {
    public static final /* synthetic */ int a = 0;

    static {
        new koc(true, false, 14);
    }

    public static final void a(final fdat fdatVar, final fdae fdaeVar, final ics icsVar, final fdat fdatVar2, final boolean z, final gmi gmiVar, final egc egcVar, hml hmlVar, final int i) {
        fdat fdatVar3;
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-532959117);
        if (i3 == 0) {
            fdatVar3 = fdatVar;
            i2 = (true != hmlVarC.F(fdatVar3) ? 2 : 4) | i;
        } else {
            fdatVar3 = fdatVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(gmiVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(egcVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.D(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            gms.b(fdatVar3, fdaeVar, icsVar, fdatVar2, z, gmiVar, egcVar, hmlVar2, i2 & 268435454);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fyk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fdat fdatVar4 = fdatVar;
                    fdae fdaeVar2 = fdaeVar;
                    ics icsVar2 = icsVar;
                    fdat fdatVar5 = fdatVar2;
                    boolean z2 = z;
                    int i4 = i;
                    fym.a(fdatVar4, fdaeVar2, icsVar2, fdatVar5, z2, gmiVar, egcVar, hmlVar3, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final fdae fdaeVar, final ics icsVar, final long j, final dpn dpnVar, final koc kocVar, final ikp ikpVar, final long j2, final float f, final fdau fdauVar, hml hmlVar, final int i, final int i2) {
        int i3;
        fdae fdaeVar2;
        dpn dpnVar2;
        int i4;
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(1725609375);
        if (i5 == 0) {
            i3 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            fdaeVar2 = fdaeVar;
            i3 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.C(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            dpnVar2 = dpnVar;
            i3 |= true != hmlVarC.D(dpnVar2) ? 8192 : 16384;
        } else {
            dpnVar2 = dpnVar;
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.D(kocVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != hmlVarC.D(ikpVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != hmlVarC.C(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.A(0.0f) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != hmlVarC.A(f) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != hmlVarC.D(null) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if (hmlVarC.J(((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true, i3 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
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
            dfwVar.d(Boolean.valueOf(z));
            if (((Boolean) dfwVar.a()).booleanValue() || ((Boolean) dfwVar.b()).booleanValue()) {
                hmlVarC.v(1165904565);
                Object objS2 = hmwVar.S();
                if (objS2 == obj) {
                    hpl hplVar = new hpl(new ikz(ikz.a), hsi.a);
                    hmwVar.af(hplVar);
                    objS2 = hplVar;
                }
                final hox hoxVar = (hox) objS2;
                kio kioVar = (kio) hmlVarC.e(jmh.e);
                int i6 = i3;
                boolean zD = ((i3 & 7168) == 2048) | hmlVarC.D(kioVar);
                Object objS3 = hmwVar.S();
                if (zD || objS3 == obj) {
                    objS3 = new hij(j, kioVar, kioVar.ep(48.0f), new fdat() { // from class: fyi
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
                                int r2 = defpackage.fym.a
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
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.fyi.a(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    });
                    hmwVar.af(objS3);
                }
                kna.b((hij) objS3, fdaeVar2, kocVar, hxe.d(-917492520, new fyl(icsVar, dfwVar, hoxVar, dpnVar2, ikpVar, j2, f, fdauVar), hmlVarC), hmlVarC, (i6 & 112) | 3072 | ((i6 >> 9) & 896), 0);
                hmwVar.ab();
            } else {
                hmlVarC.v(1166963587);
                hmwVar.ab();
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fyj
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    boolean z2 = z;
                    fdae fdaeVar3 = fdaeVar;
                    ics icsVar2 = icsVar;
                    long j3 = j;
                    dpn dpnVar3 = dpnVar;
                    koc kocVar2 = kocVar;
                    ikp ikpVar2 = ikpVar;
                    long j4 = j2;
                    int i7 = i;
                    float f2 = f;
                    int iA = hpy.a(i7 | 1);
                    int iA2 = hpy.a(i2);
                    fym.b(z2, fdaeVar3, icsVar2, j3, dpnVar3, kocVar2, ikpVar2, j4, f2, fdauVar, (hml) obj2, iA, iA2);
                    return fctx.a;
                }
            };
        }
    }
}

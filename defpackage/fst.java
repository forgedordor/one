package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fst {
    public static final hpt a = new hsg(new fdae() { // from class: fsg
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = fst.a;
            return null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:102:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ics r30, defpackage.fsv r31, defpackage.fdat r32, defpackage.fdat r33, defpackage.fdau r34, defpackage.fdat r35, int r36, boolean r37, defpackage.ikp r38, float r39, long r40, long r42, long r44, long r46, long r48, final defpackage.fdau r50, defpackage.hml r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fst.a(ics, fsv, fdat, fdat, fdau, fdat, int, boolean, ikp, float, long, long, long, long, long, fdau, hml, int, int, int):void");
    }

    public static final void b(final ehc ehcVar, ics icsVar, final fsv fsvVar, final fdat fdatVar, final fdat fdatVar2, final fdau fdauVar, final fdat fdatVar3, final int i, final boolean z, final ikp ikpVar, final float f, final long j, final long j2, final long j3, final long j4, final long j5, final fdau fdauVar2, hml hmlVar, final int i2, final int i3) {
        int i4;
        fdat fdatVar4;
        int i5;
        fdau fdauVar3;
        int i6;
        fdat fdatVar5;
        int i7;
        int i8;
        int i9;
        int i10;
        hml hmlVar2;
        final ics icsVar2;
        int i11 = i2 & 6;
        hml hmlVarC = hmlVar.c(50073903);
        if (i11 == 0) {
            i4 = (true != hmlVarC.D(ehcVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != hmlVarC.D(fsvVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            fdatVar4 = fdatVar;
            i4 |= true != hmlVarC.F(fdatVar4) ? 1024 : 2048;
        } else {
            fdatVar4 = fdatVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != hmlVarC.F(fdatVar2) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i5 = 196608;
            fdauVar3 = fdauVar;
            i4 |= true != hmlVarC.F(fdauVar3) ? 65536 : 131072;
        } else {
            i5 = 196608;
            fdauVar3 = fdauVar;
        }
        if ((i2 & 1572864) == 0) {
            i6 = 1572864;
            fdatVar5 = fdatVar3;
            i4 |= true != hmlVarC.F(fdatVar5) ? 524288 : 1048576;
        } else {
            i6 = 1572864;
            fdatVar5 = fdatVar3;
        }
        if ((i2 & 12582912) == 0) {
            i7 = 12582912;
            i8 = i;
            i4 |= true != hmlVarC.B(i8) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            i7 = 12582912;
            i8 = i;
        }
        if ((i2 & 100663296) == 0) {
            i9 = 100663296;
            i4 |= true != hmlVarC.E(false) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            i9 = 100663296;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != hmlVarC.F(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i12 = i4;
        if ((i3 & 6) == 0) {
            i10 = (true != hmlVarC.E(z) ? 2 : 4) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= true != hmlVarC.D(ikpVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i10 |= true != hmlVarC.A(f) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i10 |= true != hmlVarC.C(j) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i10 |= true == hmlVarC.C(j2) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            i10 |= true == hmlVarC.C(j3) ? 131072 : 65536;
        }
        if ((i3 & i6) == 0) {
            i10 |= true != hmlVarC.C(j4) ? 524288 : 1048576;
        }
        if ((i3 & i7) == 0) {
            i10 |= true != hmlVarC.C(j5) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i3 & i9) == 0) {
            i10 |= true != hmlVarC.F(fdauVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i12 & 306783379) == 306783378 && (38347923 & i10) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            int i13 = i12 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i13 == 4 || objS == hmk.a) {
                objS = new frd(ehcVar);
                hmwVar.af(objS);
            }
            hmlVar2 = hmlVarC;
            hwv hwvVarD = hxe.d(-1236753028, new fsp((frd) objS, ehcVar, j4, j5, i8, fdatVar4, fdauVar2, fdatVar5, fdatVar2, fdauVar3, fsvVar), hmlVar2);
            hmlVar2.v(1400747316);
            icsVar2 = icsVar;
            hwvVarD.a(icsVar2, hmlVar2, Integer.valueOf(((i12 >> 3) & 14) | 48));
            hmwVar.ab();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fsh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ehc ehcVar2 = ehcVar;
                    ics icsVar3 = icsVar2;
                    fsv fsvVar2 = fsvVar;
                    fdat fdatVar6 = fdatVar;
                    fdat fdatVar7 = fdatVar2;
                    fdau fdauVar4 = fdauVar;
                    fdat fdatVar8 = fdatVar3;
                    int i14 = i;
                    boolean z2 = z;
                    ikp ikpVar2 = ikpVar;
                    float f2 = f;
                    long j6 = j;
                    long j7 = j2;
                    long j8 = j3;
                    long j9 = j4;
                    int i15 = i2;
                    long j10 = j5;
                    int iA = hpy.a(i15 | 1);
                    int iA2 = hpy.a(i3);
                    fst.b(ehcVar2, icsVar3, fsvVar2, fdatVar6, fdatVar7, fdauVar4, fdatVar8, i14, z2, ikpVar2, f2, j6, j7, j8, j9, j10, fdauVar2, (hml) obj, iA, iA2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final int i, final fdat fdatVar, final fdau fdauVar, final fdat fdatVar2, final fdat fdatVar3, final ehc ehcVar, final fdat fdatVar4, hml hmlVar, final int i2) {
        int i3;
        fdau fdauVar2;
        final fdat fdatVar5;
        fdat fdatVar6;
        ehc ehcVar2;
        hml hmlVarC = hmlVar.c(675142332);
        if ((i2 & 6) == 0) {
            i3 = (true != hmlVarC.E(false) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            fdauVar2 = fdauVar;
            i3 |= true != hmlVarC.F(fdauVar2) ? 1024 : 2048;
        } else {
            fdauVar2 = fdauVar;
        }
        if ((i2 & 24576) == 0) {
            fdatVar5 = fdatVar2;
            i3 |= true != hmlVarC.F(fdatVar5) ? 8192 : 16384;
        } else {
            fdatVar5 = fdatVar2;
        }
        if ((196608 & i2) == 0) {
            fdatVar6 = fdatVar3;
            i3 |= true != hmlVarC.F(fdatVar6) ? 65536 : 131072;
        } else {
            fdatVar6 = fdatVar3;
        }
        if ((1572864 & i2) == 0) {
            ehcVar2 = ehcVar;
            i3 |= true != hmlVarC.D(ehcVar2) ? 524288 : 1048576;
        } else {
            ehcVar2 = ehcVar;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != hmlVarC.F(fdatVar4) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793491 & i3) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fss();
                hmwVar.af(objS);
            }
            boolean z = (i3 & 896) == 256;
            boolean z2 = (57344 & i3) == 16384;
            boolean z3 = (3670016 & i3) == 1048576;
            boolean z4 = (458752 & i3) == 131072;
            boolean z5 = (i3 & 112) == 32;
            boolean z6 = (i3 & 14) == 4;
            boolean z7 = (29360128 & i3) == 8388608;
            boolean z8 = (i3 & 7168) == 2048;
            final fss fssVar = (fss) objS;
            Object objS2 = hmwVar.S();
            if ((z8 | z7 | z | z2 | z3 | z4 | z5 | z6) || objS2 == obj) {
                final fdau fdauVar3 = fdauVar2;
                final fdat fdatVar7 = fdatVar6;
                final ehc ehcVar3 = ehcVar2;
                fdat fdatVar8 = new fdat() { // from class: fsi
                    /* JADX WARN: Removed duplicated region for block: B:107:0x0233  */
                    @Override // defpackage.fdat
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object a(java.lang.Object r25, java.lang.Object r26) {
                        /*
                            Method dump skipped, instructions count: 923
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsi.a(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                hmwVar.af(fdatVar8);
                objS2 = fdatVar8;
            }
            izg.a(null, (fdat) objS2, hmlVarC, 0, 1);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fsj
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    hml hmlVar2 = (hml) obj2;
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    fdat fdatVar9 = fdatVar;
                    fdau fdauVar4 = fdauVar;
                    fdat fdatVar10 = fdatVar2;
                    fdat fdatVar11 = fdatVar3;
                    int i5 = i2;
                    fst.c(i4, fdatVar9, fdauVar4, fdatVar10, fdatVar11, ehcVar, fdatVar4, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final fsv d(ftn ftnVar, hml hmlVar, int i) {
        hml hmlVar2;
        if ((i & 1) != 0) {
            final fpo fpoVar = fpo.a;
            int i2 = fpj.a;
            hmw hmwVar = (hmw) hmlVar;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: fph
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        int i3 = fpj.a;
                        return true;
                    }
                };
                hmwVar.af(objS);
            }
            final fdap fdapVar = (fdap) objS;
            Object[] objArr = new Object[0];
            hyu hyuVar = new hyu(new fdat() { // from class: fpl
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    return (fpo) ((fpn) obj3).a.b();
                }
            }, new fdap() { // from class: fpm
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    return new fpn((fpo) obj2);
                }
            });
            boolean zD = hmlVar.D(fdapVar);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj) {
                objS2 = new fdae() { // from class: fpi
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        int i3 = fpj.a;
                        return new fpn(fpoVar);
                    }
                };
                hmwVar.af(objS2);
            }
            hmlVar2 = hmlVar;
        } else {
            hmlVar2 = hmlVar;
        }
        if ((i & 2) != 0) {
            hmw hmwVar2 = (hmw) hmlVar2;
            Object objS3 = hmwVar2.S();
            if (objS3 == hmk.a) {
                objS3 = new ftn();
                hmwVar2.af(objS3);
            }
            ftnVar = (ftn) objS3;
        }
        hmw hmwVar3 = (hmw) hmlVar2;
        Object objS4 = hmwVar3.S();
        if (objS4 == hmk.a) {
            objS4 = new fsv(ftnVar);
            hmwVar3.af(objS4);
        }
        return (fsv) objS4;
    }
}

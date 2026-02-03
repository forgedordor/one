package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grq {
    public static final void a(final int i, final fdat fdatVar, final fdau fdauVar, final fdat fdatVar2, final fdat fdatVar3, final ehc ehcVar, final fdat fdatVar4, hml hmlVar, final int i2) {
        final int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2 & 6;
        hml hmlVarC = hmlVar.c(-280287501);
        if (i7 == 0) {
            i3 = i;
            i4 = (true != hmlVarC.B(i3) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != hmlVarC.F(fdauVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != hmlVarC.F(fdatVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != hmlVarC.F(fdatVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != hmlVarC.D(ehcVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != hmlVarC.F(fdatVar4) ? 524288 : 1048576;
        }
        if (hmlVarC.J((599187 & i4) != 599186, i4 & 1)) {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new grm();
                hmwVar.af(objS);
            }
            int i8 = i4 & 112;
            final grm grmVar = (grm) objS;
            Object objS2 = hmwVar.S();
            if (i8 == 32 || objS2 == obj) {
                hxd hxdVar = new hxd(605195056, true, new grp(fdatVar));
                hmwVar.af(hxdVar);
                objS2 = hxdVar;
            }
            int i9 = i4 & 7168;
            final fdat fdatVar5 = (fdat) objS2;
            Object objS3 = hmwVar.S();
            if (i9 == 2048 || objS3 == obj) {
                objS3 = new hxd(418899191, true, new gro(fdatVar2));
                hmwVar.af(objS3);
            }
            int i10 = 57344 & i4;
            final fdat fdatVar6 = (fdat) objS3;
            Object objS4 = hmwVar.S();
            if (i10 == 16384 || objS4 == obj) {
                objS4 = new hxd(338600263, true, new grn(fdatVar3));
                hmwVar.af(objS4);
            }
            int i11 = i4 & 896;
            final fdat fdatVar7 = (fdat) objS4;
            Object objS5 = hmwVar.S();
            if (i11 == 256 || objS5 == obj) {
                i5 = i4;
                objS5 = new hxd(-1776388365, true, new grk(fdauVar, grmVar));
                hmwVar.af(objS5);
            } else {
                i5 = i4;
            }
            int i12 = i5 & 3670016;
            final fdat fdatVar8 = (fdat) objS5;
            Object objS6 = hmwVar.S();
            if (i12 == 1048576 || objS6 == obj) {
                objS6 = new hxd(-1731662488, true, new grl(fdatVar4));
                hmwVar.af(objS6);
            }
            final fdat fdatVar9 = (fdat) objS6;
            boolean zD = ((i5 & 458752) == 131072) | hmlVarC.D(fdatVar5) | hmlVarC.D(fdatVar6) | hmlVarC.D(fdatVar7) | ((i5 & 14) == 4) | hmlVarC.D(fdatVar9) | hmlVarC.D(fdatVar8);
            Object objS7 = hmwVar.S();
            if (zD || objS7 == obj) {
                i6 = 0;
                fdat fdatVar10 = new fdat() { // from class: grg
                    /* JADX WARN: Removed duplicated region for block: B:10:0x008d  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
                    @Override // defpackage.fdat
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object a(java.lang.Object r19, java.lang.Object r20) {
                        /*
                            Method dump skipped, instructions count: 428
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.grg.a(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                hmwVar.af(fdatVar10);
                objS7 = fdatVar10;
            } else {
                i6 = 0;
            }
            izg.a(null, (fdat) objS7, hmlVarC, i6, 1);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: grh
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i13 = i;
                    fdat fdatVar11 = fdatVar;
                    fdau fdauVar2 = fdauVar;
                    fdat fdatVar12 = fdatVar2;
                    fdat fdatVar13 = fdatVar3;
                    ehc ehcVar2 = ehcVar;
                    grq.a(i13, fdatVar11, fdauVar2, fdatVar12, fdatVar13, ehcVar2, fdatVar4, (hml) obj2, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final fdat fdatVar, final fdat fdatVar2, final fdat fdatVar3, final fdat fdatVar4, final int i, final long j, final long j2, final ehc ehcVar, final fdau fdauVar, hml hmlVar, final int i2) {
        int i3;
        fdat fdatVar5;
        fdat fdatVar6;
        long j3;
        fdau fdauVar2;
        int i4;
        hml hmlVar2;
        int i5 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1211482744);
        if (i5 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            fdatVar5 = fdatVar3;
            i3 |= true != hmlVarC.F(fdatVar5) ? 1024 : 2048;
        } else {
            fdatVar5 = fdatVar3;
        }
        if ((i2 & 24576) == 0) {
            fdatVar6 = fdatVar4;
            i3 |= true != hmlVarC.F(fdatVar6) ? 8192 : 16384;
        } else {
            fdatVar6 = fdatVar4;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.B(i) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            j3 = j;
            i3 |= true != hmlVarC.C(j3) ? 524288 : 1048576;
        } else {
            j3 = j;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != hmlVarC.C(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= true != hmlVarC.D(ehcVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : 67108864;
        }
        if ((805306368 & i2) == 0) {
            fdauVar2 = fdauVar;
            i4 = 100663296;
            i3 |= true != hmlVarC.F(fdauVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            fdauVar2 = fdauVar;
            i4 = 100663296;
        }
        if (hmlVarC.J((306783379 & i3) != 306783378, i3 & 1)) {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            int i6 = (234881024 & i3) ^ i4;
            boolean z = (i6 > 67108864 && hmlVarC.D(ehcVar)) || (i3 & i4) == 67108864;
            hmw hmwVar = (hmw) hmlVarC;
            int i7 = i3;
            Object objS = hmwVar.S();
            if (z || objS == hmk.a) {
                objS = new hjm(ehcVar);
                hmwVar.af(objS);
            }
            final hjm hjmVar = (hjm) objS;
            boolean zD = ((i6 > 67108864 && hmlVarC.D(ehcVar)) || (i7 & i4) == 67108864) | hmlVarC.D(hjmVar);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: gre
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        hjmVar.a.b(new eeb(ehcVar, (ehc) obj));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmlVar2 = hmlVarC;
            gvk.c(ehm.a(icsVar, (fdap) objS2), null, j3, j2, 0.0f, 0.0f, null, hxe.d(848889571, new grj(i, fdatVar, fdauVar2, fdatVar5, fdatVar6, hjmVar, fdatVar2), hmlVarC), hmlVar2, 114);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: grf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    fdat fdatVar7 = fdatVar;
                    fdat fdatVar8 = fdatVar2;
                    fdat fdatVar9 = fdatVar3;
                    fdat fdatVar10 = fdatVar4;
                    int i8 = i;
                    long j4 = j;
                    long j5 = j2;
                    ehc ehcVar2 = ehcVar;
                    grq.b(icsVar2, fdatVar7, fdatVar8, fdatVar9, fdatVar10, i8, j4, j5, ehcVar2, fdauVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

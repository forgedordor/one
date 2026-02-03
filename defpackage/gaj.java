package defpackage;

import androidx.compose.foundation.layout.SizeElement;
import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaj {
    public static final ics a(ics icsVar, final gsp gspVar) {
        return ijn.a(icsVar, new fdap() { // from class: fzf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ikl iklVar = (ikl) obj;
                gsp gspVar2 = gspVar;
                float fB = gspVar2.d.b();
                float fA = gspVar2.d.p().a();
                float f = fB < fA ? fA - fB : 0.0f;
                iklVar.y(f > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (iklVar.r & 4294967295L)) + f) / Float.intBitsToFloat((int) (iklVar.r & 4294967295L))) : 1.0f);
                iklVar.C(ila.a(0.5f, 0.0f));
                return fctx.a;
            }
        });
    }

    public static final ics b(ics icsVar, final gsp gspVar) {
        return ijn.a(icsVar, new fdap() { // from class: fzk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ikl iklVar = (ikl) obj;
                gsp gspVar2 = gspVar;
                float fB = gspVar2.d.b();
                float fA = gspVar2.d.p().a();
                float f = fB < fA ? fA - fB : 0.0f;
                iklVar.y(f > 0.0f ? (Float.intBitsToFloat((int) (iklVar.r & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & iklVar.r)) : 1.0f);
                iklVar.C(ila.a(0.5f, 0.0f));
                return fctx.a;
            }
        });
    }

    public static final void c(final fdat fdatVar, final fdat fdatVar2, final fdat fdatVar3, final fdat fdatVar4, final fdae fdaeVar, final gsp gspVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1217723575);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar4) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(gspVar) ? 65536 : 131072;
        }
        if (hmlVarC.J((74899 & i2) != 74898, i2 & 1)) {
            fdat[] fdatVarArr = new fdat[4];
            fdatVarArr[0] = fdatVar == null ? gdf.a : fdatVar;
            fdatVarArr[1] = fdatVar2;
            fdatVarArr[2] = fdatVar3;
            fdatVarArr[3] = fdatVar4;
            List listG = fcva.g(fdatVarArr);
            boolean z = (458752 & i2) == 131072;
            boolean z2 = (i2 & 57344) == 16384;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | z2) || objS == hmk.a) {
                objS = new fzv(gspVar, fdaeVar);
                hmwVar.af(objS);
            }
            ixu ixuVar = (ixu) objS;
            ico icoVar = ics.e;
            fdat fdatVarA = iwh.a(listG);
            boolean zD = hmlVarC.D(ixuVar);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new ixv(ixuVar);
                hmwVar.af(objS2);
            }
            ixm ixmVar = (ixm) objS2;
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVar, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar5 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar5);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVarA.a(hmlVarC, 0);
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fzo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdat fdatVar6 = fdatVar;
                    fdat fdatVar7 = fdatVar2;
                    fdat fdatVar8 = fdatVar3;
                    fdat fdatVar9 = fdatVar4;
                    fdae fdaeVar3 = fdaeVar;
                    gaj.c(fdatVar6, fdatVar7, fdatVar8, fdatVar9, fdaeVar3, gspVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final gsp gspVar, final float f, final float f2, final boolean z, final ikp ikpVar, final long j, final long j2, final float f3, final float f4, final fdat fdatVar, final fdau fdauVar, hml hmlVar, final int i, final int i2) {
        int i3;
        float f5;
        int i4;
        int i5;
        hml hmlVar2;
        fdjx fdjxVar;
        ics icsVarA;
        int i6 = i & 6;
        hml hmlVarC = hmlVar.c(-2108849428);
        if (i6 == 0) {
            i3 = (true != hmlVarC.D(gspVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.A(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.D(ikpVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.C(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != hmlVarC.C(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            f5 = f3;
            i3 |= true != hmlVarC.A(f5) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            f5 = f3;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.A(f4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i3;
            i5 = i2 | (true != hmlVarC.F(fdauVar) ? 2 : 4);
        } else {
            i4 = i3;
            i5 = i2;
        }
        if (hmlVarC.J(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            final dew dewVarB = gpg.b(1, hmlVarC);
            final dew dewVarB2 = gpg.b(1, hmlVarC);
            final dew dewVarB3 = gpg.b(5, hmlVarC);
            boolean z2 = (i4 & 14) == 4;
            boolean zF = z2 | hmlVarC.F(dewVarB2) | hmlVarC.F(dewVarB3) | hmlVarC.F(dewVarB);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: fzg
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        gsp gspVar2 = gspVar;
                        gspVar2.e = dewVarB2;
                        gspVar2.f = dewVarB3;
                        gspVar2.c = dewVarB;
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hob.i((fdae) objS, hmlVarC);
            Object objS2 = hmwVar.S();
            Object obj = hmk.a;
            if (objS2 == obj) {
                objS2 = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS2);
            }
            final fdjx fdjxVar2 = (fdjx) objS2;
            dwm dwmVar = dwm.a;
            final float fEn = ((kio) hmlVarC.e(jmh.e)).en(f);
            if (z) {
                hmlVarC.v(2049455587);
                ico icoVar = ics.e;
                boolean zD = hmlVarC.D(gspVar.d);
                Object objS3 = hmwVar.S();
                if (zD || objS3 == obj) {
                    fdap fdapVar = new fdap() { // from class: fzh
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            fdil.d(fdjxVar2, null, null, new gai(gspVar, ((Float) obj2).floatValue(), null), 3);
                            return fctx.a;
                        }
                    };
                    ddz ddzVar = gsi.a;
                    fdjxVar = fdjxVar2;
                    gsh gshVar = new gsh(gspVar, fdapVar, dwmVar);
                    hmwVar.af(gshVar);
                    objS3 = gshVar;
                } else {
                    fdjxVar = fdjxVar2;
                }
                icsVarA = iqu.a(icoVar, (iqp) objS3, null);
                hmwVar.ab();
            } else {
                fdjxVar = fdjxVar2;
                hmlVarC.v(2049849814);
                hmwVar.ab();
                icsVarA = ics.e;
            }
            ics icsVarA2 = egq.d(egq.x(ics.e, 0.0f, f2, 1), 1.0f).a(new SizeElement(0.0f, 1 == (2 & 1) ? Float.NaN : f, 0.0f, (2 & 2) != 0 ? Float.NaN : 0.0f, false, 5)).a(icsVarA);
            hgn hgnVar = gspVar.d;
            boolean zA = z2 | hmlVarC.A(fEn);
            Object objS4 = hmwVar.S();
            if (zA || objS4 == obj) {
                objS4 = new fdat() { // from class: fzi
                    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[PHI: r0
                      0x007a: PHI (r0v7 gsq) = (r0v6 gsq), (r0v9 gsq), (r0v10 gsq), (r0v11 gsq), (r0v12 gsq), (r0v13 gsq), (r0v14 gsq) binds: [B:29:0x0078, B:20:0x005d, B:23:0x0066, B:26:0x006f, B:9:0x003c, B:12:0x0045, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // defpackage.fdat
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object a(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            r4 = this;
                            kjg r5 = (defpackage.kjg) r5
                            kil r6 = (defpackage.kil) r6
                            long r0 = r6.a
                            int r6 = defpackage.kil.a(r0)
                            long r0 = r5.a
                            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                            long r0 = r0 & r2
                            fzn r5 = new fzn
                            gsp r2 = r1
                            float r6 = (float) r6
                            float r3 = r2
                            int r0 = (int) r0
                            float r0 = (float) r0
                            r5.<init>()
                            hjj r5 = defpackage.hfw.d(r5)
                            hgn r6 = r2.d
                            java.lang.Object r6 = r6.j()
                            gsq r6 = (defpackage.gsq) r6
                            int r0 = r6.ordinal()
                            if (r0 == 0) goto L72
                            r1 = 1
                            if (r0 == r1) goto L57
                            r1 = 2
                            if (r0 != r1) goto L51
                            gsq r0 = defpackage.gsq.c
                            boolean r1 = r5.e(r0)
                            if (r1 == 0) goto L3f
                            goto L7a
                        L3f:
                            gsq r0 = defpackage.gsq.b
                            boolean r1 = r5.e(r0)
                            if (r1 == 0) goto L48
                            goto L7a
                        L48:
                            gsq r0 = defpackage.gsq.a
                            boolean r1 = r5.e(r0)
                            if (r1 == 0) goto L7b
                            goto L7a
                        L51:
                            fctg r5 = new fctg
                            r5.<init>()
                            throw r5
                        L57:
                            gsq r0 = defpackage.gsq.b
                            boolean r1 = r5.e(r0)
                            if (r1 == 0) goto L60
                            goto L7a
                        L60:
                            gsq r0 = defpackage.gsq.c
                            boolean r1 = r5.e(r0)
                            if (r1 == 0) goto L69
                            goto L7a
                        L69:
                            gsq r0 = defpackage.gsq.a
                            boolean r1 = r5.e(r0)
                            if (r1 == 0) goto L7b
                            goto L7a
                        L72:
                            gsq r0 = defpackage.gsq.a
                            boolean r1 = r5.e(r0)
                            if (r1 == 0) goto L7b
                        L7a:
                            r6 = r0
                        L7b:
                            fcti r0 = new fcti
                            r0.<init>(r5, r6)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzi.a(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                hmwVar.af(objS4);
            }
            ics icsVarA3 = hfw.a(icsVarA2, hgnVar, dwmVar, (fdat) objS4);
            hgn hgnVar2 = gspVar.d;
            hmlVar2 = hmlVarC;
            gvk.c(b(dvc.a(icsVarA3, hgnVar2.d, dwmVar, z, null, hgnVar2.o(), new hfo(hgnVar2, null), false, 32), gspVar), ikpVar, j, j2, f5, f4, null, hxe.d(1508311921, new gah(gspVar, fdatVar, fdjxVar, z, fdauVar), hmlVarC), hmlVar2, 64);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fzj
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    gsp gspVar2 = gspVar;
                    float f6 = f;
                    float f7 = f2;
                    boolean z3 = z;
                    ikp ikpVar2 = ikpVar;
                    long j3 = j;
                    long j4 = j2;
                    float f8 = f3;
                    float f9 = f4;
                    fdat fdatVar2 = fdatVar;
                    int i7 = i;
                    gaj.d(gspVar2, f6, f7, z3, ikpVar2, j3, j4, f8, f9, fdatVar2, fdauVar, (hml) obj2, hpy.a(i7 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final fdau fdauVar, final ics icsVar, final gak gakVar, final float f, float f2, final ikp ikpVar, final long j, final long j2, final float f3, final float f4, final fdat fdatVar, final boolean z, final fdat fdatVar2, final fdau fdauVar2, final long j3, final long j4, final fdau fdauVar3, hml hmlVar, final int i, final int i2) {
        int i3;
        ics icsVar2;
        gak gakVar2;
        int i4;
        ikp ikpVar2;
        int i5;
        int i6;
        fdat fdatVar3;
        int i7;
        boolean z2;
        fdau fdauVar4;
        int i8;
        boolean z3;
        final float f5;
        float f6;
        hml hmlVarC = hmlVar.c(920075480);
        if ((i & 6) == 0) {
            i3 = (true != hmlVarC.F(fdauVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            icsVar2 = icsVar;
            i3 |= true != hmlVarC.D(icsVar2) ? 16 : 32;
        } else {
            icsVar2 = icsVar;
        }
        if ((i & 384) == 0) {
            gakVar2 = gakVar;
            i3 |= true != hmlVarC.D(gakVar2) ? 128 : 256;
        } else {
            gakVar2 = gakVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        int i9 = i3 | 24576;
        if ((i & 196608) == 0) {
            i4 = 196608;
            ikpVar2 = ikpVar;
            i9 |= true != hmlVarC.D(ikpVar2) ? 65536 : 131072;
        } else {
            i4 = 196608;
            ikpVar2 = ikpVar;
        }
        if ((i & 1572864) == 0) {
            i9 |= true != hmlVarC.C(j) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i9 |= true != hmlVarC.C(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i & 100663296) == 0) {
            i9 |= true != hmlVarC.A(f3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i & 805306368) == 0) {
            i9 |= true != hmlVarC.A(f4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != hmlVarC.F(fdatVar) ? 2 : 4);
        } else {
            i5 = i2;
        }
        int i10 = i5;
        if ((i2 & 48) == 0) {
            i6 = i10 | (true != hmlVarC.E(z) ? 16 : 32);
        } else {
            i6 = i10;
        }
        if ((i2 & 384) == 0) {
            fdatVar3 = fdatVar2;
            int i11 = i6;
            z2 = true;
            i7 = i11 | (true == hmlVarC.F(fdatVar3) ? 256 : 128);
        } else {
            fdatVar3 = fdatVar2;
            i7 = i6;
            z2 = true;
        }
        if ((i2 & 3072) == 0) {
            i7 |= z2 == hmlVarC.F(fdauVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= z2 != hmlVarC.C(j3) ? 8192 : 16384;
        }
        if ((i2 & i4) == 0) {
            i7 |= z2 == hmlVarC.C(j4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            fdauVar4 = fdauVar3;
            i7 |= z2 == hmlVarC.F(fdauVar4) ? 1048576 : 524288;
        } else {
            fdauVar4 = fdauVar3;
        }
        if ((306783379 & i9) == 306783378 && (i7 & 599187) == 599186) {
            z3 = false;
            i8 = 1;
        } else {
            i8 = 1;
            z3 = true;
        }
        if (hmlVarC.J(z3, i8 & i9)) {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                f6 = 640.0f;
            } else {
                hmlVarC.s();
                f6 = f2;
            }
            hmlVarC.l();
            ics icsVarA = dkl.a(egq.c(icsVar2, 1.0f), j3, ikj.a);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar4 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar4);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hnj.a(gea.a.c(new ije(j4)), hxe.d(999829022, new fzt(gakVar2, fdatVar3, fdauVar4, f, f6, z, ikpVar2, j, j2, f3, f4, fdatVar, fdauVar, fdauVar2), hmlVarC), hmlVarC, 56);
            hmlVarC.n();
            f5 = f6;
        } else {
            hmlVarC.s();
            f5 = f2;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fzm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdau fdauVar5 = fdauVar;
                    ics icsVar3 = icsVar;
                    gak gakVar3 = gakVar;
                    float f7 = f;
                    float f8 = f5;
                    ikp ikpVar3 = ikpVar;
                    long j5 = j;
                    long j6 = j2;
                    float f9 = f3;
                    float f10 = f4;
                    fdat fdatVar5 = fdatVar;
                    boolean z4 = z;
                    fdat fdatVar6 = fdatVar2;
                    fdau fdauVar6 = fdauVar2;
                    long j7 = j3;
                    long j8 = j4;
                    int i12 = i;
                    gaj.e(fdauVar5, icsVar3, gakVar3, f7, f8, ikpVar3, j5, j6, f9, f10, fdatVar5, z4, fdatVar6, fdauVar6, j7, j8, fdauVar3, (hml) obj, hpy.a(i12 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}

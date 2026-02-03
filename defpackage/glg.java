package defpackage;

import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glg {
    public static final float a(int i) {
        return gln.a(i, 3) ? 12.0f : 8.0f;
    }

    public static final int b(ivu ivuVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        return fddu.g(Math.max(Math.max(kil.c(j), ivuVar.ep(gln.a(i6, 1) ? 56.0f : gln.a(i6, 2) ? 72.0f : 88.0f)), i7 + Math.max(i, Math.max(i3 + i4 + i5, i2))), kil.a(j));
    }

    public static final void c(final fdat fdatVar, final fdat fdatVar2, final fdat fdatVar3, final fdat fdatVar4, final fdat fdatVar5, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-61277522);
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
            i2 |= true != hmlVarC.F(fdatVar5) ? 8192 : 16384;
        }
        if (hmlVarC.J((i2 & 9363) != 9362, i2 & 1)) {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new gll();
                hmwVar.af(objS);
            }
            gll gllVar = (gll) objS;
            fdat[] fdatVarArr = new fdat[5];
            fdatVarArr[0] = fdatVar3;
            fdatVarArr[1] = fdatVar4 == null ? gdp.a : fdatVar4;
            fdatVarArr[2] = fdatVar5 == null ? gdp.b : fdatVar5;
            fdatVarArr[3] = fdatVar == null ? gdp.c : fdatVar;
            fdatVarArr[4] = fdatVar2 == null ? gdp.d : fdatVar2;
            List listG = fcva.g(fdatVarArr);
            ico icoVar = ics.e;
            fdat fdatVarA = iwh.a(listG);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new ixv(gllVar);
                hmwVar.af(objS2);
            }
            ixm ixmVar = (ixm) objS2;
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVar, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar6 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar6);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVarA.a(hmlVarC, 0);
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gkw
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    fdat fdatVar7 = fdatVar;
                    fdat fdatVar8 = fdatVar2;
                    fdat fdatVar9 = fdatVar3;
                    fdat fdatVar10 = fdatVar4;
                    glg.c(fdatVar7, fdatVar8, fdatVar9, fdatVar10, fdatVar5, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean d(kio kioVar, int i) {
        return i > kioVar.eo(kjm.c(30));
    }

    public static final int e(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        if (kil.i(j)) {
            return kil.b(j);
        }
        return i6 + i + Math.max(i3, Math.max(i4, i5)) + i2;
    }

    public static final void f(long j, final int i, fdat fdatVar, hml hmlVar, final int i2) {
        int i3;
        long j2;
        final fdat fdatVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-285397024);
        if (i4 == 0) {
            i3 = (true != hmlVarC.C(j) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            j2 = j;
            hjt.a(j2, hct.a(i, hmlVarC), fdatVar, hmlVarC, i3 & 910);
            fdatVar2 = fdatVar;
        } else {
            j2 = j;
            fdatVar2 = fdatVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final long j3 = j2;
            hpxVarL.d = new fdat() { // from class: gkz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j4 = j3;
                    int i5 = i;
                    glg.f(j4, i5, fdatVar2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final fdat fdatVar, final ics icsVar, final fdat fdatVar2, final fdat fdatVar3, final fdat fdatVar4, final fdat fdatVar5, final gku gkuVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        hwv hwvVar;
        hwv hwvVar2;
        hwv hwvVar3;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(487133126);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdatVar4) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar5) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(gkuVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.A(0.0f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.A(0.0f) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hwv hwvVarD = hxe.d(629852750, new glb(gkuVar, fdatVar), hmlVarC);
            hwv hwvVarD2 = null;
            if (fdatVar3 == null) {
                hmlVarC.v(-510714893);
                ((hmw) hmlVarC).ab();
                hwvVar = null;
            } else {
                hmlVarC.v(-510714892);
                hwv hwvVarD3 = hxe.d(-1291211644, new gle(gkuVar, fdatVar3), hmlVarC);
                ((hmw) hmlVarC).ab();
                hwvVar = hwvVarD3;
            }
            if (fdatVar2 == null) {
                hmlVarC.v(-510397701);
                ((hmw) hmlVarC).ab();
                hwvVar2 = null;
            } else {
                hmlVarC.v(-510397700);
                hwv hwvVarD4 = hxe.d(372414991, new gld(gkuVar, fdatVar2), hmlVarC);
                ((hmw) hmlVarC).ab();
                hwvVar2 = hwvVarD4;
            }
            if (fdatVar4 == null) {
                hmlVarC.v(-510086895);
                ((hmw) hmlVarC).ab();
                hwvVar3 = null;
            } else {
                hmlVarC.v(-510086894);
                hwv hwvVarD5 = hxe.d(449548451, new glc(gkuVar, fdatVar4), hmlVarC);
                ((hmw) hmlVarC).ab();
                hwvVar3 = hwvVarD5;
            }
            if (fdatVar5 == null) {
                hmlVarC.v(-509670658);
            } else {
                hmlVarC.v(-509670657);
                hwvVarD2 = hxe.d(1946411067, new glf(gkuVar, fdatVar5), hmlVarC);
            }
            ((hmw) hmlVarC).ab();
            hwv hwvVar4 = hwvVarD2;
            ico icoVar = ics.e;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: gkx
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmlVar2 = hmlVarC;
            gvk.c(jsh.c(icoVar, true, (fdap) objS).a(icsVar), gsc.e(14, hmlVarC), gkuVar.a, gkuVar.b, 0.0f, 0.0f, null, hxe.d(1192488737, new gla(hwvVar3, hwvVar4, hwvVarD, hwvVar2, hwvVar), hmlVarC), hmlVar2, 64);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gky
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdat fdatVar6 = fdatVar;
                    ics icsVar2 = icsVar;
                    fdat fdatVar7 = fdatVar2;
                    fdat fdatVar8 = fdatVar3;
                    fdat fdatVar9 = fdatVar4;
                    fdat fdatVar10 = fdatVar5;
                    glg.h(fdatVar6, icsVar2, fdatVar7, fdatVar8, fdatVar9, fdatVar10, gkuVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghx {
    public static final egc a = efy.h(0.0f, 0.0f, 12.0f, 12.0f, 3);
    public static final float b;

    static {
        efy.h(24.0f, 16.0f, 12.0f, 0.0f, 8);
        efy.h(24.0f, 0.0f, 12.0f, 12.0f, 2);
        b = 16.0f;
    }

    public static final void a(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void b(final ics icsVar, final int i, final fdap fdapVar, final geq geqVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1461252485);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(fdapVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.D(geqVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i3 & 1171) != 1170, i3 & 1)) {
            hnj.a(gea.a.c(new ije(geqVar.c)), hxe.d(-1734512197, new ghd(i, fdapVar, icsVar), hmlVarC), hmlVarC, 56);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gfv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i5 = i;
                    int i6 = i2;
                    ghx.b(icsVar2, i5, fdapVar, geqVar, hmlVar2, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(ics icsVar, final boolean z, final boolean z2, final boolean z3, final String str, final fdae fdaeVar, final fdae fdaeVar2, final fdae fdaeVar3, final geq geqVar, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-773929258);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(str) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.D(geqVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            ics icsVarG = egq.g(egq.d(icsVar2, 1.0f), 56.0f);
            ixm ixmVarA = egk.a(z3 ? ecr.a : ecr.g, ibw.n, hmlVarC, 48);
            int iA = hmg.a(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            int i4 = i2;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarG);
            fdae fdaeVar4 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar4);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            n(fdaeVar3, z3, null, hxe.d(619076006, new ghm(str, geqVar), hmlVarC), hmlVarC, ((i4 >> 21) & 14) | 3072 | ((i4 >> 6) & 112));
            if (z3) {
                hmlVarC.v(282426128);
                hmwVar.ab();
            } else {
                hmlVarC.v(281623693);
                hnj.a(gea.a.c(new ije(geqVar.f)), hxe.d(-128317193, new ghn(fdaeVar2, z2, fdaeVar, z), hmlVarC), hmlVarC, 56);
                hmwVar.ab();
            }
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final ics icsVar3 = icsVar2;
            hpxVarL.d = new fdat() { // from class: gfo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar4 = icsVar3;
                    boolean z4 = z;
                    boolean z5 = z2;
                    boolean z6 = z3;
                    String str2 = str;
                    fdae fdaeVar5 = fdaeVar;
                    fdae fdaeVar6 = fdaeVar2;
                    int i5 = i;
                    ghx.c(icsVar4, z4, z5, z6, str2, fdaeVar5, fdaeVar6, fdaeVar3, geqVar, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.geq r39, final defpackage.hhr r40, defpackage.hml r41, final int r42) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghx.d(geq, hhr, hml, int):void");
    }

    public static final void e(final String str, final ics icsVar, final boolean z, final boolean z2, final fdae fdaeVar, final boolean z3, final String str2, final geq geqVar, hml hmlVar, final int i) {
        String str3;
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1153850597);
        if (i3 == 0) {
            str3 = str;
            i2 = (true != hmlVarC.D(str3) ? 2 : 4) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(z3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(geqVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if (hmlVarC.J((4793491 & i2) != 4793490, i2 & 1)) {
            boolean z4 = (i2 & 7168) == 2048;
            boolean z5 = (i2 & 896) == 256;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z4 | z5) || objS == hmk.a) {
                dky dkyVarA = null;
                if (z2 && !z) {
                    dkyVarA = dkz.a(1.0f, geqVar.u);
                }
                objS = dkyVarA;
                hmwVar.af(objS);
            }
            int i4 = 3670016 & i2;
            dky dkyVar = (dky) objS;
            Object objS2 = hmwVar.S();
            if (i4 == 1048576 || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: gft
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        egc egcVar = ghx.a;
                        jtk.v(jtoVar, new juo(str2));
                        jtk.q(jtoVar, 0);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            gvk.d(z, fdaeVar, jsh.c(icsVar, true, (fdap) objS2), z3, gsc.e(7, hmlVarC), ((ije) dcs.b(z ? z3 ? geqVar.l : geqVar.m : ije.g, gpg.b(4, hmlVarC), hmlVarC, 0, 12).a()).i, 0.0f, dkyVar, null, hxe.d(-564400443, new ghq(str3, geqVar, z2, z, z3), hmlVarC), hmlVarC, 1472);
            hmlVarC = hmlVarC;
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gfu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    String str4 = str;
                    ics icsVar2 = icsVar;
                    boolean z6 = z;
                    boolean z7 = z2;
                    fdae fdaeVar2 = fdaeVar;
                    boolean z8 = z3;
                    int i5 = i;
                    ghx.e(str4, icsVar2, z6, z7, fdaeVar2, z8, str2, geqVar, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean f(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    public static final void g(final ics icsVar, final long j, final fdap fdapVar, final djll djllVar, final hhr hhrVar, final fddq fddqVar, final geq geqVar, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1286899812);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(djllVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(hhrVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fddqVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(geqVar) ? 524288 : 1048576;
        }
        if (hmlVarC.J((599187 & i2) != 599186, i2 & 1)) {
            gyj.a(hct.a(1, hmlVarC), hxe.d(1301915789, new ghu(hhrVar, j, fddqVar, icsVar2, geqVar, fdapVar, djllVar), hmlVarC), hmlVarC, 48);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gfg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    long j2 = j;
                    fdap fdapVar2 = fdapVar;
                    djll djllVar2 = djllVar;
                    hhr hhrVar2 = hhrVar;
                    int i4 = i;
                    ghx.g(icsVar3, j2, fdapVar2, djllVar2, hhrVar2, fddqVar, geqVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.Long r29, final long r30, final defpackage.fdap r32, final defpackage.fdap r33, final defpackage.hhr r34, final defpackage.fddq r35, final defpackage.gfd r36, final defpackage.djll r37, final defpackage.geq r38, defpackage.hml r39, final int r40) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghx.h(java.lang.Long, long, fdap, fdap, hhr, fddq, gfd, djll, geq, hml, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    public static final void i(ejy ejyVar, final Long l, final fdap fdapVar, final fdap fdapVar2, final hhr hhrVar, final fddq fddqVar, final gfd gfdVar, final djll djllVar, final geq geqVar, hml hmlVar, final int i) {
        int i2;
        Long l2;
        djll djllVar2;
        geq geqVar2;
        ?? r15;
        Object ghkVar;
        final ejy ejyVar2 = ejyVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1994757941);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ejyVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l2 = l;
            i2 |= true != hmlVarC.D(l2) ? 16 : 32;
        } else {
            l2 = l;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdapVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(hhrVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fddqVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? hmlVarC.D(gfdVar) : hmlVarC.F(gfdVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            djllVar2 = djllVar;
            i2 |= true != hmlVarC.D(djllVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            djllVar2 = djllVar;
        }
        if ((100663296 & i) == 0) {
            geqVar2 = geqVar;
            i2 |= true != hmlVarC.D(geqVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            geqVar2 = geqVar;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            hhq hhqVarC = hhrVar.c();
            boolean zD = hmlVarC.D(fddqVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                r15 = 1;
                objS = hhrVar.g(fddqVar.a, 1);
                hmwVar.af(objS);
            } else {
                r15 = 1;
            }
            int i4 = i2;
            gyj.a(hct.a(r15, hmlVarC), hxe.d(1504086906, new ghj(ejyVar2, fddqVar, hhrVar, (hhv) objS, fdapVar, hhqVarC, l2, gfdVar, djllVar2, geqVar2), hmlVarC), hmlVarC, 48);
            boolean zF = ((i4 & 14) == 4 ? r15 : false) | ((i4 & 7168) == 2048 ? r15 : false) | hmlVarC.F(hhrVar) | hmlVarC.F(fddqVar);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == hmk.a) {
                ejyVar2 = ejyVar;
                ghkVar = new ghk(ejyVar2, fdapVar2, hhrVar, fddqVar, null);
                hmwVar.af(ghkVar);
            } else {
                ghkVar = objS2;
                ejyVar2 = ejyVar;
            }
            hob.g(ejyVar2, (fdat) ghkVar, hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gfs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ejy ejyVar3 = ejyVar2;
                    Long l3 = l;
                    fdap fdapVar3 = fdapVar;
                    fdap fdapVar4 = fdapVar2;
                    hhr hhrVar2 = hhrVar;
                    fddq fddqVar2 = fddqVar;
                    gfd gfdVar2 = gfdVar;
                    int i5 = i;
                    ghx.i(ejyVar3, l3, fdapVar3, fdapVar4, hhrVar2, fddqVar2, gfdVar2, djllVar, geqVar, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final Long l, final long j, final int i, final fdap fdapVar, final fdap fdapVar2, final hhr hhrVar, final fddq fddqVar, final gfd gfdVar, final djll djllVar, final geq geqVar, final igr igrVar, hml hmlVar, final int i2, final int i3) {
        int i4;
        fdap fdapVar3;
        hhr hhrVar2;
        fddq fddqVar2;
        djll djllVar2;
        int i5;
        hml hmlVar2;
        int i6 = i2 & 6;
        hml hmlVarC = hmlVar.c(-2053685029);
        if (i6 == 0) {
            i4 = (true != hmlVarC.D(l) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != hmlVarC.B(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != hmlVarC.F(fdapVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            fdapVar3 = fdapVar2;
            i4 |= true != hmlVarC.F(fdapVar3) ? 8192 : 16384;
        } else {
            fdapVar3 = fdapVar2;
        }
        if ((196608 & i2) == 0) {
            hhrVar2 = hhrVar;
            i4 |= true != hmlVarC.F(hhrVar2) ? 65536 : 131072;
        } else {
            hhrVar2 = hhrVar;
        }
        if ((1572864 & i2) == 0) {
            fddqVar2 = fddqVar;
            i4 |= true != hmlVarC.F(fddqVar2) ? 524288 : 1048576;
        } else {
            fddqVar2 = fddqVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != ((16777216 & i2) == 0 ? hmlVarC.D(gfdVar) : hmlVarC.F(gfdVar)) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            djllVar2 = djllVar;
            i4 |= true != hmlVarC.D(djllVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            djllVar2 = djllVar;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != hmlVarC.D(geqVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != hmlVarC.D(igrVar) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if (hmlVarC.J(((i7 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i7 & 1)) {
            final int i8 = -((kio) hmlVarC.e(jmh.e)).ep(48.0f);
            final dew dewVarB = gpg.b(4, hmlVarC);
            final dew dewVarB2 = gpg.b(5, hmlVarC);
            final dew dewVarB3 = gpg.b(1, hmlVarC);
            final dew dewVarB4 = gpg.b(1, hmlVarC);
            giy giyVar = new giy(i);
            ico icoVar = ics.e;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: gfp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        egc egcVar = ghx.a;
                        jtk.H((jto) obj2);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarC = jsh.c(icoVar, false, (fdap) objS);
            boolean zF = hmlVarC.F(dewVarB3) | hmlVarC.F(dewVarB) | hmlVarC.F(dewVarB2) | hmlVarC.B(i8) | hmlVarC.F(dewVarB4);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new fdap() { // from class: gfq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        egc egcVar = ghx.a;
                        boolean zA = giy.a(((giy) ((cxg) obj2).b()).a, 1);
                        dew dewVar = dewVarB2;
                        dew dewVar2 = dewVarB;
                        final int i9 = i8;
                        dew dewVar3 = dewVarB3;
                        cyt cytVar = zA ? new cyt(dae.e(dewVar3, new fdap() { // from class: gfj
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                Integer num = (Integer) obj3;
                                num.intValue();
                                egc egcVar2 = ghx.a;
                                return num;
                            }
                        }).a(dae.l(dewVar2, 2)), dae.m(dewVar, 2).a(dae.h(dewVar3, new fdap() { // from class: gfk
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                ((Integer) obj3).intValue();
                                egc egcVar2 = ghx.a;
                                return Integer.valueOf(i9);
                            }
                        }))) : new cyt(dae.e(dewVar3, new fdap() { // from class: gfl
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                ((Integer) obj3).intValue();
                                egc egcVar2 = ghx.a;
                                return Integer.valueOf(i9);
                            }
                        }).a(dae.l(dewVar2, 2)), dae.h(dewVar3, new fdap() { // from class: gfm
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                Integer num = (Integer) obj3;
                                num.intValue();
                                egc egcVar2 = ghx.a;
                                return num;
                            }
                        }).a(dae.m(dewVar, 2)));
                        final dew dewVar4 = dewVarB4;
                        cytVar.d = new dcx(true, new fdat() { // from class: gfn
                            @Override // defpackage.fdat
                            public final Object a(Object obj3, Object obj4) {
                                egc egcVar2 = ghx.a;
                                return dewVar4;
                            }
                        });
                        return cytVar;
                    }
                };
                hmwVar.af(objS2);
            }
            hmlVar2 = hmlVarC;
            cwx.a(giyVar, icsVarC, (fdap) objS2, null, "DatePickerDisplayModeAnimation", null, hxe.d(1838500091, new gho(l, j, fdapVar, fdapVar3, hhrVar2, fddqVar2, gfdVar, djllVar2, geqVar, igrVar), hmlVarC), hmlVar2, ((i7 >> 6) & 14) | 1597440, 40);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gfr
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    Long l2 = l;
                    long j2 = j;
                    int i9 = i;
                    fdap fdapVar4 = fdapVar;
                    fdap fdapVar5 = fdapVar2;
                    hhr hhrVar3 = hhrVar;
                    fddq fddqVar3 = fddqVar;
                    gfd gfdVar2 = gfdVar;
                    djll djllVar3 = djllVar;
                    int i10 = i2;
                    geq geqVar2 = geqVar;
                    int iA = hpy.a(i10 | 1);
                    int iA2 = hpy.a(i3);
                    ghx.j(l2, j2, i9, fdapVar4, fdapVar5, hhrVar3, fddqVar3, gfdVar2, djllVar3, geqVar2, igrVar, (hml) obj2, iA, iA2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final hhv hhvVar, final fdap fdapVar, final long j, final Long l, final gfd gfdVar, final djll djllVar, final geq geqVar, final Locale locale, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        fdat fdatVar;
        fdae fdaeVar;
        fdat fdatVar2;
        fdat fdatVar3;
        hml hmlVar3;
        int i3;
        fdat fdatVar4;
        int i4;
        hmw hmwVar;
        ico icoVar;
        ecj ecjVar;
        int i5;
        boolean z;
        final fdap fdapVar2 = fdapVar;
        gfd gfdVar2 = gfdVar;
        Locale locale2 = locale;
        int i6 = i & 6;
        hml hmlVarC = hmlVar.c(-333300603);
        if (i6 == 0) {
            i2 = (true != hmlVarC.D(hhvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(l) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? hmlVarC.D(gfdVar2) : hmlVarC.F(gfdVar2)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(djllVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.D(geqVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != hmlVarC.F(locale2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if (hmlVarC.J((306783379 & i2) != 306783378, i2 & 1)) {
            hmlVarC.v(606809853);
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            ico icoVar2 = ics.e;
            ics icsVarA = egq.g(icoVar2, 288.0f).a(icoVar2);
            ecj ecjVar2 = ecr.f;
            int i7 = i2;
            ixm ixmVarA = edl.a(ecjVar2, ibw.j, hmlVarC, 6);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar5 = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar5);
            fdat fdatVar6 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar6);
            fdat fdatVar7 = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar7);
            }
            fdat fdatVar8 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar8);
            hmlVarC.v(-680088507);
            ico icoVar3 = icoVar2;
            int i8 = 0;
            int i9 = 6;
            int i10 = 0;
            while (i8 < i9) {
                ics icsVarD = egq.d(icoVar3, 1.0f);
                int i11 = i8;
                int i12 = i10;
                ixm ixmVarA2 = egk.a(ecjVar2, ibw.n, hmlVarC, 54);
                int iA2 = hmg.a(hmlVarC);
                ecj ecjVar3 = ecjVar2;
                hxi hxiVarAk2 = hmwVar2.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVarD);
                hmlVarC.x();
                if (hmwVar2.z) {
                    hmlVarC.j(fdaeVar2);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA2, fdatVar5);
                hsk.b(hmlVarC, hxiVarAk2, fdatVar6);
                if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA2))) {
                    Integer numValueOf2 = Integer.valueOf(iA2);
                    hmwVar2.af(numValueOf2);
                    hmlVarC.h(numValueOf2, fdatVar7);
                }
                hsk.b(hmlVarC, icsVarB2, fdatVar8);
                hmlVarC.v(1542622305);
                int i13 = i12;
                int i14 = 0;
                while (i14 < 7) {
                    int i15 = hhvVar.d;
                    if (i13 < i15 || i13 >= hhvVar.c + i15) {
                        fdatVar = fdatVar7;
                        fdaeVar = fdaeVar2;
                        fdatVar2 = fdatVar5;
                        fdatVar3 = fdatVar8;
                        hmlVar3 = hmlVarC;
                        i3 = i13;
                        fdatVar4 = fdatVar6;
                        i4 = i14;
                        hmwVar = hmwVar2;
                        icoVar = icoVar3;
                        ecjVar = ecjVar3;
                        hmlVar3.v(576825266);
                        ics icsVarW = egq.w(icoVar, 40.0f, 40.0f, 0.0f, 0.0f, 12);
                        hpt hptVar = gks.c;
                        egt.a(egq.m(icsVarW, ((kir) hmlVar3.e(hptVar)).a, ((kir) hmlVar3.e(hptVar)).a), hmlVar3);
                        hmwVar.ab();
                    } else {
                        hmlVarC.v(577912405);
                        int i16 = i13 - i15;
                        fdaeVar = fdaeVar2;
                        fdatVar2 = fdatVar5;
                        final long j2 = hhvVar.e + (i16 * 86400000);
                        boolean z2 = j2 == j;
                        if (l != null && j2 == l.longValue()) {
                            i5 = i16;
                            z = true;
                        } else {
                            i5 = i16;
                            z = false;
                        }
                        hmlVarC.v(578888316);
                        hmwVar2.ab();
                        StringBuilder sb = new StringBuilder();
                        fdatVar = fdatVar7;
                        hmlVarC.v(974837835);
                        hmwVar2.ab();
                        if (z2) {
                            fdatVar3 = fdatVar8;
                            hmlVarC.v(1416920453);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(hjw.b(R.string.m3c_date_picker_today_description, hmlVarC));
                            hmwVar2.ab();
                        } else {
                            fdatVar3 = fdatVar8;
                            hmlVarC.v(975028299);
                            hmwVar2.ab();
                        }
                        String string = sb.length() == 0 ? null : sb.toString();
                        i3 = i13;
                        String strA = gfdVar2.a(Long.valueOf(j2), locale2, true);
                        if (strA == null) {
                            strA = "";
                        }
                        String strA2 = gaz.a(i5 + 1, 0, 7);
                        boolean zC = ((i7 & 112) == 32) | hmlVarC.C(j2);
                        Object objS = hmwVar2.S();
                        if (zC || objS == hmk.a) {
                            objS = new fdae() { // from class: gfy
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    egc egcVar = ghx.a;
                                    fdapVar2.invoke(Long.valueOf(j2));
                                    return fctx.a;
                                }
                            };
                            hmwVar2.af(objS);
                        }
                        fdae fdaeVar3 = (fdae) objS;
                        boolean zC2 = ((i7 & 29360128) == 8388608) | hmlVarC.C(j2);
                        Object objS2 = hmwVar2.S();
                        if (zC2 || objS2 == hmk.a) {
                            objS2 = Boolean.valueOf(djllVar.b(hhvVar.a) && djllVar.a(j2));
                            hmwVar2.af(objS2);
                        }
                        boolean zBooleanValue = ((Boolean) objS2).booleanValue();
                        if (string != null) {
                            strA = a.q(strA, string, ", ");
                        }
                        i4 = i14;
                        icoVar = icoVar3;
                        hml hmlVar4 = hmlVarC;
                        hmwVar = hmwVar2;
                        fdatVar4 = fdatVar6;
                        ecjVar = ecjVar3;
                        m(strA2, icoVar, z, fdaeVar3, z, zBooleanValue, z2, strA, geqVar, hmlVar4, ((i7 << 3) & 1879048192) | 48);
                        hmlVar3 = hmlVar4;
                        hmwVar.ab();
                    }
                    gfdVar2 = gfdVar;
                    locale2 = locale;
                    ecjVar3 = ecjVar;
                    hmwVar2 = hmwVar;
                    i13 = i3 + 1;
                    icoVar3 = icoVar;
                    fdatVar5 = fdatVar2;
                    fdatVar7 = fdatVar;
                    fdatVar6 = fdatVar4;
                    i14 = i4 + 1;
                    hmlVarC = hmlVar3;
                    fdaeVar2 = fdaeVar;
                    fdatVar8 = fdatVar3;
                    fdapVar2 = fdapVar;
                }
                fdat fdatVar9 = fdatVar8;
                hml hmlVar5 = hmlVarC;
                int i17 = i13;
                hmwVar2.ab();
                hmlVar5.n();
                gfdVar2 = gfdVar;
                locale2 = locale;
                ecjVar2 = ecjVar3;
                i8 = i11 + 1;
                i9 = 6;
                fdaeVar2 = fdaeVar2;
                fdatVar5 = fdatVar5;
                fdatVar7 = fdatVar7;
                i10 = i17;
                fdapVar2 = fdapVar;
                hmlVarC = hmlVar5;
                fdatVar8 = fdatVar9;
            }
            hmlVar2 = hmlVarC;
            hmwVar2.ab();
            hmlVar2.n();
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ggd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar6 = (hml) obj;
                    ((Integer) obj2).intValue();
                    hhv hhvVar2 = hhvVar;
                    fdap fdapVar3 = fdapVar;
                    long j3 = j;
                    Long l2 = l;
                    gfd gfdVar3 = gfdVar;
                    djll djllVar2 = djllVar;
                    int i18 = i;
                    ghx.k(hhvVar2, fdapVar3, j3, l2, gfdVar3, djllVar2, geqVar, locale, hmlVar6, hpy.a(i18 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(final ghy ghyVar, final ics icsVar, final gfd gfdVar, final geq geqVar, final fdat fdatVar, final fdat fdatVar2, final boolean z, igr igrVar, hml hmlVar, final int i) {
        int i2;
        final igr igrVar2;
        igr igrVar3;
        hwv hwvVarD;
        hml hmlVarC = hmlVar.c(1105472031);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(ghyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(gfdVar) : hmlVarC.F(gfdVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(geqVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.E(z) ? 524288 : 1048576;
        }
        int i3 = i2 | 12582912;
        if (hmlVarC.J((4793491 & i3) != 4793490, i3 & 1)) {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = new igr();
                    hmwVar.af(objS);
                }
                igrVar3 = (igr) objS;
            } else {
                hmlVarC.s();
                igrVar3 = igrVar;
            }
            hmlVarC.l();
            fzd fzdVar = (fzd) ghyVar;
            boolean zD = hmlVarC.D(fzdVar.b);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS2 = hmwVar2.S();
            if (zD || objS2 == hmk.a) {
                objS2 = fzdVar.c;
                hmwVar2.af(objS2);
            }
            hhr hhrVar = (hhr) objS2;
            if (z) {
                hmlVarC.v(-690528328);
                hwvVarD = hxe.d(-1483431603, new ggn(ghyVar, geqVar), hmlVarC);
                hmwVar2.ab();
            } else {
                hmlVarC.v(-690141665);
                hmwVar2.ab();
                hwvVarD = null;
            }
            hwv hwvVar = hwvVarD;
            jyq jyqVarA = hct.a(7, hmlVarC);
            hwv hwvVarD2 = hxe.d(-1346903698, new ggq(ghyVar, hhrVar, gfdVar, geqVar, igrVar3), hmlVarC);
            int i4 = i3 >> 9;
            o(icsVar, fdatVar, fdatVar2, hwvVar, geqVar, jyqVarA, hwvVarD2, hmlVarC, ((i3 >> 3) & 14) | 14155776 | (i4 & 112) | (i4 & 896) | (57344 & (i3 << 3)));
            igrVar2 = igrVar3;
        } else {
            hmlVarC.s();
            igrVar2 = igrVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gfe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ghy ghyVar2 = ghyVar;
                    ics icsVar2 = icsVar;
                    gfd gfdVar2 = gfdVar;
                    geq geqVar2 = geqVar;
                    fdat fdatVar3 = fdatVar;
                    fdat fdatVar4 = fdatVar2;
                    int i5 = i;
                    ghx.l(ghyVar2, icsVar2, gfdVar2, geqVar2, fdatVar3, fdatVar4, z, igrVar2, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void m(final String str, final ics icsVar, final boolean z, final fdae fdaeVar, final boolean z2, final boolean z3, final boolean z4, final String str2, final geq geqVar, hml hmlVar, final int i) {
        String str3;
        int i2;
        hsf hsfVarA;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-945355136);
        if (i3 == 0) {
            str3 = str;
            i2 = (true != hmlVarC.D(str3) ? 2 : 4) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(z3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.E(z4) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.E(false) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.D(str2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != hmlVarC.D(geqVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if (hmlVarC.J((306783379 & i2) != 306783378, i2 & 1)) {
            int i4 = 234881024 & i2;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 67108864 || objS == hmk.a) {
                objS = new fdap() { // from class: gfh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        egc egcVar = ghx.a;
                        jtk.v(jtoVar, new juo(str2));
                        jtk.q(jtoVar, 0);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarC = jsh.c(icsVar, true, (fdap) objS);
            ikp ikpVarE = gsc.e(7, hmlVarC);
            long j = z ? z3 ? geqVar.r : geqVar.s : ije.g;
            if (z2) {
                hmlVarC.v(-1319857759);
                hsfVarA = dcs.b(j, gpg.b(4, hmlVarC), hmlVarC, 0, 12);
                hmwVar.ab();
            } else {
                hmlVarC.v(-1319632048);
                hsfVarA = hsc.a(new ije(j), hmlVarC);
                hmwVar.ab();
            }
            long j2 = ((ije) hsfVarA.a()).i;
            dky dkyVarA = null;
            if (z4 && !z) {
                dkyVarA = dkz.a(1.0f, geqVar.u);
            }
            gvk.d(z, fdaeVar, icsVarC, z3, ikpVarE, j2, 0.0f, dkyVarA, null, hxe.d(1126347158, new gha(str3, geqVar, z4, z, z3), hmlVarC), hmlVarC, 1472);
            hmlVarC = hmlVarC;
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gfi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    String str4 = str;
                    ics icsVar2 = icsVar;
                    boolean z5 = z;
                    fdae fdaeVar2 = fdaeVar;
                    boolean z6 = z2;
                    boolean z7 = z3;
                    boolean z8 = z4;
                    int i5 = i;
                    ghx.m(str4, icsVar2, z5, fdaeVar2, z6, z7, z8, str2, geqVar, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void n(final fdae fdaeVar, final boolean z, ics icsVar, final fdat fdatVar, hml hmlVar, final int i) {
        fdae fdaeVar2;
        int i2;
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(-709923073);
        if ((i & 6) == 0) {
            fdaeVar2 = fdaeVar;
            i2 = (true != hmlVarC.F(fdaeVar2) ? 2 : 4) | i;
        } else {
            fdaeVar2 = fdaeVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i3 & 1171) != 1170, i3 & 1)) {
            ico icoVar = ics.e;
            evm evmVar = evn.a;
            egc egcVar = gam.a;
            gax.b(fdaeVar2, icoVar, false, evmVar, gam.e(0L, ((ije) hmlVarC.e(gea.a)).i, hmlVarC, 13), null, hxe.d(1899489890, new ghv(fdatVar, z), hmlVarC), hmlVarC, (i3 & 14) | 807075840 | ((i3 >> 3) & 112), 388);
            hmlVarC = hmlVarC;
            icsVar2 = icoVar;
        } else {
            hmlVarC.s();
            icsVar2 = icsVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ggi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    boolean z2 = z;
                    int i4 = i;
                    ghx.n(fdaeVar3, z2, icsVar2, fdatVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void o(final ics icsVar, final fdat fdatVar, final fdat fdatVar2, final fdat fdatVar3, final geq geqVar, final jyq jyqVar, final fdat fdatVar4, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        fdat fdatVar5;
        fdat fdatVar6;
        fdat fdatVar7;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1539132883);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            fdatVar5 = fdatVar;
            i2 |= true != hmlVarC.F(fdatVar5) ? 16 : 32;
        } else {
            fdatVar5 = fdatVar;
        }
        if ((i & 384) == 0) {
            fdatVar6 = fdatVar2;
            i2 |= true != hmlVarC.F(fdatVar6) ? 128 : 256;
        } else {
            fdatVar6 = fdatVar2;
        }
        if ((i & 3072) == 0) {
            fdatVar7 = fdatVar3;
            i2 |= true != hmlVarC.F(fdatVar7) ? 1024 : 2048;
        } else {
            fdatVar7 = fdatVar3;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(geqVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(jyqVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.A(120.0f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar4) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i4 = i2;
        if (hmlVarC.J((i4 & 4793491) != 4793490, i4 & 1)) {
            ics icsVarW = egq.w(icsVar2, 360.0f, 0.0f, 0.0f, 0.0f, 14);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: gge
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        egc egcVar = ghx.a;
                        jtk.H((jto) obj);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarA = dkl.a(jsh.c(icsVarW, false, (fdap) objS), geqVar.a, ikj.a);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = hmg.a(hmlVarC);
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
            fdat fdatVar8 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar8);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            p(ics.e, fdatVar, geqVar.b, geqVar.c, hxe.d(-1658370654, new ggl(fdatVar6, fdatVar7, fdatVar5, geqVar, jyqVar), hmlVarC), hmlVarC, (i4 & 112) | 196614 | ((i4 >> 6) & 57344));
            hmlVar2 = hmlVarC;
            fdatVar4.a(hmlVar2, Integer.valueOf((i4 >> 21) & 14));
            hmlVar2.n();
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ggf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    fdat fdatVar9 = fdatVar;
                    fdat fdatVar10 = fdatVar2;
                    fdat fdatVar11 = fdatVar3;
                    geq geqVar2 = geqVar;
                    int i5 = i;
                    ghx.o(icsVar3, fdatVar9, fdatVar10, fdatVar11, geqVar2, jyqVar, fdatVar4, hmlVar3, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void p(final ics icsVar, final fdat fdatVar, final long j, final long j2, final fdat fdatVar2, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2020490761);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.A(120.0f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 65536 : 131072;
        }
        if (hmlVarC.J((74899 & i2) != 74898, i2 & 1)) {
            ics icsVarA = egq.d(icsVar2, 1.0f).a(fdatVar != null ? egq.q(ics.e, 0.0f, 120.0f, 1) : ics.e);
            ixm ixmVarA = edl.a(ecr.g, ibw.j, hmlVarC, 6);
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
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            if (fdatVar != null) {
                hmlVarC.v(396894187);
                hjt.a(j, hct.a(10, hmlVarC), hxe.d(1344395458, new ggy(fdatVar), hmlVarC), hmlVarC, ((i2 >> 6) & 14) | 384);
                hmwVar.ab();
            } else {
                hmlVarC.v(397163267);
                hmwVar.ab();
            }
            hnj.a(gea.a.c(new ije(j2)), fdatVar2, hmlVarC, ((i2 >> 12) & 112) | 8);
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gff
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    fdat fdatVar4 = fdatVar;
                    long j3 = j;
                    int i4 = i;
                    ghx.p(icsVar3, fdatVar4, j3, j2, fdatVar2, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

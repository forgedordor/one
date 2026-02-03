package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkpa {
    public static final void a(final djrr djrrVar, final long j, final String str, hml hmlVar, final int i) {
        int i2;
        long j2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(162596898);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= true != hmlVarC.C(j2) ? 16 : 32;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(str) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            qsa qsaVarA = qsc.a(new qse[]{qsc.b(qok.a, Integer.valueOf(ijg.b(j2)), new String[]{"**"}, hmlVarC), qsc.b(qok.b, Integer.valueOf(ijg.b(j2)), new String[]{"**"}, hmlVarC)}, hmlVarC);
            qrs qrsVarD = qsm.d(new qrx(true != ((Boolean) dljt.b(hmlVarC).g.invoke()).booleanValue() ? R.raw.animated_icons : R.raw.animated_icons_v2), hmlVarC);
            qnm qnmVarA = qrsVarD.a();
            Map map = dkon.a;
            Map map2 = dkon.a;
            fcti fctiVar = (fcti) map2.get(djrrVar);
            String str2 = fctiVar != null ? (String) fctiVar.a : null;
            fcti fctiVar2 = (fcti) map2.get(djrrVar);
            final qrk qrkVarA = qqp.a(qnmVarA, false, false, new qrm(str2, fctiVar2 != null ? (String) fctiVar2.b : null, 4), 0.0f, 0, hmlVarC, 0, 1006);
            if (qrsVarD.a() != null) {
                ics icsVarA = dihi.a(ics.e, str, true);
                qnm qnmVarA2 = qrsVarD.a();
                hmlVarC.v(5004770);
                boolean zD = hmlVarC.D(qrkVarA);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (zD || objS == hmk.a) {
                    objS = new fdae() { // from class: dkoy
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return Float.valueOf(((Number) qrkVarA.a()).floatValue());
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                qrj.b(qnmVarA2, (fdae) objS, icsVarA, 0, qsaVarA, null, null, false, hmlVarC, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS, 0, 7928);
                hmlVarC = hmlVarC;
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkoo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    long j3 = j;
                    dkpa.a(djrrVar2, j3, str, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(long j, hml hmlVar, final int i) {
        int i2;
        final long j2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1204388466);
        if (i3 == 0) {
            i2 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            j2 = j;
        } else {
            j2 = j;
            dtfn.a(djrs.b(djrr.ed, hmlVarC), null, null, j2, hmlVarC, ((i2 << 9) & 7168) | 48, 4);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkov
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkpa.b(j2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(djrr djrrVar, final boolean z, final boolean z2, long j, final String str, hml hmlVar, final int i) {
        int i2;
        String str2;
        djrr djrrVar2;
        final long j2 = j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(240172413);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i2 |= true != hmlVarC.D(str2) ? 8192 : 16384;
        } else {
            str2 = str;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            djrrVar2 = djrrVar;
        } else {
            int i4 = i2 & 14;
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, true);
            long jB = hmg.b(hmlVarC);
            long j3 = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i5 = (int) j3;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            if (z2) {
                hmlVarC.v(29993688);
                int i6 = i2 >> 6;
                a(djrrVar, j2, str2, hmlVarC, (i6 & 112) | i4 | (i6 & 896));
                hmwVar.ab();
                djrrVar2 = djrrVar;
                j2 = j;
            } else {
                hmlVarC.v(30101785);
                djrrVar2 = djrrVar;
                dtfn.a(djrs.b(djrrVar2, hmlVarC), str, null, j, hmlVarC, ((i2 >> 9) & 112) | (i2 & 7168), 4);
                j2 = j;
                hmlVarC = hmlVarC;
                hmwVar.ab();
            }
            hmlVarC.v(-276120276);
            if (z) {
                b(j2, hmlVarC, (i2 >> 9) & 14);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final djrr djrrVar3 = djrrVar2;
            hpxVarL.d = new fdat() { // from class: dkou
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar4 = djrrVar3;
                    boolean z3 = z;
                    boolean z4 = z2;
                    long j4 = j2;
                    dkpa.c(djrrVar4, z3, z4, j4, str, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ics icsVar, final djrr djrrVar, final boolean z, final boolean z2, final long j, final ije ijeVar, final long j2, final String str, hml hmlVar, final int i) {
        int i2;
        boolean z3;
        String str2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(387706614);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.B(djrrVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= true != hmlVarC.E(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            str2 = str;
            i2 |= true != hmlVarC.D(str2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            str2 = str;
        }
        if ((4793491 & i2) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(-1746271574);
            boolean z4 = (57344 & i2) == 16384;
            boolean z5 = (458752 & i2) == 131072;
            boolean z6 = (i2 & 896) == 256;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z4 | z5 | z6) || objS == hmk.a) {
                objS = new fdap() { // from class: dkoq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        imz imzVar = (imz) obj;
                        imzVar.getClass();
                        imy.e(imzVar, j, 0.0f, 0L, null, 0, 126);
                        ije ijeVar2 = ijeVar;
                        if (ijeVar2 != null) {
                            boolean z7 = z;
                            long jB = imzVar.b();
                            imy.d(imzVar, ijeVar2.i, 75.0f, true != z7 ? 360.0f : 300.0f, 0L, 0L, new ind(imzVar.en((Math.max(Float.intBitsToFloat((int) ((jB >> 32) & 2147483647L)), Float.intBitsToFloat((int) (jB & 2147483647L))) / imzVar.en(24.0f)) * 1.2f), 0.0f, 1, 0, 26), 880);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            gvk.c(ifb.a(icsVar, (fdap) objS), null, ije.g, 0L, 0.0f, 0.0f, null, hxe.d(-742536751, new dkoz(djrrVar, z, z3, j2, str2), hmlVarC), hmlVar2, 122);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkor
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    djrr djrrVar2 = djrrVar;
                    boolean z7 = z;
                    boolean z8 = z2;
                    long j3 = j;
                    ije ijeVar2 = ijeVar;
                    long j4 = j2;
                    dkpa.d(icsVar2, djrrVar2, z7, z8, j3, ijeVar2, j4, str, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dkpc dkpcVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1141641830);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkpcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            int i4 = dkpcVar.c - 1;
            int i5 = (i2 >> 3) & 14;
            if (i4 == 0) {
                icsVar2 = icsVar;
                hmlVarC.v(-1901134209);
                f(icsVar2, dkpcVar.d, dkpcVar.a, dkpcVar.b, hmlVarC, i5);
                ((hmw) hmlVarC).ab();
            } else if (i4 == 1) {
                icsVar2 = icsVar;
                hmlVarC.v(-1901131398);
                g(icsVar2, dkpcVar.d, dkpcVar.a, dkpcVar.b, hmlVarC, i5);
                ((hmw) hmlVarC).ab();
            } else if (i4 != 2) {
                hmlVarC.v(-1901125894);
                icsVar2 = icsVar;
                i(icsVar2, dkpcVar.d, dkpcVar.a, dkpcVar.b, hmlVarC, i5);
                ((hmw) hmlVarC).ab();
            } else {
                icsVar2 = icsVar;
                hmlVarC.v(-1901128643);
                h(icsVar2, dkpcVar.d, dkpcVar.a, dkpcVar.b, hmlVarC, i5);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkox
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkpc dkpcVar2 = dkpcVar;
                    int i6 = i;
                    dkpa.e(dkpcVar2, icsVar2, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final ics icsVar, final int i, final boolean z, final boolean z2, hml hmlVar, final int i2) {
        ics icsVar2;
        int i3;
        boolean z3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(571871857);
        if (i4 == 0) {
            icsVar2 = icsVar;
            i3 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i2;
        } else {
            icsVar2 = icsVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            z3 = z2;
            i3 |= true != hmlVarC.E(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            d(icsVar2, ((Boolean) dljt.b(hmlVarC).g.invoke()).booleanValue() ? djrr.ec : djrr.eb, z, z3, n(i, 1, hmlVarC), new ije(p(i, 1, hmlVarC)), o(1, i, hmlVarC), jqu.b(R.string.delivered_content_description, hmlVarC), hmlVar2, i3 & 8078);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkos
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    int i5 = i;
                    boolean z4 = z;
                    dkpa.f(icsVar3, i5, z4, z2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final ics icsVar, final int i, final boolean z, final boolean z2, hml hmlVar, final int i2) {
        ics icsVar2;
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-366685281);
        if (i4 == 0) {
            icsVar2 = icsVar;
            i3 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i2;
        } else {
            icsVar2 = icsVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            d(icsVar2, ((Boolean) dljt.b(hmlVarC).g.invoke()).booleanValue() ? djrr.ec : djrr.eb, z, z2, n(i, 2, hmlVarC), null, o(2, i, hmlVarC), jqu.b(R.string.read_content_description, hmlVarC), hmlVar2, (i3 & 14) | 196608 | (i3 & 896) | (i3 & 7168));
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkot
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    int i5 = i;
                    boolean z3 = z;
                    dkpa.g(icsVar3, i5, z3, z2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final ics icsVar, final int i, final boolean z, final boolean z2, hml hmlVar, final int i2) {
        ics icsVar2;
        int i3;
        boolean z3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1856655687);
        if (i4 == 0) {
            icsVar2 = icsVar;
            i3 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i2;
        } else {
            icsVar2 = icsVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            z3 = z2;
            i3 |= true != hmlVarC.E(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            d(icsVar2, djrr.ea, z, z3, n(i, 3, hmlVarC), new ije(p(i, 3, hmlVarC)), o(3, i, hmlVarC), jqu.b(R.string.sending_content_description, hmlVarC), hmlVar2, (i3 & 14) | 48 | (i3 & 896) | (i3 & 7168));
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkow
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    int i5 = i;
                    boolean z4 = z;
                    dkpa.h(icsVar3, i5, z4, z2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final ics icsVar, final int i, final boolean z, final boolean z2, hml hmlVar, final int i2) {
        ics icsVar2;
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-411623391);
        if (i4 == 0) {
            icsVar2 = icsVar;
            i3 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i2;
        } else {
            icsVar2 = icsVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            d(icsVar2, djrr.eh, z, z2, n(i, 4, hmlVarC), new ije(p(i, 4, hmlVarC)), o(4, i, hmlVarC), jqu.b(R.string.sent_content_description, hmlVarC), hmlVar2, (i3 & 14) | 48 | (i3 & 896) | (i3 & 7168));
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkop
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    int i5 = i;
                    boolean z3 = z;
                    dkpa.i(icsVar3, i5, z3, z2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final long j(hml hmlVar) {
        long jF;
        hmlVar.v(199744145);
        if (((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue()) {
            hmlVar.v(2048230802);
            long j = glz.a(hmlVar).p;
            jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.92f, ije.f(j));
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(2048298909);
            jF = glz.a(hmlVar).F;
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return jF;
    }

    private static final long k(int i, hml hmlVar) {
        long jF;
        hmlVar.v(-2022087386);
        if (dlv.a(hmlVar)) {
            hmlVar.v(1206069907);
            if (i == 3 || i == 2 || i == 1) {
                long j = ije.d;
                jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.9f, ije.f(j));
            } else {
                if (i != 4) {
                    throw new fctg();
                }
                jF = glz.a(hmlVar).r;
            }
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(1206307057);
            if (i == 3 || i == 1) {
                long j2 = ije.d;
                jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.9f, ije.f(j2));
            } else {
                if (i != 2 && i != 4) {
                    throw new fctg();
                }
                jF = glz.a(hmlVar).s;
            }
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return jF;
    }

    private static final long l(int i, hml hmlVar) {
        long jF;
        hmlVar.v(1596296434);
        if (dlv.a(hmlVar)) {
            int i2 = i - 1;
            if (i2 == 0 || i2 == 1 || i2 == 2) {
                long j = ije.d;
                jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.9f, ije.f(j));
            } else {
                long j2 = ije.a;
                jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.8f, ije.f(j2));
            }
        } else if (i == 3 || i == 1) {
            long j3 = ije.d;
            jF = ijg.f(ije.d(j3), ije.c(j3), ije.b(j3), 0.9f, ije.f(j3));
        } else if (i == 2) {
            jF = glz.a(hmlVar).s;
        } else {
            if (i != 4) {
                throw new fctg();
            }
            long j4 = ije.a;
            jF = ijg.f(ije.d(j4), ije.c(j4), ije.b(j4), 0.8f, ije.f(j4));
        }
        ((hmw) hmlVar).ab();
        return jF;
    }

    private static final long m(int i, hml hmlVar) {
        long j;
        hmlVar.v(439973590);
        int i2 = i - 1;
        if (dlv.a(hmlVar)) {
            hmlVar.v(-986870577);
            if (i2 == 0) {
                hmlVar.v(1907829983);
                j = glz.a(hmlVar).q;
                ((hmw) hmlVar).ab();
            } else if (i2 == 1) {
                hmlVar.v(1907832038);
                j = glz.a(hmlVar).s;
                ((hmw) hmlVar).ab();
            } else if (i2 != 2) {
                hmlVar.v(1907836196);
                j = glz.a(hmlVar).r;
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(1907834207);
                j = glz.a(hmlVar).q;
                ((hmw) hmlVar).ab();
            }
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(-986582618);
            if (i2 == 0) {
                hmlVar.v(1907838480);
                j = j(hmlVar);
                ((hmw) hmlVar).ab();
            } else if (i2 == 1) {
                hmlVar.v(1907841062);
                j = glz.a(hmlVar).s;
                ((hmw) hmlVar).ab();
            } else if (i2 != 2) {
                hmlVar.v(1907844927);
                j = glz.a(hmlVar).q;
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(1907842416);
                j = j(hmlVar);
                ((hmw) hmlVar).ab();
            }
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return j;
    }

    private static final long n(int i, int i2, hml hmlVar) {
        long jK;
        hmlVar.v(-721876251);
        if (i2 != 2) {
            jK = ije.g;
        } else if (((Boolean) dljt.b(hmlVar).g.invoke()).booleanValue()) {
            int i3 = i - 1;
            hmlVar.v(-514000363);
            hmlVar.v(2096632330);
            if (dlv.a(hmlVar)) {
                hmlVar.v(-935546503);
                if (i3 == 0) {
                    hmlVar.v(524012275);
                    jK = glz.a(hmlVar).q;
                    ((hmw) hmlVar).ab();
                } else if (i3 == 1) {
                    hmlVar.v(524014330);
                    jK = glz.a(hmlVar).s;
                    ((hmw) hmlVar).ab();
                } else if (i3 != 2) {
                    hmlVar.v(524018490);
                    jK = glz.a(hmlVar).v;
                    ((hmw) hmlVar).ab();
                } else {
                    hmlVar.v(524016499);
                    jK = glz.a(hmlVar).q;
                    ((hmw) hmlVar).ab();
                }
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(-935256405);
                if (i3 == 0) {
                    hmlVar.v(524020836);
                    jK = j(hmlVar);
                    ((hmw) hmlVar).ab();
                } else if (i3 == 1) {
                    hmlVar.v(524023418);
                    jK = glz.a(hmlVar).s;
                    ((hmw) hmlVar).ab();
                } else if (i3 != 2) {
                    hmlVar.v(524027290);
                    jK = glz.a(hmlVar).s;
                    ((hmw) hmlVar).ab();
                } else {
                    hmlVar.v(524024772);
                    jK = j(hmlVar);
                    ((hmw) hmlVar).ab();
                }
                ((hmw) hmlVar).ab();
            }
            hmw hmwVar = (hmw) hmlVar;
            hmwVar.ab();
            hmwVar.ab();
        } else {
            hmlVar.v(-513954793);
            jK = k(i, hmlVar);
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return jK;
    }

    private static final long o(int i, int i2, hml hmlVar) {
        long jL;
        hmlVar.v(454383993);
        if (i == 2) {
            int i3 = i2 - 1;
            hmlVar.v(-1183276158);
            hmlVar.v(1957173035);
            if (dlv.a(hmlVar)) {
                hmlVar.v(1960935115);
                if (i3 == 0 || i3 == 1) {
                    hmlVar.v(1961069531);
                    jL = glz.a(hmlVar).v;
                    ((hmw) hmlVar).ab();
                } else if (i3 != 2) {
                    hmlVar.v(1961154874);
                    ((hmw) hmlVar).ab();
                    jL = ije.d;
                } else {
                    hmlVar.v(1960972966);
                    jL = dljt.f(hmlVar).Y;
                    ((hmw) hmlVar).ab();
                }
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(1961206768);
                if (i3 == 0) {
                    hmlVar.v(1961317314);
                    jL = glz.a(hmlVar).q;
                    ((hmw) hmlVar).ab();
                } else if (i3 != 2) {
                    hmlVar.v(1961421722);
                    ((hmw) hmlVar).ab();
                    jL = ije.d;
                } else {
                    hmlVar.v(1961244836);
                    jL = glz.a(hmlVar).a;
                    ((hmw) hmlVar).ab();
                }
                ((hmw) hmlVar).ab();
            }
            hmw hmwVar = (hmw) hmlVar;
            hmwVar.ab();
            hmwVar.ab();
        } else {
            hmlVar.v(-1183228015);
            if (((Boolean) dljt.b(hmlVar).g.invoke()).booleanValue()) {
                hmlVar.v(-1183181670);
                jL = m(i2, hmlVar);
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(-1183129156);
                jL = l(i2, hmlVar);
                ((hmw) hmlVar).ab();
            }
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return jL;
    }

    private static final long p(int i, int i2, hml hmlVar) {
        long jL;
        hmlVar.v(-2067943737);
        if (i2 == 2) {
            hmlVar.v(899114356);
            jL = k(i, hmlVar);
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(899162282);
            if (((Boolean) dljt.b(hmlVar).g.invoke()).booleanValue()) {
                hmlVar.v(899208658);
                jL = m(i, hmlVar);
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(899255375);
                jL = l(i, hmlVar);
                ((hmw) hmlVar).ab();
            }
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return jL;
    }
}

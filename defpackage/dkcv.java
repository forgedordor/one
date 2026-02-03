package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkcv {
    public static final void a(fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1290508453);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtdi.e(fdaeVar2, null, false, null, null, null, dkch.c, hmlVarC, (i2 & 14) | 805306368, 510);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkck
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkcv.a(fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final List list, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-5201243);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtfz.b(z, fdaeVar2, null, 0L, null, null, glz.c(hmlVarC).f, 0L, 0.0f, hxe.d(-1654076982, new dkcs(list, fdaeVar), hmlVarC), hmlVarC, (i2 & 14) | ((i2 >> 3) & 112), 48, 1980);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkcj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    List list2 = list;
                    int i4 = i;
                    dkcv.b(z2, list2, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dkcx dkcxVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(359207359);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkcxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hwv hwvVarD = hxe.d(420367343, new dkct(dkcxVar), hmlVarC);
            hmlVarC.v(-1633490746);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | z2) || objS == hmk.a) {
                objS = new fdae() { // from class: dkcm
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dkcxVar.d.invoke();
                        fdaeVar.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtfz.a(hwvVarD, (fdae) objS, null, hxe.d(1766354508, new dkcu(dkcxVar), hmlVarC), false, null, null, hmlVarC, 3078, 500);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkcn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkcx dkcxVar2 = dkcxVar;
                    int i4 = i;
                    dkcv.c(dkcxVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final String str, String str2, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        final String str3;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1413944151);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            str3 = str2;
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = (jB >>> 32) ^ jB;
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
            int i5 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVar2 = hmlVarC;
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar2, i4 & 14, 0, 131070);
            str3 = str2;
            dthx.b(str3, null, glz.a(hmlVar2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).n, hmlVar2, (i4 >> 3) & 14, 0, 65530);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkcl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str4 = str;
                    int i6 = i;
                    dkcv.d(str4, str3, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dkcw dkcwVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(850798860);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkcwVar) ? 2 : 4) | i;
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
            icsVar2 = icsVar;
            dtfr.a(hxe.d(-2143886610, new dkco(dkcwVar), hmlVarC), icsVar2, dkch.a, null, dkch.b, hxe.d(-871939575, new dkcr(dkcwVar), hmlVarC), dtfp.a(ije.g, hmlVarC, 510), hmlVarC, (i2 & 112) | 221574, 392);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkci
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkcw dkcwVar2 = dkcwVar;
                    int i4 = i;
                    dkcv.e(dkcwVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

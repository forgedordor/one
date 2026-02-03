package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmf {
    public static final void a(final List list, final long j, final fdae fdaeVar, hml hmlVar, final int i) {
        List<dllt> list2;
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1817902522);
        if (i3 == 0) {
            list2 = list;
            i2 = (true != hmlVarC.F(list2) ? 2 : 4) | i;
        } else {
            list2 = list;
            i2 = i;
        }
        long j2 = j;
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            Object obj2 = obj;
            long j3 = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j3;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-1684487468);
            for (final dllt dlltVar : list2) {
                String str = dlltVar.a;
                hmlVarC.v(-1746271574);
                boolean zF = hmlVarC.F(fdjxVar) | hmlVarC.D(dlltVar);
                boolean z = (i2 & 896) == 256;
                Object objS2 = hmwVar.S();
                boolean z2 = zF | z;
                Object obj3 = obj2;
                if (z2 || objS2 == obj3) {
                    objS2 = new fdae() { // from class: dllv
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdil.d(fdjxVar, null, null, new dlmd(dlltVar, fdaeVar, null), 3);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                hmwVar.ab();
                b(str, j2, (fdae) objS2, hmlVarC, i2 & 112);
                j2 = j;
                obj2 = obj3;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dllw
                @Override // defpackage.fdat
                public final Object a(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    List list3 = list;
                    long j4 = j;
                    dlmf.a(list3, j4, fdaeVar, (hml) obj4, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, final long j, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1212533791);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            fdaeVar2 = fdaeVar;
            i2 |= true != hmlVarC.F(fdaeVar2) ? 128 : 256;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            egc egcVar = dtdc.a;
            dtdi.e(fdaeVar2, null, false, null, dtdc.f(j, hmlVarC, 13), null, hxe.d(784463516, new dlme(str), hmlVarC), hmlVarC, ((i2 >> 6) & 14) | 805306368, 494);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dllx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    long j2 = j;
                    dlmf.b(str2, j2, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dlmg dlmgVar, ics icsVar, long j, long j2, long j3, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        long j4;
        long j5;
        long j6;
        ics icsVar2;
        final ics icsVar3;
        hml hmlVar2;
        final long j7;
        final long j8;
        final long j9;
        fdatVar.getClass();
        hml hmlVarC = hmlVar.c(-7607429);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dlmgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 65536 : 131072;
        }
        int i4 = i3;
        if ((74899 & i4) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            j9 = j;
            j7 = j2;
            j8 = j3;
            hmlVar2 = hmlVarC;
        } else {
            int i5 = i4 & (-65409);
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                ico icoVar = ics.e;
                j4 = glz.a(hmlVarC).p;
                j5 = glz.a(hmlVarC).s;
                j6 = glz.a(hmlVarC).a;
                icsVar2 = icoVar;
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
                j4 = j;
                j5 = j2;
                j6 = j3;
            }
            hmlVarC.l();
            hmlVarC.u(1279207308, true);
            float f = hce.a;
            dok dokVar = hgs.a;
            dok dokVar2 = hgs.a;
            boolean zE = hmlVarC.E(true) | hmlVarC.D(dokVar2);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zE || objS == hmk.a) {
                objS = new hcj(dokVar2);
                hmwVar.af(objS);
            }
            hcj hcjVar = (hcj) objS;
            hmwVar.ab();
            float f2 = dtif.a;
            hmlVarC.v(2063781281);
            int iEp = ((kio) hmlVarC.e(jmh.e)).ep(4.0f);
            hmlVarC.v(5004770);
            boolean zB = hmlVarC.B(iEp);
            Object objS2 = hmwVar.S();
            if (zB || objS2 == hmk.a) {
                objS2 = new dtie(iEp);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hmwVar.ab();
            long j10 = j4;
            long j11 = j5;
            long j12 = j6;
            int i6 = i5 << 6;
            ics icsVar4 = icsVar2;
            dtii.b((dtie) objS2, hxe.d(-357042320, new dlmb(dlmgVar, j4, j5, j6, hcjVar), hmlVarC), hcjVar, icsVar4, false, false, fdatVar, hmlVarC, (i6 & 29360128) | (i6 & 7168) | 48);
            hmlVarC.v(-1633490746);
            boolean zF = ((i4 & 14) == 4) | hmlVarC.F(hcjVar);
            Object objS3 = hmwVar.S();
            if (zF || objS3 == hmk.a) {
                objS3 = new dlmc(dlmgVar, hcjVar, null);
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            hob.g(true, (fdat) objS3, hmlVarC);
            icsVar3 = icsVar4;
            hmlVar2 = hmlVarC;
            j7 = j11;
            j8 = j12;
            j9 = j10;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dllu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlmg dlmgVar2 = dlmgVar;
                    ics icsVar5 = icsVar3;
                    long j13 = j9;
                    long j14 = j7;
                    long j15 = j8;
                    dlmf.c(dlmgVar2, icsVar5, j13, j14, j15, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

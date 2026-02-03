package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dayz {
    public static final void a(final String str, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(116328146);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtdi.a(fdaeVar, efy.j(egq.d(ics.e, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7), false, null, null, null, null, null, hxe.d(-2063791902, new dayv(str), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 805306416, 508);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dayq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dayz.a(str2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final daxr daxrVar, final dayo dayoVar, hml hmlVar, final int i) {
        int i2;
        jyq jyqVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1914522969);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(daxrVar) : hmlVarC.F(daxrVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1610575062);
            jul julVar = new jul((byte[]) null);
            julVar.f(daxrVar.a);
            diio diioVar = daxrVar.c;
            hmlVarC.v(1610577941);
            if (diioVar != null) {
                julVar.a.add(new juk(new jux(diioVar.a, new jyj(new jxx(glz.a(hmlVarC).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), 14)), diioVar.b, diioVar.c, null, 8));
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            juo juoVarB = julVar.b();
            hmwVar.ab();
            long j = glz.a(hmlVarC).s;
            if (daxrVar.d) {
                hmlVarC.v(1610591491);
                jyqVar = glz.d(hmlVarC).k;
                hmwVar.ab();
            } else {
                hmlVarC.v(1610592994);
                jyqVar = glz.d(hmlVarC).l;
                hmwVar.ab();
            }
            ico icoVar = ics.e;
            dthx.a(juoVarB, efy.i(icoVar, 0.0f, 20.0f, 1), j, 0L, 0L, null, 0L, 0, false, 0, null, null, jyqVar, hmlVarC, 48, 0, 65528);
            egt.a(egq.k(icoVar, 4.0f), hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dayu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    daxr daxrVar2 = daxrVar;
                    int i4 = i;
                    dayz.b(daxrVar2, dayoVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dayp daypVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1519343272);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(daypVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new gun();
                hmwVar.af(objS);
            }
            gun gunVar = (gun) objS;
            hmwVar.ab();
            dayo dayoVar = daypVar.h;
            ics icsVarZ = ics.e;
            if (!dayoVar.a) {
                icsVarZ = egq.z(icsVarZ, null, 3);
            }
            hmlVar2 = hmlVarC;
            dtgq.a(icsVarZ, hxe.d(1512253460, new dayw(daypVar), hmlVarC), null, hxe.d(1930142162, new dayx(gunVar), hmlVarC), null, 0, glz.a(hmlVarC).p, 0L, ehv.f(hmlVarC), hxe.d(-973379351, new dayy(daypVar, gunVar), hmlVarC), hmlVar2, 805309488, 180);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: days
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dayz.c(daypVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final edp edpVar, final daxu daxuVar, final dazu dazuVar, final dauy dauyVar, final daxr daxrVar, final gun gunVar, final fdae fdaeVar, final dayo dayoVar, hml hmlVar, final int i) {
        int i2;
        gun gunVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-772002568);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(daxuVar) : hmlVarC.F(daxuVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dazuVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(dauyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? hmlVarC.D(daxrVar) : hmlVarC.F(daxrVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            gunVar2 = gunVar;
            i2 |= true != hmlVarC.D(gunVar2) ? 65536 : 131072;
        } else {
            gunVar2 = gunVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != ((16777216 & i) == 0 ? hmlVarC.D(dayoVar) : hmlVarC.F(dayoVar)) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i4 = i2;
        if ((4793491 & i4) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i5 = i4 >> 3;
            int i6 = i4 & 14;
            if (dauyVar.c) {
                hmlVarC.v(821797632);
                dazp.g(edpVar, daxuVar, dauyVar, gunVar2, hmlVarC, ((i4 >> 6) & 7168) | (i5 & 896) | i6 | 64 | (i4 & 112));
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(821906876);
                dbaa.b(edpVar, dazuVar, hmlVarC, (i5 & 112) | i6);
                ((hmw) hmlVarC).ab();
            }
            ecq ecqVar = daxrVar != null ? daxrVar.b : ecr.d;
            hmlVarC.v(1134898125);
            if (dayoVar.a) {
                egt.a(edp.b(ics.e, 1.0f, true), hmlVarC);
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            ics icsVarB = egq.b(ics.e, 1.0f);
            ixm ixmVarA = edl.a(ecqVar, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = (jB >>> 32) ^ jB;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarB);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            int i7 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i7))) {
                Integer numValueOf = Integer.valueOf(i7);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB2, jbb.c);
            hmlVarC.v(1103771935);
            if (daxrVar != null) {
                b(daxrVar, dayoVar, hmlVarC, (i4 >> 18) & 112);
            }
            hmwVar.ab();
            hmlVarC.v(1103773646);
            if (fdaeVar != null) {
                String str = dauyVar.a.b().e;
                str.getClass();
                a(str, fdaeVar, hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dayt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    daxu daxuVar2 = daxuVar;
                    dazu dazuVar2 = dazuVar;
                    dauy dauyVar2 = dauyVar;
                    daxr daxrVar2 = daxrVar;
                    gun gunVar3 = gunVar;
                    fdae fdaeVar3 = fdaeVar;
                    dayz.d(edpVar2, daxuVar2, dazuVar2, dauyVar2, daxrVar2, gunVar3, fdaeVar3, dayoVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final edp edpVar, final dazu dazuVar, final daxr daxrVar, final dayo dayoVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1219537027);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(dazuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(daxrVar) : hmlVarC.F(daxrVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? hmlVarC.D(dayoVar) : hmlVarC.F(dayoVar)) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dbaa.b(edpVar, dazuVar, hmlVarC, i2 & 126);
            egt.a(edp.b(ics.e, 1.0f, true), hmlVarC);
            if (daxrVar != null) {
                b(daxrVar, dayoVar, hmlVarC, (i2 >> 6) & 112);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dayr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    dazu dazuVar2 = dazuVar;
                    daxr daxrVar2 = daxrVar;
                    dayz.e(edpVar2, dazuVar2, daxrVar2, dayoVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

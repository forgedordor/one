package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkan {
    public static final void a(final ego egoVar, final dkao dkaoVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2051979187);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(egoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dkaoVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            dkqr.o(dkaoVar.a, null, egq.k(icoVar, 40.0f), 0, null, hmlVarC, 432, 24);
            ics icsVarI = efy.i(egoVar.a(icoVar, 1.0f, true), 16.0f, 0.0f, 2);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = dkaa.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarI);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
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
            h(dkaoVar.b, hmlVarC, 0);
            String str = dkaoVar.d;
            hmlVarC.v(-1329603986);
            if (str != null) {
                f(str, hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkai
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ego egoVar2 = egoVar;
                    int i4 = i;
                    dkan.a(egoVar2, dkaoVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dkao dkaoVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1249244177);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkaoVar) ? 2 : 4) | i;
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
            hmlVarC.v(2067193466);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            String str = dkaoVar.d;
            hmlVarC.v(2067209114);
            hwv hwvVarD = str == null ? null : hxe.d(1209039382, new dkaj(str), hmlVarC);
            hmwVar.ab();
            icsVar2 = icsVar;
            dtfr.a(hxe.d(222040653, new dkak(dkaoVar), hmlVarC), icsVar2, null, hwvVarD, hxe.d(-1757862063, new dkal(dkaoVar), hmlVarC), hxe.d(-1179095918, new dkam(dkaoVar), hmlVarC), dtfp.a(ije.g, hmlVarC, 510), hmlVarC, 221190, 388);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkae
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkao dkaoVar2 = dkaoVar;
                    int i4 = i;
                    dkan.b(dkaoVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final String str, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(340501333);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            int iA = dlss.a(BasePaymentResult.ERROR_REQUEST_FAILED);
            int i4 = i2;
            Uri uri = Uri.parse(str);
            iva ivaVar = iuz.b;
            Integer numValueOf = Integer.valueOf(iA);
            hmlVar2 = hmlVarC;
            djrv.a(uri, "custom sticker", icsVar, null, null, null, ivaVar, null, 0.0f, numValueOf, numValueOf, null, null, null, null, null, hmlVar2, ((i4 << 3) & 896) | 12582960, 0, 518008);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkah
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    dkan.c(str2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final dkao dkaoVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1424455496);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkaoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1192846782);
            ics icsVarA = iex.a(efy.i(egq.u(egq.d(icsVar, 1.0f), 68.0f, 0.0f, 2), 0.0f, 2.0f, 1), evn.b(24.0f));
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            ics icsVarI = efy.i(icsVarA, 16.0f, 0.0f, 2);
            icc iccVar = ibw.n;
            eci eciVar = ecr.a;
            ixm ixmVarA = egk.a(eciVar, iccVar, hmlVarC, 48);
            int iA = dkaa.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarI);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            ics icsVarD = egq.d(icsVar, 1.0f);
            ecq ecqVar = ecr.c;
            ibx ibxVar = ibw.j;
            int i4 = i2;
            ixm ixmVarA2 = edl.a(ecqVar, ibxVar, hmlVarC, 0);
            int iA2 = dkaa.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarD);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            ico icoVar = ics.e;
            ixm ixmVarA3 = egk.a(eciVar, iccVar, hmlVarC, 48);
            int iA3 = dkaa.a(hmg.b(hmlVarC));
            hxi hxiVarAk3 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVarC, icoVar);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA3, fdatVar);
            hsk.b(hmlVarC, hxiVarAk3, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar.af(numValueOf3);
                hmlVarC.h(numValueOf3, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar4);
            a(egp.a, dkaoVar, hmlVarC, ((i4 << 3) & 112) | 6);
            hmlVarC.n();
            c(((djzy) dkaoVar.c).a, efy.j(edp.a(icoVar, ibxVar), 0.0f, 8.0f, 0.0f, 0.0f, 13), hmlVarC, 0);
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkaf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkao dkaoVar2 = dkaoVar;
                    int i5 = i;
                    dkan.d(dkaoVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dkao dkaoVar, final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        dkaoVar.getClass();
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-1538181723);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(dkaoVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            djzz djzzVar = dkaoVar.c;
            if (djzzVar instanceof djzy) {
                hmlVarC.v(-723881268);
                d(dkaoVar, icsVar, hmlVarC, i3 & 126);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(djzzVar instanceof djzx)) {
                    hmlVarC.v(-723882481);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(-723879478);
                b(dkaoVar, icsVar, hmlVarC, i3 & 126);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkad
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkao dkaoVar2 = dkaoVar;
                    int i6 = i;
                    dkan.e(dkaoVar2, icsVar, (hml) obj, hpy.a(i6 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1626376179);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, null, glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVarC).l, hmlVar2, i2 & 14, 3120, 55290);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkab
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkan.f(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1215071742);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, hmlVar2, i2 & 14, 3120, 120830);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkag
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkan.g(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1678108803);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, null, glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVarC).j, hmlVar2, i2 & 14, 3120, 55290);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkac
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkan.h(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

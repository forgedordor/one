package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzf {
    public static final void a(final xtt xttVar, fdae fdaeVar, hml hmlVar, final int i) {
        final fdae fdaeVar2;
        xttVar.getClass();
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(864594986);
        int i3 = i2 == 0 ? i | (true != hmlVarC.D(xttVar) ? 2 : 4) : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            djrr djrrVar = d(hoxVar) ? djrr.t : djrr.s;
            ico icoVar = ics.e;
            ecq ecqVar = ecr.c;
            ibx ibxVar = ibw.j;
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVarC, 0);
            int iA = zyw.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            int i4 = i3;
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar3);
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
            String str = xttVar.a;
            dkdk dkdkVar = new dkdk(djrrVar);
            hmlVarC.v(5004770);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdae() { // from class: zzb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hoxVar.b(Boolean.valueOf(!zzf.d(r0)));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            dkef.a(new dkeg(str, null, null, null, null, null, dkdkVar, (fdae) objS2, 62), null, hmlVarC, 0, 2);
            hmlVarC.v(1840849071);
            if (d(hoxVar)) {
                ics icsVarI = efy.i(icoVar, 8.0f, 0.0f, 2);
                ixm ixmVarA2 = edl.a(ecqVar, ibxVar, hmlVarC, 0);
                int iA2 = zyw.a(hmg.b(hmlVarC));
                hxi hxiVarAk2 = hmwVar.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVarI);
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar3);
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
                hmlVarC.v(472235001);
                List list = xttVar.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((xtt) obj2).b) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b((xtt) it.next(), fdaeVar, hmlVarC, i4 & 112);
                }
                fdaeVar2 = fdaeVar;
                hmwVar.ab();
                hmlVarC.n();
            } else {
                fdaeVar2 = fdaeVar;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zzc
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    xtt xttVar2 = xttVar;
                    int i5 = i;
                    zzf.a(xttVar2, fdaeVar2, (hml) obj3, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final xtt xttVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        xttVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(418075945);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(xttVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (xttVar.b) {
            String str = xttVar.a;
            hmlVarC.v(-1633490746);
            boolean z = (i2 & 112) == 32;
            boolean z2 = (i2 & 14) == 4;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z2 | z) || objS == hmk.a) {
                objS = new fdae() { // from class: zyx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdaeVar.invoke();
                        xttVar.d.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dkef.a(new dkeg(str, null, null, null, null, null, null, (fdae) objS, 126), null, hmlVarC, 0, 2);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zyy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xtt xttVar2 = xttVar;
                    int i4 = i;
                    zzf.b(xttVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final zyv zyvVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(87463934);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zyvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            egc egcVarH = efy.h(0.0f, 8.0f, 0.0f, 8.0f, 5);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: zyz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eio eioVar = (eio) obj;
                        eioVar.getClass();
                        ejk.a(eioVar, null, zyu.a, 3);
                        ArrayList arrayList = new ArrayList();
                        zyv zyvVar2 = zyvVar;
                        for (Object obj2 : zyvVar2.a) {
                            if (((xtt) obj2).b) {
                                arrayList.add(obj2);
                            }
                        }
                        eioVar.a(arrayList.size(), null, new zzd(arrayList), new hxd(802480018, true, new zze(arrayList, zyvVar2)));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            eig.a(null, null, egcVarH, false, null, null, null, false, null, (fdap) objS, hmlVarC, 384, 507);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zza
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    zzf.c(zyvVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean d(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }
}

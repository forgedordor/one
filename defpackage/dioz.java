package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dioz {
    public static final void a(final ede edeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1366866309);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = idb.a(dkl.a(edeVar.a(efy.j(egq.k(icoVar, 32.0f), 4.0f, 0.0f, 0.0f, 4.0f, 6), ibw.g), glz.a(hmlVarC).a, evn.a), 1.0f);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = diou.a(hmg.b(hmlVarC));
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
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dtfn.a(djrs.b(djrr.cS, hmlVarC), jqu.b(R.string.attachment_bubble_magic_edit, hmlVarC), edf.a.a(efy.d(egq.c(icoVar, 1.0f), 4.0f), ibw.e), glz.a(hmlVarC).b, hmlVarC, 0, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diov
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dioz.a(edeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dipa dipaVar, ics icsVar, final ije ijeVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        fdauVar.getClass();
        hml hmlVarC = hmlVar.c(1244131132);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dipaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(ijeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = diou.a(hmg.b(hmlVarC));
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
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            edf edfVar = edf.a;
            ics icsVarJ = efy.j(icoVar, 0.0f, 8.0f, 8.0f, 0.0f, 9);
            eve eveVar = glz.c(hmlVarC).c;
            hmlVarC.v(5004770);
            int i4 = i3 & 14;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: diow
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dipa dipaVar2 = dipaVar;
                        (dipaVar2.d ? dipaVar2.c : dipaVar2.b).invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            gvk.e((fdae) objS, icsVarJ, false, eveVar, 0L, 0L, 0.0f, null, null, hxe.d(-1380972661, new dioy(fdauVar), hmlVarC), hmlVarC, 1012);
            hmlVarC = hmlVarC;
            hmlVarC.v(1851334954);
            if (dipaVar.d) {
                a(edfVar, hmlVarC, 6);
            }
            hmwVar.ab();
            diww.a(edfVar, new diwx(dipaVar.a), ijeVar, null, hmlVarC, (i3 & 896) | 6, 4);
            hmlVarC.n();
            icsVar2 = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diox
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dipa dipaVar2 = dipaVar;
                    ics icsVar3 = icsVar2;
                    ije ijeVar2 = ijeVar;
                    dioz.b(dipaVar2, icsVar3, ijeVar2, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

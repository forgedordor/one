package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksp {
    public static final void a(final ics icsVar, final dkst dkstVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2084979778);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dkstVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dkfd.a(egq.k(icsVar, 48.0f), egq.c(ics.e, 1.0f), 0.0f, djrs.b(dkstVar.b, hmlVarC), jqu.b(R.string.pending_bubble_retry_button_content_description, hmlVarC), 0L, dkstVar.a, hmlVarC, 48, 36);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dksm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dksp.a(icsVar2, dkstVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final dksw dkswVar, hml hmlVar, final int i) {
        int i2;
        fctx fctxVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1211794698);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dkswVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ixm ixmVarA = ecz.a(ibw.e, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            inz inzVarB = djrs.b(djrr.ak, hmlVarC);
            ico icoVar = ics.e;
            dkfd.a(egq.k(icoVar, 24.0f), null, 0.0f, inzVarB, jqu.b(R.string.pending_bubble_cancel_button_content_description, hmlVarC), 0L, dkswVar.b, hmlVarC, 6, 38);
            Float f = dkswVar.a;
            hmlVarC.v(-749106470);
            if (f == null) {
                fctxVar = null;
            } else {
                float fFloatValue = f.floatValue();
                gqs.g(fFloatValue, dihi.a(egq.k(icoVar, 36.0f), jqu.c(R.string.pending_bubble_finite_spinner_content_description, new Object[]{Integer.valueOf((int) (100.0f * fFloatValue))}, hmlVarC), true), 0L, 0.0f, glz.a(hmlVarC).c, 0, hmlVarC, 0);
                fctxVar = fctx.a;
            }
            hmwVar.ab();
            hmlVarC.v(-749106999);
            if (fctxVar == null) {
                gqs.d(dihi.a(egq.k(icoVar, 36.0f), jqu.b(R.string.pending_bubble_infinite_spinner_content_description, hmlVarC), true), 0L, 0.0f, glz.a(hmlVarC).c, 0, 0.0f, hmlVarC, 0, 54);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dksn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i5 = i;
                    dksp.b(icsVar2, dkswVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dksx dksxVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-2069053281);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dksxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icsVar = ics.e;
            hmlVarC.v(5004770);
            int i4 = i3 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new dkso(dksxVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(dksxVar, (fdat) objS, hmlVarC);
            if (dksxVar instanceof dksw) {
                hmlVarC.v(209661488);
                b(icsVar, (dksw) dksxVar, hmlVarC, (i3 >> 3) & 14);
                hmwVar.ab();
            } else {
                if (!(dksxVar instanceof dkst)) {
                    hmlVarC.v(209659750);
                    hmwVar.ab();
                    throw new fctg();
                }
                hmlVarC.v(209664365);
                a(icsVar, (dkst) dksxVar, hmlVarC, (i3 >> 3) & 14);
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dksl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dksx dksxVar2 = dksxVar;
                    int i5 = i;
                    dksp.c(dksxVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

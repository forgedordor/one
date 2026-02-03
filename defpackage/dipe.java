package defpackage;

import android.text.format.DateUtils;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipe {
    public static final void a(final float f, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(304703075);
        if (i3 == 0) {
            i2 = (true != hmlVarC.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ecz.b(dkl.a(iex.a(egq.k(ics.e, f), evn.a), glz.a(hmlVarC).w, ikj.a), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dipd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dipe.a(f, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dipg dipgVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        long j;
        hml hmlVar2;
        hml hmlVarC = hmlVar.c(-581172012);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dipgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            hmlVar2 = hmlVarC;
        } else {
            icsVar2 = ics.e;
            ixm ixmVarA = egk.a(ecr.e, ibw.n, hmlVarC, 54);
            int iA = dipb.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar2);
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
            ics icsVarK = egq.k(icsVar2, 8.0f);
            ixm ixmVarA2 = ecz.a(ibw.e, false);
            int iA2 = dipb.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarK);
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
            hmlVarC.v(-662782749);
            float f = ((kir) dfq.c(dfq.b(hmlVarC), new kir(4.0f), new kir(8.0f), diu.c, dljt.d(hmlVarC).e, hmlVarC, 33208).a()).a;
            hmwVar.ab();
            a(f, hmlVarC, 0);
            hmlVarC.n();
            ics icsVarJ = efy.j(icsVar2, 7.0f, 0.0f, 0.0f, 0.0f, 14);
            Duration duration = dipgVar.a;
            String elapsedTime = DateUtils.formatElapsedTime(duration.getSeconds());
            elapsedTime.getClass();
            hmlVarC.v(-1182005364);
            Duration durationMinus = dipgVar.b.minus(duration);
            Duration duration2 = dipf.a;
            if (durationMinus.compareTo(dipf.a) <= 0) {
                hmlVarC.v(1315185261);
                j = glz.a(hmlVarC).w;
                hmwVar.ab();
            } else {
                hmlVarC.v(1315232009);
                j = glz.a(hmlVarC).q;
                hmwVar.ab();
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dthx.b(elapsedTime, icsVarJ, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyq.y(glz.d(hmlVarC).k, 0L, 0L, null, null, null, "tnum", 0L, null, 0, 0, 0L, null, null, 0, 16777151), hmlVar2, 48, 0, 65528);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dipc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dipg dipgVar2 = dipgVar;
                    int i3 = i;
                    dipe.b(dipgVar2, icsVar2, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

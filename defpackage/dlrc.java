package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlrc {
    public static final void a(final ede edeVar, final String str, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1351040213);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = joj.a(efy.j(edeVar.a(ics.e, ibw.g), 8.0f, 0.0f, 0.0f, 8.0f, 6), "video_controls_duration_tag");
            long j = dljt.a(hmlVarC).i;
            gvk.c(icsVarA, evn.a, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.7f, ije.f(j)), 0L, 0.0f, 0.0f, null, hxe.d(1818921584, new dlra(str), hmlVarC), hmlVarC, 120);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlqy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    int i4 = i;
                    dlrc.a(edeVar2, str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final djrr djrrVar, String str, hml hmlVar, final int i) {
        int i2;
        final String str2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1366438761);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            str2 = str;
        } else {
            ico icoVar = ics.e;
            egt.a(dkl.a(egq.k(icoVar, 16.0f), ije.a, ikj.a), hmlVarC);
            str2 = str;
            dtfn.a(djrs.b(djrrVar, hmlVarC), str2, egq.k(icoVar, 40.0f), ije.d, hmlVarC, (i2 & 112) | 3456, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlqw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    int i4 = i;
                    dlrc.b(djrrVar2, str2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ede edeVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1150281173);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djrr djrrVar = djrr.di;
            hmlVarC.v(1517949801);
            String strB = jqu.b(R.string.video_controls_play_content_description, hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            if (fdaeVar != null) {
                hmlVarC.v(1518053713);
                dtfk.b(fdaeVar, edeVar.a(ics.e, ibw.e), false, null, null, hxe.d(-164085724, new dlrb(djrrVar, strB), hmlVarC), hmlVarC, ((i2 >> 6) & 14) | 1572864, 60);
                hmwVar.ab();
            } else {
                hmlVarC.v(1518224678);
                ico icoVar = ics.e;
                iby ibyVar = ibw.e;
                ics icsVarA = edeVar.a(icoVar, ibyVar);
                ixm ixmVarA = ecz.a(ibyVar, false);
                int iA = dlqv.a(hmg.b(hmlVarC));
                hxi hxiVarAk = hmwVar.ak();
                ics icsVarB = icj.b(hmlVarC, icsVarA);
                fdae fdaeVar2 = jbb.a;
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar2);
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
                b(djrrVar, strB, hmlVarC, 0);
                hmlVarC.n();
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlqx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    int i4 = i;
                    dlrc.c(edeVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ede edeVar, final dlre dlreVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1713133330);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dlreVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarB = edeVar.b(ics.e);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dlqv.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarB);
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
            hsk.b(hmlVarC, icsVarB2, jbb.c);
            edf edfVar = edf.a;
            hmlVarC.v(810941445);
            c(edfVar, dlreVar.b, hmlVarC, 6);
            hmwVar.ab();
            String str = dlreVar.a;
            hmlVarC.v(810946223);
            if (str != null) {
                a(edfVar, str, hmlVarC, 6);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlqz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    dlre dlreVar2 = dlreVar;
                    int i4 = i;
                    dlrc.d(edeVar2, dlreVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

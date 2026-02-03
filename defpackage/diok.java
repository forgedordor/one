package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diok {
    public static final void a(final dili diliVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1355257528);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diliVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djuc.d(new djue(djrr.eG, diliVar.a, diliVar.b, false, true, 32), efm.b(icsVar, 2), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dioj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dili diliVar2 = diliVar;
                    int i4 = i;
                    diok.a(diliVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dilj diljVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-638731328);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diljVar) ? 2 : 4) | i;
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
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dioe.a(hmg.b(hmlVarC));
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
            ics icsVarA = ecs.a(ics.e, 1.0f, false);
            Uri uri = diljVar.a;
            Uri uri2 = diljVar.b;
            String str = diljVar.c;
            dike dikeVar = diljVar.d;
            djrv.a(uri, str, icsVarA, uri2, null, null, iuz.a, null, 0.0f, null, null, null, null, null, dikeVar != null ? new dilo(dikeVar) : null, null, hmlVarC, 12583296, 0, 393072);
            hmlVar2 = hmlVarC;
            d(edfVar, false, hmlVar2, 6, 1);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diof
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dilj diljVar2 = diljVar;
                    int i4 = i;
                    diok.b(diljVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2115820536);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dioe.a(hmg.b(hmlVarC));
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
            egt.a(dkto.a(ecs.a(ics.e, 1.0f, false), new ije(ije.g), new ije(glz.a(hmlVarC).v), true), hmlVarC);
            d(edfVar, true, hmlVarC, 54, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dioi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    diok.c(icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final ede edeVar, boolean z, hml hmlVar, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(-166802540);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if (i2 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            z2 = z;
        } else {
            boolean z3 = (z ? 1 : 0) & (i2 ^ 1);
            ics icsVarA = edeVar.a(egq.k(ics.e, 32.0f), ibw.e);
            inz inzVarB = djrs.b(djrr.di, hmlVarC);
            hmlVarC.v(-1383442530);
            long j = z3 != 0 ? glz.a(hmlVarC).s : ije.d;
            ((hmw) hmlVarC).ab();
            dtfn.a(inzVarB, null, icsVarA, j, hmlVarC, 0, 0);
            z2 = z3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final boolean z4 = true == z2;
            hpxVarL.d = new fdat() { // from class: diog
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    int i5 = i;
                    diok.d(edeVar2, z4, (hml) obj, hpy.a(i5 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dill dillVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(193162915);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dillVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = dillVar instanceof dilk;
            ico icoVar = ics.e;
            if (z) {
                hmlVarC.v(945972480);
                c(icoVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            } else if (dillVar instanceof dilj) {
                hmlVarC.v(945974725);
                b((dilj) dillVar, icoVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(dillVar instanceof dili)) {
                    hmlVarC.v(945970927);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(945977092);
                a((dili) dillVar, icoVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            }
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dioh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dill dillVar2 = dillVar;
                    int i4 = i;
                    diok.e(dillVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

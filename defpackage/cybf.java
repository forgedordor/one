package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cybf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/debug/cloudstore/d2d/D2dToolsPage");
    public final axky b;
    public final Context c;
    public final fdkf d;
    public final fdkf e;
    private final fdjx f;

    /* compiled from: PG */
    public interface a {
        cyaq fU();
    }

    public cybf(axky axkyVar, fdjx fdjxVar, Context context) {
        axkyVar.getClass();
        fdjxVar.getClass();
        context.getClass();
        this.b = axkyVar;
        this.f = fdjxVar;
        this.c = context;
        fdjz fdjzVar = fdjz.b;
        fcyi fcyiVar = fcyi.a;
        this.d = fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new cybi(null, this));
        this.e = fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new cybj(null, this));
    }

    public final void a(hox hoxVar, hml hmlVar, final int i) {
        int i2;
        final hox hoxVar2;
        hoxVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1810785934);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(hoxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hoxVar2 = hoxVar;
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            fdjx fdjxVar = (fdjx) objS;
            ibx ibxVar = ibw.k;
            ics icsVarC = dpc.c(ics.e, dpc.a(0, hmlVarC, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVarC, 48);
            int iA = cyaw.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
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
                Object objValueOf = Integer.valueOf(iA);
                hmwVar.af(objValueOf);
                hmlVarC.h(objValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(this);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new cybe(this, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hoxVar2 = hoxVar;
            d(fdjxVar, hoxVar2, (fdap) objS2, hmlVarC, ((i2 << 3) & 112) | 384 | ((i2 << 9) & 57344));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cybb
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cybf cybfVar = this.a;
                    int i4 = i;
                    cybfVar.a(hoxVar2, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(964275751);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl("", hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            ics icsVarD = egq.d(efy.j(ics.e, 0.0f, 10.0f, 0.0f, 0.0f, 13), 1.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVarC, 48);
            int iA = cyaw.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
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
            int i4 = (i2 << 3) & 112;
            a(hoxVar, hmlVarC, i4);
            fpf.a(null, 0L, 0.0f, hmlVarC, 0, 15);
            c((String) hoxVar.a(), hmlVarC, i4);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyay
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    this.a.b((hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void c(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        str.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1925167882);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            fst.a(efy.f(ics.e, 20.0f, 10.0f, 20.0f, 10.0f), null, cyan.b, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, hxe.d(1231822968, new cybh(str), hmlVarC), hmlVar2, 384, 12582912, 131066);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyax
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cybf cybfVar = this.a;
                    int i4 = i;
                    cybfVar.c(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void d(final fdjx fdjxVar, final hox hoxVar, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        fdjxVar.getClass();
        fdapVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1626415649);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdjxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D("getDeltaSyncEligibility") ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1224400529);
            boolean zF = hmlVarC.F(fdapVar) | ((i2 & 896) == 256) | hmlVarC.F(fdjxVar) | ((i2 & 112) == 32);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: cyaz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        auvw.k(fdjxVar, null, null, new cybc(hoxVar, fdapVar, null), 3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtdi.a((fdae) objS, joj.a(ics.e, "getDeltaSyncEligibilityButton"), false, null, null, null, null, null, hxe.d(-226498511, new cybd(), hmlVarC), hmlVarC, 805306368, 508);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyba
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cybf cybfVar = this.a;
                    fdjx fdjxVar2 = fdjxVar;
                    hox hoxVar2 = hoxVar;
                    cybfVar.d(fdjxVar2, hoxVar2, fdapVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

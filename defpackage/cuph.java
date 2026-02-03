package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuph {
    public static final void a(final cupi cupiVar, final Context context, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1109888170);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(cupiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(context) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarC = egq.c(ics.e, 1.0f);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: cupe
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        jto jtoVar = (jto) obj2;
                        jtoVar.getClass();
                        jtk.u(jtoVar, "sim_preference");
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarJ = efy.j(jsh.c(icsVarC, false, (fdap) objS), 15.0f, 0.0f, 0.0f, 0.0f, 14);
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(context) | hmlVarC.F(cupiVar);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new fdae() { // from class: cupf
                    @Override // defpackage.fdae
                    public final Object invoke() throws IOException {
                        eiid.p(context, cupiVar.c, null);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            ics icsVarE = dli.e(icsVarJ, false, null, (fdae) objS2, 15);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = cuoz.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
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
            String strC = cssf.c(cupiVar.a);
            strC.getClass();
            hmlVar2 = hmlVarC;
            dthx.b(strC, null, e(hmlVarC), 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).j, hmlVar2, 0, 0, 65018);
            String strC2 = cssf.c(cupiVar.b);
            strC2.getClass();
            dthx.b(strC2, null, e(hmlVar2), 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, glz.d(hmlVar2).j, hmlVar2, 0, 0, 65018);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cupg
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cupi cupiVar2 = cupiVar;
                    int i4 = i;
                    cuph.a(cupiVar2, context, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final List list, final Context context, final Intent intent, hml hmlVar, final int i) {
        int i2;
        long j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-308216697);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(context) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(intent) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = cuoz.a(hmg.b(hmlVarC));
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
            d(hmlVarC, 6);
            c(context, intent, hmlVarC, (i2 >> 3) & 126);
            hmlVarC.v(186987320);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cupi cupiVar = (cupi) it.next();
                d(hmlVarC, 6);
                ics icsVarD = egq.d(icoVar, 1.0f);
                hmlVarC.v(1087211232);
                if (dlv.a(hmlVarC)) {
                    hmlVarC.v(761516272);
                    j = glz.a(hmlVarC).u;
                    hmwVar.ab();
                } else {
                    hmlVarC.v(761571824);
                    j = glz.a(hmlVarC).r;
                    hmwVar.ab();
                }
                hmwVar.ab();
                int i4 = i2;
                dtev.a(icsVarD, 0.0f, j, hmlVarC, 6, 2);
                d(hmlVarC, 6);
                a(cupiVar, context, hmlVarC, i4 & 112);
                i2 = i4;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cupb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    Context context2 = context;
                    int i5 = i;
                    cuph.b(list2, context2, intent, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final Context context, final Intent intent, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1722500702);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(context) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(intent) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarJ = efy.j(egq.c(ics.e, 1.0f), 15.0f, 0.0f, 0.0f, 0.0f, 14);
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(context) | hmlVarC.F(intent);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: cupc
                    @Override // defpackage.fdae
                    public final Object invoke() throws IOException {
                        eiid.p(context, intent, null);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarE = dli.e(icsVarJ, false, null, (fdae) objS, 15);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = cuoz.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
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
            String string = context.getString(R.string.general_settings);
            string.getClass();
            hmlVar2 = hmlVarC;
            dthx.b(string, null, e(hmlVarC), 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).j, hmlVar2, 0, 0, 65018);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cupd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Context context2 = context;
                    int i4 = i;
                    cuph.c(context2, intent, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(272086554);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(16) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            egt.a(egq.e(egq.d(ics.e, 1.0f), 16.0f), hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cupa
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cuph.d((hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final long e(hml hmlVar) {
        long j;
        hmlVar.v(1327463927);
        if (dlv.a(hmlVar)) {
            hmlVar.v(-1580934313);
            j = glz.a(hmlVar).v;
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(-1580876777);
            j = glz.a(hmlVar).s;
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return j;
    }
}

package defpackage;

import androidx.compose.foundation.selection.ToggleableElement;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djfx {
    public static final void a(final djfy djfyVar, final ije ijeVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        djfyVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-577445018);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (z) {
            hmlVarC.v(-1320326430);
            djdg.a(new djdh(djfyVar.a, null, djfyVar.e, djfyVar.f, 2), new ije(ije.g), new ije(glz.a(hmlVarC).q), true, hmlVarC, 3120, 0);
            ((hmw) hmlVarC).ab();
        } else {
            hmlVarC.v(-1319917044);
            if (ijeVar != null) {
                hmlVarC.v(-1319884928);
                gvk.c(iex.a(egq.d(ics.e, 1.0f), evn.d(24.0f, 24.0f, 0.0f, 0.0f, 12)), null, ijeVar.i, 0L, 0.0f, 0.0f, null, hxe.d(-317247680, new djfv(djfyVar), hmlVarC), hmlVarC, 122);
                hmlVarC = hmlVarC;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-1319666347);
                d(djfyVar, hmlVarC, i2 & 14);
                ((hmw) hmlVarC).ab();
            }
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djfs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djfy djfyVar2 = djfyVar;
                    ije ijeVar2 = ijeVar;
                    int i4 = i;
                    djfx.a(djfyVar2, ijeVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, final fdap fdapVar, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1066983511);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            ics icsVarJ = efy.j(egq.d(ics.e, 1.0f), 16.0f, 0.0f, 4.0f, 0.0f, 10);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = djfo.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar3);
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
            int i4 = i2 << 3;
            c(egp.a, str, fdapVar, hmlVarC, (i4 & 896) | (i4 & 112) | 6);
            fdaeVar2 = fdaeVar;
            dtfk.b(fdaeVar2, null, false, null, null, djar.a, hmlVarC, ((i2 >> 6) & 14) | 1572864, 62);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djfu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    fdap fdapVar2 = fdapVar;
                    int i5 = i;
                    djfx.b(str2, fdapVar2, fdaeVar2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ego egoVar, final String str, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1642521056);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(egoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            long j = glz.a(hmlVarC).q;
            hmlVarC.v(5004770);
            boolean zC = hmlVarC.C(j);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zC || objS == hmk.a) {
                objS = new hpl(new ikt(j), hsi.a);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            int i4 = i2 >> 3;
            hmlVar2 = hmlVarC;
            ewj.c(str, fdapVar, dihi.a(egoVar.a(ics.e, 1.0f, true), jqu.b(R.string.compose_subject_placeholder, hmlVarC), true), false, jyq.y(glz.d(hmlVarC).k, glz.a(hmlVarC).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), new fae(3, null, 0, 0, 126), null, false, 2, 0, null, null, null, (ikt) ((hox) objS).a(), hxe.d(1091585923, new djfw(str), hmlVarC), hmlVar2, (i4 & 14) | 806879232 | (i4 & 112), 196608, 15768);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djft
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ego egoVar2 = egoVar;
                    String str2 = str;
                    int i5 = i;
                    djfx.c(egoVar2, str2, fdapVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final djfy djfyVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-263108111);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarI = efy.i(ics.e, 0.0f, 8.0f, 1);
            ixm ixmVarA = edl.a(ecr.c, ibw.l, hmlVarC, 48);
            int iA = djfo.a(hmg.b(hmlVarC));
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
            e(djfyVar.b, djfyVar.d, hmlVarC, 0);
            b(djfyVar.a, djfyVar.c, djfyVar.f, hmlVarC, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djfr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djfx.d(djfyVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final boolean z, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1392555399);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            final String strB = jqu.b(R.string.compose_urgent_checked, hmlVarC);
            final String strB2 = jqu.b(R.string.compose_urgent_unchecked, hmlVarC);
            ico icoVar = ics.e;
            ics icsVarA = efy.j(icoVar, 0.0f, 0.0f, 14.0f, 0.0f, 11).a(new ToggleableElement(z, null, null, true, true, null, fdapVar));
            hmlVarC.v(-1746271574);
            boolean zD = hmlVarC.D(strB) | ((i4 & 14) == 4) | hmlVarC.D(strB2);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: djfp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.t(jtoVar, true != z ? strB2 : strB);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarC = jsh.c(icsVarA, false, (fdap) objS);
            ixm ixmVarA = egk.a(ecr.b, ibw.n, hmlVarC, 54);
            int iA = djfo.a(hmg.b(hmlVarC));
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
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            String upperCase = jqu.b(R.string.compose_urgent_label, hmlVarC).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            dthx.b(upperCase, null, glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).n, hmlVarC, 0, 0, 65530);
            hmlVar2 = hmlVarC;
            egt.a(egq.o(icoVar, 4.0f), hmlVar2);
            djae.b(new djah(z, fdapVar, 9), egq.k(icoVar, 28.0f), hmlVar2, 48, 0);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djfq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i5 = i;
                    djfx.e(z2, fdapVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

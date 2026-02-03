package defpackage;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfl {
    public static final void a(fdae fdaeVar, fdae fdaeVar2, final fdvc fdvcVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar3;
        final fdae fdaeVar4;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(492615927);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdvcVar) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar3 = fdaeVar;
            fdaeVar4 = fdaeVar2;
        } else {
            ecj ecjVar = ecr.e;
            ico icoVar = ics.e;
            ics icsVarD = egq.d(icoVar, 1.0f);
            ixm ixmVarA = egk.a(ecjVar, ibw.m, hmlVarC, 6);
            int iA = acez.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar5 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar5);
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
            egp egpVar = egp.a;
            dtdi.a(fdaeVar, egpVar.a(icoVar, 1.0f, true), false, null, null, null, null, null, acem.b, hmlVarC, (i4 & 14) | 805306368, 508);
            egt.a(egq.o(icoVar, 8.0f), hmlVarC);
            fdaeVar3 = fdaeVar;
            fdaeVar4 = fdaeVar2;
            dtdi.a(fdaeVar4, egpVar.a(icoVar, 1.0f, true), ((Boolean) hro.a(fdvcVar, hmlVarC).a()).booleanValue(), null, null, null, null, null, acem.c, hmlVarC, ((i4 >> 3) & 14) | 805306368, 504);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: acfd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar6 = fdaeVar3;
                    fdae fdaeVar7 = fdaeVar4;
                    int i5 = i;
                    acfl.a(fdaeVar6, fdaeVar7, fdvcVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final djrr djrrVar, final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(121449895);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, 0.0f, 16.0f, 1);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = acez.a(hmg.b(hmlVarC));
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
            dtfn.a(djrs.b(djrrVar, hmlVarC), null, egq.k(icoVar, 24.0f), 0L, hmlVarC, 432, 8);
            egt.a(egq.o(icoVar, 16.0f), hmlVarC);
            hmlVar2 = hmlVarC;
            dthx.b(str, null, glz.a(hmlVarC).s, 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).j, hmlVar2, (i2 >> 3) & 14, 0, 65018);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: acfi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    int i4 = i;
                    acfl.b(djrrVar2, str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final acey aceyVar, hml hmlVar, final int i) {
        int i2;
        ico icoVar;
        fdat fdatVar;
        fdat fdatVar2;
        hmw hmwVar;
        fdat fdatVar3;
        fdae fdaeVar;
        fdat fdatVar4;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2070927560);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(aceyVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar2 = ics.e;
            ics icsVarD = egq.d(icoVar2, 1.0f);
            long j = glz.a(hmlVarC).q;
            ics icsVarD2 = efy.d(dkl.a(dkr.b(icsVarD, dkz.a(1.0f, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.1f, ije.f(j))), evn.a(10)), glz.a(hmlVarC).J, evn.a(10)), 20.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVarC, 48);
            int iA = acez.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD2);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar5 = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar5);
            fdat fdatVar6 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar6);
            fdat fdatVar7 = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar7);
            }
            fdat fdatVar8 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar8);
            egt.a(egq.e(icoVar2, Settings.System.getFloat(((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getContentResolver(), "font_scale", 1.0f) * 12.0f), hmlVarC);
            hmlVarC.v(1062292511);
            String str = aceyVar.b;
            if (str != null) {
                icoVar = icoVar2;
                fdatVar = fdatVar8;
                fdatVar4 = fdatVar5;
                fdatVar2 = fdatVar6;
                hmwVar = hmwVar2;
                fdaeVar = fdaeVar2;
                fdatVar3 = fdatVar7;
                dthx.b(str, null, glz.a(hmlVarC).q, 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVarC, 0, 0, 65018);
                hmlVarC = hmlVarC;
            } else {
                icoVar = icoVar2;
                fdatVar = fdatVar8;
                fdatVar2 = fdatVar6;
                hmwVar = hmwVar2;
                fdatVar3 = fdatVar7;
                fdaeVar = fdaeVar2;
                fdatVar4 = fdatVar5;
            }
            hmwVar.ab();
            ics icsVarD3 = egq.d(icoVar, 1.0f);
            ixm ixmVarA2 = egk.a(ecr.e, ibw.n, hmlVarC, 54);
            int iA2 = acez.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarD3);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar4);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar);
            ico icoVar3 = icoVar;
            dkqr.h(new dkrk(new dkph(acfj.a, 0, 5), null, 0, 0, 0.0f, null, 62), egq.e(icoVar3, 40.0f), hmlVarC, 48);
            dkke.c(new dkkr("1", null, null, null, 66584574), egq.o(icoVar3, 200.0f), false, null, null, acem.a, hmlVarC, 197046, 24);
            hmlVarC.n();
            egt.a(egq.e(icoVar3, 20.0f), hmlVarC);
            hmlVar2 = hmlVarC;
            dthx.b(jqu.b(R.string.account_sign_out_profile_description, hmlVarC), null, glz.a(hmlVarC).s, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).l, hmlVar2, 0, 0, 65018);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: acfe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    acfl.c(aceyVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final acey aceyVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(732404236);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(aceyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            egt.a(egq.e(icoVar, 28.0f), hmlVarC);
            ics icsVarY = egq.y(egq.d(icoVar, 1.0f));
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = acez.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarY);
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
            c(aceyVar, hmlVarC, i2 & 14);
            e(edfVar, hmlVarC, 6);
            hmlVarC.n();
            egt.a(egq.e(icoVar, 16.0f), hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: acfa
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    acfl.d(aceyVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final ede edeVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1808089406);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarF = efy.f(dkl.a(efs.b(edeVar.a(icoVar, ibw.a), -12.0f, -24.0f), glz.a(hmlVarC).J, ikj.a), 12.0f, 12.0f, 20.0f, 20.0f);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = acez.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarF);
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
            dtfn.a(djrs.b(djrr.bt, hmlVarC), null, egq.k(icoVar, 24.0f), 0L, hmlVarC, 432, 8);
            egt.a(egq.o(icoVar, 16.0f), hmlVarC);
            hmlVar2 = hmlVarC;
            dthx.b("Profiles", null, glz.a(hmlVarC).s, 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).j, hmlVar2, 6, 0, 65018);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: acfb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    acfl.e(edeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final fdvc fdvcVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1125620956);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            acey aceyVar = (acey) hro.a(fdvcVar, hmlVarC).a();
            if (aceyVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: acfg
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            acfl.f(fdvcVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            gvk.c(ehm.b(egq.c(ics.e, 1.0f), ehv.f(hmlVarC)), null, 0L, 0L, 0.0f, 0.0f, null, hxe.d(1799200375, new acfk(aceyVar), hmlVarC), hmlVarC, 126);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: acfh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    acfl.f(fdvcVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final edp edpVar, final acey aceyVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1629923403);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(aceyVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String strB = jqu.b(R.string.account_sign_out_description, hmlVarC);
            jyq jyqVar = glz.d(hmlVarC).h;
            long j = glz.a(hmlVarC).s;
            ico icoVar = ics.e;
            dthx.b(strB, edp.a(icoVar, ibw.k), j, 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, jyqVar, hmlVarC, 0, 0, 65016);
            hmlVar2 = hmlVarC;
            egt.a(egq.e(icoVar, 12.0f), hmlVar2);
            ics icsVarE = efy.e(dkl.a(egq.d(icoVar, 1.0f), glz.a(hmlVar2).J, evn.a(10)), 32.0f, 16.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar2, 48);
            int iA = acez.a(hmg.b(hmlVar2));
            hmw hmwVar = (hmw) hmlVar2;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVar2, icsVarE);
            fdae fdaeVar = jbb.a;
            hmlVar2.x();
            if (hmwVar.z) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA, jbb.e);
            hsk.b(hmlVar2, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVar2.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar2, icsVarB, jbb.c);
            b(djrr.cq, jqu.b(R.string.account_sign_out_description_magic_compose, hmlVar2), hmlVar2, 6);
            b(djrr.aJ, jqu.b(R.string.account_sign_out_description_device_pairing, hmlVar2), hmlVar2, 6);
            hmlVar2.v(1834682741);
            if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
                b(djrr.bs, jqu.b(R.string.account_sign_out_description_gemini, hmlVar2), hmlVar2, 6);
            }
            hmwVar.ab();
            d(aceyVar, hmlVar2, (i2 >> 3) & 14);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: acff
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    int i4 = i;
                    acfl.g(edpVar2, aceyVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final edp edpVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(812056124);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            inz inzVarB = djrs.b(djrr.cZ, hmlVarC);
            ico icoVar = ics.e;
            ics icsVarK = egq.k(icoVar, 30.0f);
            ibx ibxVar = ibw.k;
            dtfn.a(inzVarB, null, edp.a(icsVarK, ibxVar), glz.a(hmlVarC).s, hmlVarC, 48, 0);
            egt.a(egq.e(icoVar, 20.0f), hmlVarC);
            hmlVar2 = hmlVarC;
            dthx.b(jqu.b(R.string.account_sign_out_title, hmlVarC), edp.a(icoVar, ibxVar), glz.a(hmlVarC).q, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).d, hmlVar2, 0, 0, 65016);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: acfc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    acfl.h(edpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

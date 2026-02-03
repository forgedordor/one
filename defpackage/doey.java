package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doey {
    public static final void a(final fdae fdaeVar, final fdae fdaeVar2, final fdae fdaeVar3, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1878492767);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar3) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = joj.a(efy.j(egq.b(icoVar, 1.0f), 16.0f, 0.0f, 0.0f, 16.0f, 6), "magic_compose_feedback");
            ixm ixmVarA = edl.a(ecr.d, ibw.j, hmlVarC, 6);
            int iA = doen.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar4 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar4);
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
            d(true, fdaeVar, hmlVarC, ((i2 << 3) & 112) | 6);
            d(false, fdaeVar2, hmlVarC, (i2 & 112) | 6);
            egt.a(egq.e(icoVar, 8.0f), hmlVarC);
            e(fdaeVar3, hmlVarC, (i2 >> 6) & 14);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: doet
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar5 = fdaeVar;
                    fdae fdaeVar6 = fdaeVar2;
                    int i4 = i;
                    doey.a(fdaeVar5, fdaeVar6, fdaeVar3, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdae fdaeVar, final fdae fdaeVar2, final fdae fdaeVar3, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(674846285);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar3) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 & 1022;
            if (((Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a)).orientation == 2) {
                hmlVarC.v(-395922605);
                c(fdaeVar, fdaeVar2, fdaeVar3, hmlVarC, i4);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-395748912);
                a(fdaeVar, fdaeVar2, fdaeVar3, hmlVarC, i4);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: doev
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar4 = fdaeVar;
                    fdae fdaeVar5 = fdaeVar2;
                    int i5 = i;
                    doey.b(fdaeVar4, fdaeVar5, fdaeVar3, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fdae fdaeVar, final fdae fdaeVar2, final fdae fdaeVar3, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(570639077);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar3) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = joj.a(efy.d(egq.b(icoVar, 1.0f), 8.0f), "magic_compose_feedback");
            ixm ixmVarA = egk.a(ecr.a, ibw.o, hmlVarC, 48);
            int iA = doen.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar4 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar4);
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
            d(true, fdaeVar, hmlVarC, ((i2 << 3) & 112) | 6);
            d(false, fdaeVar2, hmlVarC, (i2 & 112) | 6);
            egt.a(egq.o(icoVar, 8.0f), hmlVarC);
            e(fdaeVar3, hmlVarC, (i2 >> 6) & 14);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: doeo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar5 = fdaeVar;
                    fdae fdaeVar6 = fdaeVar2;
                    int i4 = i;
                    doey.c(fdaeVar5, fdaeVar6, fdaeVar3, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final boolean z, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1288631374);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            inz inzVarA = jqq.a(z ? R.drawable.gs_thumb_up_vd_theme_48 : R.drawable.gs_thumb_down_vd_theme_48, hmlVarC, 0);
            fdaeVar2 = fdaeVar;
            dtfk.b(fdaeVar2, null, false, dtfh.b(glz.a(hmlVarC).D, glz.a(hmlVarC).s, 0L, hmlVarC, 12), glz.c(hmlVarC).b, hxe.d(909326416, new doew(inzVarA, jqu.b(z ? R.string.magic_compose_thumbs_up_button_content_description : R.string.magic_compose_thumbs_down_button_content_description, hmlVarC)), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 1572864, 22);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: doep
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i4 = i;
                    doey.d(z2, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(605243205);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtfk.b(fdaeVar2, null, false, dtfh.b(glz.a(hmlVarC).D, glz.a(hmlVarC).s, 0L, hmlVarC, 12), glz.c(hmlVarC).b, dodk.b, hmlVarC, (i2 & 14) | 1572864, 22);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: doeu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    doey.e(fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final fdvc fdvcVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        long j;
        fdatVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1140356141);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = joj.a(efy.d(egq.b(egq.d(ics.e, 1.0f), 1.0f), 8.0f), "magic_compose");
            evm evmVarB = evn.b(24.0f);
            hpt hptVar = gdd.b;
            if (((Boolean) hmlVarC.e(hptVar)).booleanValue()) {
                hmlVarC.v(841884444);
                j = glz.a(hmlVarC).p;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(841941267);
                j = glz.a(hmlVarC).F;
                ((hmw) hmlVarC).ab();
            }
            gvk.c(icsVarA, evmVarB, j, 0L, true != ((Boolean) hmlVarC.e(hptVar)).booleanValue() ? 0.0f : 2.0f, 0.0f, null, hxe.d(1079257368, new doex(fdvcVar, fdatVar), hmlVarC), hmlVarC, 104);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: doeq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdvc fdvcVar2 = fdvcVar;
                    int i4 = i;
                    doey.f(fdvcVar2, fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final hsf hsfVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-399502333);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(hsfVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean zIsEmpty = ((dofj) hsfVar.a()).a.isEmpty();
            ibx ibxVar = ibw.l;
            ecq ecqVar = ecr.c;
            ico icoVar = ics.e;
            ics icsVarD = egq.d(icoVar, 1.0f);
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVarC, 54);
            int iA = doen.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
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
            edp edpVar = edp.a;
            hmlVarC.v(-2134209752);
            if (((dofj) hsfVar.a()).p == 2 && !((dofj) hsfVar.a()).b.isEmpty() && !fdbq.f(((dofj) hsfVar.a()).c, dodz.h)) {
                List list = ((dofj) hsfVar.a()).b;
                int i4 = ((dofj) hsfVar.a()).n;
                hmlVarC.v(1849434622);
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = new fdap() { // from class: doer
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            dlff dlffVar = (dlff) obj;
                            dlffVar.getClass();
                            dlffVar.c.invoke();
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                dlfe.b(new dleo(list, i4, (fdap) objS), null, hmlVarC, 0);
            }
            hmwVar.ab();
            doeb doebVar = ((dofj) hsfVar.a()).c;
            if (doebVar != null) {
                hmlVarC.v(-1735329067);
                dodx.f(doebVar, ((dofj) hsfVar.a()).d, ((dofj) hsfVar.a()).e, edp.a(icoVar, ibw.k), hmlVarC, 0);
                hmwVar.ab();
            } else {
                hmlVarC.v(-1735098334);
                cye.f(edpVar, zIsEmpty, null, null, dae.m(dea.c(250, 0, null, 6), 2), null, dodk.a, hmlVarC, 1597446, 22);
                hmlVarC = hmlVarC;
                if (!zIsEmpty) {
                    if (((dofj) hsfVar.a()).k) {
                        hmlVarC.v(-1734747879);
                        icc iccVar = ibw.m;
                        eci eciVar = ecr.a;
                        ics icsVarC = egq.c(icoVar, 1.0f);
                        ixm ixmVarA2 = egk.a(eciVar, iccVar, hmlVarC, 54);
                        int iA2 = doen.a(hmg.b(hmlVarC));
                        hxi hxiVarAk2 = hmwVar.ak();
                        ics icsVarB2 = icj.b(hmlVarC, icsVarC);
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
                        b(((dofj) hsfVar.a()).h, ((dofj) hsfVar.a()).i, ((dofj) hsfVar.a()).j, hmlVarC, 0);
                        dldk.b(new dldx(((dofj) hsfVar.a()).a), efy.j(egq.d(icoVar, 1.0f), 48.0f, 0.0f, 16.0f, 0.0f, 10), hmlVarC, 432);
                        hmlVarC.n();
                        hmwVar.ab();
                    } else {
                        hmlVarC.v(-1734092601);
                        dldk.b(new dldx(((dofj) hsfVar.a()).a), efy.j(egq.d(icoVar, 1.0f), 48.0f, 0.0f, 16.0f, 0.0f, 10), hmlVarC, 432);
                        hmwVar.ab();
                    }
                }
                hmwVar.ab();
            }
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: does
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    doey.g(hsfVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

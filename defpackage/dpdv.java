package defpackage;

import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.composable.HugoHostFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpdv {
    public static final void a(final jfw jfwVar, final Object obj, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-848504160);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(jfwVar) : hmlVarC.F(jfwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(obj) : hmlVarC.F(obj)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            Object obj2 = jfwVar.a;
            hmlVarC.v(-1746271574);
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && hmlVarC.F(jfwVar));
            boolean z3 = (i2 & 896) == 256;
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !hmlVarC.F(obj))) {
                z = false;
            }
            boolean z4 = z2 | z3;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z4 | z) || objS == hmk.a) {
                objS = new dpdu(jfwVar, fdatVar, obj, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.f(obj2, obj, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpdi
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    jfw jfwVar2 = jfwVar;
                    Object obj5 = obj;
                    int i4 = i;
                    dpdv.a(jfwVar2, obj5, fdatVar, (hml) obj3, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dpdy dpdyVar, final ics icsVar, boolean z, hml hmlVar, final int i) {
        int i2;
        ics icsVarA;
        final boolean z2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-783662198);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dpdyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i4 = i2 | 3456;
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            z2 = z;
        } else {
            hmlVarC.v(-1480088282);
            final dpgl dpglVarB = dpdyVar.d ? dpgm.b(glz.a(hmlVarC), dljt.h(hmlVarC), ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue()) : null;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            if (dpdyVar.f) {
                icsVarA = icsVar;
            } else {
                ico icoVar = ics.e;
                icoVar.getClass();
                icsVarA = icsVar.a(icj.g(icoVar, dpcp.a));
            }
            boolean z3 = dpdyVar.e;
            ics icsVarA2 = joj.a(icsVarA, "hugo");
            if (z3) {
                hmlVarC.v(1362360921);
                hmlVarC.v(1849434622);
                Object objS = hmwVar.S();
                Object obj = hmk.a;
                if (objS == obj) {
                    objS = new jfw();
                    hmwVar.af(objS);
                }
                final jfw jfwVar = (jfw) objS;
                hmwVar.ab();
                hmlVarC.v(5004770);
                boolean zF = hmlVarC.F(jfwVar);
                Object objS2 = hmwVar.S();
                if (zF || objS2 == obj) {
                    objS2 = new fdap() { // from class: dpdk
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj2;
                            hugoHostFragment.getClass();
                            jfwVar.a = hugoHostFragment;
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                fdap fdapVar = (fdap) objS2;
                hmwVar.ab();
                hmlVarC.w(1765406104);
                hmlVarC.w(-496803845);
                Object[] objArr = new Object[0];
                hyu hyuVar = new hyu(new fdat() { // from class: lsv
                    @Override // defpackage.fdat
                    public final Object a(Object obj2, Object obj3) {
                        return ((lsu) obj3).a;
                    }
                }, new fdap() { // from class: lsw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return new lsu((hox) obj2);
                    }
                });
                hmlVarC.w(1849434622);
                Object objS3 = hmwVar.S();
                if (objS3 == obj) {
                    objS3 = new fdae() { // from class: lsx
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return new lsu((byte[]) null);
                        }
                    };
                    hmwVar.af(objS3);
                }
                hmwVar.ab();
                lsu lsuVar = (lsu) hxy.e(objArr, hyuVar, (fdae) objS3, hmlVarC, 3072, 4);
                hmwVar.ab();
                lss.a(HugoHostFragment.class, icsVarA2, lsuVar, Bundle.EMPTY, fdapVar, hmlVarC, 0);
                hmlVarC = hmlVarC;
                hmwVar.ab();
                hmlVarC.v(-1480067557);
                hmlVarC.v(1849434622);
                Object objS4 = hmwVar.S();
                if (objS4 == obj) {
                    objS4 = new fdat() { // from class: dpdl
                        @Override // defpackage.fdat
                        public final Object a(Object obj2, Object obj3) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj2;
                            dpgl dpglVar = (dpgl) obj3;
                            hugoHostFragment.getClass();
                            if (dpglVar != null) {
                                hugoHostFragment.p(dpglVar);
                            }
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS4);
                }
                hmwVar.ab();
                a(jfwVar, dpglVarB, (fdat) objS4, hmlVarC, 392);
                hmlVarC.v(1849434622);
                Object objS5 = hmwVar.S();
                if (objS5 == obj) {
                    objS5 = new fdat() { // from class: dpdm
                        @Override // defpackage.fdat
                        public final Object a(Object obj2, Object obj3) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj2;
                            hugoHostFragment.getClass();
                            hugoHostFragment.aj = (dpdh) obj3;
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS5);
                }
                hmwVar.ab();
                a(jfwVar, null, (fdat) objS5, hmlVarC, ((i4 >> 6) & 112) | 392);
                dnhl dnhlVar = dpdyVar.b;
                hmlVarC.v(1849434622);
                Object objS6 = hmwVar.S();
                if (objS6 == obj) {
                    objS6 = new fdat() { // from class: dpdn
                        @Override // defpackage.fdat
                        public final Object a(Object obj2, Object obj3) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj2;
                            dnhl dnhlVar2 = (dnhl) obj3;
                            hugoHostFragment.getClass();
                            dnhlVar2.getClass();
                            hugoHostFragment.ag = dnhlVar2;
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS6);
                }
                hmwVar.ab();
                a(jfwVar, dnhlVar, (fdat) objS6, hmlVarC, 392);
                dpyu dpyuVar = dpdyVar.c;
                hmlVarC.v(1849434622);
                Object objS7 = hmwVar.S();
                if (objS7 == obj) {
                    objS7 = new fdat() { // from class: dpdo
                        @Override // defpackage.fdat
                        public final Object a(Object obj2, Object obj3) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj2;
                            dpyu dpyuVar2 = (dpyu) obj3;
                            hugoHostFragment.getClass();
                            dpyuVar2.getClass();
                            hugoHostFragment.ah = dpyuVar2;
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS7);
                }
                hmwVar.ab();
                a(jfwVar, dpyuVar, (fdat) objS7, hmlVarC, 392);
                dpzj dpzjVar = dpdyVar.a;
                hmlVarC.v(1849434622);
                Object objS8 = hmwVar.S();
                if (objS8 == obj) {
                    objS8 = new fdat() { // from class: dpdp
                        @Override // defpackage.fdat
                        public final Object a(Object obj2, Object obj3) {
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) obj2;
                            dpzj dpzjVar2 = (dpzj) obj3;
                            hugoHostFragment.getClass();
                            dpzjVar2.getClass();
                            hugoHostFragment.q(dpzjVar2);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS8);
                }
                hmwVar.ab();
                a(jfwVar, dpzjVar, (fdat) objS8, hmlVarC, 392);
                hmwVar.ab();
                fctx fctxVar = fctx.a;
                hmlVarC.v(5004770);
                boolean zF2 = hmlVarC.F(jfwVar);
                Object objS9 = hmwVar.S();
                if (zF2 || objS9 == obj) {
                    objS9 = new fdap() { // from class: dpdq
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            ((hny) obj2).getClass();
                            return new dpdt(jfwVar);
                        }
                    };
                    hmwVar.af(objS9);
                }
                hmwVar.ab();
                hob.c(fctxVar, (fdap) objS9, hmlVarC);
                hmwVar.ab();
            } else {
                hmlVarC.v(1363006775);
                hmlVarC.v(1849434622);
                Object objS10 = hmwVar.S();
                Object obj2 = hmk.a;
                if (objS10 == obj2) {
                    objS10 = new fdau() { // from class: dpdr
                        @Override // defpackage.fdau
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            LayoutInflater layoutInflater = (LayoutInflater) obj3;
                            ViewGroup viewGroup = (ViewGroup) obj4;
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            layoutInflater.getClass();
                            viewGroup.getClass();
                            View viewInflate = layoutInflater.inflate(R.layout.hugo_host_fragment, viewGroup, zBooleanValue);
                            viewInflate.getClass();
                            return (FragmentContainerView) viewInflate;
                        }
                    };
                    hmwVar.af(objS10);
                }
                fdau fdauVar = (fdau) objS10;
                hmwVar.ab();
                hmlVarC.v(-1746271574);
                boolean zF3 = hmlVarC.F(dpglVarB) | hmlVarC.F(null);
                boolean z4 = (i4 & 14) == 4;
                Object objS11 = hmwVar.S();
                if ((z4 | zF3) || objS11 == obj2) {
                    objS11 = new fdap() { // from class: dpds
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) obj3;
                            fragmentContainerView.getClass();
                            HugoHostFragment hugoHostFragment = (HugoHostFragment) fr.l(fragmentContainerView).g(fragmentContainerView.getId());
                            if (hugoHostFragment != null) {
                                dpgl dpglVar = dpglVarB;
                                if (dpglVar != null) {
                                    hugoHostFragment.p(dpglVar);
                                }
                                dpdy dpdyVar2 = dpdyVar;
                                hugoHostFragment.aj = null;
                                hugoHostFragment.ag = dpdyVar2.b;
                                hugoHostFragment.ah = dpdyVar2.c;
                                hugoHostFragment.q(dpdyVar2.a);
                            }
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS11);
                }
                hmwVar.ab();
                dpef.b(fdauVar, icsVarA2, null, (fdap) objS11, hmlVarC, 6);
                hmlVarC = hmlVarC;
                hmwVar.ab();
            }
            dpcq.a(hmlVarC, 0);
            z2 = true;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpdj
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dpdy dpdyVar2 = dpdyVar;
                    ics icsVar2 = icsVar;
                    int i5 = i;
                    dpdv.b(dpdyVar2, icsVar2, z2, (hml) obj3, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

package com.google.android.libraries.compose.ui.composable;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.composable.HugoHostFragment;
import defpackage.abs;
import defpackage.acg;
import defpackage.dnhl;
import defpackage.doxa;
import defpackage.doxc;
import defpackage.dpbq;
import defpackage.dpbr;
import defpackage.dpbz;
import defpackage.dpcf;
import defpackage.dpcg;
import defpackage.dpcr;
import defpackage.dpdc;
import defpackage.dpde;
import defpackage.dpdf;
import defpackage.dpdh;
import defpackage.dpgl;
import defpackage.dpjd;
import defpackage.dpuv;
import defpackage.dpux;
import defpackage.dpxe;
import defpackage.dpxp;
import defpackage.dpxq;
import defpackage.dpyu;
import defpackage.dpyw;
import defpackage.dpyz;
import defpackage.dpzb;
import defpackage.dpzd;
import defpackage.dpzf;
import defpackage.dpzh;
import defpackage.dpzj;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.fcsu;
import defpackage.fctc;
import defpackage.fctd;
import defpackage.fctg;
import defpackage.fcva;
import defpackage.fdae;
import defpackage.fdap;
import defpackage.fdbq;
import defpackage.fdil;
import defpackage.fdjx;
import defpackage.fduf;
import defpackage.fr;
import defpackage.ldq;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class HugoHostFragment extends dpcr implements dpcg {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/ui/composable/HugoHostFragment");
    public dnhl ag;
    public dpyu ah;
    public fdap ai;
    public dpdh aj;
    public boolean ak;
    public dpbq al;
    public abs am;
    public Integer an;
    private final fctc ao;
    public dpbr b;
    public fdjx c;
    public Optional d;
    public fcsu e;

    public HugoHostFragment() {
        super(R.layout.hugo_anchor);
        this.ai = new fdap() { // from class: dpcw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Context) obj).getClass();
                return 0;
            }
        };
        this.ao = fctd.a(new fdae() { // from class: dpcx
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional = this.a.d;
                if (optional == null) {
                    fdbq.c("optionalProvidedConfiguration");
                    optional = null;
                }
                optional.isPresent();
                return optional.get();
            }
        });
    }

    private final void r(int i) {
        View view = this.Q;
        if (view != null) {
            ldq.b(view, new dpdf(view, i));
        }
        this.an = null;
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final View viewM = super.M(layoutInflater, viewGroup, bundle);
        if (viewM == null) {
            return null;
        }
        dpbr dpbrVar = this.b;
        if (dpbrVar == null) {
            fdbq.c("hugoManagerFactory");
            dpbrVar = null;
        }
        dpxq dpxqVar = e().a;
        fr frVarI = I();
        fdae fdaeVar = new fdae() { // from class: dpcs
            @Override // defpackage.fdae
            public final Object invoke() {
                HugoHostFragment hugoHostFragment = this.a;
                fcsu fcsuVar = null;
                if (hugoHostFragment.e().c) {
                    fcsu fcsuVar2 = hugoHostFragment.e;
                    if (fcsuVar2 == null) {
                        fdbq.c("providedDraftController");
                    } else {
                        fcsuVar = fcsuVar2;
                    }
                    return (dnhl) fcsuVar.b();
                }
                dnhl dnhlVar = hugoHostFragment.ag;
                if (dnhlVar != null) {
                    return dnhlVar;
                }
                fdbq.c("draftController");
                return null;
            }
        };
        Consumer consumer = new Consumer() { // from class: dpct
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                View view = viewM;
                ViewParent parent = ((ViewGroup) view).getParent();
                HugoHostFragment hugoHostFragment = this;
                if (parent == null) {
                    ((ekrd) HugoHostFragment.a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "onCreateView$lambda$11$lambda$7", 142, "HugoHostFragment.kt")).q("View does not have parent yet, so saving height to set when it does have a parent.");
                    hugoHostFragment.an = num;
                } else {
                    if (hugoHostFragment.ak) {
                        ((ekrd) HugoHostFragment.a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "onCreateView$lambda$11$lambda$7", 131, "HugoHostFragment.kt")).r("Fragment is paused, so saving height %s to set when it resumes.", num.intValue());
                        hugoHostFragment.an = num;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = num.intValue();
                    view.setLayoutParams(layoutParams);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        e();
        boolean z = e().b;
        e();
        dpcf dpcfVarA = dpbrVar.a(dpxqVar, frVarI, fdaeVar, new dpux(new fdae() { // from class: dpcu
            @Override // defpackage.fdae
            public final Object invoke() {
                HugoHostFragment hugoHostFragment = this.a;
                Context contextZ = hugoHostFragment.z();
                return Integer.valueOf(contextZ != null ? ((Number) hugoHostFragment.ai.invoke(contextZ)).intValue() : 0);
            }
        }, (ViewGroup) viewM, consumer, false, false, z, null, true, true, 5090));
        dpcfVarA.e();
        this.al = dpcfVarA;
        this.am = acg.a(fg().c(), fg(), false, new fdap() { // from class: dpcv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((abs) obj).getClass();
                ekrg ekrgVar = HugoHostFragment.a;
                ((ekrd) ekrgVar.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "onCreateView$lambda$11$lambda$10", 172, "HugoHostFragment.kt")).q("Handling back navigation event.");
                HugoHostFragment hugoHostFragment = this.a;
                dpbq dpbqVar = hugoHostFragment.al;
                dpbq dpbqVar2 = null;
                if (dpbqVar == null) {
                    fdbq.c("hugoManager");
                    dpbqVar = null;
                }
                if (!dpbqVar.n()) {
                    dpbq dpbqVar3 = hugoHostFragment.al;
                    if (dpbqVar3 == null) {
                        fdbq.c("hugoManager");
                    } else {
                        dpbqVar2 = dpbqVar3;
                    }
                    int iOrdinal = dpbqVar2.c().ordinal();
                    if (iOrdinal == 0) {
                        ((ekrd) ekrgVar.i().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 269, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is MATCHING_KEYBOARD.");
                    } else if (iOrdinal == 1) {
                        ((ekrd) ekrgVar.i().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 276, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is ABOVE_KEYBOARD.");
                    } else if (iOrdinal == 2) {
                        ((ekrd) ekrgVar.i().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 283, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is EXPANDED.");
                    } else {
                        if (iOrdinal != 3) {
                            throw new fctg();
                        }
                        ((ekrd) ekrgVar.i().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 290, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is CLOSED.");
                    }
                }
                return fctx.a;
            }
        });
        fdil.d(f(), null, null, new dpdc(this, null), 3);
        fdil.d(f(), null, null, new dpde(this, null), 3);
        return viewM;
    }

    @Override // defpackage.ea
    public final void ai() {
        dpbq dpbqVar = this.al;
        if (dpbqVar != null) {
            dpbqVar.f();
        }
        abs absVar = this.am;
        if (absVar != null) {
            absVar.f();
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void am() {
        super.am();
        this.ak = true;
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        Integer num = this.an;
        if (num != null) {
            View view = this.Q;
            if ((view != null ? view.getParent() : null) != null) {
                ((ekrd) a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "onResume", 224, "HugoHostFragment.kt")).q("Updating height to cached height in onResume.");
                r(num.intValue());
            }
        }
        this.ak = false;
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        dpbq dpbqVar;
        view.getClass();
        if (bundle == null || (dpbqVar = this.al) == null) {
            return;
        }
        dpbqVar.h(bundle);
    }

    public final dpdh e() {
        dpdh dpdhVar = this.aj;
        return dpdhVar == null ? (dpdh) this.ao.a() : dpdhVar;
    }

    public final fdjx f() {
        fdjx fdjxVar = this.c;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        fdbq.c("uiScope");
        return null;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        dpbq dpbqVar = this.al;
        if (dpbqVar != null) {
            dpbqVar.i(bundle);
        }
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        dpbq dpbqVar = this.al;
        if (dpbqVar == null) {
            fdbq.c("hugoManager");
            dpbqVar = null;
        }
        dpbqVar.g();
    }

    public final void p(dpgl dpglVar) {
        if (this.al != null) {
            ((ekrd) a.e().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "applyHugoColors", 100, "HugoHostFragment.kt")).t("Applying HugoColors: %s", dpglVar);
            dpbq dpbqVar = this.al;
            if (dpbqVar == null) {
                fdbq.c("hugoManager");
                dpbqVar = null;
            }
            dpbqVar.d(dpglVar);
        }
    }

    public final void q(dpzj dpzjVar) {
        dpyz dpyzVar;
        doxa doxaVar;
        Object next;
        if (this.ag == null) {
            throw new IllegalArgumentException("DraftController must be set before input display");
        }
        Integer num = this.an;
        if (num != null) {
            ((ekrd) a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "display", 86, "HugoHostFragment.kt")).q("Updating height to cached height in display.");
            r(num.intValue());
        }
        boolean z = dpzjVar instanceof dpzf;
        if (z) {
            dpyzVar = ((dpzf) dpzjVar).a;
        } else {
            if (dpzjVar instanceof dpzh) {
                dpzh dpzhVar = (dpzh) dpzjVar;
                for (dpyz dpyzVar2 : dpzhVar.a) {
                    if (dpyzVar2.a == dpzhVar.b) {
                        dpyzVar = dpyzVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            dpyzVar = null;
        }
        if (dpyzVar != null) {
            this.ai = dpyzVar.c;
        }
        dpbq dpbqVar = this.al;
        if (dpbqVar == null) {
            fdbq.c("hugoManager");
            dpbqVar = null;
        }
        dpcf dpcfVar = (dpcf) dpbqVar;
        dpcfVar.h.f(dpzjVar);
        if (z) {
            dpyz dpyzVar3 = ((dpzf) dpzjVar).a;
            dpxp dpxpVar = dpyzVar3.b;
            if (dpxpVar != null) {
                dpcfVar.m(dpyzVar3.a, dpxpVar);
            }
            dpcfVar.j(dpyzVar3.a);
            return;
        }
        if (dpzjVar instanceof dpzh) {
            dpzh dpzhVar2 = (dpzh) dpzjVar;
            for (dpyz dpyzVar4 : dpzhVar2.a) {
                dpxe dpxeVar = dpyzVar4.a;
                dpxp dpxpVar2 = dpyzVar4.b;
                if (dpxpVar2 != null) {
                    dpcfVar.m(dpxeVar, dpxpVar2);
                }
            }
            List list = dpzhVar2.a;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((dpyz) it.next()).a);
            }
            dpcfVar.l(arrayList, dpzhVar2.b, dpzhVar2.c);
            return;
        }
        if (dpzjVar instanceof dpzd) {
            View view = ((dpzd) dpzjVar).a;
            fduf fdufVar = dpcfVar.g;
            if (fdufVar.c() == dpjd.d || fdufVar.c() == dpjd.c) {
                ((ekrd) dpcf.b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "ensureOnlyKeyboardOpen", 511, "HugoManagerImpl.kt")).q("Keyboard not visible, attempting to open.");
                if (view != null) {
                    dpcfVar.c.h(view, false);
                    return;
                } else {
                    dpcfVar.c.k();
                    return;
                }
            }
            if (dpcfVar.f.c() == dpuv.d) {
                ((ekrd) dpcf.b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "ensureOnlyKeyboardOpen", 520, "HugoManagerImpl.kt")).t("Keyboard already only input open (%s).", fdufVar.c());
                return;
            }
            ((ekrd) dpcf.b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "ensureOnlyKeyboardOpen", 515, "HugoManagerImpl.kt")).q("Keyboard showing above input, closing input.");
            dpcfVar.q();
            if (view != null) {
                View view2 = true != view.hasFocus() ? view : null;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
            }
            return;
        }
        if (!(dpzjVar instanceof dpzb)) {
            if (!(dpzjVar instanceof dpyw)) {
                throw new fctg();
            }
            dpcfVar.q();
            return;
        }
        dpzb dpzbVar = (dpzb) dpzjVar;
        doxc doxcVar = dpzbVar.b;
        if (doxcVar != null) {
            Iterator it2 = doxcVar.a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((doxa) next).a == dpzbVar.a) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            doxaVar = (doxa) next;
        } else {
            doxaVar = null;
        }
        if (doxaVar != null) {
            fdil.d(dpcfVar.d, null, null, new dpbz(dpcfVar, doxaVar, null), 3);
            return;
        }
        throw new IllegalStateException("Couldn't find a shortcut with label " + dpzbVar.a + ".");
    }
}

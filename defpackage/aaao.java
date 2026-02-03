package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaao extends aaan implements ehlg, eyhx, ehlc, ehnw, eifl {
    private aabj ag;
    private Context ah;
    private final lvn ai = new lvn(this);
    private final eics aj = new eics(this);
    private boolean ak;

    @Deprecated
    public aaao() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return aabj.class;
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iA;
        Dialog dialog;
        Window window;
        dnjr dnjrVar;
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            final aabj aabjVarH = H();
            layoutInflater.getClass();
            aaar aaarVar = aabjVarH.h;
            dpbq dpbqVar = null;
            View viewInflate = layoutInflater.inflate((aaarVar.b & 4) != 0 ? R.layout.reaction_picker_fragment_with_header : R.layout.reaction_picker_fragment, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.reaction_hugo_anchor);
            viewFindViewById.getClass();
            ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
            final dnhl dnhlVar = new dnhl(aabjVarH.t, aabjVarH.s);
            dpux dpuxVar = new dpux(new aabi(aabjVarH), viewGroup2, new Consumer() { // from class: aaax
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    View viewFindViewById2;
                    int iIntValue = ((Integer) obj).intValue();
                    View view = aabjVarH.c.Q;
                    if (view == null || (viewFindViewById2 = view.findViewById(R.id.reaction_hugo_anchor)) == null) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = iIntValue;
                    viewFindViewById2.setLayoutParams(layoutParams);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, true, true, false, aabjVarH.r, false, false, 60578);
            dpbr dpbrVar = aabjVarH.d;
            aaao aaaoVar = aabjVarH.c;
            aabjVarH.u = dpbrVar.a(null, aaaoVar.I(), new fdae() { // from class: aaay
                @Override // defpackage.fdae
                public final Object invoke() {
                    return dnhlVar;
                }
            }, dpuxVar);
            int i = aaarVar.c;
            int iA2 = aaaq.a(i);
            if ((iA2 != 0 && iA2 == 3) || ((iA = aaaq.a(i)) != 0 && iA == 5)) {
                dnov dnovVar = (dnov) aabjVarH.j.a();
                String str = aaarVar.d;
                str.getClass();
                if (fdgn.H(str)) {
                    dnjrVar = null;
                } else {
                    String str2 = aaarVar.d;
                    str2.getClass();
                    dnjrVar = new dnjr(str2);
                }
                Integer numValueOf = Integer.valueOf(R.drawable.selected_reaction_item_background);
                dnce dnceVar = aabj.a;
                dnlw dnlwVar = dnovVar.a;
                boolean z = dnovVar.b;
                ejxr ejxrVar = dnovVar.c;
                dnfv dnfvVar = dnovVar.h;
                dnov dnovVar2 = new dnov(dnlwVar, z, ejxrVar, dnjrVar, numValueOf, false, dnceVar);
                dote doteVar = (dote) aabjVarH.l.a();
                Map mapC = fcwa.c(new fcti(dpxe.b, dnovVar2));
                Integer numValueOf2 = Integer.valueOf(R.dimen.reaction_picker_fragment_compose_search_bar_top_inset);
                Integer numValueOf3 = Integer.valueOf(R.dimen.reaction_picker_fragment_compose_search_bar_bottom_margin);
                boolean z2 = doteVar.b;
                boolean z3 = doteVar.e;
                dote doteVar2 = new dote(mapC, numValueOf2, numValueOf3, doteVar.f, doteVar.g, doteVar.h, doteVar.i, doteVar.j, doteVar.k);
                dpbq dpbqVar2 = aabjVarH.u;
                if (dpbqVar2 == null) {
                    fdbq.c("hugoManager");
                    dpbqVar2 = null;
                }
                dpbqVar2.m(dpxe.d, doteVar2);
            } else {
                int iA3 = aaaq.a(i);
                if (iA3 != 0 && iA3 == 4) {
                    dmyw dmywVar = (dmyw) aabjVarH.k.a();
                    fctc fctcVarA = fctd.a(new fdae() { // from class: aaau
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dohf dohfVar = dohm.b;
                            return dogr.a();
                        }
                    });
                    fctc fctcVar = dmyw.a;
                    Integer num = dmywVar.b;
                    int i2 = dmywVar.c;
                    dnbx dnbxVar = dmywVar.d;
                    dmiv dmivVar = dmywVar.e;
                    boolean z4 = dmywVar.g;
                    boolean z5 = dmywVar.h;
                    dmyw dmywVar2 = new dmyw(i2, dnbxVar, dmivVar, fctcVarA, z4, dmywVar.i, dmywVar.j, dmywVar.k);
                    dpbq dpbqVar3 = aabjVarH.u;
                    if (dpbqVar3 == null) {
                        fdbq.c("hugoManager");
                    } else {
                        dpbqVar = dpbqVar3;
                    }
                    dpbqVar.m(dpxe.a, dmywVar2);
                }
            }
            if ((aaarVar.b & 4) != 0) {
                View viewFindViewById2 = viewInflate.findViewById(R.id.header);
                viewFindViewById2.getClass();
                TextView textView = (TextView) viewFindViewById2;
                textView.setVisibility(0);
                textView.setText(aaarVar.e);
            }
            int iA4 = aaaq.a(aaarVar.c);
            if (iA4 != 0 && iA4 == 4 && ((aqkn) aabjVarH.g.b()).a() && (dialog = aaaoVar.d) != null && (window = dialog.getWindow()) != null) {
                window.setNavigationBarColor(0);
            }
            viewInflate.setClipToOutline(true);
            dpgl dpglVar = aabjVarH.r;
            if (dpglVar != null) {
                viewInflate.getClass();
                aabj.a(viewInflate, dpglVar);
            }
            viewInflate.getClass();
            eidc.q();
            return viewInflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.ai;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        eifp eifpVarJ = this.aj.j();
        try {
            boolean zAM = super.aM(menuItem);
            eifpVarJ.close();
            return zAM;
        } catch (Throwable th) {
            try {
                eifpVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.aj.h(i, i2);
        eidc.q();
    }

    @Override // defpackage.aaan
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
    }

    @Override // defpackage.ehlg
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final aabj H() {
        aabj aabjVar = this.ag;
        if (aabjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return aabjVar;
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final void ae(Bundle bundle) {
        this.aj.k();
        try {
            super.ae(bundle);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.aj.f();
        try {
            super.af(i, i2, intent);
            eifpVarF.close();
        } catch (Throwable th) {
            try {
                eifpVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aaan, defpackage.ecdv, defpackage.ea
    public final void ag(Activity activity) {
        this.aj.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.aj.b();
        try {
            super.ai();
            dpbq dpbqVar = H().u;
            if (dpbqVar != null) {
                dpbqVar.f();
            }
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final void am() {
        this.aj.k();
        try {
            super.am();
            dpbq dpbqVar = H().u;
            if (dpbqVar == null) {
                fdbq.c("hugoManager");
                dpbqVar = null;
            }
            dpbqVar.f();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.aj.b();
        try {
            super.ao();
            aabj aabjVarH = H();
            aabjVarH.c.N().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            dpbq dpbqVar = aabjVarH.u;
            dpbq dpbqVar2 = null;
            if (dpbqVar == null) {
                fdbq.c("hugoManager");
                dpbqVar = null;
            }
            dpbqVar.e();
            int iA = aaaq.a(aabjVarH.h.c);
            if (iA == 0) {
                iA = 1;
            }
            int i = iA - 2;
            if (i == 1) {
                dpbq dpbqVar3 = aabjVarH.u;
                if (dpbqVar3 == null) {
                    fdbq.c("hugoManager");
                } else {
                    dpbqVar2 = dpbqVar3;
                }
                dpxe dpxeVar = dpxe.b;
                dpbqVar2.k(fcva.b(dpxeVar), dpxeVar);
            } else if (i == 2) {
                dpbq dpbqVar4 = aabjVarH.u;
                if (dpbqVar4 == null) {
                    fdbq.c("hugoManager");
                } else {
                    dpbqVar2 = dpbqVar4;
                }
                dpbqVar2.j(dpxe.a);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("A picker mode must be specified.");
                }
                dpbq dpbqVar5 = aabjVarH.u;
                if (dpbqVar5 == null) {
                    fdbq.c("hugoManager");
                } else {
                    dpbqVar2 = dpbqVar5;
                }
                dpbqVar2.k(((asgk) aabjVarH.f.b()).a() ? fcva.g(dpxe.b, dpxe.i) : fcva.g(dpxe.i, dpxe.b), dpxe.b);
            }
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.aj.k();
        try {
            super.ap(view, bundle);
            aabj aabjVarH = H();
            view.getClass();
            if (bundle != null) {
                dpbq dpbqVar = aabjVarH.u;
                if (dpbqVar == null) {
                    fdbq.c("hugoManager");
                    dpbqVar = null;
                }
                dpbqVar.h(bundle);
            }
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ejwl.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.ah == null) {
            this.ah = new ehnz(this, super.z());
        }
        return this.ah;
    }

    @Override // defpackage.eifl
    public final eiik bf() {
        return this.aj.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.aj.e(eiikVar, z);
    }

    @Override // defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.aj.b = eiikVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [eieu] */
    @Override // defpackage.aaan, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.aj.k();
        try {
            if (this.ak) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragment", 96, aaao.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragment", EnergyProfile.EVCONNECTOR_TYPE_OTHER, aaao.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            try {
                                if (!(eaVar instanceof aaao)) {
                                    throw new IllegalStateException(a.M(eaVar, aabj.class));
                                }
                                aaao aaaoVar = (aaao) eaVar;
                                dpbr dpbrVar = (dpbr) ((ahib) objBb).t.b();
                                dpir dpirVar = (dpir) ((ahib) objBb).c.bu.b();
                                ahkn ahknVar = ((ahib) objBb).a;
                                ahng ahngVar = ahknVar.b;
                                eyik eyikVar = ahngVar.hj;
                                eyik eyikVar2 = ahngVar.nY;
                                Optional optionalOf = Optional.of(ahknVar.jw);
                                Optional optionalOf2 = Optional.of(((ahib) objBb).v);
                                Optional optionalOf3 = Optional.of(((ahib) objBb).P);
                                dnga dngaVar = (dnga) ahngVar.ho.b();
                                dnji dnjiVar = (dnji) ((ahib) objBb).u.b();
                                Bundle bundleA = ((ahib) objBb).a();
                                evrr evrrVar = (evrr) ahngVar.gp.b();
                                ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                                aaar aaarVar = (aaar) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", aaar.a, evrrVar);
                                aaarVar.getClass();
                                this.ag = new aabj(aaaoVar, dpbrVar, dpirVar, eyikVar, eyikVar2, optionalOf, optionalOf2, optionalOf3, dngaVar, dnjiVar, aaarVar);
                                eieuVarG2.close();
                                this.Z.c(new ehns(this.aj, this.ai));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    context.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            context = eieuVarG2;
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lvj lvjVar = this.E;
            if (lvjVar instanceof eifl) {
                eics eicsVar = this.aj;
                if (eicsVar.a == null) {
                    eicsVar.e(((eifl) lvjVar).bf(), true);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.eefb, defpackage.kc, defpackage.dn
    public final Dialog gK(Bundle bundle) {
        super.gK(bundle);
        aabj aabjVarH = H();
        aaao aaaoVar = aabjVarH.c;
        return new aabh(aabjVarH, aaaoVar.A(), aaaoVar.b);
    }

    @Override // defpackage.aaan, defpackage.dn, defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.aj.k();
        try {
            LayoutInflater layoutInflaterGo = super.go(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterGo.cloneInContext(new ehnz(this, layoutInflaterGo));
            eidc.q();
            return layoutInflaterCloneInContext;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.aj.k();
        try {
            super.h(bundle);
            H().c.q(1, R.style.ReactionPickerStyle);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eefb, defpackage.dn
    public final void hh() {
        eifp eifpVarK = eidc.k();
        try {
            super.hh();
            eifpVarK.close();
        } catch (Throwable th) {
            try {
                eifpVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.aj.b();
        try {
            super.i();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.aj.a();
        try {
            super.j();
            this.ak = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.aj.k();
        try {
            super.k(bundle);
            dpbq dpbqVar = H().u;
            if (dpbqVar == null) {
                fdbq.c("hugoManager");
                dpbqVar = null;
            }
            dpbqVar.i(bundle);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void l() {
        Window window;
        this.aj.k();
        try {
            super.l();
            aaao aaaoVar = H().c;
            Dialog dialog = aaaoVar.d;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setFlags(2, 2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = kyy.a(aaaoVar.B(), R.dimen.reaction_picker_background_dim_amount);
                window.setAttributes(attributes);
            }
            eina.c(this);
            if (this.c) {
                eina.b(this);
            }
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void m() {
        this.aj.k();
        try {
            super.m();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.aj.g().close();
    }

    @Override // defpackage.ecdv, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dpbq dpbqVar = H().u;
        if (dpbqVar == null) {
            fdbq.c("hugoManager");
            dpbqVar = null;
        }
        dpbqVar.g();
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        eifp eifpVarI = this.aj.i();
        try {
            super.onDismiss(dialogInterface);
            eifpVarI.close();
        } catch (Throwable th) {
            try {
                eifpVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aaan, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

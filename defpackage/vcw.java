package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ehol;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcw extends vdw implements ehlg, eyhx, ehlc, ehnw, eifl {
    private vdr a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public vcw() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return vdr.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            vdr vdrVarH = H();
            layoutInflater.getClass();
            eieu eieuVarH = eiiy.h("Conversation2Fragment::onCreateView");
            try {
                ComposeView composeView = new ComposeView(vdrVarH.b.A(), null, 0, 6, null);
                Optional optional = vdrVarH.m;
                final fdap fdapVar = new fdap() { // from class: vcx
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        cwzv cwzvVar = (cwzv) obj;
                        cwzvVar.getClass();
                        cwzvVar.a();
                        return fctx.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: vcy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                composeView.setFitsSystemWindows(true);
                composeView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: vcz
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        view.getClass();
                        windowInsets.getClass();
                        return windowInsets;
                    }
                });
                composeView.a(new hxd(1096399568, true, new vdl(vdrVarH)));
                ((aisx) vdrVarH.n.b()).a(composeView, 184228);
                if (((dflk) vdrVarH.z.b()).a()) {
                    eieuVarH = eiiy.h("firstVisit");
                    try {
                        ajec ajecVar = (ajec) vdrVarH.y.b();
                        Instant instantF = ((cogw) vdrVarH.u.b()).f();
                        instantF.getClass();
                        auvh.h(ajecVar.a(3, instantF));
                        fczl.a(eieuVarH, null);
                    } finally {
                    }
                } else {
                    eieuVarH = eiiy.h("logScreenFirstVisitEvents");
                    try {
                        ajef ajefVar = (ajef) vdrVarH.t.b();
                        Instant instantF2 = ((cogw) vdrVarH.u.b()).f();
                        instantF2.getClass();
                        auvh.h(ajefVar.a(3, instantF2));
                        fczl.a(eieuVarH, null);
                    } finally {
                    }
                }
                fczl.a(eieuVarH, null);
                eidc.q();
                return composeView;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vdr H() {
        vdr vdrVar = this.a;
        if (vdrVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return vdrVar;
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

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.vdw, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.c.b();
        try {
            aY();
            lfq.a(H().b.fg().getWindow(), true);
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

    @Override // defpackage.ea
    public final void al(boolean z) {
        zud zudVar = (zud) fdct.b(H().r);
        if (zudVar != null) {
            zudVar.a = z;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            be();
            vdr vdrVarH = H();
            ((bwwe) vdrVarH.g.b()).e(barn.a);
            ((afgk) vdrVarH.j.b()).a();
            ((zuh) vdrVarH.f.b()).f();
            if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ((Optional) vdrVarH.a().f.b()).isPresent()) {
                agxz agxzVar = (agxz) ((Optional) vdrVarH.a().f.b()).get();
                if (agxzVar.c.getAndSet(0) > 0) {
                    ((agxn) agxzVar.b.b()).b();
                }
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.c.b();
        try {
            bj();
            vdr vdrVarH = H();
            eieu eieuVarH = eiiy.h("Conversation2Fragment::onResume");
            try {
                ((bwwe) vdrVarH.g.b()).e(ajwb.a(vdrVarH.a().a));
                ConversationViewModel conversationViewModelA = vdrVarH.a();
                if (((aquo) conversationViewModelA.j.b()).a() && (conversationViewModelA.a instanceof EmergencyConversationId)) {
                    ((akez) conversationViewModelA.i.b()).L();
                }
                fczl.a(eieuVarH, null);
                eifpVarB.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            bn(view, bundle);
            vdr vdrVarH = H();
            view.getClass();
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

    @Override // defpackage.vdw
    protected final /* bridge */ /* synthetic */ ehok b() {
        return new ehof(this, true);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2, types: [eieu] */
    @Override // defpackage.vdw, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/conversation2/Conversation2Fragment", 88, vcw.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/conversation2/Conversation2Fragment", 93, vcw.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            try {
                                if (!(eaVar instanceof vcw)) {
                                    throw new IllegalStateException(a.M(eaVar, vdr.class));
                                }
                                vcw vcwVar = (vcw) eaVar;
                                eyik eyikVar = ((ahhw) objBb).av;
                                ahhe ahheVar = ((ahhw) objBb).d;
                                ahhh ahhhVar = ((ahhw) objBb).c;
                                ahkn ahknVar = ((ahhw) objBb).a;
                                eyik eyikVar2 = ahheVar.H;
                                eyik eyikVar3 = ahheVar.I;
                                eyik eyikVar4 = ahhhVar.o;
                                ahnh ahnhVar = ahknVar.a;
                                eyik eyikVar5 = ahnhVar.Jd;
                                eyik eyikVar6 = ((ahhw) objBb).by;
                                eyik eyikVar7 = ahhhVar.p;
                                eyik eyikVar8 = ahheVar.B;
                                eyik eyikVar9 = ahheVar.t;
                                eyik eyikVar10 = ahheVar.K;
                                Optional optionalEmpty = Optional.empty();
                                ahng ahngVar = ahknVar.b;
                                this.a = new vdr(vcwVar, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, eyikVar8, eyikVar9, eyikVar10, optionalEmpty, ahngVar.jd, ahngVar.iT, Optional.empty(), ahngVar.je, Optional.of((zud) ahngVar.jf.b()), ahheVar.p, ahngVar.jk, ahknVar.cD, ahnhVar.qa, ahheVar.h, ahngVar.jl, ahngVar.jm, ((ahhw) objBb).bz, ahnhVar.Uy, ahngVar.jo);
                                eieuVarG2.close();
                                this.Z.c(new ehns(this.c, this.e));
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
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new ehol.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            vdr vdrVarH = H();
            eieu eieuVarH = eiiy.h("Conversation2Fragment::onCreate");
            try {
                fcsu fcsuVar = vdrVarH.l;
                if (((Optional) fcsuVar.b()).isPresent()) {
                    dztc.a.d(new dzfh("ConversationScreen"));
                }
                ((zuh) vdrVarH.f.b()).d();
                vcw vcwVar = vdrVarH.b;
                boolean z = false;
                lfq.a(vcwVar.fg().getWindow(), false);
                zud zudVar = (zud) fdct.b(vdrVarH.r);
                if (zudVar != null) {
                    zudVar.a = craf.e(vcwVar.fg(), ((tlt) vdrVarH.s.b()).a);
                }
                if (((Optional) fcsuVar.b()).isEmpty()) {
                    afzd afzdVar = (afzd) vdrVarH.d.b();
                    afzdVar.a();
                    Bundle bundle2 = vcwVar.m;
                    boolean z2 = bundle2 != null ? bundle2.getBoolean("can_navigate_back") : true;
                    Bundle bundle3 = vcwVar.m;
                    boolean z3 = bundle3 != null ? bundle3.getBoolean("is_bubble_activity") : false;
                    agbf agbfVar = agbf.a;
                    if (z2 && !z3) {
                        z = true;
                    }
                    afzdVar.b(agbfVar, z);
                }
                ((cujc) vdrVarH.e.b()).a();
                eieuVarH = eiiy.h("Conversation2Fragment::initializeExpressiveStickers");
                try {
                    if (((Boolean) ccze.f.e()).booleanValue()) {
                        final cyxw cyxwVar = (cyxw) vdrVarH.o.b();
                        if (((Boolean) cyxw.b.e()).booleanValue()) {
                            if (!cyxwVar.g) {
                                eooy eooyVar = new eooy() { // from class: cyxq
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        cyxw cyxwVar2 = cyxwVar;
                                        if (cyxwVar2.d()) {
                                            return eijx.c();
                                        }
                                        cyxwVar2.g = true;
                                        return eiju.g(((cqey) cyxwVar2.c.a()).i());
                                    }
                                };
                                eosd eosdVar = cyxwVar.e;
                                eijx.h(eooyVar, eosdVar).h(new ejvr() { // from class: cyxr
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        cyxw cyxwVar2 = cyxwVar;
                                        Boolean bool = (Boolean) obj;
                                        if (!cyxwVar2.d()) {
                                            if (bool.booleanValue()) {
                                                cyxwVar2.b();
                                            } else {
                                                cyxwVar2.a();
                                            }
                                        }
                                        cyxwVar2.g = false;
                                        return true;
                                    }
                                }, eosdVar).k(auvh.b(), cyxwVar.f);
                            }
                        } else if (!cyxwVar.d() && cyxwVar.h == null) {
                            cyxw.a.m("Start initializing default stickers");
                            cyxwVar.h = ((cqey) cyxwVar.c.a()).i();
                            eork.r(cyxwVar.h, auwc.a(new cyxu(cyxwVar)), cyxwVar.d);
                        }
                    }
                    fczl.a(eieuVarH, null);
                    Optional optional = vdrVarH.p;
                    final fdap fdapVar = new fdap() { // from class: vda
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            cohe coheVar = (cohe) obj;
                            coheVar.getClass();
                            coheVar.a();
                            return fctx.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: vdb
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            fdapVar.invoke(obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    fczl.a(eieuVarH, null);
                    eidc.q();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ag = true;
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bl();
            vdr vdrVarH = H();
            eieu eieuVarH = eiiy.h("Conversation2Fragment::onStart");
            try {
                afib afibVar = vdrVarH.B;
                String strB = vdrVarH.a().a.b();
                strB.getClass();
                afibVar.a(new afhy(strB));
                fczl.a(eieuVarH, null);
                eidc.q();
            } finally {
            }
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bm();
            vdr vdrVarH = H();
            vdrVarH.B.a(new afhz());
            ConversationViewModel conversationViewModelA = vdrVarH.a();
            boolean zIsChangingConfigurations = vdrVarH.b.fg().isChangingConfigurations();
            for (zwh zwhVar : (Set) conversationViewModelA.g.b()) {
                if (!zIsChangingConfigurations) {
                    auvw.k(zwhVar.c, null, null, new zwg(zwhVar, null), 3);
                }
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

    @Override // defpackage.vdw, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

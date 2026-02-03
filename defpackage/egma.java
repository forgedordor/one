package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egma extends egmh implements ehlg, eyhx, ehlc, ehnw, eifl {
    private egme ag;
    private Context ah;
    private final lvn ai = new lvn(this);
    private final eics aj = new eics(this);
    private boolean ak;

    @Deprecated
    public egma() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return egme.class;
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            final egme egmeVarH = H();
            View viewInflate = layoutInflater.inflate(R.layout.express_sign_in_fragment, viewGroup, false);
            ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) viewInflate.findViewById(R.id.express_sign_in_layout);
            egmi egmiVar = ((eglu) ehle.a(egmeVarH.e)).b;
            dytx dytxVar = egmeVarH.o;
            dyua dyuaVarC = dyud.c();
            final eilb eilbVar = egmeVarH.n;
            final dyuc dyucVar = new dyuc() { // from class: egmb
                /* JADX WARN: Type inference failed for: r6v13, types: [egly, java.lang.Object] */
                @Override // defpackage.dyuc
                public final ListenableFuture a(ejwi ejwiVar) {
                    egbe egbeVar;
                    final egme egmeVar = egmeVarH;
                    if (ejwiVar.g()) {
                        egbeVar = (egbe) ejwiVar.c();
                    } else {
                        egbeVar = egmeVar.s;
                        egbeVar.getClass();
                    }
                    ejwl.l(egmeVar.r.g());
                    ejwl.l(((ekgp) egmeVar.r.c()).containsKey(egbeVar));
                    if (((ekgp) egmeVar.r.c()).get(egbeVar) == egkk.INELIGIBLE) {
                        ejwi ejwiVar2 = egmeVar.l;
                        ejwl.l(ejwiVar2.g());
                        ejwiVar2.c().a().t(egmeVar.f.I(), "$tiktok$account_ineligible_dialog");
                        return eork.i(false);
                    }
                    final efwo efwoVarA = egbeVar.a();
                    new egmj(egbeVar.b().c, egbeVar.b().g, egbeVar.b().k);
                    egmeVar.h.h(egpq.b(eooq.g(eorv.a, eiid.d(new eooz() { // from class: egmc
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return egmeVar.j.a(efwoVarA);
                        }
                    }), egmeVar.q)), new egpo(efwoVarA), egmeVar.b);
                    return eork.i(true);
                }
            };
            ((dyrr) dyuaVarC).a = new dyuc() { // from class: eikz
                @Override // defpackage.dyuc
                public final ListenableFuture a(ejwi ejwiVar) {
                    eigp eigpVar = eilbVar.a;
                    dyuc dyucVar2 = dyucVar;
                    eieh eiehVarC = eigpVar.c("Click Continue in TikTok Express SignIn", "com/google/apps/tiktok/tracing/contrib/onegoogle/ExpressSignInTraceCreation", "onContinueWithAccountAsync", 33);
                    try {
                        ListenableFuture listenableFutureA = dyucVar2.a(ejwiVar);
                        eiehVarC.close();
                        return listenableFutureA;
                    } catch (Throwable th) {
                        try {
                            eiehVarC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            };
            ((dyrr) dyuaVarC).b = ((eglz) egmiVar).a;
            expressSignInLayout.a(dytxVar, dyuaVarC.a());
            egmeVarH.g.a(egmeVarH.k, egmeVarH.d);
            eidc.q();
            return viewInflate;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
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

    @Override // defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        this.aj.j().close();
        return false;
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

    @Override // defpackage.ehlg
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final egme H() {
        egme egmeVar = this.ag;
        if (egmeVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return egmeVar;
    }

    @Override // defpackage.egmh
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
    }

    @Override // defpackage.ea
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

    @Override // defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.aj.f();
        try {
            super.af(i, i2, intent);
            egme egmeVarH = H();
            if (i == 29878) {
                egmeVarH.a();
            }
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

    @Override // defpackage.egmh, defpackage.ea
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

    @Override // defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.aj.b();
        try {
            super.ai();
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
    public final void am() {
        this.aj.k();
        try {
            super.am();
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
    public final void ao() {
        eifp eifpVarB = this.aj.b();
        try {
            super.ao();
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
    public final void ap(View view, Bundle bundle) {
        this.aj.k();
        eidc.q();
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
    /* JADX WARN: Type inference failed for: r25v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [eieu] */
    @Override // defpackage.egmh, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        Context context2;
        eg egVar;
        ea eaVar;
        this.aj.k();
        try {
            if (this.ak) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragment", 93, egma.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragment", 98, egma.class, "CreatePeer");
                        try {
                            ahhk ahhkVar = ((ahib) objBb).c;
                            context2 = (Context) ahhkVar.d.b();
                            egVar = (eg) ahhkVar.g.b();
                            eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                        } catch (Throwable th) {
                            th = th;
                            context = eieuVarG2;
                        }
                        try {
                            if (!(eaVar instanceof egma)) {
                                throw new IllegalStateException(a.M(eaVar, egme.class));
                            }
                            egma egmaVar = (egma) eaVar;
                            ejwi ejwiVarJ = ejwi.j("google");
                            ehac ehacVar = (ehac) ((ahib) objBb).k.b();
                            egpr egprVar = (egpr) ((ahib) objBb).l.b();
                            ahkn ahknVar = ((ahib) objBb).a;
                            eigp eigpVar = (eigp) ahknVar.aI.b();
                            ahnh ahnhVar = ahknVar.a;
                            egcd egcdVar = (egcd) ahnhVar.l.b();
                            egca egcaVarME = ahnhVar.mE();
                            ahng ahngVar = ahknVar.b;
                            ahnh ahnhVar2 = ahngVar.a.a;
                            egdi egdiVar = new egdi((egcq) ahnhVar2.aod.b(), (egcd) ahnhVar2.l.b());
                            ekgp ekgpVar = ekoj.a;
                            this.ag = new egme(context2, egVar, egmaVar, ejwiVarJ, ehacVar, egprVar, eigpVar, egcdVar, egcaVarME, new egkj(egdiVar, ekgpVar, (Executor) ahknVar.p.b()), ekgpVar, ((ahib) objBb).E(), (ehrb) ((ahib) objBb).cl.b(), (egda) ((ahib) objBb).ah.b(), ((ahib) objBb).F(), (dtah) ahngVar.jW.b(), (Executor) ahknVar.p.b(), (eosc) ahknVar.y.b());
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.aj, this.ai));
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            try {
                                context.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
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

    @Override // defpackage.egmh, defpackage.dn, defpackage.ea
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

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.aj.k();
        try {
            super.h(bundle);
            egme egmeVarH = H();
            if (bundle != null) {
                egmeVarH.p.a(bundle);
            }
            egpr egprVar = egmeVarH.h;
            egprVar.j(egmeVarH.b);
            egprVar.j(egmeVarH.c);
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

    @Override // defpackage.dn
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

    @Override // defpackage.dn, defpackage.ea
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

    @Override // defpackage.dn, defpackage.ea
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

    @Override // defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.aj.k();
        try {
            super.k(bundle);
            H().p.b(bundle);
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

    @Override // defpackage.dn, defpackage.ea
    public final void l() {
        this.aj.k();
        try {
            super.l();
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

    @Override // defpackage.dn, defpackage.ea
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

    @Override // defpackage.egmh, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.eyhq;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egln extends eglm implements ehlg, eyhx, ehlc, ehnw, eifl {
    private egls a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public egln() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return egls.class;
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.c.f();
        try {
            aW(i, i2, intent);
            egls eglsVarH = H();
            if (i == 38294) {
                egoc.d("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer", "refresh", 345, eglsVarH.k.b(), "Failed account invalidation.", new Object[0]);
            }
            eifpVarF.close();
        } finally {
        }
    }

    @Override // defpackage.eglm, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.eglm
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
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

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final egls H() {
        egls eglsVar = this.a;
        if (eglsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return eglsVar;
    }

    @Override // defpackage.eglm, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        eieu eieuVar;
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragment", 83, egln.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragment", 88, egln.class, "CreatePeer");
                        try {
                            ahhk ahhkVar = ((ahib) objBb).c;
                            Context context2 = (Context) ahhkVar.d.b();
                            Activity activity = (Activity) ahhkVar.d.b();
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            ejwi ejwiVarJ = ejwi.j("google");
                            ehrb ehrbVar = (ehrb) ((ahib) objBb).cl.b();
                            ahkn ahknVar = ((ahib) objBb).a;
                            eigp eigpVar = (eigp) ahknVar.aI.b();
                            efxf efxfVar = (efxf) ahhkVar.x.b();
                            ahnh ahnhVar = ahknVar.a;
                            egcd egcdVar = (egcd) ahnhVar.l.b();
                            egca egcaVarME = ahnhVar.mE();
                            egda egdaVar = (egda) ((ahib) objBb).ah.b();
                            egbf egbfVar = (egbf) ahnhVar.pG.b();
                            egpr egprVar = (egpr) ((ahib) objBb).l.b();
                            ehac ehacVar = (ehac) ((ahib) objBb).k.b();
                            ejud ejudVar = ejud.a;
                            eieuVar = eieuVarG2;
                            try {
                                dcdt dcdtVar = (dcdt) ahknVar.dk.b();
                                Executor executor = (Executor) ahknVar.p.b();
                                eosc eoscVar = (eosc) ahknVar.y.b();
                                dtah dtahVar = (dtah) ahknVar.b.jW.b();
                                Activity activity2 = (Activity) ahhkVar.d.b();
                                dyun dyunVarK = dyuo.k();
                                String string = activity2.getString(R.string.sign_in_for_messages_features);
                                if (string == null) {
                                    throw new NullPointerException("Null title");
                                }
                                ((dyug) dyunVarK).a = ejwi.j(new dyuf(string, ejudVar, ejudVar, ejudVar));
                                this.a = new egls(context2, activity, eaVar, ejwiVarJ, ehrbVar, eigpVar, efxfVar, egcdVar, egcaVarME, egdaVar, egbfVar, egprVar, ehacVar, dcdtVar, executor, eoscVar, dtahVar, ejwi.j(dyunVarK.e()), ((ahib) objBb).F());
                                eieuVar.close();
                                this.Z.c(new ehns(this.c, this.e));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    eieuVar.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            eieuVar = eieuVarG2;
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
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
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
            final egls eglsVarH = H();
            if (bundle != null) {
                eglsVarH.s.a(bundle);
            }
            dyua dyuaVarC = dyud.c();
            dyuaVarC.c(new eila(eglsVarH.q, "Express SignIn Dialog: Clicked Continue", new dyub() { // from class: eglq
                @Override // defpackage.dyub
                public final void a(ejwi ejwiVar) {
                    egbe egbeVar;
                    final egls eglsVar = eglsVarH;
                    if (ejwiVar.g()) {
                        egbeVar = (egbe) ejwiVar.c();
                    } else {
                        egbeVar = eglsVar.v;
                        egbeVar.getClass();
                    }
                    final efwo efwoVarA = egbeVar.a();
                    new egmj(egbeVar.b().c, egbeVar.b().g, egbeVar.b().k);
                    eglsVar.m.h(egpq.b(eooq.g(eorv.a, eiid.d(new eooz() { // from class: eglr
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return eglsVar.j.a(efwoVarA);
                        }
                    }), eglsVar.t)), new egpo(efwoVarA), eglsVar.c);
                }
            }));
            final ejwi ejwiVar = eglsVarH.p;
            dyun dyunVarA = ((dyuo) ((ejwt) ejwiVar).a).a();
            dyunVarA.b(dyus.a(eglsVarH.f, new Runnable() { // from class: eglo
                @Override // java.lang.Runnable
                public final void run() {
                    dyuo dyuoVar = (dyuo) ((ejwt) ejwiVar).a;
                    if (dyuoVar.c().g()) {
                        egls eglsVar = eglsVarH;
                        ((dyur) dyuoVar.c().c()).a.run();
                        ea eaVar = eglsVar.h;
                        cg cgVar = new cg(eaVar.J());
                        cgVar.o(eaVar);
                        cgVar.c();
                    }
                }
            }));
            ((dyrr) dyuaVarC).b = dyunVarA.e();
            dyud dyudVarA = dyuaVarC.a();
            ejud ejudVar = ejud.a;
            dytx dytxVar = eglsVarH.r;
            if (dytxVar == null) {
                throw new NullPointerException("Null expressSignInManager");
            }
            dyro dyroVar = new dyro(dytxVar, dyudVarA, ejudVar, true);
            ea eaVar = eglsVarH.h;
            eglsVarH.u = new dysd(eaVar.A(), eaVar.I(), dyroVar, eaVar.G());
            egpr egprVar = eglsVarH.m;
            egprVar.j(eglsVarH.c);
            egprVar.j(eglsVarH.d);
            eglsVarH.n.a(eglsVarH.l.b(), eglsVarH.e);
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
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bk(bundle);
            H().s.b(bundle);
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

    @Override // defpackage.eglm, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

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
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acay extends acbq implements ehlg, eyhx, ehlc, ehnw, eifl {
    private acbj ag;
    private Context ah;
    private final lvn ai = new lvn(this);
    private final eics aj = new eics(this);
    private boolean ak;

    @Deprecated
    public acay() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return acbj.class;
    }

    @Override // defpackage.ea
    public final View M(final LayoutInflater layoutInflater, final ViewGroup viewGroup, Bundle bundle) {
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            final acbj acbjVarH = H();
            View viewInflate = layoutInflater.inflate(R.layout.bugle_express_sign_in_fragment, viewGroup, false);
            final ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) viewInflate.findViewById(R.id.express_sign_in_layout);
            acca accaVarA = ((acax) ehle.a(acbjVarH.b)).a();
            dytx dytxVar = acbjVarH.k;
            dyua dyuaVarC = dyud.c();
            dyuaVarC.c(new eila(acbjVarH.j, "Click Continue in TikTok Express SignIn", new dyub() { // from class: acaz
                @Override // defpackage.dyub
                public final void a(ejwi ejwiVar) {
                    efwo efwoVarA;
                    acbj acbjVar = acbjVarH;
                    if (ejwiVar.g()) {
                        efwoVarA = ((egbe) ejwiVar.c()).a();
                    } else {
                        efwoVarA = acbjVar.q;
                        efwoVarA.getClass();
                    }
                    acbjVar.e.h(egpq.b(acbjVar.g.a(efwoVarA)), new egpo(efwoVarA), acbjVar.m);
                }
            }));
            ((dyrr) dyuaVarC).b = accaVarA.a();
            expressSignInLayout.a(dytxVar, dyuaVarC.a());
            accaVarA.d().ifPresent(new Consumer() { // from class: acba
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    accc acccVar = (accc) obj;
                    expressSignInLayout.addView(acccVar.a(layoutInflater, viewGroup));
                    acccVar.b();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            dyue dyueVar = ((dyrq) dytxVar).a;
            dyueVar.a.c(new acbi(acbjVarH));
            acbjVarH.d.a(acbjVarH.h.b(), acbjVarH.o);
            dztc.a.b(acbjVarH.c.G());
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
    public final acbj H() {
        acbj acbjVar = this.ag;
        if (acbjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return acbjVar;
    }

    @Override // defpackage.acbq
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
            acbj acbjVarH = H();
            if (i == 29878) {
                acbjVarH.a();
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

    @Override // defpackage.acbq, defpackage.ea
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

    @Override // defpackage.acbq, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.aj.k();
        try {
            if (this.ak) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/gaia/expresssignin/BugleExpressSignInFragment", 93, acay.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/gaia/expresssignin/BugleExpressSignInFragment", 98, acay.class, "CreatePeer");
                        try {
                            ahhk ahhkVar = ((ahib) objBb).c;
                            Context context2 = (Context) ahhkVar.d.b();
                            eg egVar = (eg) ahhkVar.g.b();
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof acay)) {
                                throw new IllegalStateException(a.M(eaVar, acbj.class));
                            }
                            acay acayVar = (acay) eaVar;
                            ehac ehacVar = (ehac) ((ahib) objBb).k.b();
                            egpr egprVar = (egpr) ((ahib) objBb).l.b();
                            ahkn ahknVar = ((ahib) objBb).a;
                            eigp eigpVar = (eigp) ahknVar.aI.b();
                            ahnh ahnhVar = ahknVar.a;
                            this.ag = new acbj(context2, egVar, acayVar, ehacVar, egprVar, eigpVar, (egcd) ahnhVar.l.b(), ahnhVar.mE(), (egbf) ahnhVar.pG.b(), ((ahib) objBb).E(), (dyyv) ahnhVar.anY.b(), (egda) ((ahib) objBb).ah.b(), ((ahib) objBb).F(), (dtah) ahknVar.b.jW.b(), (eosc) ahknVar.y.b(), ((ahib) objBb).b.cd);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.aj, this.ai));
                        } finally {
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

    @Override // defpackage.acbq, defpackage.dn, defpackage.ea
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
            acbj acbjVarH = H();
            if (bundle != null) {
                acbjVarH.l.a(bundle);
            }
            egpr egprVar = acbjVarH.e;
            egprVar.j(acbjVarH.m);
            egprVar.j(acbjVarH.n);
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
            H().l.b(bundle);
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

    @Override // defpackage.acbq, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

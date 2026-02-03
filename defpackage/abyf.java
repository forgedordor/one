package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import defpackage.eyhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyf extends abyn implements ehlg, eyhx, ehlc, ehnw, eifl {
    private abym a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public abyf() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return abym.class;
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abym H() {
        abym abymVar = this.a;
        if (abymVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return abymVar;
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

    @Override // defpackage.abyn, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.abyn
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

    @Override // defpackage.abyn, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragment", 83, abyf.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragment", 88, abyf.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            ahkn ahknVar = ((ahib) objBb).a;
                            this.a = new abym(eaVar, ahknVar.a.c, ahknVar.aI, ahknVar.aQ, ((ahib) objBb).f, ((ahib) objBb).ae, ahknVar.cD, ahknVar.aJ, ((ahib) objBb).af);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } finally {
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
            final abym abymVarH = H();
            if (bundle != null) {
                abymVarH.k = bundle.getBoolean("state_disc_visible", true);
            }
            ea eaVar = abymVarH.d;
            abymVarH.f = egks.a(eaVar.I());
            abymVarH.g = ((dydm) abymVarH.f).b;
            ((ehbb) abymVarH.m.b()).g(R.id.account_menu_refresh_local_subscription_id, new abyc((abyd) abymVarH.n.b()), new abyl(abymVarH));
            if (((Boolean) ((cczi) cpxw.k.get()).e()).booleanValue() && cpyl.a()) {
                eaVar.I().q(new fx() { // from class: abyh
                    @Override // defpackage.fx
                    public final void h(ea eaVar2) {
                        if (eaVar2 instanceof dn) {
                            abym abymVar = abymVarH;
                            Boolean bool = abymVar.r;
                            if (bool != null && !bool.booleanValue()) {
                                ekrw ekrwVarE = abym.c.e();
                                ekrwVarE.X(eksq.a, "BugleCms");
                                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer", "addObserverToTheAccountMenuCard", 270, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("No linked account for CMS, skip adding observer on the Account Menu.");
                            } else {
                                ekrw ekrwVarE2 = abym.c.e();
                                ekrwVarE2.X(eksq.a, "BugleCms");
                                ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer", "addObserverToTheAccountMenuCard", 277, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("Adding observer on the Account Menu: OgDialogFragment.");
                                eaVar2.P().c(new abyk(abymVar));
                            }
                        }
                    }
                });
            } else {
                ekrw ekrwVarE = abym.c.e();
                ekrwVarE.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer", "addObserverToTheAccountMenuCard", 260, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("Flag is off, skip adding observer on the Account Menu.");
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
            bundle.putBoolean("state_disc_visible", H().k);
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
    public final void l() {
        this.c.k();
        try {
            bl();
            abym abymVarH = H();
            abymVarH.g.c(abymVarH.e);
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
    public final void m() {
        this.c.k();
        try {
            bm();
            abym abymVarH = H();
            abymVarH.g.d(abymVarH.e);
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

    @Override // defpackage.abyn, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

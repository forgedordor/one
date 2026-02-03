package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.welcome.v1.viewmodel.AccountWelcomeViewModel;
import defpackage.ehol;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class datn extends daub implements ehlg, eyhx, ehlc, ehnw, eifl {
    public final lvn a = new lvn(this);
    private boolean ag;
    private daua d;
    private Context e;

    @Deprecated
    public datn() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return daua.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            daua dauaVarH = H();
            layoutInflater.getClass();
            ((ehac) dauaVarH.g.b()).a(((egbf) dauaVarH.h.b()).b(), new dato(dauaVarH, dauaVarH.f));
            AccountWelcomeViewModel accountWelcomeViewModel = (AccountWelcomeViewModel) dauaVarH.j.a();
            fcsu fcsuVar = dauaVarH.b;
            Intent intent = ((datn) fcsuVar.b()).fg().getIntent();
            intent.getClass();
            dayp daypVarA = accountWelcomeViewModel.a(daug.a(intent));
            auvw.k(dauaVarH.i, null, null, new datr(dauaVarH, daypVarA, null), 3);
            lfq.a(((datn) fcsuVar.b()).fg().getWindow(), false);
            dztc.a.b(((datn) fcsuVar.b()).G());
            Context context = layoutInflater.getContext();
            context.getClass();
            ComposeView composeView = new ComposeView(context, null, 0, 6, null);
            composeView.a(new hxd(1439527642, true, new datu(dauaVarH, daypVarA)));
            eidc.q();
            return composeView;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.a;
    }

    @Override // defpackage.ea, defpackage.luv
    public final lyp T() {
        lys lysVar = new lys(super.T());
        lysVar.b(lwu.c, new Bundle());
        return lysVar;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final daua H() {
        daua dauaVar = this.d;
        if (dauaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dauaVar;
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

    @Override // defpackage.daub, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.daub
    protected final /* bridge */ /* synthetic */ ehok b() {
        return new ehof(this, true);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.e == null) {
            this.e = new ehnz(this, super.z());
        }
        return this.e;
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

    @Override // defpackage.daub, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/welcome/v1/SignedInWelcomeFragment", 91, datn.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/welcome/v1/SignedInWelcomeFragment", 96, datn.class, "CreatePeer");
                        try {
                            ahjr ahjrVar = ((ahhw) objBb).b;
                            ahhh ahhhVar = ((ahhw) objBb).c;
                            ahhe ahheVar = ((ahhw) objBb).d;
                            this.d = new daua(((ahhw) objBb).dZ, ((ahhw) objBb).av, ahheVar.f, ahhhVar.r, (efwo) ahjrVar.b.b(), ((ahhw) objBb).g, ((ahhw) objBb).a.a.pG, (fdjx) ahheVar.v.b());
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.a));
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

    @Override // defpackage.daub, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

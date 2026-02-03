package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.apps.messaging.R;
import defpackage.ehol;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkl extends adko implements ehlg, eyhx, ehlc, ehnw, eifl {
    private adkm a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public adkl() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return adkm.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            adkm adkmVarH = H();
            layoutInflater.getClass();
            adkl adklVar = adkmVarH.a;
            if (((NavHostFragment) adklVar.I().g(R.id.nav_host_container)) == null) {
                egru egruVar = adkmVarH.b;
                Bundle bundle2 = new Bundle();
                Object obj = ((ejwt) ejwi.j(egruVar.a)).a;
                bundle2.putInt("account_id", ((efwo) obj).a());
                bundle2.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", ((efwo) obj).a());
                Bundle bundle3 = new Bundle();
                bundle3.putInt("android-support-nav:fragment:graphId", R.navigation.join_via_link_nav_graph);
                bundle3.putBundle("android-support-nav:fragment:startDestinationArgs", bundle2);
                NavHostFragment navHostFragment = new NavHostFragment();
                navHostFragment.at(bundle3);
                navHostFragment.Z.c(new egrt(egruVar, navHostFragment));
                cg cgVar = new cg(adklVar.I());
                cgVar.s(R.id.nav_host_container, navHostFragment);
                cgVar.p(navHostFragment);
                cgVar.c();
            }
            View viewInflate = layoutInflater.inflate(R.layout.activity_navigation_root, viewGroup, false);
            viewInflate.getClass();
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
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adkm H() {
        adkm adkmVar = this.a;
        if (adkmVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return adkmVar;
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

    @Override // defpackage.adko, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.adko
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

    @Override // defpackage.adko, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/joinvialink/JoinViaLinkNavigationFragment", 88, adkl.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/joinvialink/JoinViaLinkNavigationFragment", 93, adkl.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            if (!(eaVar instanceof adkl)) {
                                throw new IllegalStateException(a.M(eaVar, adkm.class));
                            }
                            ahjr ahjrVar = ((ahhw) objBb).b;
                            efwo efwoVar = (efwo) ahjrVar.b.b();
                            eigp eigpVar = (eigp) ahjrVar.ac.b();
                            eyif eyifVar = eyim.a;
                            this.a = new adkm((adkl) eaVar, new egru(efwoVar, eigpVar), ((ahhw) objBb).d.H);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarG.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } catch (Throwable th3) {
            try {
                eidc.q();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
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
            ((afzd) H().c.b()).a();
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

    @Override // defpackage.adko, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

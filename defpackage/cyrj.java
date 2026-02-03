package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.ehol;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyrj extends cysm implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cyrm a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public cyrj() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cyrm.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final cyrm cyrmVarH = H();
            layoutInflater.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.gaia_pairing_reset_primary_fragment_v2, (ViewGroup) null);
            viewInflate.getClass();
            TextView textView = (TextView) viewInflate.findViewById(R.id.gaia_pairing_reset_primary_title);
            cyrj cyrjVar = cyrmVarH.b;
            textView.setText(cyrjVar.B().getString(R.string.gaia_pairing_reset_primary_title_text));
            ((TextView) viewInflate.findViewById(R.id.gaia_pairing_reset_primary_info)).setText(cyrjVar.B().getString(R.string.gaia_pairing_reset_primary_info_text_v2));
            ((Button) viewInflate.findViewById(R.id.gaia_pairing_reset_primary_button)).setText(cyrjVar.B().getString(R.string.gaia_pairing_reset_primary_button_text_v2));
            ((Button) viewInflate.findViewById(R.id.gaia_pairing_reset_primary_button)).setOnClickListener(new eifs((eigp) cyrmVarH.e.b(), "", "", 0, "GaiaPairingResetPrimaryFragmentPeer::resetPrimaryButtonOnClickListener", new View.OnClickListener() { // from class: cyrk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    view.setEnabled(false);
                    ekrw ekrwVarH = cyrm.a.h();
                    ekrwVarH.X(eksq.a, "BugleGDitto");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragmentPeer", "onCreateView$lambda$0", 74, "GaiaPairingResetPrimaryFragmentPeer.kt")).q("Start resetting to be the primary device flow");
                    cyrm cyrmVar = cyrmVarH;
                    ((egpr) cyrmVar.d.b()).g(egpq.b(((bvmu) cyrmVar.c.b()).f()), cyrmVar.g);
                }
            }));
            eidc.q();
            return viewInflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cyrm H() {
        cyrm cyrmVar = this.a;
        if (cyrmVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cyrmVar;
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

    @Override // defpackage.cysm, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.cysm
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

    @Override // defpackage.cysm, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragment", 88, cyrj.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragment", 93, cyrj.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            if (!(eaVar instanceof cyrj)) {
                                throw new IllegalStateException(a.M(eaVar, cyrm.class));
                            }
                            this.a = new cyrm((cyrj) eaVar, ((ahhw) objBb).cj, ((ahhw) objBb).f, ((ahhw) objBb).b.ac, ((ahhw) objBb).a.a.pQ);
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
            cyrm cyrmVarH = H();
            ((egpr) cyrmVarH.d.b()).j(cyrmVarH.g);
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

    @Override // defpackage.cysm, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

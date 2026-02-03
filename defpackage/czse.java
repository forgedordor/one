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
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czse extends czsn implements ehlg, eyhx, ehlc, ehnw, eifl {
    private czsh ag;
    private Context ah;
    private final lvn ai = new lvn(this);
    private final eics aj = new eics(this);
    private boolean ak;

    @Deprecated
    public czse() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return czsh.class;
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            final czsh czshVarH = H();
            czshVarH.h.g(R.id.terms_and_conditions_data, ((cjyi) czshVarH.i.b()).a(czshVarH.c), new czsl(czshVarH));
            View viewInflate = layoutInflater.inflate(R.layout.carriertos_popup_fragment_v2, viewGroup, false);
            ((LottieAnimationView) viewInflate.findViewById(R.id.carrier_tos_popup_animation)).g(czshVarH.d.z().getString(R.string.rcs_tos_animation_json));
            Button button = (Button) viewInflate.findViewById(R.id.conversation_list_carrier_tos_popup_positive_button);
            eigp eigpVar = czshVarH.j;
            button.setOnClickListener(new eifs(eigpVar, "com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer", "onCreateView", 205, "Explicit Carrier Tos Accept", new View.OnClickListener() { // from class: czsf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czsh czshVar = czshVarH;
                    ((cjya) czshVar.k.b()).g(czshVar.c, emfc.RCS_PROVISIONING_PROMPT_ACCEPTED);
                    czshVar.g.h(egpq.b(czshVar.b(3)), new egpo(true), czshVar.l);
                }
            }));
            ((TextView) viewInflate.findViewById(R.id.conversation_list_carrier_tos_popup_negative_button)).setOnClickListener(new eifs(eigpVar, "com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer", "onCreateView", 210, "Explicit Carrier Tos Decline", new View.OnClickListener() { // from class: czsg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czsh czshVar = czshVarH;
                    ((cjya) czshVar.k.b()).g(czshVar.c, emfc.RCS_PROVISIONING_PROMPT_DECLINED);
                    czshVar.g.h(egpq.b(czshVar.b(4)), new egpo(false), czshVar.l);
                }
            }));
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

    @Override // defpackage.ehlg
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final czsh H() {
        czsh czshVar = this.ag;
        if (czshVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czshVar;
    }

    @Override // defpackage.czsn
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
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

    @Override // defpackage.czsn, defpackage.ecdv, defpackage.ea
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
            czsh czshVarH = H();
            czsk czskVar = czshVarH.b;
            if (czskVar != null) {
                ((czsm) czskVar).a = null;
                czshVarH.b = null;
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
            H();
            ((LottieAnimationView) view.findViewById(R.id.carrier_tos_popup_animation)).d();
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

    @Override // defpackage.czsn, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.aj.k();
        try {
            if (this.ak) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragment", 97, czse.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragment", 102, czse.class, "CreatePeer");
                        try {
                            String strH = ((ahib) objBb).H();
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof czse)) {
                                throw new IllegalStateException(a.M(eaVar, czsh.class));
                            }
                            czse czseVar = (czse) eaVar;
                            ahkn ahknVar = ((ahib) objBb).a;
                            ahnh ahnhVar = ahknVar.a;
                            this.ag = new czsh(strH, czseVar, ahnhVar.yw, ahnhVar.yf, ahnhVar.PN, (egpr) ((ahib) objBb).l.b(), (ehbb) ((ahib) objBb).ag.b(), ahnhVar.ZG, (eigp) ahknVar.aI.b(), ahknVar.b.jn);
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

    @Override // defpackage.eefb, defpackage.kc, defpackage.dn
    public final Dialog gK(Bundle bundle) {
        super.gK(bundle);
        czsh czshVarH = H();
        eefa eefaVar = new eefa(czshVarH.d.z());
        eefaVar.setOnShowListener(new czsi());
        eefaVar.b.b(eefaVar, new czsj(czshVarH, eefaVar));
        return eefaVar;
    }

    @Override // defpackage.czsn, defpackage.dn, defpackage.ea
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
            czsh czshVarH = H();
            czshVarH.g.j(czshVarH.l);
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
        czsh czshVarH = H();
        if (czshVarH.b != null) {
            if (configuration.orientation == 2) {
                czshVarH.b.h();
            } else {
                czshVarH.b.i();
            }
        }
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

    @Override // defpackage.czsn, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

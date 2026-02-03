package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.settingspage.SettingsPageView;
import defpackage.ehol;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afex extends affv implements ehlg, eyhx, ehlc, ehnw, eifl {
    private afey a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public afex() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return afey.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            H();
            View viewInflate = layoutInflater.inflate(R.layout.lighter_conversation_settings_fragment, viewGroup, false);
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
    public final afey H() {
        afey afeyVar = this.a;
        if (afeyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return afeyVar;
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

    @Override // defpackage.affv, defpackage.ecdo, defpackage.ea
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
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            bn(view, bundle);
            afey afeyVarH = H();
            afeyVarH.l = ((dvhb) afeyVarH.b.b()).l();
            if (afeyVarH.k == null && afeyVarH.l != null) {
                afex afexVar = afeyVarH.d;
                afexVar.getClass();
                afeyVarH.k = new affd(afeyVarH, (SettingsPageView) afexVar.N().findViewById(R.id.settings_page), afeyVarH.l);
            }
            if (afeyVarH.k == null) {
                dvhv.a("LIGHTER_SETTINGS_FRAGMENT", "settingsPagePresenter is null");
            } else if (afeyVarH.l == null) {
                dvhv.a("LIGHTER_SETTINGS_FRAGMENT", "userPropertiesController is null");
            } else {
                afex afexVar2 = afeyVarH.d;
                afexVar2.getClass();
                ((Switch) afexVar2.N().findViewById(R.id.read_receipt_switch_button)).setClickable(false);
            }
            ((Toolbar) view.findViewById(R.id.toolbar)).t(new affc(afeyVarH));
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

    @Override // defpackage.affv
    protected final /* bridge */ /* synthetic */ ehok b() {
        return new ehof(this, false);
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

    @Override // defpackage.affv, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/lighterconversation/LighterConversationSettingsFragment", 87, afex.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/lighterconversation/LighterConversationSettingsFragment", 92, afex.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            if (!(eaVar instanceof afex)) {
                                throw new IllegalStateException(a.M(eaVar, afey.class));
                            }
                            afex afexVar = (afex) eaVar;
                            ahkn ahknVar = ((ahhw) objBb).a;
                            this.a = new afey(afexVar, ahknVar.a.ajK, (egpr) ((ahhw) objBb).f.b(), (ehbb) ((ahhw) objBb).n.b(), (eosc) ahknVar.y.b());
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
            afey afeyVarH = H();
            afex afexVar = afeyVarH.d;
            Bundle bundle2 = afexVar.m;
            bundle2.getClass();
            dwje dwjeVar = (dwje) bundle2.getSerializable("account_context");
            if (dwjeVar == null) {
                afey.a.m("Unable to get the account context.");
                afexVar.fg().finish();
            } else {
                dwpx dwpxVar = (dwpx) bundle2.getParcelable("conversation_id");
                if (dwpxVar == null) {
                    afey.a.r("Unable to get the conversation id.");
                    afexVar.fg().finish();
                } else {
                    afeyVarH.e = dwjeVar;
                    afeyVarH.f = dwpxVar;
                    afeyVarH.g.j(afeyVarH.i);
                    afeyVarH.h.g(R.id.initialize_read_receipt_setting_value_local_subscription, new affb(afeyVarH, dwjeVar, dwpxVar), afeyVarH.j);
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

    @Override // defpackage.affv, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

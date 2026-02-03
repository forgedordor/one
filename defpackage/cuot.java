package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;
import defpackage.ehol;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuot extends cvbw implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cuoy a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public cuot() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cuoy.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final cuoy cuoyVarH = H();
            layoutInflater.getClass();
            final View viewInflate = layoutInflater.inflate(R.layout.sim_settings_fragment, viewGroup, false);
            ehbb ehbbVar = (ehbb) cuoyVarH.c.b();
            cuoq cuoqVar = new cuoq((cuos) cuoyVarH.d.b());
            final fdap fdapVar = new fdap() { // from class: cuou
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    List list = (List) obj;
                    ekrg ekrgVar = cuoy.a;
                    ekrw ekrwVarE = ekrgVar.e();
                    ekrz ekrzVar = eksq.a;
                    ekrwVarE.X(ekrzVar, "Bugle");
                    ekrd ekrdVar = (ekrd) ekrwVarE;
                    ekrz ekrzVar2 = cqnc.S;
                    ekrdVar.X(ekrzVar2, "ChatIdentitySettingsSelectionFragmentPeer");
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/ui/appsettings/ChatIdentitySettingsSelectionFragmentPeer", "onCreateView$lambda$0", 77, "ChatIdentitySettingsSelectionFragmentPeer.kt")).r("Fetched chat identity data for %s identities", list.size());
                    ea eaVar = cuoyVarH.b;
                    Intent intent = new Intent(eaVar.z(), (Class<?>) ApplicationSettingsActivity.class);
                    View view = viewInflate;
                    if (view == null) {
                        ekrw ekrwVarJ = ekrgVar.j();
                        ekrwVarJ.X(ekrzVar, "Bugle");
                        ekrd ekrdVar2 = (ekrd) ekrwVarJ;
                        ekrdVar2.X(ekrzVar2, "ChatIdentitySettingsSelectionFragmentPeer");
                        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/ui/appsettings/ChatIdentitySettingsSelectionFragmentPeer", "onCreateView$lambda$0", 84, "ChatIdentitySettingsSelectionFragmentPeer.kt")).q("Can not setup compose view because fragment view is null");
                    } else {
                        list.getClass();
                        ComposeView composeView = (ComposeView) view.findViewById(R.id.sim_settings_compose_view);
                        composeView.j();
                        Context contextZ = eaVar.z();
                        if (contextZ == null) {
                            ekrw ekrwVarJ2 = ekrgVar.j();
                            ekrwVarJ2.X(ekrzVar, "Bugle");
                            ekrd ekrdVar3 = (ekrd) ekrwVarJ2;
                            ekrdVar3.X(ekrzVar2, "ChatIdentitySettingsSelectionFragmentPeer");
                            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/ui/appsettings/ChatIdentitySettingsSelectionFragmentPeer", "setupComposeView", 50, "ChatIdentitySettingsSelectionFragmentPeer.kt")).q("Can not setup compose view because context is null");
                        } else {
                            composeView.a(new hxd(-1953891386, true, new cuox(list, contextZ, intent)));
                        }
                    }
                    return fctx.a;
                }
            };
            ehbbVar.g(R.id.get_sim_selection_settings_data_source, cuoqVar, new ehay() { // from class: cuov
                @Override // defpackage.ehay
                public final /* synthetic */ void a(Throwable th) {
                    ehax.a(th);
                }

                @Override // defpackage.ehay
                public final void b(Object obj) {
                    fdapVar.invoke(obj);
                }
            });
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
    public final cuoy H() {
        cuoy cuoyVar = this.a;
        if (cuoyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cuoyVar;
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

    @Override // defpackage.cvbw, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.cvbw
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

    @Override // defpackage.cvbw, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/appsettings/ChatIdentitySettingsSelectionFragment", 88, cuot.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/appsettings/ChatIdentitySettingsSelectionFragment", 93, cuot.class, "CreatePeer");
                        try {
                            this.a = new cuoy((ea) ((eyig) ((ahhw) objBb).e).a, ((ahhw) objBb).dH, ((ahhw) objBb).dI);
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

    @Override // defpackage.cvbw, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}

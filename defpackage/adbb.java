package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import defpackage.ehol;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adbb extends adbq implements ehlg, eyhx, ehlc, ehnw, eifl {
    private adbm a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public adbb() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return adbm.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            adbm adbmVarH = H();
            layoutInflater.getClass();
            ComposeView composeView = new ComposeView(adbmVarH.c.A(), null, 0, 6, null);
            composeView.setFitsSystemWindows(true);
            composeView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: adbc
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.getClass();
                    windowInsets.getClass();
                    return windowInsets;
                }
            });
            composeView.a(new hxd(-1332961778, true, new adbg(adbmVarH)));
            eidc.q();
            return composeView;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adbm H() {
        adbm adbmVar = this.a;
        if (adbmVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return adbmVar;
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

    @Override // defpackage.adbq, defpackage.ecdo, defpackage.ea
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
    public final void ao() {
        eifp eifpVarB = this.c.b();
        try {
            bj();
            H().i = false;
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
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ejwl.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.adbq
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

    @Override // defpackage.adbq, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/home/minidetailspage/HomeMiniConversationDetailsFragment", 88, adbb.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/home/minidetailspage/HomeMiniConversationDetailsFragment", 93, adbb.class, "CreatePeer");
                        try {
                            eyik eyikVar = ((ahhw) objBb).d.H;
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            if (!(eaVar instanceof adbb)) {
                                throw new IllegalStateException(a.M(eaVar, adbm.class));
                            }
                            adbb adbbVar = (adbb) eaVar;
                            eyik eyikVar2 = ((ahhw) objBb).av;
                            ahng ahngVar = ((ahhw) objBb).a.b;
                            this.a = new adbm(eyikVar, adbbVar, eyikVar2, ahngVar.hW, ahngVar.kk);
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
        ConversationId bugleConversationId;
        this.c.k();
        try {
            aX(bundle);
            adbm adbmVarH = H();
            afzd afzdVar = (afzd) adbmVarH.b.b();
            afzdVar.a();
            afzdVar.b(agbf.a, false);
            Bundle bundleC = adbmVarH.c.C();
            if (((arvo) adbmVarH.f.b()).a() && bundleC.containsKey("conversation_id_parcelable")) {
                Parcelable parcelable = bundleC.getParcelable("conversation_id_parcelable");
                parcelable.getClass();
                bugleConversationId = (ConversationId) parcelable;
            } else {
                bugleConversationId = new BugleConversationId(bundleC.getString("conversation_id"));
            }
            ConversationId conversationId = bugleConversationId;
            adbmVarH.g.f(bundleC.getIntArray("starting_coordinate"));
            bundleC.putParcelable("open_conversation2_arguments", new OpenConversation2Arguments(conversationId, null, null, false, false, false, ajlm.MINIMAL, 54, null));
            bundleC.putParcelable("mapi_conversation_id", conversationId);
            vwp.b(bundleC, vwo.a);
            eidc.q();
        } finally {
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
            H().i = true;
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

    @Override // defpackage.adbq, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
